class Estudiante {

    String nombre;
    int edad;
    double nota1;
    double nota2;
    double nota3;

    public Estudiante(String nombre, int edad, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public boolean aprobo() {
        return calcularPromedio() >= 11;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + calcularPromedio());
    }
    public class Main {

    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Ana", 20, 15, 14, 16);
        Estudiante e2 = new Estudiante("Luis", 19, 10, 9, 12);
        Estudiante e3 = new Estudiante("Carlos", 21, 18, 17, 19);

        Estudiante[] estudiantes = {e1, e2, e3};

        for (Estudiante e : estudiantes) {
            e.mostrarDatos();

            if (e.aprobo()) {
                System.out.println("Estado: Aprobo");
            } else {
                System.out.println("Estado: Desaprobo");
            }

            System.out.println("----------------------");
        }
    }
}
}
