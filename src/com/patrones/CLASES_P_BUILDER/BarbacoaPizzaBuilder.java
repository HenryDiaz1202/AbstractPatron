package com.patrones.CLASES_P_BUILDER;

public class BarbacoaPizzaBuilder extends PizzaBuilder{

    @Override
    public void ponerNombre() {
        // TODO Auto-generated method stub
        pizza.setNombre("Barbacoa");

    }

    @Override
    public void crearMasa() {
        // TODO Auto-generated method stub
        pizza.setMasa("gorda");

    }

    @Override
    public void crearSalsa() {
        // TODO Auto-generated method stub
        pizza.setSalsa("barbacoa");

    }

    @Override
    public void crearIngrediente() {
        // TODO Auto-generated method stub
        pizza.setIngredientes("mozzarella,ternera,cebolla,maiz");

    }

}
