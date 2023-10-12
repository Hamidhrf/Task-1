public class Primes {
    public static void main(String[] args) {
        int nValues = 50;
        outerloop:
        for (int i = 2; i <= nValues; i++) {
            int maxCheck = (int) Math.sqrt(i);
            for (int j = 2; j <= maxCheck; j++) {
                if (i % j == 0) {
                    continue outerloop;
                }
            }
            System.out.println(i);
        }
    }
}