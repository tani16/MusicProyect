package com.music.model.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="artist")
public class ArtistDao {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idArtis")
	private int idArtist;
	
	@Column(name="nameArtist")
	private	String nameArtist;
	
	@Column(name="yearArtist")
	private Integer yearArtist;

	public int getIdArtist() {
		return idArtist;
	}

	public void setIdArtist(int idArtist) {
		this.idArtist = idArtist;
	}

	public String getNameArtist() {
		return nameArtist;
	}

	public void setNameArtist(String nameArtist) {
		this.nameArtist = nameArtist;
	}

	public Integer getYearArtist() {
		return yearArtist;
	}

	public void setYearArtist(Integer yearArtist) {
		this.yearArtist = yearArtist;
	}
	
}
