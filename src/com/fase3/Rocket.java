package com.fase3;

import java.util.ArrayList;
import java.util.List;

public class Rocket {

    public String idRocket;
    public List<Propeller> propellers = new ArrayList<>();
    public int maxSpeed;


    public Rocket(String idRocket) throws Exception {
        if (idRocket == null) throw new Exception("Id inválido");
        this.idRocket = idRocket;
    }

    public String getIdRocket() {
        return idRocket;
    }
    public int getPropellerNumb() {
        return propellers.size();
    }

    public String getPropellers() {
        String res = " ";
        for (Propeller p : propellers) {
            res += p.getMaxPower() + ", ";
        }
        return res;
    }
    public void addPropeller(int maxPower) throws Exception {
        Propeller p1 = new Propeller(maxPower);
        propellers.add(p1);
    }

    public int getMaxSpeed() {
        for (Propeller p : propellers) {
            maxSpeed += p.getMaxPower();
        }
        return maxSpeed;
    }
    public int getSpeed() {
        int Speed = 0;
        for (Propeller p : propellers) {
            Speed +=p.getPower();
        }
        return Speed;
    }

    public void accelerate (int m){
        int acc = 10;
        int cn =acc*m;
        for (Propeller p : propellers) {
            p.powerCtrl(cn);
            //System.out.println(x);
        }
    }
    public void brake (int m) {
        int brake = -10;
        int cn = brake * m;
        for (Propeller p : propellers) {
            p.powerCtrl(cn);
        }
    }
}
