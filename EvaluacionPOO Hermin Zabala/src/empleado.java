
public class empleado extends Persona {
    private String departamento;
    private double salario;
    private String fechaContratacion;

    public empleado(String nombre, String direccion, String telefono, String correoElectronico, String departamento, double salario, String fechaContratacion) {
        super(nombre, direccion, telefono, correoElectronico);
        if (departamento.equals("Contabilidad") || departamento.equals("Recursos Humanos") || departamento.equals("Compras")) {
            this.departamento = departamento;
        } else {
            this.departamento = "Recursos Humanos";
        }
        this.salario = salario;
        this.fechaContratacion = fechaContratacion;
    }

	
	 @Override
	    public String toString() {
	        return super.toString() + "\nDepartamento: " + departamento + "\nSalario: " + salario + "\nFecha de Contratación: " + fechaContratacion;
	    }
}
