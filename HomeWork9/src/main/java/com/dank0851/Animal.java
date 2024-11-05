package com.dank0851;
/*
*Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина
* препятствия. Результатом выполнения действия будет печать в консоль.
* (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
 */

public abstract class Animal {
    public int catBowl = 0;

    public void run(int distance) {
        System.out.println("Животное пробежало " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println("Животное проплыло " + distance + " м.");
    }

    public void getFoodFromBowl() {

        System.out.println("В миске кота " + catBowl + "корма");
    }


}
