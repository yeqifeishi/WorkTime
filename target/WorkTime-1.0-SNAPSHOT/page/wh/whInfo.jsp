<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath();%>
<html>
<head>
    <title>工时信息</title>
    <link rel="stylesheet" type="text/css" href="<%=path%>/layui/css/layui.css">
    <script src="<%=path%>/layui/layui.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>工时统计</legend>
</fieldset>
工时录入时间:
<div class="layui-input-inline">
    <input type="text" name="startTime" id="startTime" autocomplete="off" class="layui-input startTime">
</div>至
<div class="layui-input-inline">
    <input type="text" name="endTime" id="endTime" autocomplete="off" class="layui-input endTime">
</div>
<button type="button" class="layui-btn layui-btn-warm">搜索</button>
<table class="layui-hide" id="userTable" lay-filter="userTable"></table>
<div style="display: none;" id="userToolBar">
<%--    <label class="layui-form-label">工时录入时间：</label>--%>
</div>
<div id="userBar" style="display: none;">
    <a class="layui-btn layui-btn-xs" lay-event="edit">修改工时</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</div>
</body>
<script>
    layui.use(['laydate', 'jquery', 'laypage', 'layer', 'table', 'form', 'element','upload'], function () {
        var laydate = layui.laydate //日期
            ,
            laypage = layui.laypage //分页
            ,
            layer = layui.layer //弹层
            ,
            $ = layui.jquery
            ,
            table = layui.table;//表格

        var form = layui.form;
        var upload = layui.upload;

        laydate.render({
            elem: '#startTime'
        });
        laydate.render({
            elem: '#endTime'
        });

        var tableIns = table.render({
            elem: '#userTable' //渲染的目标对象
            ,
            url: "<%=path%>/customs" //数据接口
            ,
            title: '用户数据表' //数据导出来的标题
            ,
            toolbar: "#userToolBar" //表格的工具条
            //,height:'full-300'
            ,
            height: '400',
            cellMinWidth: 100 //设置列的最小默认宽度
            ,
            done: function (res, curr, count) {

            },
            page: true //是否启用分页
            ,
            cols: [
                [ //列表数据
                    {type: 'checkbox'},
                    {field: 'ID', title: 'ID', sort: true, align: 'center'},
                    {field: 'username', title: '项目ID', align: 'center'},
                    {field: 'custom_tel', title: '用户ID', align: 'center'},
                    {field: 'custom_tel', title: '工时数', align: 'center'},
                    {field: 'custom_tel', title: '工时录入时间', align: 'center'},
                    {fixed: 'right', title: '操作', toolbar: '#userBar', width: 220, align: 'center'}
                ]
            ]
        });
    })
</script>
</html>
