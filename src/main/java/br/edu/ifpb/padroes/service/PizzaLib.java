package br.edu.ifpb.padroes.service;

import java.util.List;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;

public interface PizzaLib {
	
	
	

	List<DamenosPizza> getPizzasDamenos();

	List<PizzaHotPizza> getPizzasPizzaHot();
}
