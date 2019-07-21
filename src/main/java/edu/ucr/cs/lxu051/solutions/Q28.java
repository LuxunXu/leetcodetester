package edu.ucr.cs.lxu051.solutions;

public class Q28 {
    public Q28() {

    }

    public int strStr(String haystack, String needle) {
        return kmp(haystack, needle);
    }

    public int kmp(String s, String p) {
        int[] ips = preprocess(p);
        return 0;
    }

    public int[] preprocess(String p) {
        int[] ips = new int[p.length()];
        int i = 0, j = 0;
        
        return ips;
    }
}
