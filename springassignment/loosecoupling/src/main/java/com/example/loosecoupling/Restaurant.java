package com.example.loosecoupling;

public class Restaurant {

private HotDrink hotdrink;
    void prepareDrink()
    {
        hotdrink = new Tea();
        hotdrink.prepareDrink();


        // to prepare express tea we must change only hotdrink = new ExpressTea() hence the code is loosely coupled

        //hotdrink = new ExpressTea();

    }

}
