package ptp_git;

import java.util.LinkedList;
import java.util.Scanner;

public class DeleteTeam {
	void delete(LinkedList<Team> list) {
		System.out.println("���� �����մϴ�. ������ �Ͻ� ���� �� ��� ��ȣ�� �Է��ϼ���");
		Scanner input = new Scanner(System.in);
		int teamId = input.nextInt();
		
		list.remove(teamId);
		System.out.println(teamId+" �� ������ �Ϸ�Ǿ����ϴ�.");
	}
}
