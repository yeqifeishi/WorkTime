<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath();%>
<html>
<head>
    <title>添加工时</title>
    <link rel="stylesheet" type="text/css" href="<%=path%>/layui/css/layui.css">
    <script src="<%=path%>/layui/layui.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>添加工时</legend>
</fieldset>
<form class="layui-form">
    <div class="layui-form-item">
        <label class="layui-form-label">项目ID：</label>
        <div class="layui-input-inline">
            <select name="proID" class="layui-input-inline">
                <option value="1">工时管理系统</option>
                <option value="1">工时管理系统</option>
                <option value="1">工时管理系统</option>
            </select>
        </div>
        <label class="layui-form-label">工时数：</label>
        <div class="layui-input-inline">
            <input type="text" name="username" class="layui-input">
        </div>
        <label class="layui-form-label">工时录入时间：</label>
        <div class="layui-input-inline">
            <input type="text" name="inTime" id="inTime" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
</body>
<script>
    layui.use(['laydate', 'jquery', 'laypage', 'layer', 'table', 'form', 'element','upload','layedit'], function () {
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
            elem: '#inTime' //指定元素
        });
    })
</script>
</html>
