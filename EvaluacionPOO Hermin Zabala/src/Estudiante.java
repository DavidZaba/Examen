public class Estudiante extends Persona {
    private int estado;

    public Estudiante(String nombre, String direccion, String telefono, String correoElectronico, int estado) {
        super(nombre, direccion, telefono, correoElectronico);
        if (estado >= 1 && estado <= 4) {
            this.estado = estado;
        } else {
            this.estado = 1;
        }
    }

	@Override
    public String toString() {
        return super.toString() + "\nEstado: " + estado;
    }
}
