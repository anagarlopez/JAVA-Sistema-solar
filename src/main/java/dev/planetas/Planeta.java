package dev.planetas;

public class Planeta {
    private String nombre = null;
    private int numeroSatelites = 0;
    private double masaEnKg = 0;
    private double volumenEnKm3 = 0;
    private int diametroEnKm = 0;
    private int distanciaAlSol = 0;
    public TipoPlaneta tipoPlaneta ;
    private boolean observable = false;
    
    public Planeta(String nombre, int numeroSatelites, double masaEnKg, double volumenEnKm3, int diametroEnKm,
            int distanciaAlSol, TipoPlaneta tipoPlaneta, boolean observable) {
        this.nombre = nombre;
        this.numeroSatelites = numeroSatelites;
        this.masaEnKg = masaEnKg;
        this.volumenEnKm3 = volumenEnKm3;
        this.diametroEnKm = diametroEnKm;
        this.distanciaAlSol = distanciaAlSol;
        this.tipoPlaneta = tipoPlaneta;
        this.observable = observable;
    }
    
    public static void main(String[] args) {
       
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getNumeroSatelites() {
        return numeroSatelites;
    }
    
    public void setNumeroSatelites(int numeroSatelites) {
        this.numeroSatelites = numeroSatelites;
    }
    
    public double getMasaEnKg() {
        return masaEnKg;
    }
    
    public void setMasaEnKg(double masaEnKg) {
        this.masaEnKg = masaEnKg;
    }
    
    public double getVolumenEnKm3() {
        return volumenEnKm3;
    }
    
    public void setVolumenEnKm3(double volumenEnKm3) {
        this.volumenEnKm3 = volumenEnKm3;
    }
    
    public int getDiametroEnKm() {
        return diametroEnKm;
    }
    
    public void setDiametroEnKm(int diametroEnKm) {
        this.diametroEnKm = diametroEnKm;
    }
    
    public int getDistanciaAlSol() {
        return distanciaAlSol;
    }
    
    public void setDistanciaAlSol(int distanciaAlSol) {
        this.distanciaAlSol = distanciaAlSol;
    }
    
    public boolean esObservable() {
        return observable;
    
}

public double calculo_distancia_al_sol(double masa, double volumen) {
    return masa / volumen;
  }
  public boolean es_exterior(int distanciaAlSol) {
if (distanciaAlSol >149597870 ) { return false;}
else return true;


  
}
}
