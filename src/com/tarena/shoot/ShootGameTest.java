package com.tarena.shoot;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShootGameTest {
	
	ShootGame game = new ShootGame();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEnterAction() {
		for(int i=0; i<40; i++) {
			game.enterAction();
		}
		assertEquals(40,game.flyEnteredIndex);
	}

	@Test
	public void testStepAction() {
		fail("get a test error");
	}

	@Test
	public void testShootAction() {
		for(int i=0; i<30; i++) {
			game.shootAction();
		}
		assertEquals(30,game.shootIndex);
	}

	@Test
	public void testIsGameOver() {
		assertEquals(false,game.isGameOver());
	}

}
