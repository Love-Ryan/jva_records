package com.mydomain.jinchul;

public class Time {
	
	public void whatToDo () {
		
		Run run = new Run();
		Friends friend = new Friends();
		
		
		// ���� �ð��� ���ϴ� �Լ� ������ int��
		
		// �ؾߵ� �Լ� , input �� ������ �޴´�. �ƿ�ǲ�� ������ ��� �ɵ�
		//��
		
		// �ؾߵ��Ͽ��� ��µǾ�� �Ǵ� �Լ�
		
		int watch = (int)(Math.random()*5) + 6; {
			
			switch(watch) {
			
			case 6:

				break;
				
			case 7:
				System.out.println(watch + "�� �Դϴ�.");
				System.out.println("��ħ�� �Խ��ϴ�.");
				break;
				
			case 8:
				System.out.println(watch + "�� �Դϴ�.");
				System.out.println("��å�� �մϴ�.");
				run.getEnergy(50);
				run.walkOrGoHome();
				break;
			
			case 9:
				System.out.println(watch + "�� �Դϴ�.");
				System.out.println("�Ľ��ϴ�.");
				break;
				
			default:
				System.out.println(watch + "�� �Դϴ�.");
				friend.meetFriends();
				}
			}
		}
}