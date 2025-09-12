public class duel {
    import java.util.*;

public class Main {
    static boolean liarExists(int[] a) {
        int n = a.length, ones = 0;
        for (int x : a) ones += x;
        if (ones == n) return true;
        for (int i = 0; i + 1 < n; i++)
            if (a[i] == 0 && a[i+1] == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            System.out.println(liarExists(a) ? "YES" : "NO");
        }
        sc.close();
    }
}

}
