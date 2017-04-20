public class Problem009 {
    public static void main(String[] args) {
        int big = 1000;

        for (int a = 1; a < big; a++) {
            for (int b = a + 1; b < big; b++) {
                // may not be a natural number
                double cReal = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

                // good enough check
                if (cReal == (int) cReal) {
                    int c = (int) cReal;
                    if (a + b + cReal == 1000) {
                        System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);
                        System.out.printf("abc = %d", a * b * c);
                        break;
                    }
                }
            }
        }
    }
}
