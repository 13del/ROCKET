package com.fase2;

public class Main {
   // Volem fer un software de carreres de coets.
    // Un coet està identificat per un codi de 8 caràcters i un número de propulsors.
    //Realitza els següents passos:
    //Creem dos coets amb els codis “32WESSDS” I “LDSFJA32”. El primer coet tindrà tres propulsors i el segon sis propulsors.
    //Mostrar a pantalla el codi dels coets i el número de propulsors que té.

    public static void main(String[] args) throws Exception {

      Rocket r1 = new Rocket("32WESSDS");
      r1.addPropeller(10);
      r1.addPropeller(30);
      r1.addPropeller(80);
      Rocket r2 = new Rocket("LDSFJA32");
      r2.addPropeller(30);
      r2.addPropeller(40);
      r2.addPropeller(50);
      r2.addPropeller(50);
      r2.addPropeller(30);
      r2.addPropeller(10);

        System.out.println("El código del cohete es " + r1.getIdRocket() + " y el número de propulsores es " + r1.getPropellerNumb());
        System.out.println("El código del cohete es " + r2.getIdRocket() + " y el número de propulsores es " + r2.getPropellerNumb());
        System.out.println(r1.getIdRocket() +":"+ r1.getPropellers());
        System.out.println(r2.getIdRocket() +":"+ r2.getPropellers());
    }
  }
