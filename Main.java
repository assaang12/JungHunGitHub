package RockScissorPaper;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		RockScissorPaper rsp = new RockScissorPaper();
		
		System.out.print("������ �� �ǰ���?:");
		
		String USERRSP = sc.next();
		
		int pcrsp = (int)(Math.random()*2);
		
		String PCRSP = "";
	
		
		if(pcrsp == 0) {
			System.out.println("PC�� ������ �½��ϴ�.");
			PCRSP = "����";
		}
		else if(pcrsp == 1) {
			System.out.println("PC�� ������ �½��ϴ�.");
			PCRSP = "����";
		}
		else if(pcrsp == 2) {
			System.out.println("PC�� ���� �½��ϴ�.");
			PCRSP = "��";
		}
		
		System.out.println("���ڴ� "+ rsp.WhoIsWinner(USERRSP,PCRSP));
	}

}