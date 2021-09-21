package br.edu.ifpb.padroes.service;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;

public class PizzaData implements PizzaLib {
	
	private List<PizzaHotPizza> cachePizzaHot = new ArrayList<>();
	private List<DamenosPizza> cachePizzaDamenos = new ArrayList<>();
	
	@Override
	public List<DamenosPizza> getPizzasDamenos() {
		// TODO Auto-generated method stub
		return cachePizzaDamenos;
	}

	@Override
	public List<PizzaHotPizza> getPizzasPizzaHot() {
		// TODO Auto-generated method stub
		return cachePizzaHot;
	}

}
