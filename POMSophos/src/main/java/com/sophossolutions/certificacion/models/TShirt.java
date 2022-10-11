package com.sophossolutions.certificacion.models;

public class TShirt {

	private String category;
	private String description;
	private String quantity;
	private String size;
	private String color;

	public TShirt(String category, String description, String quantity, String size, String color) {
		super();
		this.category = category;
		this.description = description;
		this.quantity = quantity;
		this.size = size;
		this.color = color;
	}

	public String getCategory() {
		return category;
	}

	public String getDescription() {
		return description;
	}

	public String getQuantity() {
		return quantity;
	}

	public String getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}

}
