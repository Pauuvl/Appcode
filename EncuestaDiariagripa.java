public class EncuestaDiariagripa {
    private double temperatura;
    private String[] sintomas;
    private boolean contactoConInfectados;

    
    public EncuestaDiariagripa(double temperatura, String[] sintomas, boolean contactoConInfectados) {
        this.temperatura = temperatura;
        this.sintomas = sintomas;
        this.contactoConInfectados = contactoConInfectados;
    }

    // Getters y Setters
    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String[] getSintomas() {
        return sintomas;
    }

    public void setSintomas(String[] sintomas) {
        this.sintomas = sintomas;
    }

    public boolean isContactoConInfectados() {
        return contactoConInfectados;
    }

    public void setContactoConInfectados(boolean contactoConInfectados) {
        this.contactoConInfectados = contactoConInfectados;
    }
}

