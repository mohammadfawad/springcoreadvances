package com.springframework.springcoreadvances.injecting.Interfaces.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("orderBOImpl")
public class OrderBOImpl implements OrderBO {
	
	@Autowired
	@Qualifier("orderDAOImpl2")
	private OrderDAO orderDAO;
	
	@Override
	public void placeOrder() {
		// TODO Auto-generated method stub
		System.out.println("Inside OrderBO ");
		orderDAO.creatOreder();
	}

	public OrderDAO getOrderDAO() {
		return orderDAO;
	}

	public void setOrderDAO(OrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}

	@Override
	public String toString() {
		return "OrderBOImpl [orderDAO=" + orderDAO + "]";
	}
	
}
