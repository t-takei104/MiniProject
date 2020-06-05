package minipro;

public class Reservation {
	private Ticket ticket;
	private Member member;
	private int amount;
	private int reserveNo;
	private String date;
	public static int reserveID = 1;

	public Reservation(Member menber, Ticket ticket, int amount, String date) {
		this.member = menber;
		this.ticket = ticket;
		this.amount = amount;
		this.date = date;

		reserveID++;
	}

	public Member getMenberName() {
		return member;
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

	public String getDate() {
		return date;
	}

}
