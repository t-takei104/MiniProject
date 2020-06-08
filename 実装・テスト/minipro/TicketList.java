package minipro;

import java.util.ArrayList;
import java.util.List;

public class TicketList {
	private List<Ticket> tickets = new ArrayList<Ticket>();

	public TicketList() {
		Ticket t1 = new Ticket(10,"トトロ","2020-06-06",1000);
		Ticket t2 = new Ticket(20,"ラピュタ","2020-06-13",2000);
		tickets.add(t1);
		tickets.add(t2);
	}
	
	public void setTicket(Ticket ticket) {
		tickets.add(ticket);
	}

	public Ticket getTicket(int ticketNo) {
		Ticket target = tickets.get(ticketNo - 1);
		return target;

	}

	public List<Ticket> getTicketList() {// Ticketが格納されているticketsを返す
		return tickets;
	}

}
