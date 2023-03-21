(I)     public static int factorial(int n) {
(1)             int resultado;

(2)             resultado = 1;
(3),(4) y (5)   for (int i = 2; i <= n; i++) {
(6)                 resultado = resultado * i;
                }
(7)             return resultado;
(F)     }