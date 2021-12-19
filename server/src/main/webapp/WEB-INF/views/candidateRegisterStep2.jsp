
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<div class="container" style="margin-top: 100px;">
    <p class="text-center text-danger h3 p-3">Đăng ký</p>
    <form:form method="POST" modelAttribute="candidate" enctype="multipart/form-data">
        <div class="row">
            <div class="col-6">
                <div class="form-group">
                    <label for="Name">Họ và tên</label>

                    <form:input type="text" cssClass="form-control" path="fullname"/>
                     <small class="form-text text-muted">
                        <form:errors path="fullname" cssClass="text-danger"/>
                    </small>
                </div>
            </div>
            <div class="col-6">
                <div class="form-group">
                    <label for="email">Email </label>
                    <form:input type="text" cssClass="form-control" path="email"/>
                    <small class="form-text text-muted">
                        <form:errors path="email" cssClass="text-danger"/>
                    </small>
                </div>
            </div>
            <div class="col-6">
                <div class="form-group">
                    <label for="exampleInputEmail1">Số điện thoại</label>
                    <form:input type="text" cssClass="form-control" path="phone"/>
                    <small class="form-text text-muted">
                        <form:errors path="phone" cssClass="text-danger"/>
                    </small>
                </div>
            </div>
            <div class="col-6">
                <div class="form-group">
                    <label for="exampleInputEmail1">Nơi làm việc mong muốn</label>
                    <form:input type="text" cssClass="form-control" path="address"/>
                </div>
            </div>
        </div>
       
        <div class="form-group">
            <label for="exampleFormControlSelect1">Lĩnh vực của bạn</label>
<!--            <select class="form-control" id="exampleFormControlSelect1">
              <option>1</option>

            </select>-->
<form:select path="idJob" items="${jobs}" itemLabel="title" itemValue="id" cssClass="form-control">
                
            </form:select>
          </div>
          <div class="form-group">
            <label for="exampleFormControlFile1">Upload CV</label>
            <form:input type="file" cssClass="form-control-file" path="fileCV"/>
          </div>
          <div class="form-group text-center"style="margin-bottom: 100px;">
            <!--<input type="submit" class="form-control btn btn-light " style="font-weight: 500; width: 30%;" value="Trở về">-->
             <input type="submit" class="form-control btn btn-info " style="font-weight: 500; width: 30%;" value="Đăng ký">
          </div>

    </form:form>
<!--    <form>
        <div class="row">
            <div class="col-6">
                <div class="form-group">
                    <label for="exampleInputEmail1">Họ và tên</label>
                    <input type="text" class="form-control">
                </div>
            </div>
            <div class="col-6">
                <div class="form-group">
                    <label for="exampleInputEmail1">Email </label>
                    <input type="email" class="form-control" >
                </div>
            </div>
            <div class="col-6">
                <div class="form-group">
                    <label for="exampleInputEmail1">Số điện thoại</label>
                    <input type="number" class="form-control">
                </div>
            </div>
            <div class="col-6">
                <div class="form-group">
                    <label for="exampleInputEmail1">Nơi làm việc mong muốn</label>
                    <input type="text" class="form-control">
                </div>
            </div>
        </div>
       
        <div class="form-group">
            <label for="exampleFormControlSelect1">Lĩnh vực của bạn</label>
            <select class="form-control" id="exampleFormControlSelect1">
              <option>1</option>

            </select>
          </div>
          <div class="form-group">
            <label for="exampleFormControlFile1">Upload CV</label>
            <input type="file" class="form-control-file">
          </div>
          <div class="form-group text-center">
            <input type="submit" class="form-control btn btn-info " style="font-weight: 500; width: 30%;" value="Đăng ký">
            <input type="submit" class="form-control btn btn-light " style="font-weight: 500; width: 30%;" value="Trở về">
          </div>
    </form>-->

</div>
