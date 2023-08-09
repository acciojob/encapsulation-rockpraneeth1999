package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly=new RWOnly();

        //rwOnly.name="Praneeth";
        //System.out.println(rwOnly.name);

        rwOnly.setName("Praneeth");
        System.out.println(rwOnly.getName());


    }
}