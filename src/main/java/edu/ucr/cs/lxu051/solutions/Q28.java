package edu.ucr.cs.lxu051.solutions;

public class Q28 {
    public Q28() {

    }

    public int strStr(String haystack, String needle) {
        return kmp(haystack, needle);
    }

    public int kmp(String s, String p) {
        int[] ips = preprocess(p);
        return match(s, p, ips);
    }

    public int[] preprocess(String p) {
        int[] ips = new int[p.length()];
        int i = 0, j = 1;
        while (j < p.length()) {
            if (p.charAt(j) == p.charAt(i)) {
                ips[j] = i + 1;
                j++;
                i++;
            } else {
                if (i == 0) {
                    j++;
                } else {
                    i = ips[i - 1];
                }
            }
        }
        return ips;
    }

    public int match(String s, String p, int[] ips) {
        int i = 0, j = 0;
        while (j < s.length()) {
            if (i == p.length()) {
                return j - i;
            }
            if (s.charAt(j) == p.charAt(i)) {
                j++;
                i++;
            } else {
                if (i == 0) {
                    j++;
                } else {
                    i = ips[i - 1];
                }
            }
        }
        if (i == p.length()) {
            return j - i;
        } else {
            return -1;
        }
    }
}
