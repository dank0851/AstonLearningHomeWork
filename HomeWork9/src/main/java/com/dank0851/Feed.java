package com.dank0851;

public class Feed {
	private int feed=0;
	public int catBowl = 0;
	public void fillFeeder(int n) {
		feed = feed + n;
		System.out.println("Вы положили в миску" + n + "еды");
	}

	public Feed(int feed) {

	}
	public void getFoodFromBowl() {

		System.out.println("В миске кота " + catBowl + "корма");
	}



}
