package com.entidades.OPR;

import java.sql.Date;

public class DetalleReserva {
	private Horario Horario;
	private Reserva Reserva;
	private Double Precio;
	private Date FechaReserva;
	
	
	public Horario getHorario() {
		return Horario;
	}
	public void setHorario(Horario horario) {
		Horario = horario;
	}
	public Reserva getReserva() {
		return Reserva;
	}
	public void setReserva(Reserva reserva) {
		Reserva = reserva;
	}
	public Double getPrecio() {
		return Precio;
	}
	public void setPrecio(Double precio) {
		Precio = precio;
	}
	public Date getFechaReserva() {
		return FechaReserva;
	}
	public void setFechaReserva(Date fechaReserva) {
		FechaReserva = fechaReserva;
	}
	
}
