package com.entidades.OPR;

import java.sql.Date;

import com.entidades.seguridad.Usuario;
import com.entidades.ventas.Cliente;

public class Reserva {
	private int idReserva;
	private Cliente Cliente;
	private Usuario Usuario;
	private String Descripcion;
	private int Estado;
	private Date FechaDocumento;
	
	public int getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}
	public Cliente getCliente() {
		return Cliente;
	}
	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}
	public Usuario getUsuario() {
		return Usuario;
	}
	public void setUsuario(Usuario usuario) {
		Usuario = usuario;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public int getEstado() {
		return Estado;
	}
	public void setEstado(int estado) {
		Estado = estado;
	}
	public Date getFechaDocumento() {
		return FechaDocumento;
	}
	public void setFechaDocumento(Date fechaDocumento) {
		FechaDocumento = fechaDocumento;
	}
	

}
