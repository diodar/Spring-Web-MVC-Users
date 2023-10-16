<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./fragments/head.jsp"%>
</head>
<body style="background-color: #E9ECEB;">
<%@include file="./fragments/menu.jsp"%>
<div class="container-fluid" style="background-color: #FCFCFC;">
	<div class="container-sm">
		<div class="row">
			<div class="col-md-12">
				<div class="container text-left mb-3">
				    <p class="fs-2" style="color: #a72090;">Users
				    <a href="add-user" class="btn btn-primary btn-sm ms-2"><i class="bi bi-plus-lg"></i>Add</a>
				    </p>
                </div>
				<table class="table">
					<thead class="table-light">
						<tr>
							<th scope="col">No.</th>
							<th scope="col">First Name</th>
							<th scope="col">Last Name</th>
							<th scope="col">Email</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${user}" var="usr">
							<tr>
								<th scope="row">${usr.id}</th>
								<td>${usr.firstName}</td>
								<td>${usr.lastName}</td>
								<td>${usr.email}</td>
								<td>
								<a class="btn btn-warning btn-sm" href="update-user/${usr.id}" role="button">Update</a>
								&nbsp;&nbsp;
								<a class="btn btn-danger btn-sm" href="delete-user/${usr.id}" role="button">Delete</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>
</body>
</html>