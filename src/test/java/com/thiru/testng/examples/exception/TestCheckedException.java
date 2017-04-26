package com.thiru.testng.examples.exception;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.thiru.testng.project.order.Order;
import com.thiru.testng.project.order.OrderBo;
import com.thiru.testng.project.order.OrderNotFoundException;
import com.thiru.testng.project.order.OrderSaveException;
import com.thiru.testng.project.order.OrderUpdateException;

public class TestCheckedException {

	OrderBo orderBo;
	Order data;

	@BeforeTest
	void setup() {
		orderBo = new OrderBo();

		data = new Order();
		data.setId(1);
		data.setCreatedBy("Thiru");
	}

	@Test(expectedExceptions = OrderSaveException.class)
	public void throwIfOrderIsNull() throws OrderSaveException {
		orderBo.save(null);
	}

	@Test(expectedExceptions = { OrderUpdateException.class, OrderNotFoundException.class })
	public void throwIfOrderIsNotExists() throws OrderUpdateException, OrderNotFoundException {
		orderBo.update(data);
	}
	
}