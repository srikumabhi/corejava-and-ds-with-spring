package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.oopsmisc.objectclass;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class Bike {

	private int engineCapacity;
	private String color;

	public Bike(int engineCapacity, String color) {
		this.engineCapacity = engineCapacity;
		this.color = color;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "Bike [engineCapacity=" + engineCapacity + ", color=" + color
				+ "]";
	}
}
