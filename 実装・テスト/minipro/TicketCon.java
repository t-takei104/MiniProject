package minipro;

import java.util.List;

public class TicketCon {
	private TicketList ticketList;

	public TicketCon(TicketList ticketList) {
		this.ticketList = ticketList;
	}

	public List<Ticket> viewTicket() {
		return ticketList.getTicketList();// List<Ticket> ticketsを返す
	}

	public Ticket getTicketInfo(int ticketNo) {
		return ticketList.getTicket(ticketNo);
	}
}
