package ptp_git;

import java.util.LinkedList;

public class ShowTeamList{

	void showTeamList(LinkedList<Team> list) {/// static Ű���尡 �� ����
		if(!list.isEmpty()) {
			System.out.println("=======================================");
			System.out.println("���������������������������������������������������������������������� ��   �� �Ϧ�");
			for(int i=0; i<list.size(); i++) {
				System.out.println("��"+(i+1)+". "+list.get(i).name+"��\n��");
			}
			System.out.println("���������������������������������������������������������������������� ��   �� ��   ����");
			System.out.println("=======================================");
			
		}else System.out.println("������ ���� �����ϴ�.");
	}
}

/*
 * ���� static Ű���� ������ showTeamList�� ��ü �������� �ʰ�
 * �ٷ� �����ٰ� ������ �ߴµ� static�� ������ main class ���� ����� �Ұ����� 
 */