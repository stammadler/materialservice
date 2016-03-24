package de.bdpadler.material.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inventory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long dbid;
	private String name;
	private String beschreibung;
	private String inventarnummer;
	private Integer beschaffungsjahr;
	private Double preis; // Anschaffungspreis in Euro
	private String tagno; // RFID oder sonstiger Tag-Nummer
	
	public Inventory() {
		super();
	}
	
	public Inventory(String name) {
		super();
		this.name = name;
	}

	public Long getDbid() {
		return dbid;
	}
	public void setDbid(Long dbid) {
		this.dbid = dbid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBeschreibung() {
		return beschreibung;
	}
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	public String getInventarnummer() {
		return inventarnummer;
	}
	public void setInventarnummer(String inventarnummer) {
		this.inventarnummer = inventarnummer;
	}
	public Integer getBeschaffungsjahr() {
		return beschaffungsjahr;
	}
	public void setBeschaffungsjahr(Integer beschaffungsjahr) {
		this.beschaffungsjahr = beschaffungsjahr;
	}
	public Double getPreis() {
		return preis;
	}
	public void setPreis(Double preis) {
		this.preis = preis;
	}
	public String getTagno() {
		return tagno;
	}
	public void setTagno(String tagno) {
		this.tagno = tagno;
	}

	
	
}
