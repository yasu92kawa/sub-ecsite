<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>Login</title>


<style type="text/css">
    /*--------------Tbale-------------*/
    body{
        margin: 0;
        padding: 0;
        line-height: 1.6;
        letter-spacing: 1px;
        font-family:Verdana, Helvetica, sans-serif;
        font-size: 12px;
        color: #333;
        background: #fff;
    }

    table{
        text-align: center;
        margin: 0 auto;
    }
    /*--------ID-------*/
    #top{
        width: 780px;
        margin: 30px auto;
        border: 1px solid #333;
    }

    #header{
        width: 100%;
        height: 80px;
        background-color: black;
    }

    #main{
        width: 100%;
        height: 500px;
        text-align: center;
    }

    #footer{
        width: 100%;
        height: 80px;
        background-color: black;
        clear:both;
    }

    /*-- 追加--*/

    #text-link{
        display: inline-block;
        text-align: right;
    }

    /*-- 追加--*/




</style>


</head>


<body>


   <div id="header">
      <div id="pr">
      </div>
   </div>
   <div id="main">
      <div id="top">
         <p>Login</p>
      </div>
      <div>
         <h3>商品を購入する際にはログインをお願いします。</h3>
          <s:form action="LoginAction">
            <s:textfield name="loginUserId"/>
            <s:password name="loginPassword"/>
            <s:submit value="ログイン"/>
          </s:form>
          <br/>
          <div>
              <p>
                  新規ユーザー登録は
                  <a href='<s:url action="UserCreateAction"/>'>
                  こちら
                  </a>
              </p>
              <!-- 追加-->

          	<p>
              HOMEへ戻る場合は
              <a href='<s:url action="GoHomeAction"/>'>こちら</a>
          	</p>

          <!-- 追加-->

          </div>
      </div>
   </div>
   <div id="footer">
       <div id="pr">

       </div>
   </div>


</body>
</html>