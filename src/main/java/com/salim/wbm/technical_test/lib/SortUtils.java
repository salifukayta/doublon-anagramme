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

	protected static final String CANNOT_SWITCH_VALUES_NULL_LIST = "Cannot switch values null list";
	protected static final String CANNOT_SORT_NULL_LIST = "Cannot sort null list";

	/**
	 * Trie la liste avec l'algo de trie rapide
	 * 
	 * @param words
	 * @throws SortException
	 */
	public static void quickSort(List<? extends Word> words) throws SortException {
		if (words == null) {
			throw new SortException(CANNOT_SORT_NULL_LIST);
		}
		quickSort(words, 0, words.size() - 1);
	}

	/**
	 * Fonction Recursive de trie rapide
	 * 
	 * @param words
	 * @param firstIndex
	 * @param lastIndex
	 * @throws SortException
	 */
	protected static void quickSort(List<? extends Word> words, int firstIndex, int lastIndex) throws SortException {
		int pivotIndex = (firstIndex + lastIndex) / 2;
		int j = firstIndex + 1;

		if (firstIndex < lastIndex) {
			switchValues(words, firstIndex, pivotIndex);
			pivotIndex = firstIndex;
			for (int i = firstIndex + 1; i <= lastIndex; i++) {
				if (words.get(i).getText().compareTo(words.get(pivotIndex).getText()) < 0) {
					switchValues(words, i, j);
					j++;
				}
			}
			switchValues(words, pivotIndex, j - 1);
			pivotIndex = j - 1;
			quickSort(words, firstIndex, pivotIndex - 1);
			quickSort(words, pivotIndex + 1, lastIndex);
		}
	}

	/**
	 * Permet de permuter 2 elements d'une liste
	 * 
	 * @param words
	 * @param index1
	 * @param index2
	 * @throws SortException
	 */
	protected static <T extends Word> void switchValues(List<T> words, int index1, int index2) throws SortException {
		if (words == null) {
			throw new SortException(CANNOT_SWITCH_VALUES_NULL_LIST);
		}
		try {
			T storedValue = words.get(index1);
			words.set(index1, words.get(index2));
			words.set(index2, storedValue);
		} catch (IndexOutOfBoundsException e) {
			throw new SortException(e);
		}
	}

}
