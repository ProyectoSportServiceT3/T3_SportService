package com.datos.OPR;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.datos.comunes.Conexion;
import com.entidades.OPR.Cancha;
import com.entidades.OPR.Horario;

public class HorarioDAO {
	//Sinlegton
	public static HorarioDAO _Instancia;
	private HorarioDAO() {};
	public static HorarioDAO Instancia() {
		if(_Instancia==null) {
			_Instancia = new HorarioDAO();
		}
		return _Instancia;
	}
	//end Sinlegton
	public ArrayList<Horario> Listar(int idCancha) throws Exception{
		Connection cn = Conexion.conectar();
		ArrayList<Horario> lista = new ArrayList<Horario>();
		try {
			CallableStatement cst = cn.prepareCall("{call pa_ListarHorarioPorCancha(?)}");
			cst.setInt(1, idCancha);
			ResultSet rs = cst.executeQuery();
			while(rs.next()){
				Horario obj = new Horario();
				obj.setIdHorario(rs.getInt("idHorario"));
				obj.setDia(rs.getInt("Dia"));
				obj.setHora(rs.getInt("Hora"));
				obj.setEstado(rs.getInt("Estado"));
				obj.setPrecio(rs.getDouble("Precio"));
				lista.add(obj);
			}
		} catch (Exception e) { throw e;}
		finally{cn.close();}
		return lista;
	}
			
}
