package ptp_git;

import java.util.LinkedList;

public class ShowTeamList{

	void showTeamList(LinkedList<Team> list) {/// static 키워드가 안 붙음
		if(!list.isEmpty()) {
			System.out.println("=======================================");
			System.out.println("┌────────────────────────────────── 팀   목 록┐");
			for(int i=0; i<list.size(); i++) {
				System.out.println("│"+(i+1)+". "+list.get(i).name+"│\n│");
			}
			System.out.println("└────────────────────────────────── 팀   목 록   끝┘");
			System.out.println("=======================================");
			
		}else System.out.println("생성된 팀이 없습니다.");
	}
}

/*
 * 원래 static 키워드 붙혀서 showTeamList를 객체 생성하지 않고
 * 바로 가져다가 쓰려고 했는데 static을 붙혀도 main class 에서 사용이 불가능함 
 */