package com.vti.academy.Exercise3;

public class Car {
	private String name;
	private String type;
	private Engine engine;
	
	public Car(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public class Engine {
		private String engineType;

		public String getEngineType() {
			return engineType;
		}

		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}
		
		@Override
		public String toString() {
			return engineType;
		}
	}
	
	@Override
	public String toString() {
		String result = "\nName: " + name	
						+ "\nType: " + type
						+ "\nEngineType: " + this.new Engine().toString();
		return result;
	}
}
