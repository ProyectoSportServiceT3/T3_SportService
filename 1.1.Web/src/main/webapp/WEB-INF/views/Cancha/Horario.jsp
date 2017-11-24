<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<jsp:include page="/WEB-INF/views/LayoutHead.jsp"></jsp:include>
<body>
<table class="table table-striped" >
		<thead>
			<tr>
				<th>Precio</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listita}" var="list">
			
				<td><c:out value="${list.precio}"/></td>
			
			</c:forEach>
		</tbody>
	</table>
</body>
<jsp:include page="/WEB-INF/views/LayoutFooter.jsp"></jsp:include>