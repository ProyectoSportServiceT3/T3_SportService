</div>
                    </div>
                </div>

            </div>
        </div>
    </div>
    <div class="section">
        <div class="container">
            <div class="row">
                <div class="col-md-6 text-center">
                    <a href="#"><i class="fa fa-3x fa-fw fa-home"></i></a>
                    <a href="#"><i class="fa fa-3x fa-fw fa-building"></i></a>
                    <a href="#"><i class="fa fa-3x fa-fw fa-soccer-ball-o"></i></a>
                    <a href="#"><i class="fa fa-3x fa-fw fa-phone-square"></i></a>
                    <a href="#"><i class=" fa fa-3x fa-fw fa-users"></i></a>
                    <h1>Sport Services</h1>
                    <h3>Acerca de Nosotros</h3>
                    <p>
                        <br>795 Folsom Ave, Suite 600
                        <br>San Francisco, CA 94107
                        <br>
                        <abbr title="Phone">P:</abbr>(123) 456-7890
                    </p>
                </div>
                <div class="col-md-6">
                    <div class="col-md-5" id="mapa" style="width:500px;height:300px"></div>
                    <script type="text/javascript">
                        var divMapa = document.getElementById('mapa');
                        var empLat = -8.1024143;
                        var empLon = -79.0292486;
                        var gEmpLanLon = new google.maps.LatLng(empLat, empLon);//coordenadas de la empresa
                        var objConfig = {
                            zoom: 14,
                            center: gEmpLanLon
                        }
                        var gMapa = new google.maps.Map(divMapa, objConfig);
                        //marcadores---
                        //marcador Empresa--
                        var objConMEmpresa = {
                            position: gEmpLanLon,
                            map: gMapa,
                            title: 'Nuestras Canchas'
                        }
                        var gMEmpresa = new google.maps.Marker(objConMEmpresa);
                        gMEmpresa.setIcon('data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAABw0lEQVRYR+2WwUocQRCG/6rp1ezVZSYnQUwERfIMAc8Bk4sHwaM+g5BxXMYFX0HPBj0GBMFTyDMIITm4CIIHd5SckhW3uyrMYffgzoq92UUP08eme+qr/5+qasIzL3rm+CgBSgVejgJRYj85kT1minwqI0srFCYd9bmj4m6YzUYrNV97CtTi+2vf4HnQYQDyewKX3aavoh6AbxbdjIcF6MKXAI9WwSBbBPKHwbuWzcHvOl1OfdbpgO2akMQMrhb9kLlVRfsDLRjkrUDaUHpP4DmCbmU7lYUw6fxSpVRZzqH6vQii6Hv5njcAFFtK1CTo4cMqUNAqoG8JSB9mOzIAFjsrbE4ALBSU4U9m90EkaI4NIGNTCe19G8ymD0DEZmaiGortjA3AODNj2Z6CMN9vAX6wuGXl4HxsAABiVWoS6VG/BbRC0EUFtscGICJ/DdGSEM9ANM4alXe1pHPGoB1ivXIi3xg86Q1QVKOP9IE2gXcDsV+uG9WLKL57Aw7WHGSzKHhXKa8+8NTpVs6CkSlQS+5ajCB8qvT/O45FtHXbmHjda8VR3X50VvZ9HyXDKJAHJ8PrN3Vz/HLehL7Sj+p8qUCpwD8fe0Mw9XKNBwAAAABJRU5ErkJggg==');//icono - empresa
                        //------------

                        //InfoEmpresa
                        var objEmpresaHTML = {
                            content: '<div><h4 class="text-center text-primary">Sport Services</h4><p class="text-center text-info">Alquiler de Canchas</p><p class="text-center text-info"><a href="/">Mas Informacion...</a></p></div>'
                        }
                        var gIWEmpresa = new google.maps.InfoWindow(objEmpresaHTML);
                        google.maps.event.addListener(gMEmpresa, 'click', function () {
                            gIWEmpresa.open(gMapa, gMEmpresa);
                        });
                        //
                    </script>
                </div>
            </div>
                </div>
            </div>
     <ul class="nav nav-tabs navbar-fixed-bottom footer-nav paraf">
        <li>
            <a href="#">Inicio</a>
        </li>
        <li>
            <a href="#">Quienes Somos</a>
        </li>
        <li>
            <a href="#">Nuestras Canchas</a>
        </li>
        <li>
            <a href="#">Contactenos</a>
        </li>
    </ul>
</body>
</html>