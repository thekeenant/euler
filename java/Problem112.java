public class Problem112 implements EulerProblem {
    public static void main(String[] args) {
        EulerProblem.execute(new Problem112());
    }

    @Override
    public long run() {
        // Minimum bound given
        long total = 100;
        long bouncy = 0;
        
        for (; total < Long.MAX_VALUE; total++) {
            if (isBouncy(total)) {
                bouncy++;
            }

            double portion = (double) bouncy / (double) total;

            if (portion >= 0.99) {
                break;
            }
        }


        return total;
    }

    private boolean isBouncy(long number) {
        String str = Long.toString(number);

        boolean inc = true;
        boolean dec = true;

        for (int i = 0; i < str.length(); i++) {
            int current = Character.getNumericValue(str.charAt(i));


            if (i > 0) {
                int before = Character.getNumericValue(str.charAt(i - 1));

                if (before > current) {
                    inc = false;
                }
            }

            if (i < str.length() - 1) {
                int after = Character.getNumericValue(str.charAt(i + 1));

                if (after > current) {
                    dec = false;
                }
            }

            if (!inc && !dec) {
                return true;
            }
        }

        return false;
    }
}
