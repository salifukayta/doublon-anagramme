package com.salim.wbm.technical_test.main;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.salim.wbm.technical_test.exception.SortException;
import com.salim.wbm.technical_test.lib.SortUtils;
import com.salim.wbm.technical_test.model.WordDefault;

public class MainDoublon {

	public static void main(String[] args) {

		if (args.length < 1) {
			System.out.println("Need arg with file path");
			return;
		}
		System.out.println("BEGIN MainDoublon " + args[0] + "\n");

		try {
			// Lecture du fichier, chaque ligne est un element de la liste
			List<String> initialLines = Files.readAllLines(Paths.get(args[0]), StandardCharsets.UTF_8);

			int workIndex = 0;
			List<WordDefault> words = new ArrayList<>();
			// Construction de la liste des objets en sauvegardant l'index de chaque element O(n)
			for (String word : initialLines) {
				words.add(new WordDefault(word, workIndex++));
			}

			// Trie de la liste avec l'algorithme du trie rapide O(n ln(n))
			SortUtils.quickSort(words);

			//Afficher les doublons O(n)
			for (int i = 0; i < words.size() - 1; i++) {
				WordDefault currentWord = words.get(i);
				// Si un mot est �gale au mot suivant
				if (currentWord.getText().equals(words.get(i + 1).getText())) {
					// On afficher les doublons: le mot ainsi que les deux index
					System.out.println(currentWord.getText() + " => " + currentWord.getInitialIndex() + ", " + words.get(i + 1).getInitialIndex());
				}
			}

			// Complexite totale: O(n ln(n))
			System.out.println("\nFIN MainDoublon");
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
