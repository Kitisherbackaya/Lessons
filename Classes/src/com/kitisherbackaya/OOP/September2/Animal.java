package com.kitisherbackaya.OOP.September2;

public class Animal {
    public String name = "Без имени";
    public String phrase = " Молчит";
    public String action = " Чиллит";
    public Animal(String link, String words,String chilling){
        this.name = link;
        this.phrase = words;
        this.action = chilling;
    }
    public void say(){
        System.out.println(" Животное с именем" + this.name +" говорит:" + this.phrase + ", пока"+ this.action);

    }
}
