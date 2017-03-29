package fibonacci.calcul;

import java.math.BigInteger;

//Le Calcul de la suite de Fibonacci.
//Méthode matricielle
public class CalculFibonacci {

    //La méthode pour la multiplication de deux matrices
    private BigInteger[][] multMat(BigInteger[][] m, BigInteger[][] n) {

        BigInteger[][] ret = {
            {BigInteger.ZERO, BigInteger.ZERO},
            {BigInteger.ZERO, BigInteger.ZERO}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    ret[i][j] = (ret[i][j]).add((m[i][k]).multiply(n[k][j]));
                }

                ret[i][j] = (ret[i][j]);
            }
        }
        return ret;
    }

    //la méthode pour la puissance d'une matrice
    private BigInteger[][] powMat(BigInteger[][] m, int n) {
        if (n == 1) {
            return m;
        } else {
            n = n - 1;
            BigInteger[][] ret = new BigInteger[2][2];
            ret = m;
            while (n-- > 0) {
                ret = multMat(ret, m);

            }
            return ret;
        }
    }

    //La méthode qui calcule la suite de Fibonacci
    public String run(int n) {
        BigInteger ans = BigInteger.ZERO;
        BigInteger[][] M = {
            {BigInteger.ONE, BigInteger.ONE},
            {BigInteger.ONE, BigInteger.ZERO}};
        M = powMat(M, n);
        return "" + M[1][0];

    }
}
