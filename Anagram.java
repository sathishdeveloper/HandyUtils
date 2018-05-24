public class Anagram {
  boolean isAnagram(final String s1, final String s2) {
		
		if (s1.trim().length() != s2.trim().length())
			return false;
		
		// all possible characters with all cases, 'A' ~ 'z' = 58
		int[] all = new int[58];

		for (char ch : s1.toCharArray()) {
			int idx = ch - 'A';
			all[idx] = all[idx] + 1;
		}

		for (char ch : s2.toCharArray()) {
			int idx = ch - 'A';
			if(all[idx] == 0){
				return false;
			}
			all[idx] = all[idx] - 1;
		}

		return true;
	}
}
