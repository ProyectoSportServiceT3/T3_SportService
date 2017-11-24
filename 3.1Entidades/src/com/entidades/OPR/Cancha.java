package com.entidades.OPR;

import java.util.ArrayList;

public class Cancha {
	private int idCancha;
	private String Nombre;
	private Double Precio;
	private int Estado;
	private String Imagen;
	private ArrayList<Horario> horario;
	
	public int getIdCancha() {
		return idCancha;
	}
	public void setIdCancha(int idCancha) {
		this.idCancha = idCancha;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
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
	public String getImagen() {
		return Imagen;
	}
	public void setImagen(String imagen) {
		Imagen = imagen;
	}
	public ArrayList<Horario> getHorario() {
		return horario;
	}
	public void setHorario(ArrayList<Horario> horario) {
		this.horario = horario;
	}
	
}
