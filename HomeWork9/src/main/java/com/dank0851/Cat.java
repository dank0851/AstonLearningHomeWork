package com.dank0851;

/*
*Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
*  Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150);
*  -> 'Бобик пробежал 150 м.');
* У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
* плавание: кот не умеет плавать, собака 10 м.).

* Добавить подсчет созданных котов, собак и животных.

* Расширить задачу, добавив для котов возможность кушать из миски, выполнив следующие
* пункты:
* Сделать так, чтобы в миске с едой не могло получиться отрицательного количества еды (например, в миске 10 еды,
*  а кот пытается покушать 15-20).

* Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
* Если коту удалось покушать (хватило еды), сытость = true.
*

* Считаем, что если коту мало еды в миске, то он её просто не трогает,
* то есть не может быть наполовину сыт (это сделано для упрощения логики программы).

* Создать массив котов и миску с едой, попросить всех котов покушать из этой миски
*  и потом вывести информацию о сытости котов в консоль.

* Добавить метод, с помощью которого можно было бы добавлять еду в миску.
*
 */




public class Cat extends Animal {

    public final static int runRangeMax = 200;
    static int cnt = 0;
    public boolean satiety;
    public int gluttony;

    public static class Feeder {
        private int feed;

        public void fillFeeder(int n) {
            feed = feed + n;
        }

        public Feeder(int feed) {
            this.feed = feed;
        }
    }

    public Cat() {
        cnt++;
        this.satiety = false;
        this.gluttony = (int) ((Math.random() * 9) + 1);
    }

    @Override
    public void swim(int range) {
        super.swim(range);
        System.out.println("Кот не умеет плавать");
    }

    @Override
    public void run(int range) {
        super.run(range);

        if (range <= runRangeMax) {
            System.out.println("Кот пробежал " + range + " метров.");
        } else {
            System.out.println("Дистанция слишком большая. " + range + " > " + runRangeMax);
        }
    }

    public void feedCat(Feeder feeder){

        if (this.satiety) {
            System.out.println("Кот сыт, количество еды в миске не изменилось.");
        }
        if (feeder.feed >= this.gluttony) {
            feeder.feed -= this.gluttony;
            this.satiety = true;
            System.out.print("Кот теперь сыт. ");
        } else {
            System.out.print("Коту не хватило еды. ");
        }
        System.out.println("В миске осталось " + feeder.feed + " еды.");
    }

    @Override
    public String toString() {
        return "Кот [" +
                "сыт: " + satiety +
                ", прожорливость: " + gluttony +
                ']';
    }
}
