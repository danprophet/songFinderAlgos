package com.hit.algorithm;

public class NaiveAlgoImpl extends AbstractAlgoStringMatch {
	public int compareStrings(String a, String b) {
		int M = b.length();
		int N = a.length();

		if (M == 0 && N == 0) // empty strings
			return 0;
		else if (M == 0 || N == 0) // one of the strings is empty
			return -1;

		for (int i = 0; i <= N - M; i++) {

			int j;

			for (j = 0; j < M; j++)
				if (a.charAt(i + j) != b.charAt(j))
					break;

			if (j == M)
				return i;
		}
		return -1;
	}
}
