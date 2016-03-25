package tests;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Path {
	private void TestCode(int x, boolean expected) {
		Board su = new Board());
		boolean actual = su.Board();// Legality of movement player can only make a legal pawn movement or tile movement.
		assertTrue("Expected the path Pawn to be "+(expected)+", but was "+(actual)+".", expected==actual);
	//Move Check
	}
	@Test public void test00(){TestCode(0,false);}
	@Test public void test01(){TestCode(6,false);}
	@Test public void test02(){TestCode(1,true);}
	
}
