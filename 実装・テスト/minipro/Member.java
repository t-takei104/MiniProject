package minipro;

public class Member {
	private int id;
	private String name;
	private String pw;

	public Member(int id, String name, String pw) {
		this.id = id;
		this.name = name;
		this.pw = pw;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPw() {
		return pw;
	}

}
