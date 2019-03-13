package RockScissorPaper;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		RockScissorPaper rsp = new RockScissorPaper();
		
		System.out.print("무엇을 낼 건가요?:");
		
		String USERRSP = sc.next();
		
		int pcrsp = (int)(Math.random()*2);
		
		String PCRSP = "";
	
		
		if(pcrsp == 0) {
			System.out.println("PC는 가위를 냈습니다.");
			PCRSP = "가위";
		}
		else if(pcrsp == 1) {
			System.out.println("PC는 바위를 냈습니다.");
			PCRSP = "바위";
		}
		else if(pcrsp == 2) {
			System.out.println("PC는 보를 냈습니다.");
			PCRSP = "보";
		}
		
		System.out.println("승자는 "+ rsp.WhoIsWinner(USERRSP,PCRSP));
	}

}