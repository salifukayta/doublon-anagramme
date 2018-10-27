package com.salim.wbm.technical_test.model;

/**
 * Implementation par d�faut de l'interface Word
 * 
 * @author sfeki
 */
public class WordDefault implements Word {

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
	public WordDefault(String text, int initialIndex) {
		this.initialText = text;
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
		return initialText;
	}

}
