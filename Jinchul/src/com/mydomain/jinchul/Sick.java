package com.mydomain.jinchul;

public class Sick {
	
	public void cheongchun() {
		
		Ache body = null;
		int area = (int)(Math.random()*8) + 1;
		
		switch(area) {
		
		case 1:
			body = Ache.HEAD;
			break;
		
		case 2:
			body = Ache.EYE;
			break;
			
		case 3:
			body = Ache.NECK;
			break;
			
		case 4:
			body = Ache.HEART;
			break;
			
		case 5:
			body = Ache.STOMACH;
			break;
			
		case 6:
			body = Ache.ARM;
			break;
			
		case 7:
			body = Ache.LEG;
			break;
			
		default:
			body = Ache.BACK;
			break;
		}
		System.out.println("¾ÆÇÂºÎÀ§: " + body);
		System.out.println("º´¿ø¿¡ °©´Ï´Ù.");
	}
}