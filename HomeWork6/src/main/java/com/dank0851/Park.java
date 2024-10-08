package com.dank0851;

/*
3. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах,
 времени их работы и стоимости
*/
public class Park {


	public class Attraction {
		String nameAttraction;
		String workingTime;
		double price;

		public Attraction(String nameAttraction, String workingTime, double price) {
			this.nameAttraction = nameAttraction;
			this.workingTime = workingTime;
			this.price = price;
		}



	}
}

