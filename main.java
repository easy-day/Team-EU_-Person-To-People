package ptp_git;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;


/*
 *  Main Activity
 *  
 *  
 */
/* 
 * 1. ���� ���
 * - �ּ� ó���� ��ȣ�� �� ���� ���� �� ���� �� �� ���϶� ������ �ؼ��Ѵ�.
 * 
 * - 1-1 �ּ� ��ȣ�� �� ���� �� (//)
 * 		: ����, ������ ����, ���� , ���
 * - 1-2 �ּ� ��ȣ�� �� ���� ��(///)
 * 		: ������ �ʿ��� ��, �߰� ����� �ʿ��� ��
 * - 1-3 �ּ� ��ȣ�� �� ���� ��(////)
 * 		: �׽�Ʈ�� ����� �� (////test��� ��ȣ�� ���� ��)
 * 
 * To do list
 * 
 *  1. ũ�Ⱑ ���������� �þ �� �ִ� �迭�� �ٲ�� ��
 *  2. �� ���� ����
 */
public class main {	
	
	public static void main(String[] args) {
		Ui ui = new Ui();
		
		LinkedList teamList = new LinkedList(); // ���� �ڷᱸ���� ���� �̸��� ���� ����
		
		int listSize = teamList.size();// �� ��
		
		Team team[] = new Team[100]; /// �� ��ü�ε� ���Ḯ��Ʈ�� �ٲٰų� �������̰� �ٲ����
		
		int firstChoice; // loop1�� �Է� ���� 
		
		Loop1: while(true) {
			
			firstChoice = ui.head();
			
			switch (firstChoice) {
			case 1:{// �� ���
				System.out.println("\n\n\n ���� "+listSize+" ���� ���� �����մϴ�");
				System.out.println(teamList);
				
				break;
			}
			case 2:{// ��� ��� ����
				System.out.println(teamList+"���� �����ϼ���");
				WinPointDispenser win = new WinPointDispenser();
				
				break;
			}
			case 3:{// ���� ����
				break;
			}
			case 4:{// �� ���
				team[listSize] = new Team();
				teamList.add(team[listSize].name);
				listSize++;
				System.out.println(listSize);
				break;
			}
			case 5:{// ����
				int deleteCount = team[listSize].teamDelete();
				
				break;
			}
			}
		}
		
	}
}


