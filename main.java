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
		LinkedList<Team> teamList = new LinkedList<Team>(); // 연결 자료구조로 팀의 이름과 수를 저장
		ShowTeamList show = new ShowTeamList(); // 저장된 팀을 보여주는 클래스
		int listSize = 0;
		/* 앱 기능 테스트를 위해 미리 팀을 생성해놓음 나중에 삭제 요망*/
		teamList.add(new Team("Liverpool FC",51));
		
		teamList.add(new Team("FC Manchaster City",45));
		
		teamList.add(new Team("RealMadrid FC",60));
		
		teamList.add(new Team("Juventus FC",55));
		/* 앱 기능 테스트를 위해 미리 팀을 생성해놓음 나중에 삭제 요망*/
		
		int firstChoice; // loop1의 입력 변수 
		 
		Loop1: while(true) {
			
			firstChoice = ui.head();
			
			switch (firstChoice) {
			case 1:{// 팀 목록
				show.showTeamList(teamList);
				break;
			}
			case 2:{// 경기 결과 저장, 승패 저장, 승점 생산?
				show.showTeamList(teamList);
				
				break;
			}
			case 3:{// 순위 보기
				
				break;
			}
			case 4:{// 팀 등록
				teamList.add(new Team());
				break;
			}
			case 5:{// 삭제
				
				break;
			}
			}
		}
		
	}
}


