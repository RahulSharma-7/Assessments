package com.example.loosecoupling;

public class Tea implements HotDrink
{

    @Override
    public void prepareDrink()
    {

        System.out.println(">>>>>>>>>>>>>>>>>>>>");
        System.out.println("Preparing Tea");
        System.out.println(">>>>>>>>>>>>>>>>>>>>");

    }
}
