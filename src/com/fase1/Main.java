package com.fase1;

public class Main {
   // Volem fer un software de carreres de coets.
    // Un coet està identificat per un codi de 8 caràcters i un número de propulsors.
    //Realitza els següents passos:
    //Creem dos coets amb els codis “32WESSDS” I “LDSFJA32”. El primer coet tindrà tres propulsors i el segon sis propulsors.
    //Mostrar a pantalla el codi dels coets i el número de propulsors que té.

    public static void main(String[] args) throws Exception {

      Rocket r1 = new Rocket("32WESSDS", 3);
      Rocket r2 = new Rocket("LDSFJA32", 6);

        System.out.println("El código del cohete es " + r1.getIdRocket() + " y el número de propulsores es " + r1.getPropellerNumb());
        System.out.println("El código del cohete es " + r2.getIdRocket() + " y el número de propulsores es " + r2.getPropellerNumb());
    }
  }
