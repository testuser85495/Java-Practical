<%@page import="doa.ComplainDOA"%>
<%@page import="model.Complain"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="admin-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
.table {
	text-align: center;;
}

.msglist, .userlist {
border:1px,solid,black;
/* border-radius:20px; */
	margin: 20px;
	/* width: 50%; */
}

.tblpart {
	display: flex;
	justify-content: space-around;
	align-items: flex-start;
	/* min-width: max-content; */
}
</style>
<body>
<header class="section background-white">
		<div class="line text-center">
			<h1
				class="text-dark text-s-size-30 text-m-size-40 text-l-size-headline text-thin text-line-height-1">
				Complains List</h1>
			<p class="margin-bottom-0 text-size-16 text-dark">
				Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse
				molestie consequat, vel illum dolore eu feugiat nulla facilisis.<br>
				Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam
				nonummy nibh euismod.
			</p>
		</div>
	</header>
	
			<table class="table table-hover ">
				<thead>
					<tr>
						<th scope="col" colspan="7" class="table-primary">PENDING COMPLAINS</th>
					</tr>
					<tr>
						<th scope="col">User Id</th>
						<th scope="col">Name</th>
						<th scope="col">Email</th>
						<th scope="col">Complain</th>
						<th scope="col">Status</th>
						<th scope="col">Complain Date</th>
						<th scope="col">Action</th>
					</tr>
				</thead>
				<%
				List<Complain> pendinglist = ComplainDOA.pendingComplain();
				%>
				<%
				for (Complain c : pendinglist) {
				%>
				<tbody>
					<tr>
						<td><%=c.getUid()%></td>
						<th><%=c.getName()%></th>
						<td><%=c.getEmail()%></td>
						<td><%=c.getComplain()%></td>
						<td><%=c.getC_status()%></td>
						<td><%=c.getDate()%></td>
						<td><a style="color: DodgerBlue;" href="ComplainController?action=complainconfirm&emailid=<%=c.getEmail()%>">Confirm</a> || <a
							style="color: red;" href="ComplainController?action=complainreject&emailid=<%=c.getEmail()%>">Reject</a></td>
					</tr>

				</tbody>
				<%
				}
				%>
			</table>
		
		
			<table class="table table-hover">
				<thead>
					<tr>
						<th scope="col" colspan="7" class="table-primary">COMPLETE COMPLAINS</th>
					</tr>
					<tr>
						<th scope="col">User Id</th>
						<th scope="col">Name</th>
						<th scope="col">Email</th>
						<th scope="col">Complain</th>
						<th scope="col">Status</th>
						<th scope="col">Complain Date</th>
						<th scope="col">Complete Date</th>
					</tr>
				</thead>
				<%
				List<Complain> confirmlist = ComplainDOA.confirmComplain();
				%>
				<%
				for (Complain c : confirmlist) {
				%>
				<tbody>
					<tr>
						<td><%=c.getUid()%></td>
						<th><%=c.getName()%></th>
						<td><%=c.getEmail()%></td>
						<td><%=c.getComplain()%></td>
						<td><%=c.getC_status()%></td>
						<td><%=c.getDate()%></td>
						<td><%=c.getCompletedate()%></td>
					</tr>

				</tbody>
				<%
				}
				%>
			</table>
			
			
			<table class="table table-hover">
				<thead>
					<tr>
						<th scope="col" colspan="7" class="table-primary">REJECT COMPLAINS</th>
					</tr>
					<tr>
						<th scope="col">User Id</th>
						<th scope="col">Name</th>
						<th scope="col">Email</th>
						<th scope="col">Complain</th>
						<th scope="col">Status</th>
						<th scope="col">Complain Date</th>
						<th scope="col">Complete Date</th>
					</tr>
				</thead>
				<%
				List<Complain> rejectlist = ComplainDOA.rejectComplain();
				%>
				<%
				for (Complain c : rejectlist) {
				%>
				<tbody>
					<tr>
						<td><%=c.getUid()%></td>
						<th><%=c.getName()%></th>
						<td><%=c.getEmail()%></td>
						<td><%=c.getComplain()%></td>
						<td><%=c.getC_status()%></td>
						<td><%=c.getDate()%></td>
						<td><%=c.getCompletedate()%></td>
					</tr>

				</tbody>
				<%
				}
				%>
			</table>
</body>
</html>
<%@include file="footer.jsp"%>