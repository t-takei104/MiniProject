package minipro;

import java.util.HashMap;

public class ReservationCon {
	private ReserveList reservelist;

	public ReservationCon(ReserveList reservelist) {
		this.reservelist = reservelist;
	}

	public void reserve(Member member, int amount, Ticket ticket) {
		reservelist.giveInfo(member, amount, ticket);
	}

	public HashMap<Integer, Reservation> viewReserveList() {
		HashMap<Integer, Reservation> map = reservelist.getReserveList();
		return map;
	}
}
