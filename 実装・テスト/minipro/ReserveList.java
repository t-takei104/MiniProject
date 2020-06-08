package minipro;

//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class ReserveList {
	private HashMap<String, List<Reservation>> reserveMap = new HashMap<String, List<Reservation>>();

	public void giveInfo(Member member, int amount, Ticket ticket) {// 予約を作成しMapにputする
		Reservation r = new Reservation(member.getName(), ticket, amount);// 予約を作成
		String id = member.getId();// 渡されるMemberのIDを代入
		this.setReserveList(id);
		reserveMap.get(id).add(r);
	}

	public void setReserveList(String id) {// メンバー生成後に呼びだされる
		if(reserveMap.containsKey(id) == false) {
			List<Reservation> reservelist = new ArrayList<Reservation>();
			reserveMap.put(id, reservelist);// MapにIDと予約を紐づける
		}
	}

	public List<Reservation> getReserveList(String id) {
		return reserveMap.get(id);
	}

	public Reservation getReservation(String id, int reserveNo) {
		return reserveMap.get(id).get(reserveNo - 1);
	}

	public void setReservation(String id, Reservation r) {// テスト用
		reserveMap.get(id).add(r);
	}

}
