package com.vti.academy.Exercise3;

import com.vti.academy.Exercise3.Car.Engine;

public class Program {
	public static void main(String[] args) {
		Car car = new Car("Mazda", "8WD");
		Engine engine = car.new Engine();
		engine.setEngineType("Cryler");
		car.setEngine(engine);
		System.out.println(car.toString());
	}
}
