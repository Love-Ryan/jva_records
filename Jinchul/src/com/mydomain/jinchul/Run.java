package com.mydomain.jinchul;

public class Run {

	int energy = 0;
	
	public void getEnergy(int energy) {
		this.energy = energy;
	}
	
	public void walkOrGoHome() {
		while(true) {
			
			if(energy > 0) {
				System.out.println("�޸��ϴ�");
				energy -= 10;
			} else if(energy == 0) {
				System.out.println("���� ���ϴ�");
				return;
			}
		}
	}
}
