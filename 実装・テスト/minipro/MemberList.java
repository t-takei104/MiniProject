package minipro;

import java.util.ArrayList;
import java.util.List;

public class MemberList {
	private List<Member> memberlist = new ArrayList<Member>();

	public Member getMember(int id) {
		Member member = memberlist.get(id);
		return member;
	}

	public void setMember(Member member) {
		memberlist.add(member);
	}

}
