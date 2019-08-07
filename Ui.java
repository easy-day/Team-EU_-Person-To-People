package ptp_git;

import java.util.Scanner;

public class Ui {
	
	int head() {
		Scanner input = new Scanner(System.in);
		int choice = 0;
		System.out.println("1. 팀 목록\n\n");
		System.out.println("2. 경기 결과 저장\n\n");
		System.out.println("3. 순위 보기\n\n");
		System.out.println("4. 팀 등록\n\n");
		System.out.println("5. 팀 삭제\n\n");
		String a = " 메뉴 입니다.";
		while(true) {
			choice = input.nextInt();
			
			switch (choice) {
			case 1: System.out.println("1. 팀 목록"+a); return 1;
			case 2: System.out.println("2. 경기 결과 저장"+a); return 2;
			case 3: System.out.println("3. 순위 보기"+a); return 3;
			case 4: System.out.println("4. 팀 등록"+a); return 4;
			case 5: System.out.println("5. 팀 삭제"+a); return 5;
	
			default :{
				System.out.println("잘 못 선택하셨습니다. 다시 입력하세요");
			}
			}
		}
	}
	
	
	void head1() {
		System.out.println("\n\n");
		int layout[][] = new int[][] {
			{1,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,2},
			{6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6},
			{6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6},
			{6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6},
			{6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6},
			{6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6},
			{6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6},
			{6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6},
			{6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6},
			{6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6},
			{6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6},
			{6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6},
			{6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6},
			{6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6},
			{6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6},
			{6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6},
			{6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6},
			{6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6},
			{4,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,3}
		};
		
		
		//┌:1   ┐:2 	┘:3		└:4		│: 6  	─:5		SPACE: 0
		for(int i=0; i<layout.length; i++) {
			for(int j=0; j<layout[i].length; j++) {
				switch (layout[i][j]) {
				case 1:{
					System.out.printf("┌");
					break;
				}
				case 2:{
					System.out.printf("┐");
					break;
				}
				case 3:{
					System.out.printf("┘");
					break;
				}
				case 4:{
					System.out.printf("└");
					break;
				}
				case 5:{
					System.out.printf("──");
					break;
				}
				case 6:{
					System.out.printf("│");//
					break;
				}
				default:{
					System.out.printf("  ");
					break;
				}
				}	
			}System.out.println("");
		}
		System.out.println("운동회에 오신것을 환영합니다.");
		System.out.println("");
	}
	
	

	static void lineBreak(int arr[][]) {
		
	}
	
}
