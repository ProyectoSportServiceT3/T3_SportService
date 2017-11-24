<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<jsp:include page="/WEB-INF/views/LayoutHead.jsp"></jsp:include>
<body>
<table class="table table-striped" >
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Precio</th>
				<th><div align="center">Imagen</div></th>
				<th>Acciones</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listita}" var="list">
			<tr>
				<td><c:out value="${list.nombre}"/></td>
				<td><c:out value="${list.precio}"/></td>
				<td><a href="#"><img src="resources/extranet/Img/${list.imagen}" class="center-block img-responsive" width="400" height="200" ></a></td>
				<td><a href="${pageContext.request.contextPath}/HorariodeCancha?id=${list.idCancha}" >Ver Horario</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
<jsp:include page="/WEB-INF/views/LayoutFooter.jsp"></jsp:include>