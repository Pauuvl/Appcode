import java.time.LocalDateTime;

public class RegistrarSintoma {
    private String sintoma;
    private String detalles;
    private LocalDateTime fechaHora;

    // Constructor
    public RegistrarSintoma(String sintoma, String detalles, LocalDateTime fechaHora) {
        this.sintoma = sintoma;
        this.detalles = detalles;
        this.fechaHora = fechaHora;
    }

    // Getters y Setters
    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    // Método para imprimir detalles del registro
    public void imprimirRegistro() {
        System.out.println("Síntoma: " + sintoma);
        System.out.println("Detalles: " + detalles);
        System.out.println("Fecha y Hora: " + fechaHora);
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        // Ejemplo de creación de un objeto RegistroSintoma
        RegistrarSintoma registro = new RegistrarSintoma("Dolor de cabeza", "Persistente desde la mañana.", LocalDateTime.now());
        
        // Impresión de los detalles del registro
        registro.imprimirRegistro();
    }
}