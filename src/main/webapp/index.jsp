<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    //http://localhost:8080/01_sxtoa_war_exploded/
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--    <base href="http://localhost:8080/ssm_page_war_exploded/">--%>
    <base href="<%=basePath%>">
    <title>$Title$</title>


    <style>
        table{
            width: 600px;
            border: 1px solid red;
            border-collapse: collapse;
            margin: 0 auto;
            text-align: center;
        }

        th,td{
            border: 1px solid red;
        }

        #pageInfo{
            margin: 0 auto;
            margin-top: 30px;
            text-align: center;
        }
    </style>


    <script type="text/javascript" src="js/jquery.js"></script>

    <script>
        $(function () {

            $.get('getProduct',{},function (data) {

                for (var i=0 ;i<data.length;i++){
                    $('table').append('<tr>\n' +
                        '        <td>'+data[i].id+'</td>\n' +
                        '        <td>'+data[i].title+'</td>\n' +
                        '        <td>'+data[i].price+'</td>\n' +
                        '        <td>'+data[i].num+'</td>\n' +
                        '        <td><a href=\"#\" class=\"tablelink click buy\"> 购买</a>&nbsp;<a href=\"#\" class=\"tablelink click del\"> 删除</a></td>\n' +
                        '    </tr>')
                }
            });


            // //使用on这个方式来绑定事件，它不论你页面是现在有这个元素还是以后会有这个元素都会给你绑定上！
            // $(document).on('click','.del',function(){
            //     if(confirm("确认删除该商品吗？")){
            //         var id = $(this).parent().parent().find('td').eq(0).text();//获取编号
            //         $.post('delProduct',{id:id},function () {});
            //         window.location.reload();
            //     }else{
            //         alert('已经取消删除');
            //     }
            // });

            $(document).on('click','.del',function(){
                if(confirm("确认删除该商品吗？")){
                    var id = $(this).parent().parent().find('td').eq(0).text();//获取编号
                    $.post('delProduct',{id:id},function () {
                        //showData();
                        document.getElementById('s').deleteRow($(this).parent().parent())
                    });

                }else{
                    alert('已经取消删除');
                }
            });

            //使用on这个方式来绑定事件，它不论你页面是现在有这个元素还是以后会有这个元素都会给你绑定上！
            $(document).on('click','.buy',function(){
                if(confirm("确认购买该商品吗？")){
                    var id = $(this).parent().parent().find('td').eq(0).text();//获取编号
                    $.post('addProduct',{id:id},function () {});
                    window.location.reload();
                }else{
                    alert('已经取消购买');
                }
            });
        })
    </script>

</head>
<body>
<table id="s">
    <thead>
    <tr>
        <th>编号</th>
        <th>标题</th>
        <th>价格</th>
        <th>数量</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>

    </tbody>
</table>


</body>
</html>
