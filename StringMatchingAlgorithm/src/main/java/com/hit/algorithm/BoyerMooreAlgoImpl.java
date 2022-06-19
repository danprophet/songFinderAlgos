package com.hit.algorithm;

public class BoyerMooreAlgoImpl {
	static int NO_OF_CHARS = 256;

	static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	static void badCharHeuristic(char[] str, int size, int badchar[]) {

		for (int i = 0; i < NO_OF_CHARS; i++)
			badchar[i] = -1;

		for (int i = 0; i < size; i++)
			badchar[(int) str[i]] = i;
	}

	public int compareStrings(String first, String second) {
		char a[] = first.toCharArray();
		char b[] = second.toCharArray();
		int m = b.length;
		int n = a.length;

		if (m == 0 && n == 0) // empty strings
			return 0;
		else if (m == 0 || n == 0) // one of the strings is empty
			return -1;

		int badchar[] = new int[NO_OF_CHARS];

		badCharHeuristic(b, m, badchar);

		int s = 0;

		while (s <= (n - m)) {
			int j = m - 1;

			while (j >= 0 && b[j] == a[s + j])
				j--;

			if (j < 0) {
				return s;
			}

			else
				s += max(1, j - badchar[a[s + j]]);
		}
		return -1;
	}
}
