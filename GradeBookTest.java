import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class GradeBookTest{
	GradeBook obj1,obj2;
	@BeforeEach
	void setUp() throws Exception {
		obj1=new GradeBook(5);
		obj1.addScore(79.9);
		obj1.addScore(89.0);
		obj2=new GradeBook(5);
		obj2.addScore(99.2);
		obj2.addScore(50.8);	
        
	}
	@AfterEach
	void tearDown() throws Exception {
		obj1=null;
		obj2=null;
		
	}

	@Test
	void testAddScore() {
		assertTrue(obj1.toString().equals("79.9 89.0 "));	
		assertTrue(obj2.toString().equals("99.2 50.8 "));	
		
	}

	@Test
	void testSum() {
		assertEquals(168.9, obj1.sum(), .0001);
		assertEquals(150, obj2.sum(), .0001);

		}

	@Test
	void testMinimum() {
		assertEquals(79.9, obj1.minimum(), .001);
		assertEquals(50.8, obj2.minimum(), .001);	
		}

	@Test
	void testFinalScore() {
		assertEquals(318.9, obj1.sum()+obj2.sum(), .0001);
}

	
		
}
