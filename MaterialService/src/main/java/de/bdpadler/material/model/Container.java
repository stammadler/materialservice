package de.bdpadler.material.model;

import java.util.List;

import javax.persistence.Entity;

public class Container extends Inventory {

	public static enum Types { BOX, SACK, BUNDLE, CASE }
	
	private List<Material> content;

	public Container() {
		super();
	}
	
	public Container(String name) {
		super(name);
	}

	public List<Material> getContent() {
		return content;
	}

	public void setContent(List<Material> content) {
		this.content = content;
	}
		
}
