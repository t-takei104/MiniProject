package minipro;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class LoginTest {
	@Test
	public void judgeTest_abc_2020() {
		MemberList memberlist = new MemberList();
		Login login = new Login(memberlist);
		boolean expected_judge = true;
		boolean actual = login.judge("abc", "2020");
		
		assertThat(actual, is(expected_judge));
	}
	
	@Test
	public void judgeTest_abcd_2020() {
		MemberList memberlist = new MemberList();
		Login login = new Login(memberlist);
		boolean expected_judge = false;
		boolean actual = login.judge("abcd", "2020");
		
		assertThat(actual, is(expected_judge));
	}
	
	@Test
	public void judgeTest_abc_2023() {
		MemberList memberlist = new MemberList();
		Login login = new Login(memberlist);
		boolean expected_judge = false;
		boolean actual = login.judge("abc", "2023");
		
		assertThat(actual, is(expected_judge));
	}
	
	@Test
	public void judgeTest_abcd_2023() {
		MemberList memberlist = new MemberList();
		Login login = new Login(memberlist);
		boolean expected_judge = false;
		boolean actual = login.judge("abcd", "2023");
		
		assertThat(actual, is(expected_judge));
	}
	
}
