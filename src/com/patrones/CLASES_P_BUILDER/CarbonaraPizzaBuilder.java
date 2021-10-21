package com.patrones.CLASES_P_BUILDER;

public class CarbonaraPizzaBuilder extends PizzaBuilder{

    @Override
    public void ponerNombre() {
        // TODO Auto-generated method stub
        pizza.setNombre("Carbonara");

    }

    @Override
    public void crearMasa() {
        // TODO Auto-generated method stub
        pizza.setMasa("fina");

    }

    @Override
    public void crearSalsa() {
        // TODO Auto-generated method stub
        pizza.setSalsa("carbonara");
    }

    @Override
    public void crearIngrediente() {
        // TODO Auto-generated method stub
        pizza.setIngredientes("mozzarella,bacon,cebolla");

    }

}