package ptp_git;

import java.util.LinkedList;
import java.util.Scanner;

public class DeleteTeam {
	void delete(LinkedList<Team> list) {
		System.out.println("팀을 삭제합니다. 삭제를 하실 팀의 팀 등록 번호를 입력하세요");
		Scanner input = new Scanner(System.in);
		int teamId = input.nextInt();
		
		list.remove(teamId);
		System.out.println(teamId+" 의 삭제가 완료되었습니다.");
	}
}
