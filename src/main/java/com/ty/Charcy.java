package com.ty;

import javax.persistence.OneToOne;

public class Charcy {
	private int id;
	private String type;
	@OneToOne(mappedBy = "charcy")
	private Bike bike;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

}
