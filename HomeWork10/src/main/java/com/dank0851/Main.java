package com.dank0851;



public class Main {
	public static void main(String[] args) {
		Cat barsik = new Cat("Барсик");
		Cat phobos = new Cat("Фобос");
		Cat persik = new Cat("Персик");
		Dog bobik = new Dog("Бобик");
		Dog wolf = new Dog("Волк");
		Dog sharik = new Dog("Шарик");
		Dog tuzik = new Dog("Тузик");

		barsik.run(150);
		phobos.run(300);
		persik.swim(30);
		bobik.run(0);
		wolf.run(600);
		sharik.swim(0);
		tuzik.swim(30);
		System.out.println();

		//task 1.2
		Bowl bowl = new Bowl();
		Cat[] kittens = new Cat[5];
		kittens[0] = new Cat("Чиби");
		kittens[1] = new Cat("Чёрный");
		kittens[2] = new Cat("Гараж");
		kittens[3] = new Cat("Снежок");
		kittens[4] = new Cat("Васька");
		for (Cat kitten : kittens) {
			bowl.food();
			kitten.eat(bowl);
			bowl.putFood();
		}
		// Задание 2
		GeometricFigure[] figures = new GeometricFigure[3];
		figures[0] = new Circle(3.0, " оранжевый", " красный");
		figures[1] = new Square(6.0, " чёрный", " белый");
		figures[2] = new Triangle(9.0, 5.0, " розовый", " фиолетовый");

		for (GeometricFigure figure: figures) {
			System.out.println(figure + " Периметр: " + figure.perimeter() +  "  Площадь: " + figure.area());
		}
	}
}