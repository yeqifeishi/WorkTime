layui.config({
	version: '1591673027433' //为了更新 js 缓存，可忽略
});

layui.use(['laydate', 'jquery', 'laypage', 'layer', 'table', 'form', 'element'], function() {
	var laydate = layui.laydate //日期
		,
		laypage = layui.laypage //分页
		,
		layer = layui.layer //弹层
		,
		$ = layui.jquery,
		table = layui.table; //表格

	var form = layui.form;

	//绑定时间选择器
	laydate.render({
		elem: '#startTime'
	});
	laydate.render({
		elem: '#endTime'
	})

	//渲染数据表格
	var tableIns = table.render({
		elem: '#productList' //渲染的目标对象
			,
		url: '/jxt/oderTable' //数据接口
			,
		title: '用户数据表' //数据导出来的标题
			,
		toolbar: "#userToolBar" //表格的工具条
			//,height:'full-300'
			,
		height: '600',
		cellMinWidth: 100 //设置列的最小默认宽度
			,
		done: function(res, curr, count) {

		},
		page: true //是否启用分页
			,
		cols: [
			[{
				field: 'product_name',
				title: '产品名称'
			},
				{field: 'product_price', title: '配送单价'},
				{field: 'dib_num', title: '配送数量', edit: true},
				{field: 'product_unit', title: '产品单位'},
				{field: 'product_type', title: '产品类型'},
				{field: 'pro_g_name', title: '产品组'},
				{field: 'operation', title: '操作'
				}
			]
		],
		parseData:function (res) {
			return {
				"code": 0,
				"msg": res.message,
				"count": res.total,
				"data": res
			};
		}
	});

	//年月范围选择
	laydate.render({
		elem: '#test7',
		type: 'month',
		range: true //或 range: '~' 来自定义分割字符
	});

	//监听时间事件
	laydate.render({
		elem: '#newtime',
		value: new Date(),
		done: function(value, date) {

		}
	});

	//监听头部工具栏事件
	table.on("toolbar(userTable)", function(obj) {
		switch(obj.event) {
			case 'add':
				openAddUser();
				break;
			case 'batchDelete':
				layer.msg('批量删除');
				break;
		};
	});

	//监听行工具事件
	table.on('tool(userTable)', function(obj) {
		var data = obj.data; //获得当前行数据
		var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）

		if(layEvent === 'del') { //删除
			layer.msg("删除");
			layer.confirm('真的删除行么', function(index) {
				obj.del();
				layer.close(index);
				//向服务端发送删除指令
			});
		} else if(layEvent === 'edit') { //修改
			openUpdateUser(data);
		} else if(layEvent === 'adds') { //添加体验
			openAddUsers(data);
		} else if(layEvent === 'approval') { //费用申请
			openapproval(data);
		}
	});

	//监听行工具事件
	table.on('tooladd(userTable)', function(obj) {
		var data = obj.data; //获得当前行数据
		var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）

		if(layEvent === 'adds') { //添加体验
			openAddUsers(data);
		}
	});

	//打开添加窗口 弹层
	var url;
	var mainIndex;

	function openAddUser() {
		//alert("qqq");
		mainIndex = layer.open({
			type: 1, //页面层
			title: '添加',
			content: $("#saveOrUpdateDiv"),
			area: ['900px', '600px'],
			success: function(index) {
				//清空表单数据
				$("#dataFrm")[0].reset();
				url = "user/addUser.action";
			}
		});
	}

	//添加体验
	var url;
	var mainIndex;

	function openAddUsers() {
		//alert("qqq");
		mainIndex = layer.open({
			type: 1, //页面层
			title: '添加项目体验信息',
			content: $("#saveOrUpdateTiyan"),
			area: ['550px', '460px'],
			success: function(index) {
				//清空表单数据
				$("#dataFrm")[0].reset();
				url = "user/addUser.action";
			}
		});
	}
	//打开编辑窗口 弹层
	function openUpdateUser(data) {
		mainIndex = layer.open({
			type: 1,
			title: '修改信息',
			content: $("#saveOrUpdateDiv"),
			area: ['460px', '525px'],
			success: function(index) {
				form.val("dataFrm", JSON.parse(JSON.stringify(data)));
				url = "user/updateUser.action";
				layer.close(mainIndex);
			}
		});

	};

	//打开审批窗口 弹层
	function openapproval(data) {
		mainIndex = layer.open({
			type: 1,
			title: '费用申请',
			content: $('#approval'),
			area: ['550px', '460px'],
			success: function(index) {
				form.val("approvalFrm", JSON.parse(JSON.stringify(data)));
				url = "user/updateUser.action";
				layer.close(mainIndex);
			}
		});
	};

	//保存
	form.on("submit(doSubmit)", function(obj) {
		//序列化表单数据
		var params = $("#dataFrm").serialize();
		//alert(params);
		//发起异步请求
		$.post("index.jsp", params, function(obj) {
			layer.msg(obj);
			//关闭弹出层
			layer.close(mainIndex)
			//刷新数据 表格
			tableIns.reload();
		});
	});
});