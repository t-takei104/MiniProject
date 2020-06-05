package minipro;

import java.util.ArrayList;
import java.util.List;

public class TicketList {
	private List<Ticket> ticketlist = new ArrayList<Ticket>();

	public void setTicket(Ticket ticket) {
		ticketlist.add(ticket);
	}

	public Ticket getTicket(int ticketNo) {
		Ticket target = ticketlist.get(ticketNo);
		return target;

	}

	public List<Ticket> getTicketList() {// Ticketが格納されているticketsを返す
		return ticketlist;
	}

}
