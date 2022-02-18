package com.qa.peer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DoggoTest {

	private Doggo competition = new Doggo();

	@Test
	public void testLength() {
		assertEquals(99, competition.compete(44).size());
	}

	@Test
	public void testNotContains() {
		assertFalse(competition.compete(44).contains("44th"));
	}

	@Test
	public void testNotFirst() {
		assertTrue(competition.compete(44).contains("21st"));
	}

	@Test
	public void testSecond() {
		assertTrue(competition.compete(54).contains("32nd"));
	}

	@Test
	public void testThird() {
		assertTrue(competition.compete(66).contains("63rd"));
	}

	@Test
	public void testTeens() {
		assertTrue(competition.compete(13).contains("14th"));
	}

}
