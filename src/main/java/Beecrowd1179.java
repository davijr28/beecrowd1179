
import java.util.Scanner;

public class Beecrowd1179 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);

        int par[] = new int[5];
        int impar[] = new int[5];
        int countPar = -1;
        int countImpar = -1;
        int X;

        for (int i = 0; i < 15; i++) {
            X = scanner.nextInt();
            if (X % 2 == 0) {
                countPar++;
                if (countPar > 4) {
                    System.out.printf("par[0] = %d%npar[1] = %d%npar[2] = %d%npar[3] = %d%npar[4] = %d%n", par[0], par[1], par[2], par[3], par[4]);
                    countPar = 0;
                    par[countPar] = X;
                } else {
                    par[countPar] = X;
                }
            } else {
                countImpar++;
                if (countImpar > 4) {
                    System.out.printf("impar[0] = %d%nimpar[1] = %d%nimpar[2] = %d%nimpar[3] = %d%nimpar[4] = %d%n", impar[0], impar[1], impar[2], impar[3], impar[4]);
                    countImpar = 0;
                    impar[countImpar] = X;
                } else {
                    impar[countImpar] = X;
                }
            }
        }

        for (int i = 0; i <= countImpar; i++) {
            System.out.printf("impar[%d] = %d%n", i, impar[i]);
        }
        for (int i = 0; i <= countPar; i++) {
            System.out.printf("par[%d] = %d%n", i, par[i]);
        }
    }
}
