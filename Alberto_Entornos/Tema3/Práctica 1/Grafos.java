public boolean esPrimo(int n) {
    boolean primo;
    
    if (n <= 1) {
         primo = false;
    } else {
        primo = true;
        int i = 2;
        while (primo && i <= n / 2) {
            if (divisible(n,i)) {
                primo = false;
            } else {
                i++;
            }
        }
    }
    return primo;
}