<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath();%>
<html>
<head>
    <title>添加角色</title>
    <link rel="stylesheet" type="text/css" href="<%=path%>/layui/css/layui.css">
    <script src="<%=path%>/layui/layui.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>添加角色</legend>
</fieldset>
<form class="layui-form">
    <div class="layui-form-item">
        <label class="layui-form-label">角色名称：</label>
        <div class="layui-input-inline">
            <input type="text" name="username" class="layui-input">
        </div>
        <label class="layui-form-label">角色表示：</label>
        <div class="layui-input-inline">
            <input type="text" name="username" class="layui-input">
        </div>
        <label class="layui-form-label">备注：</label>
        <div class="layui-input-inline">
            <%--            <input type="text" name="inTime" id="inTime" autocomplete="off" class="layui-input">--%>
            <input type="text" name="username" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">创建用户ID：</label>
        <div class="layui-input-inline">
            <input type="text" name="username" class="layui-input">
        </div>
        <label class="layui-form-label">创建日期：</label>
        <div class="layui-input-inline">
            <input type="text" name="createTime" id="createTime" autocomplete="off" class="layui-input">
        </div>
        <label class="layui-form-label">更新时间：</label>
        <div class="layui-input-inline">
            <input type="text" name="updateTime" id="updateTime" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">更新者ID：</label>
        <div class="layui-input-inline">
            <input type="text" name="username" class="layui-input">
        </div>
        <label class="layui-form-label">是否是超级管理员：</label>
        <div class="layui-input-inline">
            <input type="radio" name="supAdmin" value="1" title="是">
            <input type="radio" name="supAdmin" value="0" title="不是" checked>
        </div>
        <label class="layui-form-label">是否是系统管理员：</label>
        <div class="layui-input-inline">
            <input type="radio" name="SysAdmin" value="1" title="是">
            <input type="radio" name="SysAdmin" value="0" title="不是" checked>
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
    </div>s
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
            elem: '#createTime' //指定元素
        });

        laydate.render({
            elem: '#updateTime' //指定元素
        });
    })
</script>
</html>
