import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        
        // Clase scanner que nos permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMax = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreeglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];


        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        // Estructura de control iterativa (Bucle)
        while (!palabraAdivinada && intentos < intentosMax) {
                                                        // Se utiliza para formar una palabra a través de un arreglo de caracteres
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");

            // Utilizo la clase scanner para pedir una letra
            System.out.println("Ingrese una letra, por favor: ");
            char letra = Character.toLowerCase(scanner.nextLine().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                // Estructura de control: Condicional
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("¡Incorrecto! Te quedan " + (intentosMax - intentos) + " intentos.");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("¡Felicidades! Has adivinado la palabra secreta '" + palabraSecreta + "'.");                
            }

            if (intentos == intentosMax) {
                System.out.println("¡Game Over! Te has quedado sin intentos. Tu resultado fue: '" + String.valueOf(letrasAdivinadas) + "'.");
            }
        }

        scanner.close(); 
    }
}
