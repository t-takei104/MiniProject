package minipro;

import java.util.List;

public class TicketCon {
	private TicketList ticketlist;

	public void setTicketlist(TicketList ticketlist) {
		this.ticketlist = ticketlist;
	}

	public List<Ticket> viewTicket() {
		return ticketlist.getTickets();// List<Ticket> ticketsを返す
	}

}
