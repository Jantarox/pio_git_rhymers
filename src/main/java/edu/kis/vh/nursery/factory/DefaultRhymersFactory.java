package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

/**
 * Klasa DefaultRhymersFactory tworzy obiekty klas DefaultCountingOutRhymer i klas dziedziczących. Zawiera 4
 * gettery dla poszczególnych klas.
 */
public class DefaultRhymersFactory implements RhymersFactory {

	/**
	 * Metoda zwraca obiekt bazowej klasy DefaultCountingOutRhymer. Nie przyjmuje żadnych parametrów
	 */
	@Override
	public DefaultCountingOutRhymer getStandardRhymer() {
		return new DefaultCountingOutRhymer();
	}

	/**
	 * Metoda zwraca obiekt bazowej klasy DefaultCountingOutRhymer, tak jak metoda powyżej.
	 * Nie przyjmuje żadnych parametrów
	 */
	@Override
	public DefaultCountingOutRhymer getFalseRhymer() {
		return new DefaultCountingOutRhymer();
	}

	/**
	 * Metoda zwraca obiekt klasy FIFORhymer pod postacią klasy DefaultCountingOutRhymer. Nie przyjmuje żadnych
	 * parametrów
	 */
	@Override
	public DefaultCountingOutRhymer getFIFORhymer() {
		return new FIFORhymer();
	}

	/**
	 * Metoda zwraca obiekt klasy HanoiRhymer pod postacią klasy DefaultCountingOutRhymer. Nie przyjmuje żadnych
	 * parametrów
	 */
	@Override
	public DefaultCountingOutRhymer getHanoiRhymer() {
		return new HanoiRhymer();
	}

}
