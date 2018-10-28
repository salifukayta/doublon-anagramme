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

	private List<Word> switchTestList;
	private List<Word> sortTestlist;

	@Before
	public void setUp() throws Exception {
		switchTestList = new ArrayList<>();
		switchTestList.add(new WordDefault(text0, 0));
		switchTestList.add(new WordDefault("bbb", 1));
		switchTestList.add(new WordDefault("abz", 2));
		switchTestList.add(new WordDefault("5tre", 3));
		switchTestList.add(new WordDefault(text4, 4));

		sortTestlist = new ArrayList<>();
		sortTestlist.add(new WordDefault(text4, 0));
		sortTestlist.add(new WordDefault("5tre", 1));
		sortTestlist.add(new WordDefault(text0, 2));
	}

	// ##### TEST switchValues() #####
	@Test
	public void testSwitchValues_NominalCase() {
		try {
			SortUtils.switchValues(switchTestList, 0, 4);
			Assert.assertEquals(text0, switchTestList.get(4).getText());
			Assert.assertEquals(text4, switchTestList.get(0).getText());
		} catch (SortException e) {
			fail();
		}
	}

	@Test
	public void testSwitchValues_ListNull() {
		List<Word> newListe = null;
		try {
			SortUtils.switchValues(newListe, 0, 4);
			fail("SortException should be throwed");
		} catch (SortException e) {
			Assert.assertEquals(SortUtils.CANNOT_SWITCH_VALUES_NULL_LIST, e.getMessage());
		}
	}

	@Test
	public void testSwitchValues_OutOfBonds1() {
		int badIndex = 10;
		try {
			SortUtils.switchValues(switchTestList, badIndex, 4);
			fail("SortException should be throwed");
		} catch (SortException e) {
			Assert.assertEquals("java.lang.IndexOutOfBoundsException: Index: " + badIndex + ", Size: " + switchTestList.size(), e.getMessage());
		}
	}

	@Test
	public void testSwitchValues_OutOfBonds2() {
		int badIndex = 40;
		try {
			SortUtils.switchValues(switchTestList, 0, badIndex);
			fail("SortException should be throwed");
		} catch (SortException e) {
			Assert.assertEquals("java.lang.IndexOutOfBoundsException: Index: " + badIndex + ", Size: " + switchTestList.size(), e.getMessage());
		}
	}

	// ##### TEST quickSort(words, firstIndex, lastIndex) #####
	@Test
	public void testQuickSortListOfQextendsWordIntInt_NominalCase() {
		try {
			SortUtils.quickSort(sortTestlist, 0, 2);
			Assert.assertEquals(text0, sortTestlist.get(1).getText());
			Assert.assertEquals(text4, sortTestlist.get(2).getText());
		} catch (SortException e) {
			fail();
		}
	}

	@Test
	public void testQuickSortListOfQextendsWordIntInt_NullList() {
		List<Word> newListe = null;
		try {
			SortUtils.quickSort(newListe, 0, 2);
			fail();
		} catch (SortException e) {
			Assert.assertEquals(SortUtils.CANNOT_SWITCH_VALUES_NULL_LIST, e.getMessage());
		}
	}
	
	// ##### TEST quickSort(words) #####
	@Test
	public void testQuickSortListOfQextendsWord_NominalCase() {
		try {
			SortUtils.quickSort(sortTestlist);
			Assert.assertEquals(text0, sortTestlist.get(1).getText());
			Assert.assertEquals(text4, sortTestlist.get(2).getText());
		} catch (SortException e) {
			fail();
		}
	}

	
}
