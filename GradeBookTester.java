package LAB1;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



/**
 *this class tests the GradeBook class 
 *it checks the addScore, sum, minimum and finalScore methods
 *
 * @author Valerie Ralph-Opara
 * @version 1
 */

public class GradeBookTester {
	private GradeBook g1;
	private GradeBook g2;

	/**
	 * initializes two objects of Gradebook of size 5 and inputing the scores before each test case execution
	 * @throws Exception if an error occurs
	*/

@BeforeEach
public void setUp() throws Exception{
	g1 = new GradeBook(5);
	g1.addScore(16.0);
	g1.addScore(75.0);
	g1.addScore(25.0);
	
	g2 = new GradeBook(5);
	g2.addScore(55.5);
	g2.addScore(87.6);
	g2.addScore(95.0);
}

/**
 * sets GradeBook objects to null after each case
 * @throws Exception if an error occurs
*/

@AfterEach
public void tearDown() throws Exception{
	g1 = null;
	g2 = null;
}


//remove this test later
@Test
public void testnull() {
	GradeBook g = new GradeBook(3);
	assertTrue(g != null);
}

/**
 * tests the addScore method for correct score addition
*/

@Test
public void testAddScore() {
    assertTrue(g1.toString().equals("16.0 75.0 25.0"));
    assertTrue(g2.toString().equals("55.5 87.6 95.0"));
    assertEquals(3, g1.getScoreSize());
    assertEquals(3,g1.getScoreSize());
}

/**
 * tests the sum method for correct sum calculation
*/

@Test
public void testSum() {
	assertEquals(116.0, g1.sum(), 0.0001);
	assertEquals(238.1, g2.sum(), 0.0001);
}

/**
 * tests the minimum method for the correct least score
*/

@Test 
public void testMinimum() {
	assertEquals(16.0, g1.minimum(), 0.001);
	assertEquals(55.5, g2.minimum(), 0.001);
}

/**
 * tests the finalScore method for correct calculation after removing the minimum score
*/

@Test
public void testFinalScore() {
	assertEquals(100.0, g1.finalScore(), 0.001);
	assertEquals(182.6, g2.finalScore(), 0.001);
}
}

