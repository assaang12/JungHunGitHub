package RockScissorPaper;

public class RockScissorPaper {
	
	public String WhoIsWinner(String user,String pc) {
		if (user.equals("����") && pc.equals("����")) {
			return "���º�";
		}
		else if(user.equals("����") && pc.equals("����")) {
			return "PC";
		}
		else if(user.equals("����") && pc.equals("��")) {
			return "USER";
		}
		else if(user.equals("����") && pc.equals("����")) {
			return "USER";
		}
		else if(user.equals("����") && pc.equals("����")) {
			return "���º�";
		}
		else if(user.equals("����") && pc.equals("��")) {
			return "PC";
		}
		else if(user.equals("��") && pc.equals("����")) {
			return "PC";
		}
		else if(user.equals("��") && pc.equals("����")) {
			return "USER";
		}
		else if(user.equals("��") && pc.equals("��")) {
			return "���º�";
		}
		else {
			return "����";
		}
		
		
	
}



}
