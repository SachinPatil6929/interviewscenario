package com.prowings.interviewscenario.immutableclass;

public final class ImmutableEmployee {
	private final int id;
	private final String name;
	private final Address address;

	public ImmutableEmployee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		Address dummyAddress = new Address();
		dummyAddress.setCity(address.getCity());
		dummyAddress.setCountry(address.getCountry());
		dummyAddress.setPin(address.getPin());

		this.address = dummyAddress;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {

		Address cloneAddress = new Address();
		cloneAddress.setCity(this.address.getCity());
		cloneAddress.setCountry(this.address.getCountry());
		cloneAddress.setPin(this.address.getPin());
		return cloneAddress;

	}

	@Override
	public String toString() {
		return "ImmutableEmployee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
