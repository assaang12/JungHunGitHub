package RockScissorPaper;

public class RockScissorPaper {
	
	public String WhoIsWinner(String user,String pc) {
		if (user.equals("가위") && pc.equals("가위")) {
			return "무승부";
		}
		else if(user.equals("가위") && pc.equals("바위")) {
			return "PC";
		}
		else if(user.equals("가위") && pc.equals("보")) {
			return "USER";
		}
		else if(user.equals("바위") && pc.equals("가위")) {
			return "USER";
		}
		else if(user.equals("바위") && pc.equals("바위")) {
			return "무승부";
		}
		else if(user.equals("바위") && pc.equals("보")) {
			return "PC";
		}
		else if(user.equals("보") && pc.equals("가위")) {
			return "PC";
		}
		else if(user.equals("보") && pc.equals("바위")) {
			return "USER";
		}
		else if(user.equals("보") && pc.equals("보")) {
			return "무승부";
		}
		else {
			return "오류";
		}
		
		
	
}



}
