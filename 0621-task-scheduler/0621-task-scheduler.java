class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];

        for (char t : tasks)
            freq[t - 'A']++;

        int max = 0, countMax = 0;

        for (int f : freq) {
            if (f > max) {
                max = f;
                countMax = 1;
            } else if (f == max) {
                countMax++;
            }
        }

        return Math.max(tasks.length, (max - 1) * (n + 1) + countMax);
    }
}