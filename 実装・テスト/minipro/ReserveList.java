package minipro;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class ReserveList {
	private HashMap<Integer, Reservation> reserveMap = new HashMap<Integer, Reservation>();

	public void giveInfo(Member member, int amount, Ticket ticket) {// 予約を作成しMapにputする

		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");// 日付をyyyy-MM-ddの形にフォーマットしStringに変換
		String formattedDate = dateFormat.format(date);

		Reservation r = new Reservation(member, ticket, amount, formattedDate);// 予約を作成

		int id = member.getId();// 渡されるMemberのIDを代入
		reserveMap.put(id, r);// MapにIDと予約を紐づける
	}

	public HashMap<Integer, Reservation> getReserveList() {
		return reserveMap;
	}

	public Reservation getReservation(int reserveNo) {
		Reservation reservation = reserveMap.get(reserveNo);
		return reservation;
	}

	public void setMap(int id, Reservation r) {
		reserveMap.put(id, r);
	}

}
