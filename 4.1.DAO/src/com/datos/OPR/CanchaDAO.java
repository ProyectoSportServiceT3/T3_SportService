package com.datos.OPR;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.datos.comunes.Conexion;
import com.entidades.OPR.Cancha;

public class CanchaDAO {
	//Sinlegton
		public static CanchaDAO _Instancia;
		private CanchaDAO() {};
		public static CanchaDAO Instancia() {
			if(_Instancia==null) {
				_Instancia = new CanchaDAO();
			}
			return _Instancia;
		}
		//end Sinlegton
		public ArrayList<Cancha> Listar() throws Exception{
			Connection cn = Conexion.conectar();
			ArrayList<Cancha> lista = new ArrayList<Cancha>();
			try {
				CallableStatement cst = cn.prepareCall("{call sp_ListarCanchas()}");
				ResultSet rs = cst.executeQuery();
				while(rs.next()){
					Cancha obj = new Cancha();
					obj.setIdCancha(rs.getInt("idCancha"));
					obj.setNombre(rs.getString("Nombre"));
					obj.setPrecio(rs.getDouble("Precio"));
					obj.setEstado(rs.getInt("Estado"));
					obj.setImagen(rs.getString("Imagen"));
					lista.add(obj);
				}
			} catch (Exception e) { throw e;}
			finally{cn.close();}
			return lista;
		}
		
}
