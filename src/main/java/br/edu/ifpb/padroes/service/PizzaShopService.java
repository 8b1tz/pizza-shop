package br.edu.ifpb.padroes.service;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.domain.Pizza;
import br.edu.ifpb.padroes.domain.adapter.DamenosAdapter;
import br.edu.ifpb.padroes.domain.adapter.PizzahotAdapter;

public class PizzaShopService implements PizzaShopBase,  PizzaLib{
	
	private PizzaCacheProxy proxy; 
	
    public PizzaShopService() {
        this.proxy = new PizzaCacheProxy();
    }

    public void orderPizza(Pizza pizza) {

        Float totalPrice = pizza.getPrice();
        String name = pizza.getName();
        
        
        System.out.println(String.format("New order for = %s", name));
        System.out.println(String.format("Total price = %f", totalPrice));

    }   
    
    @Override
    public List<DamenosPizza> getPizzasDamenos() {
        return proxy.getPizzasDamenos();
    }
  
	@Override
    public List<PizzaHotPizza> getPizzasPizzaHot() {
        return proxy.getPizzasPizzaHot();
    }

	public List<Pizza> getPizzas(){
		
	      
	      List<Pizza> pizzas = new ArrayList<>();
	      
	      proxy.getPizzasDamenos().forEach( p -> pizzas.add(new DamenosAdapter(p)));
	      
	      proxy.getPizzasPizzaHot().forEach( p -> pizzas.add(new PizzahotAdapter(p)));
	      
		return pizzas;
	   
	      
	}
}
