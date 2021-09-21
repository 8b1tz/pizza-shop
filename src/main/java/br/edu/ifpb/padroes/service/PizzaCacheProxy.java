package br.edu.ifpb.padroes.service;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.domain.Pizza;

public class PizzaCacheProxy implements PizzaLib{
	
	private PizzaShopService pizzaShopService;
	private List<PizzaHotPizza> cachePizzaHot = new ArrayList<>();
	private List<DamenosPizza> cachePizzaDamenos = new ArrayList<>();
    
	@Override
	public List<DamenosPizza> getPizzasDamenos() {
		if (cachePizzaDamenos.isEmpty()) {
			cachePizzaDamenos = pizzaShopService.getPizzasDamenos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePizzaDamenos;
	}
	@Override
	public List<PizzaHotPizza> getPizzasPizzaHot() {
		if (cachePizzaHot.isEmpty()) {
			cachePizzaHot = pizzaShopService.getPizzasPizzaHot();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePizzaHot;
	}
    
	
}
