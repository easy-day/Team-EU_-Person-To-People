package ptp_git;

import java.util.Scanner;

/*
 *  �� ���� ��ü
 */
public class Team {
	Scanner input = new Scanner(System.in);
	String name; // �� ��
	int member; // ���� �� 
	int ranking; // ����
	int winPoint;// ����
	int sptzPoint; // �������� ī��Ʈ
	int sptzMember; // �������� ��
	
	
	public Team() {
		
		System.out.println("������ �� �̸��� �Է����ּ���");
		name = input.nextLine();
		System.out.println("������ ���� ���� ���� �Է��ϼ���");
		member = input.nextInt();
		System.out.println(name+" ("+member+" ��) �̶�� ���� �߰��Ǿ����ϴ�.");
		
		ranking = 0;
		winPoint = 0;
		sptzPoint = 0;
		sptzMember = 0;
	}
	
	int teamDelete() {
		int teamIdNumber = input.nextInt();
		
		return teamIdNumber; 
	}	
	
	
}
