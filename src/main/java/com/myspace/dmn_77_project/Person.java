package com.myspace.dmn_77_project;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Person implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label(value = "Age")
	private int age;

	public Person() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(java.lang.String name, int age) {
		this.name = name;
		this.age = age;
	}

}