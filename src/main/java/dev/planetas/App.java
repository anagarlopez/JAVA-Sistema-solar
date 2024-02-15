package dev.planetas;

public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Planeta p1 = new Planeta("Venus", 100, 1000, 1000, 5, 6, TipoPlaneta.GASEOSO, false);
        System.out.println("ESTOS SON LOS DATOS DEL PLANETA 1");
        
        System.out.println("Nombre del planeta: " + p1.getNombre());
        System.out.println("Número de satelites: " + p1.getNumeroSatelites());
        System.out.println("Masa: " + p1.getMasaEnKg() + " kg");
        System.out.println("Volumen: " + p1.getVolumenEnKm3() + " km3");
        System.out.println("Diametro: " + p1.getDiametroEnKm() + " km");
        System.out.println("Distancia al sol: " + p1.getDistanciaAlSol() + " km");
        System.out.println("Tipo de planeta: " + p1.tipoPlaneta);
        System.out.println("¿Es observable? " + p1.esObservable());

System.out.println("La densidad del planeta es: " + p1.calculo_distancia_al_sol(551225, 6664455)+ " g/cm");

System.out.println("El planeta es exterior? " + p1.es_exterior(149597871));
    

Planeta p2 = new Planeta("Namek", 40, 4544, 44, 3, 8, TipoPlaneta.TERRESTRE, true);
System.out.println("ESTOS SON LOS DATOS DEL PLANETA 2");
System.out.println("Nombre del planeta2 " + p2.getNombre());
System.out.println("Número de satelites: " + p2.getNumeroSatelites());
System.out.println("Masa: " + p2.getMasaEnKg() + " kg");
System.out.println("Volumen: " + p2.getVolumenEnKm3() + " km3");
System.out.println("Diametro: " + p2.getDiametroEnKm() + " km");
System.out.println("Distancia al sol: " + p2.getDistanciaAlSol() + " km");
System.out.println("Tipo de planeta: " + p2.tipoPlaneta);
System.out.println("¿Es observable? " + p2.esObservable());

System.out.println("La densidad del planeta es: " + p2.calculo_distancia_al_sol(15125, 66655)+ " g/cm");

System.out.println("El planeta es exterior? " + p2.es_exterior(149871)); 
    }
}
