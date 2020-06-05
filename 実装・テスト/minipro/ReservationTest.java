package miniproTest;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ReservationTest {

	Ticket t1;
	Reservation r;
	
	@Before
	public void setUp() {
		t1 = new Ticket(1,"event1","2020/06/05",150);
		r = new Reservation("totoro", t1, 3);
	}
	
	@Test
	public void test1() {
		
		String actual = r.getDate();
		
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		
		String expected = df.format(date);
		
		assertThat(actual, is(expected));//()の中にDateの中身を入れてください
	}
	
	@Test
	public void test2() {
		int actual = r.getAmount();
		
		assertThat(actual, is(3));
	}
	
	@Test
	public void test3() {
		int actual = r.getReserveNo();
		
		assertThat(actual, is(3));
	}
	
	@Test
	public void test4() {
		String actual = r.getMenberName();
		
		assertThat(actual, is("totoro"));
	}
	
	@Test
	public void test5() {
		Ticket actual = r.getTicket();
		
		assertThat(actual, is(t1));
	}
	
}