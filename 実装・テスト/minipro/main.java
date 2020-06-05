package minipro;

public class main {
	public static void main(String[] args) {
		TicketCon tc = new TicketCon();
		ReservationCon rc = new ReservationCon();
		Confirmation c = new Confirmation();

		Ticket t1 = new Ticket(1, "a", "2020-06-04", 100);// ticketNo = 1
		Ticket t2 = new Ticket(2, "b", "2020-06-05", 200);// ticketNo = 2
		Ticket t3 = new Ticket(5, "c", "2020-06-05", 200);// ticketNo = 3

		TicketList tlist = new TicketList();
		tlist.setTicket(t1);
		tlist.setTicket(t2);
		tlist.setTicket(t3);

		tc.setTicketlist(tlist);

		UI ui = new UI(tc, rc, c);

		ui.displayTicketList();
	}
}
