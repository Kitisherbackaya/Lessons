package com.kitisherbackaya.OOP.September20;

public class Phone {
    public long number = 0;
    public String model = "";
    public float weight = 0.0f;
    public String manufacturer = "";
    public Phone(String manufacturer, long number, String model, float weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
        this.manufacturer = manufacturer;
    }
    public void display(){
        System.out.println("Телефон " + this.manufacturer + ", Номер: " + this.number + " Модель " + this.model + " Вес " + this.weight + "g");
    }
    public void receiveCall(long number){
        System.out.println("Звонит номер телефона: " + number);
    }
    public long getNumber(){
        return this.number;
    }
    public String getModel(){
        return this.model;
    }
    public float getWeight(){
        return this.weight;
    }
    public String getManufacturer(){
        return this.manufacturer;
    }
    public void setNumber(long number){this.number = number;}
}
