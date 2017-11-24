package com.entidades.OPR;

public class Horario {
	private int idHorario;
	private Cancha Cancha;
	private int Dia;
	private int Hora;
	private Double Precio;
	private int Estado;
	public int getIdHorario() {
		return idHorario;
	}
	public void setIdHorario(int idHorario) {
		this.idHorario = idHorario;
	}
	public Cancha getCancha() {
		return Cancha;
	}
	public void setCancha(Cancha cancha) {
		Cancha = cancha;
	}
	public int getDia() {
		return Dia;
	}
	public void setDia(int dia) {
		Dia = dia;
	}
	public int getHora() {
		return Hora;
	}
	public void setHora(int hora) {
		Hora = hora;
	}
	public Double getPrecio() {
		return Precio;
	}
	public void setPrecio(Double precio) {
		Precio = precio;
	}
	public int getEstado() {
		return Estado;
	}
	public void setEstado(int estado) {
		Estado = estado;
	}
}
