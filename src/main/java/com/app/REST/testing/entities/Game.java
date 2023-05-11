package com.app.REST.testing.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Classe sem o uso de Lombok
 * Mapeamento de objetos
 * Entidade serializada 
 */

@Entity
@Table(name = "tb_Game")
public class Game implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id													
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id;
	private String title;
	
	@Column(name = "game_year")
	private Integer year;
	private String name;
	private String genre;
	private String plataform;
	private String imgUrl;
	private String shortDesc;
	private String longDesc;
	
	public Game() {
	}

	public Game(String title, Integer year, String name, String genre, String plataform, String imgUrl,
			String shortDesc, String longDesc) {
		super();
		this.title = title;
		this.year = year;
		this.name = name;
		this.genre = genre;
		this.plataform = plataform;
		this.imgUrl = imgUrl;
		this.shortDesc = shortDesc;
		this.longDesc = longDesc;
	}

	public Integer getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlataform() {
		return plataform;
	}

	public void setPlataform(String plataform) {
		this.plataform = plataform;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public String getLongDesc() {
		return longDesc;
	}

	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;
	}

	@Override
	public int hashCode() {
		return Objects.hash(genre, id, imgUrl, longDesc, plataform, shortDesc, title, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(genre, other.genre) && Objects.equals(id, other.id)
				&& Objects.equals(imgUrl, other.imgUrl) && Objects.equals(longDesc, other.longDesc)
				&& Objects.equals(plataform, other.plataform) && Objects.equals(shortDesc, other.shortDesc)
				&& Objects.equals(title, other.title) && Objects.equals(year, other.year);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
