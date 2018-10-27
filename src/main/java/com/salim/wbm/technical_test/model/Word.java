package com.salim.wbm.technical_test.model;

/**
 * Interface 
 * 
 * @author sfeki
 */
public interface Word {
	
	/**
	 * Retourne l'index de l'element dans la liste initiale
	 * 
	 * @return
	 */
	public int getInitialIndex();
	
	/**
	 * Retourne le text utilise pour l'agorithme de trie
	 * 
	 * @return
	 */
	public String getText();
}
