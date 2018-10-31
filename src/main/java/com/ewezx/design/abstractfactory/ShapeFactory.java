package com.ewezx.design.abstractfactory;

public class ShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shape) {
		if (shape == null) {
			return null;
		}
		if (shape.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}else if (shape.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}else if (shape.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		return null;
	}
	
	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
