<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>

<script type="text/javascript" src="script/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
    $(function(){
        $("#a").click(function(){
            var url = this.attr("href");
            $.ajax({
                url:url,
                type:"GET",
                success:function(data){
                    console.log(data);
                }


            });
            return false;
        });
    });

</script>
</head>

<body>
<h2>Hello World!</h2>
<a href="hello">hello</a>
<a href="hello1">转发</a>
<a href="hello3/hi">rest风格</a>
<h1>--------GET请求----------</h1>
<a href="book/1">获取1本图书</a>
<h1>--------POST请求----------</h1>
<form action="book" method="post">
    <input type="name" value="《本草纲目》"><br/>
    <input type="submit">提交<br/>
</form>
<h1>--------DELETE请求----------</h1>
<form action="book/1" method="post">
    <input  type="hidden"  name="_method" value="DELETE"><br/>
    <input type="submit">提交<br/>
</form>
<h1>--------PUT请求----------</h1>
<form action="book/1" method="post">
    <input  type="hidden"  name="_method" value="PUT"><br/>
    <input type="submit">提交<br/>
</form>

<h1>--------Ajax请求----------</h1>
<a id ="a" href="response/postAjax">Ajax请求</a>
</body>
</html>
