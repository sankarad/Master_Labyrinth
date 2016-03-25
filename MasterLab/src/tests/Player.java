package tests;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
public class Player {
		private void TestCode(int x, int y, boolean expected) {
			Path su = new Path();
			boolean actual = su.MoveCheck(x,y);
			assertTrue("Expected the path Pawn to be "+(expected)+", but was "+(actual)+".", expected==actual);
		}
		
		@Test public void test00(){TestCode(2,4, true);}
		@Test public void test01(){TestCode(9,0, false);}
		@Test public void test02(){TestCode(100,0, false);}
		@Test public void test03(){TestCode(1,0, false);}
		@Test public void test04(){TestCode(0,0, false);}
	
}

