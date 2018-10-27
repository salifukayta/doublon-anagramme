package com.salim.wbm.technical_test.model;

import java.util.Arrays;

/**
 * Implementation de l'interface Word qui trie le mot dans le constructeur
 * 
 * @author sfeki
 */
public class WordSortedCharacters implements Word {

	/**
	 * Le mot trie
	 */
	private final String sortedText;

	/**
	 * Le mot initiale, non trie
	 */
	private final String initialText;

	/**
	 * Index du mot dans la liste initiale
	 */
	private final int initialIndex;

	/**
	 * Constructeur
	 * 
	 * @param text
	 * @param initialIndex
	 */
	public WordSortedCharacters(String text, int initialIndex) {
		this.initialText = text;
		char[] chars = text.toCharArray();
		// FIXME Complexit� ? c'est quel algo de trie utilis� ici ?
		Arrays.sort(chars);
		this.sortedText = new String(chars);
		this.initialIndex = initialIndex;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getInitialIndex() {
		return initialIndex;
	}

	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getText() {
		return sortedText;
	}

	/**
	 * Retourne le mot initiale
	 * 
	 * @return initialText
	 */
	public String getInitialText() {
		return initialText;
	}

}
