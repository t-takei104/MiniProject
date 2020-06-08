package minipro;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ReservationConTest {
	ReserveList reservelist;
	ReservationCon rc;
	Reservation r1, r2, r3;
	Member member;
	Ticket ticket1, ticket2, ticket3;
	String id;

	@Before
	public void setUp() {
		reservelist = new ReserveList();
		rc = new ReservationCon(reservelist);

		member = new Member("1111", "a", "abcd");
		ticket1 = new Ticket(10, "トトロ", "2020/06/06", 1000);
		ticket2 = new Ticket(20, "bbbb", "2020-06-05", 4000);
		ticket3 = new Ticket(20, "cccc", "2020-06-05", 5000);

		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");// 日付をyyyy-MM-ddの形にフォーマットしStringに変換
		String formattedDate = dateFormat.format(date);

		id = member.getId();

		reservelist.setReserveList(id);
		r1 = new Reservation(member, ticket1, 1, formattedDate);
		r2 = new Reservation(member, ticket2, 10, formattedDate);
		r3 = new Reservation(member, ticket3, 15, formattedDate);
		reservelist.setReservation(id, r1);
		reservelist.setReservation(id, r2);
		reservelist.setReservation(id, r3);
	}

	@Test
	public void 予約リストを取得() {
		id = member.getId();
		ReserveList ex_list = new ReserveList();
		ex_list.setReserveList(id);
		ex_list.setReservation(id, r1);
		ex_list.setReservation(id, r2);
		ex_list.setReservation(id, r3);

		List<Reservation> expected = ex_list.getReserveList(id);

		//
		List<Reservation> actual = rc.viewReserveList(id);

		// 検証
		assertThat(actual, is(expected));
	}

	@Test
	public void 予約を成功した場合() {
		rc.reserve(member, 2, ticket1);
	}

	@Test
	public void 予約を失敗した場合() {
		rc.reserve(member, 11, ticket1);
	}

	@Test
	public void 予約を取得() {
		Reservation actual = r1;
		Reservation expected = rc.getReservationInfo(id, 1);

		assertThat(actual, is(sameInstance(expected)));
	}

}
