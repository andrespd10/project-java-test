public class App {
    public static float sumar(float a, float b){
        return a + b;
    }
    public static float dividir(float a, float b){
        return a / b;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Operaciones de punto flotante");
        System.out.println("La suma es: " + sumar(102, 20));
        System.out.println("La division es: " + dividir(5, 12));
    }
}