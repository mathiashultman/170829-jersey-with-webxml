package com.mkyong.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {
	private String name="hej";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
