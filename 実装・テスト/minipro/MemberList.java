package minipro;

import java.util.ArrayList;
import java.util.List;

public class MemberList {
	private List<Member> memberlist = new ArrayList<Member>();
	
	public MemberList() {
		Member member1 = new Member("abc","2020","山田太郎");
		Member member2 = new Member("def","2023","鈴木一郎");
		memberlist.add(member1);
		memberlist.add(member2);
	}

	public Member getMember(String id) {
		Member empty = new Member("","","");
		for(Member member : memberlist) {
			if(id.equals(member.getId())) {
				return member;
			}
		}
		return empty;
	}

}
