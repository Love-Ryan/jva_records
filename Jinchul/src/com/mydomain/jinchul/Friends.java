package com.mydomain.jinchul;

public class Friends {
	
	public void meetFriends() {
		
		String[] best = {"수진","재훈","혜성","지은","한솔","수빈"};
		String[] bestFriend = meetWho(best);
		
		System.out.println( bestFriend[0] + "이와 약속이 있습니다.");
	}
	
	public String[] meetWho(String[]best) {
		
		for(int i=0; i<best.length; i++) {
			
			int a = (int)(Math.random()*best.length);
			int b = (int)(Math.random()*best.length);

			best[a] = best[b];

		}
		return best;
	}
}

// 좋지 않아요..
// 함수 이름음 명확해야 됩니다.
// 제 느낌에 후 면
// 인풋으로 이름 들어가서 아웃풋으로 이름 나와야 될 것 같아요..
// 이해 되시나요 ?
//네네