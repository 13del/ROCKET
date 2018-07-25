package com.fase3;

public class Main {
 /* Tots els propulsors tindran una potència actual que començarà amb 0.
  El coet tindrà dos mètodes, accelerar o frenar i  augmentarà o es reduirà de 10 en 10 la potencia del propulsor.
  El coet tindrà una velocitat actual que és la suma de totes les potències dels seus propulsors.
  Modifiquem en el main anterior:

Creem dos coets amb els codis “32WESSDS” I “LDSFJA32”. El primer coet tindrà tres propulsors
(potència: 10,30,80) i el segon sis propulsors (potència: 30,40,50,50,30,10).
Mostrar a pantalla el codi dels coets, el número de propulsors que té i la potència màxima de cada propulsor.
Mostrar a pantalla la velocitat actual dels coets
Accelerar amb els coets tres cops
Mostrar a pantalla la velocitat actual
Frenar cinc cops amb el primer coet (“32WESSDS”) i accelerar set amb el segon coet.
Mostrar a pantalla la velocitat actual
Accelerar 15 cops amb els dos coets.
Mostrar a pantalla la velocitat actual
*/


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

      System.out.println("FASE 3: VELOCIDAD ACTUAL DE LOS COHETES: ");
      System.out.println("La velocidad actual del cohete 1 es: " + r1.getSpeed());
      System.out.println("La velocidad actual del cohete 2 es: " + r2.getSpeed());

      System.out.println("FASE 3: ACELERAR 3 VECES: ");
      r1.accelerate(3);
      r2.accelerate(3);

      System.out.println("La velocidad actual del cohete 1 es: " + r1.getSpeed());
      System.out.println("La velocidad actual del cohete 2 es: " + r2.getSpeed());

      System.out.println("FASE 3: FRENAR 5 VECES CON EL COHETE 1; ACELERAR 7 VECES CON EL COHETE 2: ");
        r1.brake(5);
        r2.accelerate(7);

        System.out.println("La velocidad actual del cohete 1 es: " + r1.getSpeed());
        System.out.println("La velocidad actual del cohete 2 es: " + r2.getSpeed());

        System.out.println("FASE 3: ACELERAR 15 VECES: ");
        r1.accelerate(15);
        r2.accelerate(15);

        System.out.println("La velocidad actual del cohete 1 es: " + r1.getSpeed());
        System.out.println("La velocidad actual del cohete 2 es: " + r2.getSpeed());
    }
  }
