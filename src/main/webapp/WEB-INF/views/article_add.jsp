<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./fragments/head.jsp"%>
</head>
<body style="background-color: #E9ECEB;">
<%@include file="./fragments/bar_top.jsp"%>
<div class="container-fluid">
	<div class="container-fluid" style="background-color: #FCFCFC;">
		<div class="row">
			<div class="col-md-6 offset-md-3 pb-3">
				<h4 class="text-center mb-3 mt-3 text-warning">Add Article</h4>
				<!-- form -->
				<form action="handle-article" method="post">
					<div>
						<label for="name"><span style="font-size:12px;">Name</span></label>
						<input type="text" class="form-control fw-light" id="name" name="name"
							placeholder="Name...">
					</div>
					<div>
						<label for="topic"><span style="font-size:12px;">Topic</span></label>
						<input type="text" class="form-control fw-light" name="topic" id="topic"
							placeholder="Topic...">
					</div>
					<div>
						<label for="text"><span style="font-size:12px;">Text</span></label>
						<textarea class="form-control fw-light" id="text" name="text"
							rows="3" placeholder="Text..."></textarea>
					</div>
					<div class="container text-left"><br>
						<a href="${pageContext.request.contextPath}/articles" class="btn btn-outline-secondary btn-sm">Cancel</a>
						&nbsp;&nbsp;
						<button type="submit" class="btn btn-primary btn-sm">Add</button>
					</div>
				</form>
				<!-- end form -->
			</div>
		</div>
	</div>
</div>
</body>
</html>