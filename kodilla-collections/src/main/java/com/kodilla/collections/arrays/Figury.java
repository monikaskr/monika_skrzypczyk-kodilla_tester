package com.kodilla.collections.arrays;

import java.util.Random;

public class Figury {

    String figura;
    //int wymiar;

    public Figury (String figura) {
        this.figura = figura;
        //this.wymiar = wymiar;
    }

    public static void main(String[] args) {

        Figury prostokat = new Figury ("prostokat");
        Figury kwadrat = new Figury ("kwadrat");
        Figury kolo = new Figury("kolo");
        Figury trojkat = new Figury("trojkat");
        Figury trapez = new Figury("trapez");
        Figury romb = new Figury ("romb");
        Figury szesciokat = new Figury ("szesciokat");
        Figury pieciagat = new Figury ("pieciagat");
        Figury rownoleglobok = new Figury ("rownoleglobok");
        Figury deltoid = new Figury ("deltoid");

        Figury[] fig = {prostokat, kwadrat, kolo, trojkat, trapez, romb, szesciokat, pieciagat, rownoleglobok, deltoid};

        Random random = new Random();
        for(int i =0; i < fig.length ; i++)
        {
            int answer = random.nextInt(fig.length);
            System.out.println(answer);
            //System.out.println(fig[answer]);
        }



    }
}
