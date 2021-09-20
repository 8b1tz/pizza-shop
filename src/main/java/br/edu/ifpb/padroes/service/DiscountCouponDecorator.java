package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.domain.Pizza;

public class DiscountCouponDecorator extends PizzaShopDecorator {

	public DiscountCouponDecorator(PizzaShopBase wrapper) {
		super(wrapper);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void orderPizza(Pizza pizza) {
		
		Float totalPrice = pizza.getPrice();
        String name = pizza.getName();
        
		totalPrice *= 0.25f;
	}
}
