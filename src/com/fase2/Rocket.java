package com.fase2;

import java.util.ArrayList;
import java.util.List;

public class Rocket {

    public String idRocket;
    public int propellerNumb;
    public List<Propeller> propellers = new ArrayList<>();


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
}
