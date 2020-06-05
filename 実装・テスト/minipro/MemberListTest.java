package minipro;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MemberListTest {
	@Test
	public void Test_id() {
		MemberList memberlist = new MemberList();
		String expected_id = "abc";
		String actual = memberlist.getMember("abc").getId();
		
		assertThat(actual, is(expected_id));
	}
}
