package com.mygame.tankstars;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;

public class GameScreen extends Game implements Screen {

    final tankstars game;
    Texture Ground;
    Tank Player1;
    Tank Player2;

    Texture playerOneHealth ;
    Texture playerTwoHealth;

    public GameScreen(final tankstars game){

        this.game = game;
        Ground = new Texture("Plane_hill.jpg");
        Player1 = new Abrams();
        Player2 = new Mammoth();
        playerOneHealth =new Texture("healthBar.png");
        playerTwoHealth =new Texture("healthBar.png");


    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.15f, 0.15f, 0.3f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.batch.begin();

        game.batch.draw(Ground,-50,-100,690,600);
        game.batch.draw(Player1.tankImageA,0,70,60,70);
        game.batch.draw(Player2.tankImageB,400,90,50,30);
        game.batch.draw(playerOneHealth,30,350,300,150);
        game.batch.draw(playerTwoHealth,315,350,300,150);

        game.batch.end();

        if(Gdx.input.isKeyPressed(Input.Keys.P)){
            GamePauseMenu gPM = new GamePauseMenu(game);
            game.setScreen(gPM);
        }
    }

    @Override
    public void create() {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }


}
