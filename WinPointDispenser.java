package ptp_git;

import java.util.Scanner;
/* 
 * ��� ��� ���忡 �ʿ��� �޼���
 */
public class WinPointDispenser {
	
	
	
	
			/* ���� ��� ���� �޼��� */
	int matchRecord(Team t1, Team t2) {
	/*
	 * ���� 
	 */
		Scanner input = new Scanner(System.in);
		
		int choice = 0; // �¸� �� ���� ����
		choice = input.nextInt();
		while(true) {
			
			
			System.out.println("�¸� ���� ������ �ּ���.");
			System.out.println("1: "+t1.name);
			System.out.println("\n2: "+t2.name);
			System.out.println("\n3: ���º�");
			
			if(choice == 1) { // 1�� ���� �¸��� ��� ���� 3�� 2���� 1�� �϶�
				
				t1.winPoint += 3;
				t2.winPoint -= 1;
				System.out.println(t1.name+": �¸�"+t2.name+": �й�");
			}else if(choice == 2){ // 2���� �¸�
				
				t2.winPoint += 3;
				t1.winPoint -= 1;
				System.out.println(t2.name+": �¸�"+t1.name+": �й�");
			}else if(choice == 3) { // ���º�
				
				t1.winPoint += 1;
				t2.winPoint += 1;
				System.out.println("���º�");
			}else {// ���� ������ �Ѿ��� ���
				System.out.println("���ڸ� �� �� �Է��ϼ̽��ϴ�.");
			}
		
		}
	}
}
