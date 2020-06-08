package minipro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.ArrayList;
import java.util.List;

public class UI {
	//エンティティ
	private Member member;
	private Ticket ticket;
	
	//コントローラー
	private Login login;
	private TicketCon ticketCon;
	private ReservationCon reservationCon;
	
	//コンストラクタ
	public UI(Login login, TicketCon ticketcon, ReservationCon reservationCon) {
		this.login = login;
		this.ticketCon = ticketcon;
		this.reservationCon = reservationCon;
	}
	
	//コンソールからの入力受付
	private String stream() {
		String line = "";
		try {
			BufferedReader reader
			= new BufferedReader(new InputStreamReader(System.in));
			line = reader.readLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return line;
	}
	
	//起動
	public void start() {
		//ログイン終了判定の変数
		boolean isEnd = false;
		String id;
		String pw;
		while(isEnd != true) {
			System.out.println("IDを入力してください");
			id = this.stream();
			System.out.println("パスワードを入力してください");
			pw = this.stream();
			isEnd = login.judge(id, pw);
		}
		this.member = login.getUser();
		//メニュー表示
		this.showMenu();
	}
	
	//メニュー表示
	private void showMenu() {
		System.out.println("メニュー");
		System.out.println("1:チケットの閲覧");
		System.out.println("2:チケットの予約");
		System.out.println("3:予約情報の確認");
		System.out.println("4:終了");
		//入力
		String memuNum = this.stream();
		switch(memuNum) {
		case "1":
			//チケットリスト表示
			this.displayTicketList();
			break;
		case "2":
			//チケットリスト表示
			this.displayTicketList();
			break;
		case "3":
			//予約リスト表示
			this.displayReservationList();
			break;
		case "4":
			//システム終了
			break;
		default:
			//メニュー再表示
			this.showMenu();
		}
		
	}
	
	//チケットリストの表示
	private void displayTicketList() {
		//チケットリスト取得
		List<Ticket> list = ticketCon.viewTicket();
		//チケットの種類数
		int count = 0;
		for(Ticket ticket : list) {
			//全チケットのチケット番号とチケット名を表示
			System.out.print("チケット番号:" + ticket.getTicketNo() + ":");
			System.out.println("チケット名:" + ticket.getEvent());
			count++;
		}
		System.out.println("チケット番号:チケットの詳細へ");
		System.out.println("それ以外:メニューへ");
		//チケット番号の入力
		int ticketNo = Integer.parseInt(this.stream());
		//入力がチケットの種類数count以下ならば
		if(ticketNo >= 1 && ticketNo <= count) {
			//チケットの詳細表示
			this.displayTicketInfo(ticketNo);
		}else {
			this.showMenu();
		}
	}
	
	//チケットの詳細表示
	private void displayTicketInfo(int ticketNo) {
		//詳細を表示したいチケットを取得
		ticket = ticketCon.getTicketInfo(ticketNo);
		System.out.println("チケット番号:" + ticket.getTicketNo());
		System.out.println("チケット名:" + ticket.getEvent());
		System.out.println("値段:" + ticket.getPrice());
		System.out.println("日付:" + ticket.getDate());
		System.out.println("在庫数:" + ticket.getStock());
		//予約確認メニューを表示
		this.ticketMenu();
	}
	
	//予約確認メニュー
	private void ticketMenu() {
		System.out.println("1:予約する");
		System.out.println("1以外:一覧に戻る");
		//入力
		String input = this.stream();
		if(input.equals("1")) {
			System.out.println("枚数を入力");
			int amount = Integer.parseInt(this.stream());
			//予約
			this.reserve(amount);
		}else {
			//一覧に戻る
			this.displayTicketList();
		}
	}
	
	//予約する
	private void reserve(int amount) {
		//チケットの在庫数以下ならば
		if(amount > 0 && amount <= ticket.getStock()) {
			//予約
			reservationCon.reserve(member, amount, ticket);
			//在庫数を減らす
			ticket.minusStock(amount);
			System.out.println("予約完了");
			//メニュー表示
			this.showMenu();
		}else {
			System.out.println("在庫枚数を超えています");
			//予約確認を表示
			this.ticketMenu();
		}
	}
	
	//会員の予約リスト表示
	private void displayReservationList() {
		//最初は予約リストに予約ががないため例外処理
		try {
			//予約リストを取得
			List<Reservation> reservationList = reservationCon.viewReserveList(member.getId());
			//予約の種類数
			int count = 0;
			for(Reservation reservation : reservationList) {
				//全予約の予約番号、チケット名、日付を表示
				System.out.println("予約番号:" + reservation.getReserveNo());
				System.out.println("チケット名:" + reservation.getTicket().getEvent());
				System.out.println("日付:" + reservation.getDate());
				count++;
			}
			System.out.println("予約番号:予約の詳細へ");
			System.out.println("それ以外:メニューへ");
			//入力
			int reserveNo = Integer.parseInt(this.stream());
			//入力が予約の種類数count以下ならば
			if(reserveNo >= 1 && reserveNo <= count) {
				this.displayResrvationInfo(reserveNo);
			}else {
				//メニュー表示
				this.showMenu();
			}
		//予約リストに予約がないとき
		}catch(NullPointerException e) {
			System.out.println("予約はありません");
			//メニュー表示
			this.showMenu();
		}
	}

	//予約リストの詳細表示
	private void displayResrvationInfo(int reserveNo) {
		//詳細を表示したい予約を取得
		Reservation reservation = reservationCon.getReservationInfo(member.getId(), reserveNo);
		System.out.println("予約番号:" + reservation.getReserveNo());
		System.out.println("会員名:" + reservation.getMenberName());
		System.out.println("チケット名:" + reservation.getTicket().getEvent());
		System.out.println("日付:" + reservation.getDate());
		System.out.println("予約枚数:" + reservation.getAmount());
		System.out.println("1:予約一覧に戻る");
		System.out.println("1以外:メニューに戻る");
		//入力
		String input = this.stream();
		if(input.equals("1")) {
			//予約一覧を表示
			this.displayReservationList();
		}else {
			//メニューを表示
			this.showMenu();
		}
	}

}
