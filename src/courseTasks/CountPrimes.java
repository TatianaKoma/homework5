package courseTasks;

public class CountPrimes {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countPrimes(n));
    }

    public static int countPrimes(int n) {
        boolean[] m = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (m[i]) {
                continue;
            }
            count++;
            for (int j = i; j < n; j = j + i)
                m[j] = true;
        }

        return count;
    }
}
