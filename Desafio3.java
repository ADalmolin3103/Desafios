public class Desafio3 {

    public static void main(String[] args) {
        System.out.println(rm(new int[] { 1, 2, 5, 7, 4, 3 }));
    }

    public static int rm(int[] x) {
        if (x.length == 0) {
            throw new RuntimeException();
        }
        int m = x[0];
        for (int i : x) {
            if (i > m) {
                m = i;
            }
        }
        return m;
    }
}
