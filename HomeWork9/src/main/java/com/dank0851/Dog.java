package com.dank0851;
/*
* У каждого животного есть ограничения на действия
* (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
 */

public class Dog extends Animal {
    public final static int runRangeMax = 500;
    public final static int swimRangeMax = 10;

    static int cnt = 0;

    public Dog() {
        cnt++;
    }

    @Override
    public void swim(int range) {
        super.swim(range);
        if (range <= swimRangeMax) {
            System.out.println("Собака проплыла " + range + " метров.");
        } else {
            System.out.println("Дистанция слишком большая. " + range + " > " + swimRangeMax);
        }
    }

    @Override
    public void run(int range) {
        super.run(range);
        if (range <= runRangeMax) {
            System.out.println("Собака пробежала " + range + " метров.");
        } else {
            System.out.println("Дистанция слишком большая. " + range + " > " + runRangeMax);
        }
    }

}