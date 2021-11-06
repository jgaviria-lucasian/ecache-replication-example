package com.test.cache;

import java.io.Serializable;

public class ElementoVO implements Serializable {

	private String id;
	private String valor;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	
}
