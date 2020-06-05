package minipro;

import java.util.Date;

public class Reservation {
	private Member menber;
	private Ticket ticket;
	private int amount;
	private int reserveNo;
	private Date date;

	public Member getMenber() {
		return menber;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public int getAmount() {
		return amount;
	}

	public int getReserveNo() {
		return reserveNo;
	}

	public Date getDate() {
		return date;
	}

}
