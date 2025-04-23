import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean visitante,empleado,estudiante;
        String nombre,apellido;
        byte edad;
        int altura, apartamento, peso;
        long celular;
        char genero;

        System.out.println("Bienvenido Al PH LOCO");

        System.out.println("\nEl visitante es un Empleado? (true/false): ");
        empleado= scanner.nextBoolean();

        System.out.println("\n¿Es estudiante? (true/false): ");
        estudiante = scanner.nextBoolean();

        System.out.println("\n¿Es su primera vez aquí? (true/false): ");
        visitante = scanner.nextBoolean();

        System.out.println("\nNombre: ");
        nombre = scanner.next();

        System.out.println("\nApellido: ");
        apellido = scanner.next();

        System.out.println("\nEdad: ");
        edad = scanner.nextByte();



        System.out.println("\nEscriba su genero (M/F): ");
        genero = scanner.next().charAt(0);

        System.out.println("\nPeso del visitante (En Kg): ");
        peso = scanner.nextShort();

        System.out.println("\nAltura del visitante (cm): ");
        altura = scanner.nextInt();

        System.out.println("\nIngrese número de telefono: ");
        celular = scanner.nextLong();

        System.out.println("\nIngrese número de apartamento: ");
        apartamento = scanner.nextInt();

        System.out.println("El visitante es un Empleado: " + empleado);
        System.out.println("\nEl visitante es un Estudiante: " + estudiante);
        System.out.println("\nEs un visitante nuevo: " + visitante);
        System.out.println("\nNombre: " + nombre + " " + apellido);
        System.out.println("\nEdad: " + edad);
        System.out.println("\nGenero: " + genero);
        System.out.println("\nPeso del visitante: " + peso);
        System.out.println("\nAltura del visitante: " + altura);
        System.out.println("\nNumero de telefono: " + celular);
        System.out.println("\nNumero de apartamento: " + apartamento);



    }
}
