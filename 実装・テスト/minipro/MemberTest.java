package minipro;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MemberTest {
	@Test
	public void Test_id() {
		Member member = new Member("abc","2020","山田太郎");
		String expected_id = "abc";
		String actual = member.getId();
		
		assertThat(actual, is(expected_id));
	}
	
	@Test
	public void Test_pw() {
		Member member = new Member("abc","2020","山田太郎");
		String expected_pw = "2020";
		String actual = member.getPw();
		
		assertThat(actual, is(expected_pw));
	}
	
	@Test
	public void Test_name() {
		Member member = new Member("abc","2020","山田太郎");
		String expected_name= "山田太郎";
		String actual = member.getName();
		
		assertThat(actual, is(expected_name));
	}
	
}
