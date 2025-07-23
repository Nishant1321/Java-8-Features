package MethodOrConstructorRefrence;

public class ConstructorRefrenceProgram {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ConstructorRefrenceProgram(String name) {
		super();
		this.name = name;
	}
	
}
