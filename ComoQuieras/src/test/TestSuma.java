package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Codigo.principal;

public class TestSuma {

	principal suma = new principal();
	
	@Before
	public void setUp() throws Exception {
		suma.setprincipal(20);
		suma.setprincipal2(5);
	}

	@Test
	public void test() {
		assertEquals(25,suma.suma());
	}

}
