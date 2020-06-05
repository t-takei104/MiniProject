package minipro;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class ReservationTest {

	
	@Test
	public void test1() {
		Ticket t1 = new Ticket(10, "トトロ","2020/06/06", 1000 );
		Reservation r = new Reservation("totoro", 3, t1);
		
		String actual = r.getDate();
		
		assertThat(actual, is());//()の中にDateの中身を入れてください
	}
	
	@Test
	public void test2() {
		Ticket t1 = new Ticket(10, "トトロ","2020/06/06", 1000 );
		Reservation r = new Reservation("totoro", 3, t1);
		
		String actual = r.getAmount();
		
		assertThat(actual, is(3));
	}
	
	@Test
	public void test3() {
		Ticket t1 = new Ticket(10, "トトロ","2020/06/06", 1000 );
		Reservation r = new Reservation("totoro", 3, t1);
		
		String actual = r.getReserveNo();
		
		assertThat(actual, is(1));
	}
	
	@Test
	public void test4() {
		Ticket t1 = new Ticket(10, "トトロ","2020/06/06", 1000 );
		Reservation r = new Reservation("totoro", 3, t1);
		
		String actual = r.getMemberName();
		
		assertThat(actual, is("totoro"));
	}
	
	@Test
	public void test5() {
		Ticket t1 = new Ticket(10, "トトロ","2020/06/06", 1000 );
		Reservation r = new Reservation("totoro", 3, t1);
		
		String actual = r.getTicket();
		
		assertThat(actual, is(t1));
	}
}