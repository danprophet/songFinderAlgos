package com.hit.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

public class IAlgoStringMatchTest {

	@Test
	public void testKMPWord() {
		KMPAlgoImpl algo = new KMPAlgoImpl(); 

		String text = "fjsjfdnsdkabcjnkfnjjk";
		String pattern = "abc";

		int resultKMP = algo.compareStrings(text, pattern);

		assertEquals(10, resultKMP);
	}

	@Test
	public void testKMPSentence() {
		KMPAlgoImpl algo = new KMPAlgoImpl(); 

		String text = "I want to find the word abc position in this sentence";
		String pattern = "abc";

		int resultKMP = algo.compareStrings(text, pattern);

		assertEquals(24, resultKMP);
	}

	@Test
	public void testKMPNotExist() {
		KMPAlgoImpl algo = new KMPAlgoImpl(); 

		String text = "I want to find the word abc position in this sentence";
		String pattern = "notThere";

		int resultKMP = algo.compareStrings(text, pattern);

		assertEquals(-1, resultKMP);
	}
	
	@Test
	public void testKMPEmptyStrings() {
		KMPAlgoImpl algo = new KMPAlgoImpl(); 

		String text = "";
		String pattern = "";

		int resultKMP = algo.compareStrings(text, pattern);

		assertEquals(0, resultKMP);
	}
	
	@Test
	public void testKMPEmptyStringA() {
		KMPAlgoImpl algo = new KMPAlgoImpl(); 

		String text = "Word";
		String pattern = "";

		int resultKMP = algo.compareStrings(text, pattern);

		assertEquals(-1, resultKMP);
	}
	
	@Test
	public void testKMPEmptyStringB() {
		KMPAlgoImpl algo = new KMPAlgoImpl(); 

		String text = "";
		String pattern = "Word";

		int resultKMP = algo.compareStrings(text, pattern);

		assertEquals(-1, resultKMP);
	}

	@Test
	public void testBoyerWord() {
		BoyerMooreAlgoImpl algo = new BoyerMooreAlgoImpl();

		String text = "unjjskfnjksdfnboyernkfjsnfjks";
		String pattern = "boyer";

		int resultBoyer = algo.compareStrings(text, pattern);

		assertEquals(14, resultBoyer);
	}

	@Test
	public void testBoyerSentence() {
		BoyerMooreAlgoImpl algo = new BoyerMooreAlgoImpl();

		String text = "In this sentence exists boyer sequence of characters";
		String pattern = "boyer";

		int resultBoyer = algo.compareStrings(text, pattern);

		assertEquals(24, resultBoyer);
	}

	@Test
	public void testBoyerNotExist() {
		BoyerMooreAlgoImpl algo = new BoyerMooreAlgoImpl();

		String text = "In this sentence exists boyer sequence of characters";
		String pattern = "marshmelo";

		int resultBoyer = algo.compareStrings(text, pattern);

		assertEquals(-1, resultBoyer);
	}
	
	@Test
	public void testBoyerEmptyStrings() {
		BoyerMooreAlgoImpl algo = new BoyerMooreAlgoImpl(); 

		String text = "";
		String pattern = "";

		int resultBoyer = algo.compareStrings(text, pattern);

		assertEquals(0, resultBoyer);
	}
	
	@Test
	public void testBoyerEmptyStringA() {
		BoyerMooreAlgoImpl algo = new BoyerMooreAlgoImpl(); 

		String text = "Word";
		String pattern = "";

		int resultBoyer = algo.compareStrings(text, pattern);

		assertEquals(-1, resultBoyer);
	}
	
	@Test
	public void testBoyerEmptyStringB() {
		BoyerMooreAlgoImpl algo = new BoyerMooreAlgoImpl(); 

		String text = "";
		String pattern = "Word";

		int resultBoyer = algo.compareStrings(text, pattern);

		assertEquals(-1, resultBoyer);
	}

	@Test
	public void testNaiveSentence() {
		NaiveAlgoImpl algo = new NaiveAlgoImpl(); // exact

		String text = "naoknaabclanaj";
		String pattern = "abc";

		int resultNaive = algo.compareStrings(text, pattern);

		assertEquals(6, resultNaive);
	}

	@Test
	public void testNaiveWord() {
		NaiveAlgoImpl algo = new NaiveAlgoImpl(); // exact

		String text = "I want to find the word abc position in this sentence";
		String pattern = "abc";

		int resultNaive = algo.compareStrings(text, pattern);

		assertEquals(24, resultNaive);
	}

	@Test
	public void testNaiveNotExist() {
		NaiveAlgoImpl algo = new NaiveAlgoImpl(); // exact

		String text = "I want to find the word abc position in this sentence";
		String pattern = "ImNotThere";

		int resultNaive = algo.compareStrings(text, pattern);

		assertEquals(-1, resultNaive);
	}
	
	@Test
	public void testNaiveEmptyStrings() {
		NaiveAlgoImpl algo = new NaiveAlgoImpl(); 

		String text = "";
		String pattern = "";

		int resultNaive = algo.compareStrings(text, pattern);

		assertEquals(0, resultNaive);
	}
	
	@Test
	public void testNaiveEmptyStringA() {
		NaiveAlgoImpl algo = new NaiveAlgoImpl(); 

		String text = "Word";
		String pattern = "";

		int resultNaive = algo.compareStrings(text, pattern);

		assertEquals(-1, resultNaive);
	}
	
	@Test
	public void testNaiveEmptyStringB() {
		NaiveAlgoImpl algo = new NaiveAlgoImpl(); 

		String text = "";
		String pattern = "Word";

		int resultNaive = algo.compareStrings(text, pattern);

		assertEquals(-1, resultNaive);
	}

}
