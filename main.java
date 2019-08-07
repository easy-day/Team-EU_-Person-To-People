package ptp_git;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

/*
 *  1. 크기가 유동적으로 늘어날 수 있는 배열로 바꿔야 함
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
			case 1:{// 팀 목록
				System.out.println("\n\n\n 현재 "+listSize+" 개의 팀이 존재합니다");
				System.out.println(teamList);
				
				break;
			}
			case 2:{// 경기 결과 저장
				break;
			}
			case 3:{// 순위 보기
				break;
			}
			case 4:{// 팀 등록
				team[listSize] = new Team();
				teamList.add(team[listSize].name);
				listSize++;
				System.out.println(listSize);
				break;
			}
			case 5:{// 삭제
				int deleteCount = team[listSize].teamDelete();
				
				break;
			}
			}
		}
		
	}
}


