package com.springframework.springcoreadvances.injecting.Interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInterfaceInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/springframework/springcoreadvances/injecting/Interfaces/injectingInterfacesConfig.xml");
//		OrderBOImpl orderBOImpl  = (OrderBOImpl) context.getBean("orderBOImpl");
//		System.out.println("\n\n Interface Injection  :: \n" );
//		orderBOImpl.placeOrder();
		//PolyMorphism interface can hold any implementation specific class i.e; subClass
		OrderBO orderBO  = (OrderBO) context.getBean("orderBOImpl");
		System.out.println("\n\n Interface Injection use polymorphism and Loose Coupling by holding Child Objects in common Parent Interface :: \n" );
		orderBO.placeOrder();
		//PolyMorphism interface can hold any implementation specific class i.e; subClass
		OrderBO orderBO2 = (OrderBO) context.getBean("orderBOImpl2");
		orderBO2.placeOrder();
	}

}
