package com.springframework.springcoreadvances.injecting.Interfaces;

public class OrderBOImpl implements OrderBO {

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
