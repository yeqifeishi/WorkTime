<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath();%>
<html>
<head>
    <title>添加员工</title>
    <link rel="stylesheet" type="text/css" href="<%=path%>/layui/css/layui.css">
    <script src="<%=path%>/layui/layui.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>添加员工</legend>
</fieldset>
<form class="layui-form">
    <div class="layui-form-item">
        <label class="layui-form-label">用户头像：</label>
        <div class="layui-upload-drag" id="test10">
            <i class="layui-icon"></i>
            <p>点击上传，或将文件拖拽到此处</p>
            <div class="layui-hide" id="uploadDemoView">
                <hr>
                <img src="" alt="上传成功后渲染" style="max-width: 196px">
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">用户姓名：</label>
        <div class="layui-input-inline">
            <input type="text" name="username" class="layui-input">
        </div>
        <label class="layui-form-label">用户性别：</label>
        <div class="layui-input-block">
            <input type="radio" name="sex" value="未知" title="未知">
            <input type="radio" name="sex" value="男" title="男">
            <input type="radio" name="sex" value="女" title="女" checked>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">用户系统登陆名：</label>
        <div class="layui-input-inline">
            <input type="text" name="username" class="layui-input">
        </div>
        <label class="layui-form-label">用户系统登陆密码：</label>
        <div class="layui-input-inline">
            <input type="text" name="username" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">用户生日：</label>
        <div class="layui-input-inline">
            <input type="text" class="layui-input" id="test1">
        </div>
        <label class="layui-form-label">用户详细地址：</label>
        <div class="layui-input-inline">
            <input type="text" name="username" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">用户所在省份：</label>
        <div class="layui-input-inline">
            <input type="text" name="username" class="layui-input">
        </div>
        <label class="layui-form-label">用户所在城市：</label>
        <div class="layui-input-inline">
            <input type="text" name="username" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">用户所在地区：</label>
        <div class="layui-input-inline">
            <input type="text" name="username" class="layui-input">
        </div>
        <label class="layui-form-label">用户所属部门ID：</label>
        <div class="layui-input-inline">
            <input type="text" name="username" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">用户电子邮箱：</label>
        <div class="layui-input-inline">
            <input type="text" name="username" class="layui-input">
        </div>
        <label class="layui-form-label">用户电话号码：</label>
        <div class="layui-input-inline">
            <input type="text" name="username" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">用户状态：</label>
        <div class="layui-input-inline">
            <input type="text" name="username" class="layui-input">
        </div>
    </div>
</form>
</body>
<script>
    layui.use(['laydate', 'jquery', 'laypage', 'layer', 'table', 'form', 'element', 'upload'], function () {
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

        //拖拽上传
        upload.render({
            elem: '#test10'
            , url: 'https://httpbin.org/post' //改成您自己的上传接口
            , done: function (res) {
                layer.msg('上传成功');
                layui.$('#uploadDemoView').removeClass('layui-hide').find('img').attr('src', res.files.file);
                console.log(res)
            }
        });
        laydate.render({
            elem: '#test1' //指定元素
        });
    })
</script>
</html>
