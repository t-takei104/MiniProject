package minipro;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reservation {
	private Ticket ticket;
	private String menberName;
	private int amount;
	private int reserveNo;
	private String date;
	public static int reserveID = 1;
	
	public Reservation(String menberName, Ticket ticket, int amount) {
		this.menberName = menberName;
		this.ticket = ticket;
		this.reserveNo = reserveID;
		
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		
		this.date = df.format(date);

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

