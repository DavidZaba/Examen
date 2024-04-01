import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del estudiante:");
        System.out.print("Nombre: ");
        String nombreEstudiante = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccionEstudiante = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefonoEstudiante = scanner.nextLine();
        System.out.print("Correo Electrónico: ");
        String correoEstudiante = scanner.nextLine();
        System.out.print("Estado (1 para primer año, 2 para segundo año, 3 para tercer año, 4 para último año): ");
        int estadoEstudiante = scanner.nextInt();

        scanner.nextLine(); 

        System.out.println("Ingrese los datos del empleado:");
        System.out.print("Nombre: ");
        String nombreEmpleado = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccionEmpleado = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefonoEmpleado = scanner.nextLine();
        System.out.print("Correo Electrónico: ");
        String correoEmpleado = scanner.nextLine();
        System.out.print("Departamento (Contabilidad, Recursos Humanos, Compras): ");
        String departamentoEmpleado = scanner.nextLine();
        System.out.print("Salario: ");
        double salarioEmpleado = scanner.nextDouble();
        System.out.print("Fecha de Contratación (AAAA-MM-DD): ");
        String fechaContratacionString = scanner.next();

        String fechaContratacionEmpleado = (fechaContratacionString);

        // Crear estudiante y empleado con los datos ingresados
        Estudiante estudiante = new Estudiante(nombreEstudiante, direccionEstudiante, telefonoEstudiante, correoEstudiante, estadoEstudiante);
        empleado empleado1 = new empleado(nombreEmpleado, direccionEmpleado, telefonoEmpleado, correoEmpleado, departamentoEmpleado, salarioEmpleado, fechaContratacionEmpleado);

        // Imprimir información de estudiante y empleado
        System.out.println("\nEstudiante:");
        System.out.println(estudiante);

        System.out.println("\nEmpleado:");
        System.out.println(empleado1);

        scanner.close();
    }
}
