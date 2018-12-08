package com.dalvikmx.facadepattern;

public class Facade {

    private Product apple, coke, crisps, juice;

    //Init the variables with each particular class
    public Facade() {
        apple = new Apple();
        coke = new Coke();
        crisps = new Crisps();
        juice = new Juice();
    }

    //we create functions to dispense to each object and return the id reference

    public int dispenseApple() {
        return  apple.dispense();
    }

    public int dispenseCoke() {
        return  coke.dispense();
    }

    public int dispenseCrisps() {
        return  crisps.dispense();
    }

    public int dispenseJuice() {
        return  juice.dispense();
    }

}
