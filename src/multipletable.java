public class multipletable {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                int a = (int) (i * j);
                if (a < 10) {
                    System.out.print(a + "   ");
                } else if (a >= 10 && a < 100) {
                    System.out.print(a + "  ");
                } else if (a == 100) {
                    System.out.print(a + " ");
                }

            }
            System.out.println();
        }
    }
}








