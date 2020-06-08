package minipro;

import java.util.List;

public class ReservationCon {
	private ReserveList reservelist;

	public ReservationCon(ReserveList reservelist) {
		this.reservelist = reservelist;
	}

	public void reserve(Member member, int amount, Ticket ticket) {
		reservelist.giveInfo(member, amount, ticket);
	}

	public List<Reservation> viewReserveList(String id) {
		return reservelist.getReserveList(id);
	}

	public Reservation getReservationInfo(String id, int reserveNo) {
		return reservelist.getReservation(id, reserveNo);
	}
}
