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

	public Reservation(String menberName, Ticket ticket, int amount/* , int reserveNo, String date */) {
		this.menberName = menberName;
		this.ticket = ticket;
		this.amount = amount;
		// this.reserveNo = reserveNo;
		// this.date = date;

		this.reserveNo = reserveID;

		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");

		this.date = df.format(date);

		reserveID++;
	}

	public Reservation(Member member, Ticket ticket2, int i, String formattedDate) {
		// TODO 自動生成されたコンストラクター・スタブ
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
