layui.use(['form', 'layer', 'laydate', 'table', 'laytpl'], function() {
	var form = layui.form,
		layer = parent.layer === undefined ? layui.layer : top.layer,
		$ = layui.jquery,
		laydate = layui.laydate,
		laytpl = layui.laytpl,
		table = layui.table;

	//工单列表
	var tableIns = table.render({
		elem: '#newsList',
		url: '../../json/newsLists.json',
		cellMinWidth: 95,
		page: true,
		height: "full-125",
		limit: 20,
		limits: [10, 15, 20, 25],
		id: "newsListTable",
		cols: [
			[{
					type: "checkbox",
					fixed: "left",
					width: 60
				},
				{
					field: 'newsId',
					title: 'ID',
					width: 60,
					align: "center"
				},
				{
					field: 'newsName',
					title: '产品种类',
					width: 300
				},
				{
					field: 'newsAuthor',
					title: '商家',
					align: 'center'
				},
				{
					field: 'newsAuthors',
					title: '买家',
					align: 'center'
				},
				{
					field: 'newsStatus',
					title: '单子状态',
					align: 'center',
					templet: "#newsStatus"
				},
				{
					field: 'newsTime',
					title: '下单时间',
					align: 'center',
					minWidth: 110,
					templet: function(d) {
						return d.newsTime.substring(0, 10);
					}
				},
				{
					title: '操作',
					width: 170,
					templet: '#newsListBar',
					fixed: "right",
					align: "center"
				}
			]
		]
	});

	//抢单
	function addNews(edit) {
		var index = layui.layer.open({
			title: "抢单",
			type: 2,
			content: "newsAdd.html",
			success: function(layero, index) {
				var body = layui.layer.getChildFrame('body', index);
				if(edit) {
					body.find(".newsName").val(edit.newsName);
					body.find(".abstract").val(edit.abstract);
					body.find(".thumbImg").attr("src", edit.newsImg);
					body.find("#news_content").val(edit.content);
					body.find(".newsStatus select").val(edit.newsStatus);
					body.find(".openness input[name='openness'][title='" + edit.newsLook + "']").prop("checked", "checked");
					body.find(".newsTop input[name='newsTop']").prop("checked", edit.newsTop);
					form.render();
				}
				setTimeout(function() {
					layui.layer.tips('点击此处返回工单列表', '.layui-layer-setwin .layui-layer-close', {
						tips: 3
					});
				}, 500)
			}
		})
		layui.layer.full(index);
		//改变窗口大小时，重置弹窗的宽高，防止超出可视区域（如F12调出debug的操作）
		$(window).on("resize", function() {
			layui.layer.full(index);
		})
	}
	$(".addNews_btn").click(function() {
		addNews();
	})

	//批量删除
	$(".delAll_btn").click(function() {
		var checkStatus = table.checkStatus('newsListTable'),
			data = checkStatus.data,
			newsId = [];
		if(data.length > 0) {
			for(var i in data) {
				newsId.push(data[i].newsId);
			}
			layer.confirm('确定删除选中的配送单？', {
				icon: 3,
				title: '提示信息'
			}, function(index) {
				// $.get("删除工单接口",{
				//     newsId : newsId  //将需要删除的newsId作为参数传入
				// },function(data){
				tableIns.reload();
				layer.close(index);
				// })
			})
		} else {
			layer.msg("请选择需要删除的工单");
		}
	})

	//列表操作
	table.on('tool(newsList)', function(obj) {
		var layEvent = obj.event,
			data = obj.data;

		if(layEvent === 'edit') { //详情
			layer.open({
				type: 2,
				title: false,
				closeBtn: 1, //显示关闭按钮
				shade: [0],
				area: ['600px', '600px'],
				offset: 'xd', //右下角弹出
				//time: 2000, //2秒后自动关闭
				anim: 2,
				content: ['2.html', 'no'], //iframe的url，no代表不显示滚动条
				
			});

		} else if(layEvent === 'look') { //抢单
			layer.open({
				type: 2,
				title: false,
				closeBtn: 1, //显示关闭按钮
				shade: [0],
				area: ['600px', '600px'],
				offset: 'xd', //右下角弹出
				//time: 2000, //2秒后自动关闭
				anim: 2,
				content: ['33.html', 'no'], //iframe的url，no代表不显示滚动条
				end: function() { //此处用于演示
					layer.alert('已成功抢到订单啦！！', {
						skin: 'layui-layer-molv' //样式类名
							,
						closeBtn: 0
					}, function() {
						layer.alert('好的呢，请尽快配送吧！！', {
							skin: 'layui-layer-lan',
							closeBtn: 0,
							anim: 4 //动画类型
						});
					});
				}
			});
		}
	});

})