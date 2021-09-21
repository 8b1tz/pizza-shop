package br.edu.ifpb.padroes.service;

import java.util.List;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.damenos.DamenosServiceImpl;
import br.edu.ifpb.padroes.api.damenos.proxy.DamenosService;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotServiceImpl;
import br.edu.ifpb.padroes.api.pizzahot.proxy.PizzaHotService;
import br.edu.ifpb.padroes.domain.Pizza;

public class PizzaShopService implements PizzaShopBase,  PizzaLib{
	
	private PizzaCacheProxy proxy; 
    private DamenosService damenosService;
    private PizzaHotService pizzaHotService;

    public PizzaShopService() {
        this.proxy = new PizzaCacheProxy();
    }

    public void orderPizza(Pizza pizza) {

        Float totalPrice = pizza.getPrice();
        String name = pizza.getName();
        
        
        System.out.println(String.format("New order for = %s", name));
        System.out.println(String.format("Total price = %f", totalPrice));

    }

    // TODO - implementar adapter para unificar pizzas vindas das APIs Damenos e PizzaHot num único método getPizzas()
   
    @Override
    public List<DamenosPizza> getPizzasDamenos() {
        return proxy.getPizzasDamenos();
    }
  
	@Override
    public List<PizzaHotPizza> getPizzasPizzaHot() {
        return proxy.getPizzasPizzaHot();
    }

	
}
