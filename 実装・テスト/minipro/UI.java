package minipro;

public class UI {
	private TicketCon ticketCon;
	private ReservationCon reservationCon;
	private Confirmation confirmation;

	private Member user;

	public UI(TicketCon ticketCon, ReservationCon reservationCon, Confirmation confirmation) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.ticketCon = ticketCon;
		this.reservationCon = reservationCon;
		this.confirmation = confirmation;
	}

	public void start() {

	}

	public void displayTicketList() {
		for (int i = 0; i < ticketCon.viewTicket().size(); i++) {
			System.out.print(ticketCon.viewTicket().get(i).getTicketNo() + ":");
			System.out.println(ticketCon.viewTicket().get(i).getEvent());
		}
	}

	public void displayReservationList(int id) {

	}

	public void inputAmount() {

	}
}
