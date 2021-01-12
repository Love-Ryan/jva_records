package com.mydomain.jinchul;

public class Application {
	public static void main(String[] args) {
		Me me1 = new Me();
		Me me2 = new Me("대한민국");
		Me me3 = new Me(31);
		Time time = new Time();
		Sick sick = new Sick();
		
		System.out.println("이름: " + me1.name);
		System.out.println("국적: " + me2.nation);
		System.out.println("나이: " + me3.age);
		time.whatToDo();
		
		System.out.println("------------------------------");
		
		sick.cheongchun();
	}
}

