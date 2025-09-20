
public class Main {

    public static float calc(int s, float x) {
        switch (s) {
            case 14 -> {
                return (float) Math.cbrt(
                        Math.pow(
                                (1 - Math.cos(x))
                                / (Math.log(Math.abs(x))),
                                2
                        )
                );
            }
            case 6, 12, 18 -> {
                return (float) Math.pow(
                        Math.E,
                        Math.log(
                                Math.pow(
                                        Math.E, x
                                )
                        )
                );
            }
            default -> {
                return (float) Math.pow(
                        (Math.sin(
                                Math.pow(
                                        Math.E,
                                        Math.pow(2 * (0.5 + x), x)
                                )
                        ) / 3) / 4,
                        2
                );
            }
        }
    }

    public static void main(String[] args) {
        int[] s;
        int r = 0;
        float[] x;
        float[][] s1;
        s = new int[7];
        x = new float[10];
        s1 = new float[s.length][x.length];
        for (int i = 18; i >= 6; i -= 2) {
            s[r++] = i;
        }
        int mn = -15, mx = 4;
        for (int i = 0; i < x.length; i++) {
            x[i] = (float) (int) (Math.random() * (mx - mn) + mn);
        }
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s1[i].length; j++) {
                s1[i][j] = calc(s[i], x[j]);
            }
        }
        System.out.println("First array:");
        for (int elem : s) {
            System.out.print(elem + " ");
        }
        System.out.println("\n\nSecond array:");
        for (float elem : x) {
            System.out.print(elem + " ");
        }
        System.out.println("\n\nMatrix:");
        for (float[] elems : s1) {
            for (float elem : elems) {
                System.out.printf("%.4f ", elem);
            }
            System.out.println();
        }
    }
}
