package com.datos.seguridad;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import com.datos.comunes.Conexion;
import com.entidades.seguridad.Usuario;

public class UsuarioDAO {
	//Sinlegton
		public static UsuarioDAO _Instancia;
		private UsuarioDAO() {};
		public static UsuarioDAO Instancia() {
			if(_Instancia==null) {
				_Instancia = new UsuarioDAO();
			}
			return _Instancia;
		}
		//end Sinlegton
		
		public Usuario VerificarAcceso(String _Login, String _Passw) throws Exception{
			Connection cn = Conexion.conectar();
			Usuario u = null;
			try {
				CallableStatement cst = cn.prepareCall("{call pa_VerificarAcceso(?,?)}");
				cst.setString(1, _Login);
				cst.setString(2, _Passw);
				ResultSet rs = cst.executeQuery();
				if(rs.next()){
					u = new Usuario();
					u.setIdUsuario(rs.getInt("idUsuario"));
					u.setName(rs.getString("Name"));
					u.setContrasenia(rs.getString("Contrasenia"));
					u.setApellido(rs.getString("Apellido"));
					u.setTelefono(rs.getString("Telefono"));
				}
			} catch (Exception e) { throw e;}
			finally{cn.close();}
			return u;
		}
		
		public Boolean InsertarUsuario(Usuario u) throws Exception{
			Connection cn = Conexion.conectar();
			Boolean inserto = false;
			try {
				CallableStatement cst = 
				cn.prepareCall("{call sp_AgregarUsuario(?,?,?,?)}");
				cst.setString(1, u.getName());
				cst.setString(2, u.getContrasenia());
				cst.setString(3, u.getTelefono());
				cst.setString(4, u.getApellido());
				int i = cst.executeUpdate();
				if(i>0) {inserto=true;}
			} catch (Exception e) { throw e;}
			finally{cn.close();}
			return inserto;
		}
}
