<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<nav class="navbar navbar-expand-lg" style="background-color: #00fff2;">
  <div class="container-fluid">
    <a class="navbar-brand fw-bold" style="color: #ffffff;">
      <img src="${pageContext.request.contextPath}/resources/icons/java-m.png" alt="Logo" width="180" height="60" class="d-inline-block align-text-top">
    </a>
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
      <div class="navbar-nav">
        <a class="nav-link" href="./home">Home</a>
        <a class="nav-link" href="./users">Users</a>
        <a class="nav-link" href="./articles">Articles</a>
        <a class="nav-link" href="./contacts">Contacts</a>
      </div>
    </div>
  </div>
</nav>