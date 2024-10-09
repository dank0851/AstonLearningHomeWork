package com.dank0851;

public class Main {
    public static void main(String[] args) {


        /*// 2. вначале объявляем массив объектов
         *Person[] persArray = new Person[5];
         *    // потом для каждой ячейки массива задаем объект
         * 8persArray[0] = new Person("Ivanov Ivan", "Engineer",
         * "ivivan@mailbox.com", "892312312", 30000, 30);
         * persArray[1] = new Person(...);
         *    ...persArray[4] = new Person(...);
         */
        Person person1 = new Person("Igor Sidorov", "AQA tester", "Igorhalloworld@mail.ru", "+375333453434",120000, 25 );

        Person[] personArray = new Person[5];
        personArray[0] = new Person("Ivanov Ivan", "Engeneer", "ivivan@mailbox.com", "892312312", 30000, 30);
        personArray[1] = new Person("Petrov Petr", "Bricklayer", "PeterInSquare@mail.com", "+375447282828", 65000, 45);
        personArray[2] = new Person("Semenov Oleg Ivanovoch", "Barista", "SOIvanovich@mail.com", "+3752929299", 25000, 22);
        personArray[3] = new Person("Belousov Dmitriy", "Driver", "Belousov_dmitriy@mail.com", "+375444545445", 45000, 35);
        personArray[4] = new Person("Belova Olga", "Dancer", "OlgaDancer@mail.com", "+375444554545", 40000, 28);

        for (Person person : personArray) {
            person.info1();
            System.out.println();
        }

        Park.Attraction attraction1 = new Park.Attraction("Сюрприз","10,00-22,00",5.5);

        System.out.println("Название атракциона - " + attraction1.nameAttraction);
        System.out.println("Время работы атракциона - " + attraction1.workingTime);
        System.out.println("Стоимость атракциона - " + attraction1.price);

    }
}