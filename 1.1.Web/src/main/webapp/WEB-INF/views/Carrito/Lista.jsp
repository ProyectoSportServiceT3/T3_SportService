<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<jsp:include page="/WEB-INF/views/LayoutHead.jsp"></jsp:include>
<body>
<p>Carrito</p>
<table class="table table-striped" >
		<thead>
			<tr>
				<th>Dia</th>
				<th>Hora</th>
				<th>Precio</th>
				<th><div align="center">Imagen</div></th>
				<th>Acciones</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listita}" var="list">
			<tr>
				<td><c:out value="${list.horario.dia}"/></td>
				<td><c:out value="${list.horario.hora}"/></td>
				<td><c:out value="${list.horario.cancha.precio}"/></td>
				<td><a href="#"><img src="resources/extranet/Img/${list.horario.cancha.imagen}" class="center-block img-responsive" width="400" height="200" ></a></td>
				<td><a href="${pageContext.request.contextPath}/EliminarCarrito?id=${list.horario.idHorario}" >Eliminar</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
<a href="${pageContext.request.contextPath}/GuardarCarrito" >Guardar</a>
</body>
<jsp:include page="/WEB-INF/views/LayoutFooter.jsp"></jsp:include>