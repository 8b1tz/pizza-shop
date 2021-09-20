package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.domain.Pizza;

public class PizzaShopDecorator implements PizzaShopBase{

	private PizzaShopBase wrapper;

	public PizzaShopDecorator(PizzaShopBase wrapper) {
		this.wrapper = wrapper;
	}
	@Override
	 public void orderPizza(Pizza pizza) {
		 	wrapper.orderPizza(pizza);
	    }
	public PizzaHotPizza[] getPizzasPizzaHot() {
		// TODO Auto-generated method stub
		return null;
	}
	public DamenosPizza[] getPizzasDamenos() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
