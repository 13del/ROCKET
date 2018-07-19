package com.races;

import java.util.ArrayList;
import java.util.List;

public class Rocket {

    public String idRocket;
    public int propellerNumb;


    public Rocket(String idRocket, int propellerNumb) throws Exception {
        if (idRocket == null) throw new Exception("Id inválido");
        if (propellerNumb <= 0) throw new Exception("Número de propulsores incorrecto");
        this.idRocket = idRocket;
        this.propellerNumb = propellerNumb;

    }

    public String getIdRocket() {
        return idRocket;
    }

    public int getPropellerNumb() {
        return propellerNumb;
    }


}
