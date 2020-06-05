package miniproTest;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TicketListTest {

	@Test
	public void TicketListTest_1() {
		Ticket t1 = new Ticket(1,"event","2020/06/05",100);
		TicketList ticketList = new TicketList();
		ticketList.setTicket(t1);
		List<Ticket> actual = ticketList.getTicketList();
		
		List<Ticket> expected = new ArrayList<Ticket>();
		expected.add(t1);
		
		assertThat(actual, hasItem(t1));
	}
	
	@Test
	public void TicketListTest_2() {
		Ticket t1 = new Ticket(1,"event","2020/06/05",100);
		Ticket t2 = new Ticket(1,"event2","2020/06/05",2000);
		TicketList ticketList = new TicketList();
		ticketList.setTicket(t1);
		ticketList.setTicket(t2);
		Ticket actual = ticketList.getTicket(1);
		
		Ticket expected = t1;
		
		assertThat(actual, is(expected));
	}
	
	@Test
	public void TicketListTest_3() {
		Ticket t1 = new Ticket(1,"event","2020/06/05",100);
		Ticket t2 = new Ticket(1,"event2","2020/06/05",2000);
		TicketList ticketList = new TicketList();
		ticketList.setTicket(t1);
		ticketList.setTicket(t2);
		Ticket actual = ticketList.getTicket(2);
		
		Ticket expected = t2;
		
		assertThat(actual, is(expected));
	}
}
