package com.mydomain.jinchul;

public class Run {

	int energy = 0;
	
	public void getEnergy(int energy) {
		this.energy = energy;
	}
	
	public void walkOrGoHome() {
		while(true) {
			
			if(energy > 0) {
				System.out.println("달립니다");
				energy -= 10;
			} else if(energy == 0) {
				System.out.println("집에 갑니다");
				return;
			}
		}
	}
}
