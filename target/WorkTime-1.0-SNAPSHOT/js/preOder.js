layui.config({
    version: '1591673027433' //为了更新 js 缓存，可忽略
});
var oderdata=null;
layui.use(['laydate', 'jquery', 'laypage', 'layer', 'table', 'form', 'element'], function() {
    var laydate = layui.laydate //日期
        ,
        laypage = layui.laypage //分页
        ,
        layer = layui.layer //弹层
        ,
        $ = layui.jquery,
        table = layui.table; //表格
    var tableIns = table.render({
        elem: '#oderList',
        url: '/jxt/oderTable',
        done: function(res, curr, count) {

        },
        page: true,
        cols: [[
                {type:'checkbox'},
                {field: 'product_id', title: '产品id',width:80},
                {field: 'product_name', title: '产品名称'},
                {field: 'product_price', title: '配送单价'},
                {field: 'dib_num', title: '配送数量', edit: true},
                {field: 'product_unit', title: '产品单位'},
                {field: 'product_type', title: '产品类型'},
                {field: 'pro_g_name', title: '产品组'},
                {fixed: 'right', title:'操作', toolbar: '#barDemo', width:150}
            ]],
        parseData:function (res) {
            // oderdata=res;
            total(res);
            return {
                "code": 0,
                "msg": res.message,
                "count": res.total,
                "data": res
            };

        }
    });
    table.on('tool(oderList)', function(obj){
        var data = obj.data;
        //console.log(obj)
        if(obj.event === 'del'){
            layer.confirm('真的删除行么', function(index){
                obj.del();
                layer.close(index);
            });
        } else if(obj.event === 'edit'){
            layer.prompt({
                formType: 2
                ,value: data.email
            }, function(value, index){
                obj.update({
                    email: value
                });
                layer.close(index);
            });
        }
    });

    table.on('checkbox(oderList)', function(obj){
        console.log(obj)
    });

    var $ = layui.$, active = {
        getCheckData: function(){ //获取选中数据
            var checkStatus = table.checkStatus('oderList')
                ,data = checkStatus.data;
            $("#oderInfo").val(JSON.stringify(data));
            // layer.alert(JSON.stringify(data));
        }
        ,getCheckLength: function(){ //获取选中数目
            var checkStatus = table.checkStatus('oderList')
                ,data = checkStatus.data;
            layer.msg('选中了：'+ data.length + ' 个');
        }
        ,isAll: function(){ //验证是否全选
            var checkStatus = table.checkStatus('oderList');
            layer.msg(checkStatus.isAll ? '全选': '未全选')
        }
    };

    $('.demoTable .layui-btn').on('click', function(){
        var checkStatus = table.checkStatus('oderList')
            ,data = checkStatus.data;
        $("#oderInfo").val(JSON.stringify(data));
        // $("#oderInfo").val('fff');
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    });

    window.onload=function () {
        var total=0;
        for (var i=0;i<oderdata.length;i++) {
            var one = oderdata[i].product_price * oderdata[i].dib_num;
            total = total + one;
        }
        $(".totalMoney").html(total);
    }



});
function total(data) {
    // alert("ddd");
    var total=0;
    for (var i=0;i<data.length;i++) {
        var one = data[i].product_price * data[i].dib_num;
        total = total + one;
    }
    $("#totalMoney").html(total);
}
// function setTotal(){
//     var totalQuantity = 0;    //总数量
//     var totalMoney = 0;       //总金额
//     var totalIntegral = 0;    //总积分
//     $("#oderList tr").each(function(){
//
//         //获取当前行的单价
//         this_price = $(this).children(".product_price").text();
//         this_price = parseFloat(this_price);
//
//         //获取当前行的积分
//         this_integral = $(this).children(".jifen").text();
//         this_integral = parseFloat(this_integral);
//
//         //获取当前行的数量
//         this_num = $(this).find(".dib_num").val();
//         this_num = parseInt(this_num);
//
//         //获取当前行的总价格、总积分
//         var trmoney = this_price*this_num;
//         var trIntegral = this_integral*this_num;
//
//         //总金额、总数量、总积分
//         totalQuantity += this_num*1;   //总数量
//         totalMoney += trmoney*1        //总金额
//         totalIntegral += trIntegral*1  //总积分
//     })
//     $(".totalQuantity").html(totalQuantity);
//     $(".totalMoney").html(totalMoney);
//     $(".totalIntegral").html(totalIntegral);
// }