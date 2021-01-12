package com.mydomain.jinchul;

public class Time {
	
	public void whatToDo () {
		
		Run run = new Run();
		Friends friend = new Friends();
		
		
		// 현재 시간을 구하는 함수 리턴은 int로
		
		// 해야될 함수 , input 은 위에서 받는다. 아웃풋은 지금은 없어도 될듯
		//네
		
		// 해야될일에서 출력되어야 되는 함수
		
		int watch = (int)(Math.random()*5) + 6; {
			
			switch(watch) {
			
			case 6:

				break;
				
			case 7:
				System.out.println(watch + "시 입니다.");
				System.out.println("아침을 먹습니다.");
				break;
				
			case 8:
				System.out.println(watch + "시 입니다.");
				System.out.println("산책을 합니다.");
				run.getEnergy(50);
				run.walkOrGoHome();
				break;
			
			case 9:
				System.out.println(watch + "시 입니다.");
				System.out.println("씻습니다.");
				break;
				
			default:
				System.out.println(watch + "시 입니다.");
				friend.meetFriends();
				}
			}
		}
}