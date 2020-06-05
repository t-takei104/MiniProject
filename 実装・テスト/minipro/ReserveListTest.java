package Test;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import minipro.Member;
import minipro.Reservation;
import minipro.ReservationCon;
import minipro.ReserveList;
import minipro.Ticket;

public class ReserveListTest {
	ReserveList reservelist;
	ReservationCon rc;
	Reservation r1;
	Member member;
	Ticket ticket;
	int id;

	@Before
	public void setUp() {
		reservelist = new ReserveList();
		rc = new ReservationCon(reservelist);

		member = new Member(1111, "a", "abcd");
		ticket = new Ticket(2, "aaaa", "2020-06-05", 2000);

		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");// 日付をyyyy-MM-ddの形にフォーマットしStringに変換
		String formattedDate = dateFormat.format(date);

		id = member.getId();

		reservelist.setReserveList(id);
		r1 = new Reservation(member, ticket, 1, formattedDate);
		reservelist.setReservation(id, r1);
	}

	@Test
	public void リストが返ってくるか() {
		id = member.getId();
		ReserveList ex_list = new ReserveList();
		ex_list.setReserveList(id);
		ex_list.setReservation(id, r1);

		List<Reservation> expected = ex_list.getReserveList(id);

		List<Reservation> actual = reservelist.getReserveList(id);

		// 検証
		assertThat(actual, is(expected));
	}

	@Test
	public void 予約が返ってくるか() {
		Reservation actual = r1;
		Reservation expected = reservelist.getReservation(id, 1);

		// 検証
		assertThat(actual, is(sameInstance(expected)));
	}

	@Test
	public void 予約の生成() {
		reservelist.giveInfo(member, 2, ticket);
		List<Reservation> actual = reservelist.getReserveList(id);

		Reservation expected = reservelist.getReservation(id, 2);

		// 検証
		assertThat(actual, hasItem(expected));
	}

}
