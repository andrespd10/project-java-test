public class App {
    public static int sumar(int a, int b) {
        return a + b;
    }
    public static int restar(int a, int b) {
        return a - b;
    }
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    public static int dividir(int a, int b) {
        return a / b;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Operaciones aritmeticas: ");
        System.out.println("La suma es: " + sumar(35, 67));
        System.out.println("La resta es: " + restar(56, 20));
        System.out.println("La multiplicacion es: " + multiplicar(20, 3));
        System.out.println("La division es: " + dividir(20, 4));
    }
}
