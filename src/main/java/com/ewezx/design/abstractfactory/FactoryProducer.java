package com.ewezx.design.abstractfactory;

/**
 * 工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂
 * @author czh
 * @since 2018年10月31日 下午2:12:47
 * @version 1.0
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String choice){
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		}else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;
	}
}
