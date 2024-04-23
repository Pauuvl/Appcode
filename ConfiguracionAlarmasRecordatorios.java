import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ConfiguracionAlarmasRecordatorios {
    private List<AlarmaMedicacion> alarmasMedicacion;
    private List<RecordatorioCitaMedica> recordatoriosCitas;

    // Constructor
    public ConfiguracionAlarmasRecordatorios() {
        this.alarmasMedicacion = new ArrayList<>();
        this.recordatoriosCitas = new ArrayList<>();
    }

    // Métodos para agregar alarmas y recordatorios
    public void agregarAlarmaMedicacion(AlarmaMedicacion alarma) {
        alarmasMedicacion.add(alarma);
    }

    public void agregarRecordatorioCitaMedica(RecordatorioCitaMedica recordatorio) {
        recordatoriosCitas.add(recordatorio);
    }

    // Getters y Setters para alarmasMedicacion
    public List<AlarmaMedicacion> getAlarmasMedicacion() {
        return alarmasMedicacion;
    }

    public void setAlarmasMedicacion(List<AlarmaMedicacion> alarmasMedicacion) {
        this.alarmasMedicacion = alarmasMedicacion;
    }

    // Getters y Setters para recordatoriosCitas
    public List<RecordatorioCitaMedica> getRecordatoriosCitas() {
        return recordatoriosCitas;
    }

    public void setRecordatoriosCitas(List<RecordatorioCitaMedica> recordatoriosCitas) {
        this.recordatoriosCitas = recordatoriosCitas;
    }
}

class AlarmaMedicacion {
    private LocalTime hora;
    private String frecuencia;

    // Constructor
    public AlarmaMedicacion(LocalTime hora, String frecuencia) {
        this.hora = hora;
        this.frecuencia = frecuencia;
    }

    // Getters y Setters para hora y frecuencia
    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }
}

class RecordatorioCitaMedica {
    private String fecha;
    private LocalTime hora;
    private String nombreMedico;
    private String ubicacion;

    // Constructor
    public RecordatorioCitaMedica(String fecha, LocalTime hora, String nombreMedico, String ubicacion) {
        this.fecha = fecha;
        this.hora = hora;
        this.nombreMedico = nombreMedico;
        this.ubicacion = ubicacion;
    }

    // Getters y Setters para fecha, hora, nombreMedico y ubicacion
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}