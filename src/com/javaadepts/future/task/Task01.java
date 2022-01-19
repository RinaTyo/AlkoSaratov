package com.javaadepts.future.task;

import com.javaadepts.future.db.Human;
import com.javaadepts.future.db.Pivo;

public class Task01 {

    private int a;
    private double d;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public Human createHuman(int age, String name) {
        Human human = new Human();
        human.setAge(age);
        human.setName(name);
        return human;
    }

    public Pivo buyPivo(Integer cash, int pizduk) {
        Pivo pivo = new Pivo();
        pivo.setCost(cash);
        if (pivo.getCost() > 50) {
            pivo.setName("темное");
        }

        if (cash < 50) {
            pivo.setName("светлое");
        }

        if (pizduk < 18 || cash <= 0) {
            pivo.setName("иди на хуй пиздюк или просто иди на хуй");
            pivo.setSale(false);
            return pivo;
        }
        pivo.setSale(true);
        return pivo;
    }
    // return 18
    // break
    // continue 10

    public void fillForExample(){
        String slovo = "Иди на хуй";
        int age = 0;
        // i =0
        // i<20

        for (int i = 0; i < 20; i++){

            if (i == 15){
                continue;
                //i++
            }

            if (i==18){
                return;
            }
            System.out.println(i + " итерация # " + i + " ");
            //i++
        }

    }

    private boolean isPrivateMethod() {
        return true;
    }
}
