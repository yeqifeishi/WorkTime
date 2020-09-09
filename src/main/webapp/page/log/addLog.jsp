<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath();%>
<html>
<head>
    <title>新日志填写</title>
    <link rel="stylesheet" type="text/css" href="<%=path%>/layui/css/layui.css">
    <script src="<%=path%>/layui/layui.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>新日志填写</legend>
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
        <label class="layui-form-label">项目更新时间：</label>
        <div class="layui-input-inline">
            <input type="text" name="updateTime" id="updateTime" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">项目更新内容</label>
        <div class="layui-input-block" style="width: 70%;">
            <textarea class="layui-textarea layui-hide" name="content" lay-verify="content" id="news_content"></textarea>
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
        var layedit = layui.layedit;

        laydate.render({
            elem: '#updateTime' //指定元素
        });

        var editIndex = layedit.build('news_content',{
            height : 335,
            uploadImage : {
                url : "../../json/newsImg.json"
            }
        });
    })
</script>
</html>
