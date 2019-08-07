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
 * 1. 보는 방법
 * - 주석 처리된 기호가 두 개일 때와 세 개일 때 네 개일때 나눠서 해석한다.
 * 
 * - 1-1 주석 기호가 두 개일 때 (//)
 * 		: 정의, 지정된 개념, 역할 , 기능
 * - 1-2 주석 기호가 세 개일 때(///)
 * 		: 변경이 필요할 때, 추가 기능이 필요할 때
 * - 1-3 주석 기호가 네 개일 때(////)
 * 		: 테스트로 사용할 때 (////test라는 기호를 붙힐 것)
 * 
 * To do list
 * 
 *  1. 크기가 유동적으로 늘어날 수 있는 배열로 바꿔야 함
 *  2. 팀 삭제 구현
 */
public class main {	
	
	public static void main(String[] args) {
		Ui ui = new Ui();
		
		LinkedList teamList = new LinkedList(); // 연결 자료구조로 팀의 이름과 수를 저장
		
		int listSize = teamList.size();// 팀 수
		
		Team team[] = new Team[100]; /// 팀 객체인데 연결리스트로 바꾸거나 유동적이게 바꿔야함
		
		System.out.println(listSize);////test
		
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


