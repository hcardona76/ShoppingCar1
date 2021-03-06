package com.Shopping.models;

import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RegistroUsuario {
	
	@Override
	public String toString() {
		return "RegistroUsuario [cedula=" + cedula + ", nombrecompleto=" + nombrecompleto + ", telefono1=" + telefono1
				+ ", telefono2=" + telefono2 + ", direccion=" + direccion + ", tipo=" + tipo + ", Ciudad=" + Ciudad
				+ "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private final long cedula;
	private final String nombrecompleto;
	private final long telefono1;
	private final long telefono2;
	private final String direccion; 
	private final String tipo;
	private final String Ciudad;
	
	
	public RegistroUsuario(long cedula, String nombrecompleto, long telefono1,long telefono2, String direccion, String Ciudad, String tipo) {

		this.cedula=cedula;
		this.nombrecompleto=nombrecompleto;
		this.telefono1= telefono1;
		this.telefono2=telefono2;
		this.direccion = direccion;
		this.tipo = tipo;
		this.Ciudad=Ciudad;
	}


	public long getCedula() {
		return cedula;
	}


	public String getNombrecompleto() {
		return nombrecompleto;
	}


	public long getTelefono1() {
		return telefono1;
	}


	public long getTelefono2() {
		return telefono2;
	}


	public String getDireccion() {
		return direccion;
	}


	public String getTipo() {
		return tipo;
	}


	public String getCiudad() {
		return Ciudad;
	}
	
	
	public static boolean Verifica_datos() {
		return false;
	}
	
	public static boolean Guardar_informacion() {
		return false;		
	}
	
	public static boolean VerificaCorreo() {
		return false;
	}

	
}
