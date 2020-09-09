
//.....

layui.config({
    version: '1591673027433' //为了更新 js 缓存，可忽略
});

layui.use(['laydate','jquery', 'laypage', 'layer', 'table', 'form'], function() {
    var laypage = layui.laypage,//分页
        $=layui.jquery,
        table = layui.table ;//表格
    var form = layui.form;

    //渲染数据表格
    var tableIns = table.render({
        elem: '#userTable' //渲染的目标对象
        ,
        url: '../../../json/DispatchingSupervision.json' //数据接口
        ,
        title: '用户数据表' //数据导出来的标题
        ,
        toolbar: "#userToolBar" //表格的工具条
        //,height:'full-300'
        ,
        height: '400',
        cellMinWidth: 100 //设置列的最小默认宽度
        ,
        done: function(res, curr, count) {

        },
        page: true //是否启用分页
        ,
        cols: [
            [ //列表数据
                {
                    type: 'checkbox',
                    fixed: 'left'
                }, {
                field: 'id',
                title: '订单编号',
                sort: true
            }, {
                field: 'WarningInform',
                title: '',
                width:"2%",
                size:"10%",
                sort: true,
                align: 'center',
                templet:'#WarningInform'
            },{
                field: 'OrderStatus',
                title: '订单状态',
                sort: true,
                align: 'center'
            }, {
                field: 'address',
                title: '配送地址',
                align: 'center'
            },{
                field: 'time',
                title: '超期倒计时',
                align: 'center',
                templet:'#endtime'
            }
            ]
        ]
    });
    //超期倒计时
    $(document).ready(function () {
        setInterval(function () {
            var endtime = $(".endtime");
            endtime.each(function (dom) {
                this.innerHTML=((Number)(this.innerHTML)-1000);
            })
        },1000);
    });
});
