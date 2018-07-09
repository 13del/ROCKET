package com.races;


public class RocketController {

    public RocketController(){

    }

    public Rocket createRocket(String idRocket, int propellerNumb) throws Exception {
        Rocket rocket = new Rocket(idRocket, propellerNumb);

        return rocket;
    }
}
