package miniproTest;

public class Ticket {
	private int stock;
	private String event;
	private String date;
	private int price;
	private int ticketNo;

	public static int ticketID = 1;

	public Ticket(int stock, String event, String date, int price) {
		this.stock = stock;
		this.event = event;
		this.date = date;
		this.price = price;
		this.ticketNo = ticketID;

		ticketID++;
	}

	public int getStock() {
		return stock;
	}

	public String getEvent() {
		return event;
	}

	public int getTicketNo() {
		return ticketNo;
	}

	public String getDate() {
		return date;
	}

	public int getPrice() {
		return price;
	}

	public void plusStock(int amount) {
		stock += amount;
	}

}
