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
		LinkedList<Team> teamList = new LinkedList<Team>(); // ���� �ڷᱸ���� ���� �̸��� ���� ����
		ShowTeamList show = new ShowTeamList(); // ����� ���� �����ִ� Ŭ����
		int listSize = 0;
		/* �� ��� �׽�Ʈ�� ���� �̸� ���� �����س��� ���߿� ���� ���*/
		teamList.add(new Team("Liverpool FC",51));
		
		teamList.add(new Team("FC Manchaster City",45));
		
		teamList.add(new Team("RealMadrid FC",60));
		
		teamList.add(new Team("Juventus FC",55));
		/* �� ��� �׽�Ʈ�� ���� �̸� ���� �����س��� ���߿� ���� ���*/
		
		int firstChoice; // loop1�� �Է� ���� 
		 
		Loop1: while(true) {
			
			firstChoice = ui.head();
			
			switch (firstChoice) {
			case 1:{// �� ���
				show.showTeamList(teamList);
				break;
			}
			case 2:{// ��� ��� ����, ���� ����, ���� ����?
				show.showTeamList(teamList);
				
				break;
			}
			case 3:{// ���� ����
				
				break;
			}
			case 4:{// �� ���
				teamList.add(new Team());
				break;
			}
			case 5:{// ����
				
				break;
			}
			}
		}
		
	}
}


