package minipro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UI {
	
	private Member member;
	
	//コントローラー
	private Login login;
	private TicketCon ticketCon;
	private ReservationCon reservationCon;
	
	public UI(Login login, TicketCon ticketcon, ReservationCon reservationCon) {
		this.login = login;
		this.ticketCon = ticketcon;
		this.reservationCon = reservationCon;
	}
	
	public void showMenu() {
		System.out.println("メニュー");
		System.out.println("1:チケットの閲覧");
		System.out.println("2:チケットの予約");
		System.out.println("3:予約情報の確認");
		System.out.println("4:終了");
		String memuNum = this.stream();
		switch(memuNum) {
		case "1":
			break;
		case "2":
			break;
		case "3":
			break;
		case "4":
			//this.start();
			break;
		default:
			this.showMenu();
		}
		
	}

	public void start() {
		boolean isEnd = false;
		String id;
		String pw;
		while(isEnd != true) {
			System.out.println("IDとパスワードを入力してください");
			id = this.stream();
			pw = this.stream();
			isEnd = login.judge(id, pw);
		}
		this.member = login.getUser();
		this.showMenu();
	}

	public String stream() {
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

	public void displayTicketList() {
		
	}

	public void displayTicketInfo(int tickeNo) {
		
	}

	public void displayReservationList() {
		
	}

	public void displayResrvationInfo(int reserveNo) {
		
	}

	public void ticketMenu() {
		
	}

	public void reserve(int amount) {
		
	}

	public void login(String id, String pw) {
		
	}

}
