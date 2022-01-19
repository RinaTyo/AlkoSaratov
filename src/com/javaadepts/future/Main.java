package com.javaadepts.future;


public class Main {
    public static void main(String[] args) {

        Task01 task01 = new Task01();
        Human human = task01.createHuman(32, "Oleg");
        int i = 0;
        Pivo pivo = task01.buyPivo(35, human.getAge());

        task01.fillForExample();

    }
}
