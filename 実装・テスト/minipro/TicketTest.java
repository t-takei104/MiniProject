package miniproTest;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class TicketTest {
    
	@Test
	public void TicketTest_1() {
		Ticket t1 = new Ticket(1,"event","2020/06/05",100);
		int actual = t1.getTicketNo();
		int expected = 1;
		
		assertThat(actual, is(expected));
	}
	
	@Test
	public void TicketTest_2() {
		Ticket t1 = new Ticket(1,"event","2020/06/05",100);
		Ticket t2 = new Ticket(1,"event","2020/06/05",100);
		int actual = t2.getTicketNo();
		int expected = 2;
		
		assertThat(actual, is(expected));
	}
	
	@Test
	public void TicketTest_3() {
		Ticket t1 = new Ticket(1,"event","2020/06/05",100);
		int actual = t1.getStock();
		int expected = 1;
		
		assertThat(actual, is(expected));
	}
	
	@Test
	public void TicketTest_4() {
		Ticket t1 = new Ticket(1,"event","2020/06/05",100);
		String actual = t1.getEvent();
		String expected = "event";
		
		assertThat(actual, is(expected));
	}
	
	
	@Test
	public void TicketTest_5() {
		Ticket t1 = new Ticket(1,"event","2020/06/05",100);
		String actual = t1.getDate();
		String expected = "2020/06/05";
		
		assertThat(actual, is(expected));
	}
	
	@Test
	public void TicketTest_6() {
		Ticket t1 = new Ticket(1,"event","2020/06/05",100);
		int actual = t1.getPrice();
		int expected = 100;
		
		assertThat(actual, is(expected));
	}
}
