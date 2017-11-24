<jsp:include page="/WEB-INF/views/LayoutHead.jsp"></jsp:include>


<div class="section paraf">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="section">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="col-md-12">
                                    <h2 class="text-center">Contactenos</h2>
                                    <form role="form">
                                        <div class="form-group">
                                            <label class="control-label" for="exampleInputEmail1">Email address</label>
                                            <input class="form-control" id="exampleInputEmail1"
                                                   placeholder="Enter email" type="email">
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label" for="exampleInputPassword1">Nombre</label>
                                            <input class="form-control" id="exampleInputPassword1" placeholder="Nombre"
                                                   type="text">
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label">Mensaje</label>
                                            <textarea class="form-control"></textarea>
                                        </div>
                                        <a href="#" type="submit" class="btn btn-default">
                                            Enviar
                                            <i class="fa fa-fw fa-send-o"></i>
                                        </a>
                                    </form>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <a href="${pageContext.request.contextPath}/"><img src="resources/extranet/Img/imgcont2.jpg" class="center-block img-circle img-responsive"></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="/WEB-INF/views/LayoutFooter.jsp"></jsp:include>