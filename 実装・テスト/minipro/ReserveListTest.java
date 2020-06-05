package Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

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
	int id;

	@Before
	public void setUp() {
		reservelist = new ReserveList();
		rc = new ReservationCon(reservelist);

		Member member = new Member(1, "a", "abcd");
		Ticket ticket = new Ticket(2, "aaaa", "2020-06-05", 2000);

		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");// 日付をyyyy-MM-ddの形にフォーマットしStringに変換
		String formattedDate = dateFormat.format(date);

		r1 = new Reservation(member, ticket, 1, formattedDate);
		id = member.getId();
		reservelist.setMap(member.getId(), r1);
	}

	@Test
	public void リストが返ってくるか() {
		// 事前準備
		ReserveList ex_list = new ReserveList();
		ex_list.setMap(id, r1);

		// 実行
		HashMap<Integer, Reservation> expected = ex_list.getReserveList();

		HashMap<Integer, Reservation> actual = reservelist.getReserveList();

		// 検証
		assertThat(actual, is(expected));
	}

}
