package com.hit.algorithm;

public class KMPAlgoImpl extends AbstractAlgoStringMatch {

	public int compareStrings(String a, String b) {
		int N = a.length();
		int M = b.length();

		if (M == 0 && N == 0) // empty strings
			return 0;
		else if (M == 0 || N == 0) // one of the strings is empty
			return -1;

		int lps[] = new int[M];
		int j = 0;

		computeLPSArray(b, M, lps);

		int i = 0;
		while (i < N) {
			if (b.charAt(j) == a.charAt(i)) {
				j++;
				i++;
			}
			if (j == M) {
				return (i - j);
			}

			else if (i < N && b.charAt(j) != a.charAt(i)) {

				if (j != 0)
					j = lps[j - 1];
				else
					i = i + 1;
			}
		}
		return -1;
	}

	void computeLPSArray(String pat, int M, int lps[]) {
		int len = 0;
		int i = 1;
		lps[0] = 0;

		while (i < M) {
			if (pat.charAt(i) == pat.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			} else {
				if (len != 0) {
					len = lps[len - 1];

				} else {
					lps[i] = len;
					i++;
				}
			}
		}
	}

}
