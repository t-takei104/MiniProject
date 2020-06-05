package minipro;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class ReserveList {

	private HashMap<Integer, List<Reservation>> reserveMap = new HashMap<Integer, List<Reservation>>();

	public void giveInfo(Member member, int amount, Ticket ticket) {// 予約を作成しMapにputする
		Reservation r = new Reservation(member.getName(), ticket, amount);// 予約を作成

		int id = member.getId();// 渡されるMemberのIDを代入

		reserveMap.get(id).add(r);
	}

	public void setReserveList(int id) {// メンバー生成後に呼びだされる
		List<Reservation> reservelist = new ArrayList<Reservation>();
		reserveMap.put(id, reservelist);// MapにIDと予約を紐づける
	}

	public List<Reservation> getReserveList(int id) {
		return reserveMap.get(id);
	}

	public Reservation getReservation(int id, int reserveNo) {
		return reserveMap.get(id).get(reserveNo - 1);
	}

	public void setReservation(int id, Reservation r) {// テスト用
		reserveMap.get(id).add(r);
	}

}
