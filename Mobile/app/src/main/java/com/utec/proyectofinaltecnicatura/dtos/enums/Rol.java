package com.utec.proyectofinaltecnicatura.dtos.enums;

public enum Rol {
	TUTOR,ANALISTA,ESTUDIANTE;
	
	@Override
	public String toString() {
		return name().charAt(0) + name().substring(1).toLowerCase();
	}
}