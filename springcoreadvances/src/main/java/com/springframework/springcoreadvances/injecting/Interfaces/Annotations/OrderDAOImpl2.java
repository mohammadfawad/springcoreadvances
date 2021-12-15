package com.springframework.springcoreadvances.injecting.Interfaces.Annotations;

import org.springframework.stereotype.Component;

@Component("orderDAOImpl2")
public class OrderDAOImpl2 implements OrderDAO {

	@Override
	public void creatOreder() {
		// TODO Auto-generated method stub
		System.out.println("Inside OrderDAOImpl2 Method creatOreder() of OrderDAO ");

	}

}
