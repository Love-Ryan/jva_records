package com.mydomain.jinchul;

public class Application {
	public static void main(String[] args) {
		Me me1 = new Me();
		Me me2 = new Me("���ѹα�");
		Me me3 = new Me(31);
		Time time = new Time();
		Sick sick = new Sick();
		
		System.out.println("�̸�: " + me1.name);
		System.out.println("����: " + me2.nation);
		System.out.println("����: " + me3.age);
		time.whatToDo();
		
		System.out.println("------------------------------");
		
		sick.cheongchun();
	}
}

