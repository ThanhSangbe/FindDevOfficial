
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<div class="container" style="margin-top: 100px;">

    <p class="text-center h3 p-3">Đăng ký</p>

    <form:form method="POST" modelAttribute="accounts">
        <div class="row">
            <div class="col-3"></div>
            <div class="col-6">
                <div class="form-group  ">
                    <label for="tendangnhap">Tên đăng nhập</label>
                    <form:input type="text" cssClass="form-control" path="nickname"/>
                    <!--                        <input type="text" class="form-control" >-->
                    <small class="form-text text-muted"><form:errors path="nickname" cssClass="text-danger" /></small> 
                </div>
            </div>
            <div class="col-3"></div>

            <div class="col-3"></div>
            <div class="col-6"> 
                <div class="form-group">
                    <label for="matkhau">Mật khẩu</label>
                    <form:input type="password" cssClass="form-control" path="pass"/>

                    <!--                        <input type="password" class="form-control" >-->
                </div>
            </div>
            <div class="col-3"></div>

            <div class="col-3"></div>
            <div class="col-6 form-group text-center">
                <input type="submit" class="form-control btn btn-info " style="font-weight: 500; width: 50%; margin-bottom: 100px; margin-top: 20px;" value="Tiếp theo">
            </div>
            <div class="col-3"></div>
        </div>
    </form:form>
