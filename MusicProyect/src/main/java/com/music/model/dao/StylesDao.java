package com.music.model.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="styles")
public class StylesDao implements Serializable{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idStyle")
	private int idStyle;
	
	@Column(name="nameStyle")
	private	String nameStyle;

	public int getIdStyle() {
		return idStyle;
	}

	public void setIdStyle(int idStyle) {
		this.idStyle = idStyle;
	}

	public String getNameStyle() {
		return nameStyle;
	}

	public void setNameStyle(String nameStyle) {
		this.nameStyle = nameStyle;
	}
	
}