package ptp_git;

import java.util.LinkedList;
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
	
	public Team() { /// 유효성검사 필요함
	
		System.out.println("생성할 팀 이름을 입력해주세요");
		name = input.nextLine();
		try { // 입력 값 유효성 검사
			System.out.println("팀원 수를 입력하세요");
			member = input.nextInt();
		} catch (Exception e) {// 정수가 아닐경우
			System.out.println("팀원은 숫자로만 입력하세요");
		}
		
		System.out.println(name+" ("+member+" 명) 이라는 팀이 추가되었습니다.");
			
	}

	/////* 기능 테스트를 위해 미리 생성해놓은 팀의 메서드 삭제요망*/////
	public Team(String name, int member) {
		this.name = name;
		this.member = member;
	}

	
	int teamDelete(LinkedList list) {
		int teamIdNumber = input.nextInt();
		
		return teamIdNumber; 
	}	
	
	
	
}
