package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class TourTest {

	/**
	 * GIVEN WHEN THEN
	 */

	ArrayList listeVille = new ArrayList();

	City A = new City(9,1);
	City B = new City(1,1);


	@Test
	public void getDistance_aucuneVille_0() {
		Tour tour = new Tour();
		int expected = 0;
		int actual = tour.getDistance();
		assertEquals(expected, actual);
	}

	@Test
	public void getDistance_uneVille_0() {
		listeVille.add(A);
		Tour tour = new Tour(listeVille);
		int expected = 0;
		int actual = tour.getDistance();
		assertEquals(expected, actual);
	}

	@Test
	public void getDistance_AToB_16() {
		listeVille.add(A);
		listeVille.add(B);
		Tour tour = new Tour(listeVille);
		int expected = 16;
		int actual = tour.getDistance();
		assertEquals(expected, actual);
	}
}
