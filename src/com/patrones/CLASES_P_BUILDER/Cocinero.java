package com.patrones.CLASES_P_BUILDER;

public class Cocinero {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb){
        pizzaBuilder=pb;
    }

    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }

    public void crearPizza(){
        pizzaBuilder.crearNuevaPizza();
        pizzaBuilder.ponerNombre();
        pizzaBuilder.crearMasa();
        pizzaBuilder.crearSalsa();
        pizzaBuilder.crearIngrediente();
    }
}
