package ptp_git;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

/*
 *  1. ũ�Ⱑ ���������� �þ �� �ִ� �迭�� �ٲ�� ��
 */
public class main {	
	
	public static void main(String[] args) {
		Ui ui = new Ui();
		
		LinkedList teamList = new LinkedList();
		int listSize = teamList.size();
		Team team[] = new Team[100];
		System.out.println(listSize);
		
		int firstChoice;
		
		while(true) {
			
			firstChoice = ui.head();
			
			switch (firstChoice) {
			case 1:{// �� ���
				System.out.println("\n\n\n ���� "+listSize+" ���� ���� �����մϴ�");
				System.out.println(teamList);
				
				break;
			}
			case 2:{// ��� ��� ����
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


