(I) public boolean esPrimo(int n) {
(1)     boolean primo;

(2)     if (n <= 1) {
(3)         primo = false;
        } else {
(4)         primo = true;
(5)         int i = 2;
(6) y (7)   while (primo && i <= n / 2) {
(8)             if (divisible(n,i)) {
(9)                 primo = false;
                } else {
(10)                i++;
                }
            }
        }
(11)    return primo;
(F) }