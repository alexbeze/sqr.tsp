package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

	City A = new City(0,0);
	City B = new City (0,6);
	City C = new City (6,0);

	@Test
	public void distanceTo_AFromA_0() {
		double expected = 0;
		double actual = A.distanceTo(A);
		assertEquals(expected, actual, 0.0);
	}

	@Test
	public void distanceTo_BFromA_6(){
		double expected = 6;
		double actual = A.distanceTo(B);
		assertEquals(expected, actual, 0.0);
	}

	@Test
	public void distanceTo_AFromB_6(){
		double expected = 6;
		double actual = B.distanceTo(A);
		assertEquals(expected, actual, 0.0);
	}

	@Test
	public void distanceTo_AFromC_6(){
		double expected = 6;
		double actual = C.distanceTo(A);
		assertEquals(expected, actual, 0.0);
	}

	@Test
	public void distanceTo_CFromA_6(){
		double expected = 6;
		double actual = A.distanceTo(C);
		assertEquals(expected, actual, 0.0);
	}

	@Test
	public void distanceTo_DFromE_6() {
		City D = new City(10,2);
		City E = new City(9, 2);
		double expected = 1;
		double actual = D.distanceTo(E);
		assertEquals(expected, actual, 0.0);
	}

	@Test(expected=NullPointerException.class)
	public void distanceTo_Null_NullPointerException() {
		double actual = A.distanceTo(null);
	}

	@Test
	public void distanceTo_NegativeBfromA_6(){
		City negativeB = new City(-6,0);
		double expected = 6;
		double actual = A.distanceTo(negativeB);
		assertEquals(expected, actual, 0.0);
	}

}
