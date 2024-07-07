package com.mygame.tankstars;

import com.badlogic.gdx.graphics.Texture;

public class Tank {
    public Texture tankImageA, tankImageB;
    Texture Health_Bar ;


    protected int maxHealth ;
    private int currentHealth;

    private static int tankWidth;
    private static int tankHeight;

    private int positionX;
    private int positionY ;
    double positionAngle ;

    public Tank(){

    }

    public void moveRight(){

    }

    public void moveLeft(){

    }

}

class Abrams extends Tank{
    public Abrams(){
        tankImageA = new Texture("Abrams.png");
        tankImageB = new Texture("Mammoth.png");
        maxHealth = 100;
    }
}

class Mammoth extends Tank{

    public Mammoth(){
        tankImageA = new Texture("Mammoth.png");
        tankImageB = new Texture("Mammoth.png");
        maxHealth = 100;
    }
}