package minipro;

public class Reservation {
	private Ticket ticket;
	private String menberName;
	private int amount;
	private int reserveNo;
	private String date;
	public static int reserveID = 1;

	public Reservation(String menberName, Ticket ticket, int amount, int reserveNo, String date) {
		this.menberName = menberName;
		this.ticket = ticket;
		this.amount = amount;
		this.reserveNo = reserveNo;
		this.date = date;

		reserveID++;
	}

	public String getMenberName() {
		return menberName;
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
