package minipro;

import java.util.ArrayList;
import java.util.List;

public class TicketList {
	private List<Ticket> tickets = new ArrayList<Ticket>();

	public void setTicket(Ticket ticket) {
		tickets.add(ticket);
	}

	public List<Ticket> getTickets() {// Ticketが格納されているticketsを返す
		return tickets;
	}

}
