package ptp_git;

import java.util.Scanner;

/*
 *  팀 생성 객체
 */
public class Team {
	Scanner input = new Scanner(System.in);
	
	String name; // 팀 명
	int member; // 팀원 수 
	int ranking; // 순위
	int winPoint;// 승점
	
	
	public Team() {
		
		System.out.println("생성할 팀 이름을 입력해주세요");
		name = input.nextLine();
		System.out.println("생성할 팀의 팀원 수를 입력하세요");
		member = input.nextInt();
		System.out.println(name+" ("+member+" 명) 이라는 팀이 추가되었습니다.");
		
		ranking = 0;
		winPoint = 0;
	}
	
	int teamDelete() {
		int teamIdNumber = input.nextInt();
		
		return teamIdNumber; 
	}	
	
	
}
