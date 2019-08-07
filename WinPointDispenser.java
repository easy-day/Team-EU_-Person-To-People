package ptp_git;

import java.util.Scanner;
/* 
 * 경기 결과 저장에 필요한 메서드
 */
public class WinPointDispenser {
	
	
	int matchRecord(Team t1, Team t2) {
	
		Scanner input = new Scanner(System.in);
		int choice = 0; // 승리 팀 지정 변수
		choice = input.nextInt();
		while(true) {
			
			
			System.out.println("승리 팀을 선택해 주세요.");
			System.out.println("1: "+t1.name);
			System.out.println("\n2: "+t2.name);
			System.out.println("\n3: 무승부");
			
			if(choice == 1) { // 1번 팀이 승리할 경우 승점 3점 2번팀 1점 하락
				t1.winPoint += 3;
				t2.winPoint -= 1;
				System.out.println(t1.name+": 승리"+t2.name+": 패배");
			}else if(choice == 2){ // 2번팀 승리
				t2.winPoint += 3;
				t1.winPoint -= 1;
				System.out.println(t2.name+": 승리"+t1.name+": 패배");
			}else if(choice == 3) { // 무승부
				t1.winPoint += 1;
				t2.winPoint += 1;
				System.out.println("무승부");
			}else {// 숫자 범위를 넘었을 경우
				System.out.println("숫자를 잘 못 입력하셨습니다.");
			}
		
		}
	}
}
