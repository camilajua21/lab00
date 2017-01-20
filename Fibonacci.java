public class Fibonacci {

    public static int fibonacci(int n) {
    //Variables
    int cero = 0;
    int uno = 1;
    int contador = 0;
    int fn = n - 2;
    int fn1 = n - 1;
    //Si Fibn = Fib0 entonces sera 0.... 0 + 0 = 0
    if (n == cero) return cero;
    //Si Fibn = Fib1 entonces sera 1.... 0 + 1 = 1
    else if(n == uno)  return uno;
    // Si n es diferente a 1 y 0, entoces ya se operra Fibonacci
    //La cual es Fibonacci(n) = fibonacci(n-2) + fibonacci(n-1)
    else 
      return fibonacci(fn) + fibonacci(fn1) ;
    }

    // NO MODIFICAR A PARTIR DE AQUI

    public static void main(String[] args) {
        if(args.length > 0) {
            int n = Integer.parseInt(args[0]);
            System.out.println("Fibonacci de " + n + ": " + fibonacci(n));
        } else {
            System.err.println("No se paso ningun argumento");
        }
    }

}
