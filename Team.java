package ptp_git;

import java.util.LinkedList;
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
	
	public Team() { /// ��ȿ���˻� �ʿ���
	
		System.out.println("������ �� �̸��� �Է����ּ���");
		name = input.nextLine();
		try { // �Է� �� ��ȿ�� �˻�
			System.out.println("���� ���� �Է��ϼ���");
			member = input.nextInt();
		} catch (Exception e) {// ������ �ƴҰ��
			System.out.println("������ ���ڷθ� �Է��ϼ���");
		}
		
		System.out.println(name+" ("+member+" ��) �̶�� ���� �߰��Ǿ����ϴ�.");
			
	}

	/////* ��� �׽�Ʈ�� ���� �̸� �����س��� ���� �޼��� �������*/////
	public Team(String name, int member) {
		this.name = name;
		this.member = member;
	}

	
	int teamDelete(LinkedList list) {
		int teamIdNumber = input.nextInt();
		
		return teamIdNumber; 
	}	
	
	
	
}
