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
				    <p class="fs-2" style="color: #1ca168;">Articles
                    <a href="add-article" class="btn btn-primary btn-sm ms-2"><i class="bi bi-plus-lg"></i>Add</a>
                    </p>
                </div>
				<table class="table">
					<thead class="table-light">
						<tr>
							<td style="width: 100px;">No.</th>
							<td style="width: 200px;">Name</th>
							<td style="width: 300px;">Topic</th>
							<td style="width: 800px;">Text</th>
							<td style="width: 200px;">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${article}" var="art">
							<tr>
								<th scope="row">${art.id}</th>
								<td>${art.name}</td>
								<td>${art.topic}</td>
								<td>${art.text}</td>
								<td>
								<a class="btn btn-warning btn-sm" href="update-article/${art.id}" role="button">Update</a>
								&nbsp;&nbsp;
								<a class="btn btn-danger btn-sm" href="delete-article/${art.id}" role="button">Delete</a>
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