class NQueens {

    static int N = 4;
    static int count = 0;

    static boolean[] cols = new boolean[4];
    static boolean[] diag1 = new boolean[8];
    static boolean[] diag2 = new boolean[8];

    public static void solve(int r) {

        if (r == N) {
            count++;
            return;
        }

        for (int c = 0; c < N; c++) {

            if (cols[c] || diag1[r - c + N] || diag2[r + c]) {
                continue;
            }

            cols[c] = true;
            diag1[r - c + N] = true;
            diag2[r + c] = true;

            solve(r + 1);

            cols[c] = false;
            diag1[r - c + N] = false;
            diag2[r + c] = false;
        }
    }

    public static void main(String[] args) {

        solve(0);

        System.out.println("Total Solutions: " + count);
    }
}