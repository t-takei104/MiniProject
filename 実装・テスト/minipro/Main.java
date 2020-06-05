package minipro;

public class Main {

	public static void main(String[] args) {
		//リスト作成
		MemberList memberlist = new MemberList();
		ReserveList reserveList = new ReserveList();
		TicketList ticketList = new TicketList();
		
		//コントローラー作成
		Login login = new Login(memberlist);
		TicketCon ticketCon = new TicketCon();//引数必要
		ReservationCon reservationCon = new ReservationCon();//引数必要
		
		//UI作成
		UI ui = new UI(login, ticketCon, reservationCon);
		
		//起動
		ui.start();
	}

}
