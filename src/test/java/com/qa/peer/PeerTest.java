package com.qa.peer;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PeerTest {
@Test
public void test1() {
	//Given
	float myVal = 120f;
	//When
	String actual = PeerMain.revFact(myVal);
	//then
	String expected = "5!";
	assertEquals(actual,expected);
	}
@Test
public void test150() {
	float myVal = 150f;
	String actual = PeerMain.revFact(myVal);
	String expected = "NONE";
	assertEquals(actual,expected);
	
}
@Test
public void testLessThanZero() {
	float myVal = -12f;
	String actual = PeerMain.revFact(myVal);
	String expected = "NONE";
	assertEquals(actual,expected);
	
}

}
