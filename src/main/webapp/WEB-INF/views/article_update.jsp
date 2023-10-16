<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    <%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./fragments/head.jsp"%>
</head>
<body style="background-color: #E9ECEB;">
<%@include file="./fragments/bar_top.jsp"%>
<div class="container-fluid">
	<div class="container-fluid">
		<div class="container-fluid" style="background-color: #FCFCFC;">
			<div class="col-md-6 offset-md-3 pb-3">
				<h4 class="text-center mb-3 mt-3 text-warning">Update Article</h4>
				<form action="${pageContext.request.contextPath}/handle-article" method="post">
				   <div>
                    <input type="hidden" value="${article.id}" name="id" class="form-control">
                   </div> 
					<div>
						<label for="name"><span style="font-size:12px;">Name</span></label>
						<input type="text"	class="form-control" id="name" name="name"
							placeholder="Name..." value="${article.name}">
					</div>
					<div>
						<label for="topic"><span style="font-size:12px;">Topic</span></label>
						<input type="text" class="form-control" name="topic" id="topic"
						placeholder="Topic..." value="${article.topic}">
					</div>
					<div>
						<label for="text"><span style="font-size:12px;">Text</span></label>
						<textarea class="form-control" id="text" name="text"
							rows="3" placeholder="Text..." >${article.text}</textarea>
					</div>
					<div class="container text-left"><br>
						<a href="${pageContext.request.contextPath}/articles" class="btn btn-outline-secondary btn-sm">Cancel</a>
						&nbsp;&nbsp;
						<button type="submit" class="btn btn-primary btn-sm">Update</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>
</body>
</html>