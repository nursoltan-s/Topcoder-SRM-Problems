import org.junit.Test;
import static org.junit.Assert.*;

public class SherlockTest {
	
	@Test(timeout=2000)
	public void test0() {
		String firstName = "BENEDICT";
		String lastName = "CUMBERBATCH";
		assertEquals("It is him", new Sherlock().isItHim(firstName, lastName));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String firstName = "BENADRYL";
		String lastName = "CUCUMBERPATCH";
		assertEquals("It is him", new Sherlock().isItHim(firstName, lastName));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String firstName = "HARSHIT";
		String lastName = "MEHTA";
		assertEquals("It is someone else", new Sherlock().isItHim(firstName, lastName));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String firstName = "BATAXXAT";
		String lastName = "CURMUDGEON";
		assertEquals("It is him", new Sherlock().isItHim(firstName, lastName));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String firstName = "BENEDI";
		String lastName = "CUMBER";
		assertEquals("It is someone else", new Sherlock().isItHim(firstName, lastName));
	}
	
	@Test(timeout=2000)
	public void test5() {
		String firstName = "BAXAXAXY";
		String lastName = "CENTRIFUGAL";
		assertEquals("It is someone else", new Sherlock().isItHim(firstName, lastName));
	}
	
	@Test(timeout=2000)
	public void test6() {
		String firstName = "BUMBLESHACK";
		String lastName = "CRUMPLEHORN";
		assertEquals("It is him", new Sherlock().isItHim(firstName, lastName));
	}
}
