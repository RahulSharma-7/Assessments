package com.example.loosecoupling;

public class ExpressTea implements HotDrink
{

    @Override
    public void prepareDrink()
    {
        System.out.println(">>>>>>>>>>>>>>>>>>>>");
        System.out.println("Preparing Express Tea");
        System.out.println(">>>>>>>>>>>>>>>>>>>>");

    }
}
