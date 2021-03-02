package co.com.softka.CarApp;

public class Conductor extends Carro {
    private String documentoConductor;
    private String nombreConductor;
    private int winner;

    public Conductor(String apodo, String documentoConductor, String nombreConductor) {
        super( apodo);
        this.documentoConductor = documentoConductor;
        this.nombreConductor = nombreConductor;
    }

    public Conductor() {
    }

    public String getDocumentoConductor() {
        return documentoConductor;
    }

    public void setDocumentoConductor(String documentoConductor) {
        this.documentoConductor = documentoConductor;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public int getWinner() {
        return winner;
    }


    public void ganador(){
        if (this.winner == 0 ){
            this.winner = 1;
        }
        else
            this.winner+=1;
    }

}
