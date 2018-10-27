package com.salim.wbm.technical_test.lib;

import java.util.List;

import com.salim.wbm.technical_test.exception.SortException;
import com.salim.wbm.technical_test.model.Word;

/**
 * Class utilitaire des algo de trie
 * 
 * @author sfeki
 */
public class SortUtils {

	/**
	 * Trie la liste avec l'algo de trie rapide
	 * 
	 * @param liste
	 * @throws SortException
	 */
	public static void quickSort(List<? extends Word> liste) throws SortException {
		quickSort(liste, 0, liste.size() - 1);
	}

	/**
	 * Fonction Recursive de trie rapide
	 * 
	 * @param liste
	 * @param firstIndex
	 * @param lastIndex
	 * @throws SortException
	 */
	protected static void quickSort(List<? extends Word> liste, int firstIndex, int lastIndex) throws SortException {
		int pivotIndex = (firstIndex + lastIndex) / 2;
		int j = firstIndex + 1;

		if (firstIndex < lastIndex) {
			switchValues(liste, firstIndex, pivotIndex);
			pivotIndex = firstIndex;
			for (int i = firstIndex + 1; i <= lastIndex; i++) {
				if (liste.get(i).getText().compareTo(liste.get(pivotIndex).getText()) < 0) {
					switchValues(liste, i, j);
					j++;
				}
			}
			switchValues(liste, pivotIndex, j - 1);
			pivotIndex = j - 1;
			quickSort(liste, firstIndex, pivotIndex - 1);
			quickSort(liste, pivotIndex + 1, lastIndex);
		}
	}

	/**
	 * Permet de permuter 2 elements d'une liste
	 * 
	 * @param liste
	 * @param index1
	 * @param index2
	 * @throws SortException
	 */
	protected static <T extends Word> void switchValues(List<T> liste, int index1, int index2) throws SortException {
		if (liste == null) {
			throw new SortException("Cannot switch values null list");
		}
		try {
			T storedValue = liste.get(index1);
			liste.set(index1, liste.get(index2));
			liste.set(index2, storedValue);
		} catch (IndexOutOfBoundsException e) {
			throw new SortException(e);
		}
	}

}
