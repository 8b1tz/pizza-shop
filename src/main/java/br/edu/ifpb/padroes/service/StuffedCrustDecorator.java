package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.domain.Pizza;

public class StuffedCrustDecorator extends PizzaShopDecorator{
	
	public StuffedCrustDecorator(PizzaShopBase wrapper) {
		super(wrapper);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void orderPizza(Pizza pizza) {
		
		Float totalPrice = pizza.getPrice();
        String name = pizza.getName();
        
        totalPrice *= 1.20f; // 20% increase
        name += " (stuffed crust)";
	}
}
