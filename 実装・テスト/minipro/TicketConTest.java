package miniproTest;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import java.util.List;
import org.junit.Before;

public class TicketConTest {
	
	Ticket t1,t2;
	
	TicketCon tCon;
	TicketList ticketList;
	
	@Before
	public void setUp() {
		t1 = new Ticket(1,"event1","2020/06/05",150);
		t2 = new Ticket(10,"event2","2020/06/06",100);
		
		ticketList = new TicketList();
		ticketList.setTicket(t1);
		ticketList.setTicket(t2);
		
		tCon = new TicketCon(ticketList);
	}
	
	@Test
	public void test1() {
		
		List<Ticket> actual = tCon.viewTicket();
		
		//List<Ticket> expected = ticketList.getTicketList();
		
		assertThat(actual, hasItem(t1));
		
	}
	
	@Test
	public void test2() {
		
		Ticket actual = tCon.displyTicketInfo(1);
		
		Ticket expected = t1;
		
		assertThat(actual, is(expected));
		
	}
	
	@Test
	public void test3() {
		
		Ticket actual = tCon.displyTicketInfo(2);
		
		Ticket expected = t2;
		
		assertThat(actual, is(expected));
		
	}
	
}
