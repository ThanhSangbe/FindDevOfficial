<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

    <div class="container p-5" style="margin-top: 100px;">
        <form method="get" action="/search" class="d-flex justify-content-center">
        <div class="form-inline" >
            <input type="text" name="keyword" class="form-group mx-sm-5"  placeholder="Nhập từ khóa tìm kiếm" style="width: 800px; padding: 10px 10px; ">
         
          </div>
          <div class="form-inline" >
          <button class="btn btn-danger" style="padding: 5px 30px;font-size: 20px;">Tìm kiếm</button>
        </div>
        </form>
    </div>
    <div class="container">
        <p class="h4 mb-4">Tin tuyển dụng hot nhất</p>
        <div class="row">
            <c:forEach var="item" items="${Tintuyendungs}">
            <div class="col-sm-3">
                 <a href="/detail?id=${item.id}">
                    <div class="card p-3">
                      <div class="text-center"> <img src="/resources/images/${item.idEmployer.logo}" class="card-img-top" style="width: 170px;">
                    </div>
                    <div class="text-center"><h5 class="card-title text-dark">${item.idEmployer.title}</h5></div> 
                    <p class="card-text text-dark text-center">${item.title}</p>
                  </div>
                </a>
            </div>
            </c:forEach>
        </div>


        <p class="h4 mb-4 mt-4">Các công ty nổi bậc</p>
        <div class="row">
             <c:forEach var="item" items="${Tintuyendungs}">
            <div class="col-sm-3">
                <a href="/detail?id=${item.id}">
                    <div class="card p-3">
                      <div class="text-center"> <img src="/resources/images/${item.idEmployer.logo}" class="card-img-top" style="width: 170px;">
                    </div>
                    <div class="text-center"><h5 class="card-title text-dark">${item.idEmployer.title}</h5></div> 
                    <p class="card-text text-dark text-center">${item.title}</p>
                  </div>
                </a>
            </div>
            </c:forEach>

        </div>
    </div>
