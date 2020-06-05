package miniproTest;

import java.util.ArrayList;
import java.util.List;

public class TicketList {
	private List<Ticket> tickets = new ArrayList<Ticket>();

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
