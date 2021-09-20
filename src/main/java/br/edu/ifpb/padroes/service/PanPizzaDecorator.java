package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.domain.Pizza;

public class PanPizzaDecorator extends PizzaShopDecorator{
	public PanPizzaDecorator(PizzaShopBase wrapper) {
		super(wrapper);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void orderPizza(Pizza pizza) {
		
		Float totalPrice = pizza.getPrice();
        String name = pizza.getName();
        
        totalPrice *= 1.15f; // 15% increase
        name += " (pan pizza)";
	}
}
