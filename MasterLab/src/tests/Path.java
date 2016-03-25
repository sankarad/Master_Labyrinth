package tests;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Path {
	private void TestCode(int x, int y, boolean expected) {
		Path su = new Path();
		boolean actual = su.// Legality of movement
		assertTrue("Expected the path Pawn to be "+(expected)+", but was "+(actual)+".", expected==actual);
	//Move Check
	}
	@Test public void test00(){TestCode(1,0, false);}
	@Test public void test01(){TestCode(1,0, false);}
	@Test public void test02(){TestCode(1,0, false);}
	@Test public void test03(){TestCode(1,0, false);}
	@Test public void test04(){TestCode(1,0, false);}
	@Test public void test05(){TestCode(1,0, false);}
}
