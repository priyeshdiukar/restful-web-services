package com.udemy.webservices.restfulwebservices.versioning;

public class PersonV2 {
	private Name name = new Name();
	
	public PersonV2() {
		super();
	}
	
	public PersonV2(Name name) {
		super();
		this.name = name;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}
}
