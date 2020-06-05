package minipro;

public class Login {
	private Member user;
	private MemberList memberlist;
	
	public Login(MemberList memberlist) {
		this.memberlist = memberlist;
	}
	
	public boolean judge(String id, String pw) {
		Member temp = memberlist.getMember(id);
		if(pw.equals(temp.getPw())) {
			user = temp;
			return true;
		}
		return false;
	}
	
	public Member getUser() {
		return user;
	}
}
