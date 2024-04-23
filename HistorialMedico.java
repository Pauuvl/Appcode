public class HistorialMedico {
    private String diagnosticoPrevio;
    private String tratamientoActual;

    // Constructor
    public HistorialMedico(String diagnosticoPrevio, String tratamientoActual) {
        this.diagnosticoPrevio = diagnosticoPrevio;
        this.tratamientoActual = tratamientoActual;
    }

    // Getters y Setters
    public String getDiagnosticoPrevio() {
        return diagnosticoPrevio;
    }

    public void setDiagnosticoPrevio(String diagnosticoPrevio) {
        this.diagnosticoPrevio = diagnosticoPrevio;
    }

    public String getTratamientoActual() {
        return tratamientoActual;
    }

    public void setTratamientoActual(String tratamientoActual) {
        this.tratamientoActual = tratamientoActual;
    }

    // Método para imprimir detalles del historial médico
    public void imprimirHistorial() {
        System.out.println("Diagnóstico Previo: " + diagnosticoPrevio);
        System.out.println("Tratamiento Actual: " + tratamientoActual);
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        // Ejemplo de creación de un objeto HistorialMedico
        HistorialMedico historial = new HistorialMedico("Hipertensión", "Medicación diaria");

        // Impresión de los detalles del historial médico
        historial.imprimirHistorial();
    }
}