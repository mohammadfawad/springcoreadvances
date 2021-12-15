package com.springframework.springcoreadvances.injecting.Interfaces.Annotations;

import org.springframework.stereotype.Component;

@Component("orderDAOImpl")
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void creatOreder() {
		// TODO Auto-generated method stub
		System.out.println("Inside OrderDAOImpl Method creatOreder() of OrderDAO ");
	}

}
