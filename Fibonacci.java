public class Fibonacci {

    public static int fibonacci(int n) {
        Scanner sc = new Scanner(System.in);
        int num;
        int f1;
        int f2;
        int cont;
        do {
            System.out.print("Introduce un numero");
            num = sc.nextInt();
        }
        for(cont=2;i<=numero;cont++){
            f2 = f1 + f2;
            f1 = f2 - f1;

        }
System.out.println();

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
