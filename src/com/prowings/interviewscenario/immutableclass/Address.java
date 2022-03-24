package com.prowings.interviewscenario.immutableclass;

public class Address {
	private String city;
	private String country;
	private int pin;

	public void setCity(String city) {
		this.city = city;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public int getPin() {
		return pin;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", pin=" + pin + "]";
	}

}
