package com.mygame.tankstars;

import com.badlogic.gdx.graphics.Texture;

public class Attack {

    private int attackPower;
    private int initialSpeed;
    double positionX;
    double positionY;
    double projectedAngle ;

    Texture attackImage;


}

class Missile extends Attack{
    public Missile(){
        attackImage = new Texture("");
    }
}

class Rocket extends Attack{
    public Rocket(){

    }
}
