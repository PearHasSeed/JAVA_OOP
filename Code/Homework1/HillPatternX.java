import java.util.Scanner;

public class HillPatternX {
    public static void printPatternA(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= 2 * size - i; j++) {
                if (j >= i) {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void printPatternB(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= 2 * size - i; j++) {
                if (j >= i) {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void printPatternC(int size) {
        int n = 0;
        while (n <= 2 * size) {
            int i = Math.abs(size - n);
            if (i == 0) {
                n += 2;
                continue;
            }
            for (int j = 1; j <= 2 * size - i; j++) {
                if (j >= i) {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
            n++;
        }
    }

    public static void printPatternD(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= 2 * size - 1; j++) {
                if ((i + j > size + 1) && (i > j - size + 1)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i < size; i++) {
            for (int j = 1; j <= 2 * size - 1; j++) {
                if ((i < j - 1) && (i + j < 2 * size - 1)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int size = sc.nextInt();
        printPatternA(size);
        System.out.println();
        printPatternB(size);
        System.out.println();
        printPatternC(size);
        System.out.println();
        printPatternD(size);
        sc.close();

    }
}
