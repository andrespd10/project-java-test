public class operadores {
     public static void main(String[] args) {

        int numero = 10;
        System.out.println("Valor inicial: " + numero);

        numero += 5;
        System.out.println("Después de + 5: " + numero);

        numero -= 2;
        System.out.println("Después de - 2: " + numero);

        numero *= 3;
        System.out.println("Después de * 3: " + numero);

        numero /= 2;
        System.out.println("Después de / 2: " + numero);

        numero %= 4;
        System.out.println("Después de % 4: " + numero);

        System.out.println("Valor final después de post-incremento: " + numero);
    }
 
}
