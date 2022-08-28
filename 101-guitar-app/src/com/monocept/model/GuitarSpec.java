package com.monocept.model;

public class GuitarSpec {

	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;

	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public boolean matches(GuitarSpec spec){
		if(!builder.equals(spec.getBuilder())){
			return false;
		}
		String model=spec.getModel();
		if(!model.equals("") && model!=null && !model.equalsIgnoreCase(model)){
			return false;
		}
		if(!type.equals(spec.getType())){
			return false;
		}
		if(!backWood.equals(spec.getBackWood())){
			return false;
		}
		if(!topWood.equals(spec.getTopWood())){
			return false;
		}
		return true;
	}

}
