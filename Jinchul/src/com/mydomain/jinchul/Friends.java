package com.mydomain.jinchul;

public class Friends {
	
	public void meetFriends() {
		
		String[] best = {"����","����","����","����","�Ѽ�","����"};
		String[] bestFriend = meetWho(best);
		
		System.out.println( bestFriend[0] + "�̿� ����� �ֽ��ϴ�.");
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

// ���� �ʾƿ�..
// �Լ� �̸��� ��Ȯ�ؾ� �˴ϴ�.
// �� ������ �� ��
// ��ǲ���� �̸� ���� �ƿ�ǲ���� �̸� ���;� �� �� ���ƿ�..
// ���� �ǽó��� ?
//�׳�