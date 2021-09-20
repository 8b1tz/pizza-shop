package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.domain.Pizza;

public class ExtraCheeseDecorator extends PizzaShopDecorator {

	public ExtraCheeseDecorator(PizzaShopBase wrapper) {
		super(wrapper);
	}

	@Override
	public void orderPizza(Pizza pizza) {
		
		Float totalPrice = pizza.getPrice();
        String name = pizza.getName();
        
        totalPrice *= 1.10f; // 10% increase
        name += " (extra cheese)";
	}
}
