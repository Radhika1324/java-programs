//demo program (* pattern) in java
public class demo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (((i + 2) % 2 == 0 && j == 0) || ((i + 2) % 2 == 0 && j == 2)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();

        }
    }
}