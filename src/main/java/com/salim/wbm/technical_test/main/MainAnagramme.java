package com.salim.wbm.technical_test.main;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.salim.wbm.technical_test.exception.SortException;
import com.salim.wbm.technical_test.lib.SortUtils;
import com.salim.wbm.technical_test.model.WordSortedCharacters;

public class MainAnagramme {

	public static void main(String[] args) {

		System.out.println("BEGIN MainAnagramme " + args[0] + "\n");
		if (args.length < 1) {
			System.out.println("Need arg with file path");
			return;
		}

		try {
			// Lecture du fichier, chaque ligne est un element de la liste
			List<String> initialLines = Files.readAllLines(Paths.get(args[0]), StandardCharsets.UTF_8);

			List<WordSortedCharacters> words = new ArrayList<>();
			int workIndex = 0;
			// Construction de la liste des objets en sauvegardant l'index de chaque element et en triant ses caract�res O(n)
			for (String word : initialLines) {
				// TODO complexit� ??
				// WordSortedCharacters trie les lettres du mot
				words.add(new WordSortedCharacters(word, workIndex++));
			}

			// Trie de la liste avec l'algorithme du trie rapide O(n ln(n))
			SortUtils.quickSort(words);

			// Afficher les anagrammes O(n)
			for (int i = 0; i < words.size() - 1; i++) {
				WordSortedCharacters currentWord = words.get(i);
				// Si un mot, dont les lettres sont tri�es, est �gale au mot suivant, dont les lettres sont tri�es
				if (currentWord.getText().equals(words.get(i + 1).getText())) {
					// On afficher les anagrammes: le deux mots ainsi que leurs index
					System.out.println(currentWord.getInitialText() + " => " + currentWord.getInitialIndex() + ", " + words.get(i + 1).getInitialText() + " => "
							+ words.get(i + 1).getInitialIndex());
				}
			}

			// TODO il faut prendre en compte la complexite des tries des caracteres!!!!!!!!!
			// Complexite totale: O(n ln(n))
			System.out.println("\nFIN MainAnagramme");
		}

		catch (IOException e) {
			System.out.println("Error while reading file: " + e.getMessage());
			e.printStackTrace();
		} catch (SortException e) {
			System.out.println("Error while sorting elements: " + e.getMessage());
			e.printStackTrace();
		}

	}

}
