

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

    <div class="container p-5" style="margin-top: 100px;">
        <form class="d-flex justify-content-center">
        <div class="form-inline" >
            <input type="text" class="form-group mx-sm-5"  placeholder="Nhập từ khóa tìm kiếm" style="width: 800px; padding: 10px 10px; ">
          </div>
          <div class="form-inline" >
          <button class="btn btn-danger" style="padding: 5px 30px;font-size: 20px;">Tìm kiếm</button>
        </div>
        </form>
    </div>
    <div class="container">
        <p class="h4 mb-4">Kết quả tìm kiếm:${title}</p>
        <c:choose>
        <c:when test="${not empty message}">
            <p>Rất tiếc kết quả tìm kiếm không có</p>
        </c:when>
        <c:otherwise>
        <div class="row mb-3">
            <c:forEach var="item" items="${results}">
            <div class="col-sm-3">
                <a href="">
                    <div class="text-center"> <img src="resources/images/${item.idEmployer.logo}" class="card-img-top" style="width: 170px;"></div>   
                </a>
            </div>
            <div class="col-sm-7 bg-light">
                <p><a href="/detail?id=${item.id}" class="text-danger h3">${item.title}</a></p>
                <p>${item.idEmployer.title}</p>
                <p><i class="fas fa-map-marker-alt"></i> ${item.idEmployer.address}</p>
                <p><i class="fas fa-dollar-sign"></i> Lương: <strong>${item.salary}</strong></p>
            </div>
            <div class="col-sm-2 bg-light d-flex align-items-center justify-content-center ">
                <a href="" class="btn btn-warning">Ứng tuyển</a>
            </div>
            </c:forEach>
        </div>    
        </c:otherwise>
            </c:choose>

