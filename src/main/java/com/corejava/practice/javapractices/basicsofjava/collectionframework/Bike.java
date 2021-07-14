package com.corejava.practice.javapractices.basicsofjava.collectionframework;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class Bike {

	private String manufacturer;
	private int enginecapacity;

	public Bike(String manufacturer, int enginecapacity) {
		this.manufacturer = manufacturer;
		this.enginecapacity = enginecapacity;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getEnginecapacity() {
		return enginecapacity;
	}

	public void setEnginecapacity(int enginecapacity) {
		this.enginecapacity = enginecapacity;
	}

	public int hashCode() {
		return this.getEnginecapacity();
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bike other = (Bike) obj;
		if (enginecapacity != other.enginecapacity)
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bike [manufacturer=" + manufacturer + ", enginecapacity=" + enginecapacity + "]";
	}
}
