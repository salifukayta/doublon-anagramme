package com.salim.wbm.technical_test.lib;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.salim.wbm.technical_test.exception.SortException;
import com.salim.wbm.technical_test.model.Word;
import com.salim.wbm.technical_test.model.WordDefault;

public class SortUtilsTest {
	
	private String text0 = "abd";
	private String text4 = "poupou";
	
	private List<Word> liste;
	
    @Before
    public void setUp() throws Exception {
		liste = new ArrayList<>();
		liste.add(new WordDefault(text0, 0));
		liste.add(new WordDefault("bbb", 1));
		liste.add(new WordDefault("abz", 2));
		liste.add(new WordDefault("5tre", 3));
		liste.add(new WordDefault(text4, 4));
    }

	@Test
	public void testQuickSortListOfQextendsWord() {
		fail("Not yet implemented");
	}

	@Test
	public void testQuickSortListOfQextendsWordIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testSwitchValues_NominalCase() {
		try {
			SortUtils.switchValues(liste, 0, 4);
			Assert.assertTrue(liste.get(4).getText().equals(text0));
			Assert.assertTrue(liste.get(0).getText().equals(text4));
		} catch (SortException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSwitchValues_ListNull() {
		List<Word> newListe = null;
		try {
			SortUtils.switchValues(newListe, 0, 4);
			fail("SortException should be throwed");
		} catch (SortException e) {
			Assert.assertTrue(true);
		}
	}
	
	@Test
	public void testSwitchValues_OutOfBonds1() {
		try {
			SortUtils.switchValues(liste, 10, 4);
			fail("SortException should be throwed");
		} catch (SortException e) {
			Assert.assertTrue(true);
		}
	}
	
	@Test
	public void testSwitchValues_OutOfBonds2() {
		try {
			SortUtils.switchValues(liste, 0, 40);
			fail("SortException should be throwed");
		} catch (SortException e) {
			Assert.assertTrue(true);
		}
	}

}
