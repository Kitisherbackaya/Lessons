package com.kitisherbackaya.OOP.Main;

import com.kitisherbackaya.OOP.September17.Calculator;
import com.kitisherbackaya.OOP.September2.Animal;
import com.kitisherbackaya.OOP.September20.Chess;
import com.kitisherbackaya.OOP.September20.Phone;

public class Main {

    public static void main(String[] args) {
//        Animal cat = new Animal(" Васька"," мяв"," лежит");
//        Animal dog = new Animal(" Добер"," тяв", " спит");
//        Animal human = new Animal(" Придурок","я не люблю животных", " ест чипсы");
//        cat.say();
//        dog.say();
//        human.say();
//    cat.name = " Барсик";
//    cat.say();


//        Calculator tesla = new Calculator (5,7);
//        tesla.deduction();
//        tesla.show();

        Phone apple = new Phone("Apple",9087654321L,"App13",203f);
        Phone samsung = new Phone("Samsung",89018273645L, "S8", 155f);
        Phone abracadabra = new Phone("Abracadabra",83735364785452L, "Abracadabra666",600f);
        apple.display();
        samsung.display();
        abracadabra.display();
        apple.setNumber(85479846594656L);
        apple.display();
        samsung.receiveCall(abracadabra.getNumber());
         for (int counter = 0; counter < 2; counter++ ){
             System.out.println();
         }



        Chess blackWhite = new Chess();
        for (int column=0; column<8;column++){
        blackWhite.addFigure('P',1, column);
        blackWhite.addFigure('P',6, column);
        }
        blackWhite.addFigure('R', 0,0);
        blackWhite.addFigure('R',0,7);
        blackWhite.addFigure('R',7,0);
        blackWhite.addFigure('R',7,7);
        blackWhite.addFigure('N',0,1);
        blackWhite.addFigure('N',7,1);
        blackWhite.addFigure('N',7,6);
        blackWhite.addFigure('N',0,6);
        blackWhite.addFigure('B',0,2);
        blackWhite.addFigure('B',0,5);
        blackWhite.addFigure('B',7,2);
        blackWhite.addFigure('B',7,5);
        blackWhite.addFigure('K',0,3);
        blackWhite.addFigure('K',7,4);
        blackWhite.addFigure('Q',0,4);
        blackWhite.addFigure('Q',7,3);



        blackWhite.showBoard();

    }
}
