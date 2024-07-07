package com.mygame.tankstars;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;

import java.util.ArrayList;

public class newGameMenu implements Screen {


    final tankstars game;
    private String playerA_name;
    private String playerB_name;

    Texture backGround , player1Text, player2Text , rightArrow , button;
    Texture startButton, gameLogo;
    ArrayList<Texture> tankImages = new ArrayList<Texture>(5);

    public String getPlayerA_name() {
        return playerA_name;
    }

    public void setPlayerA_name(String playerA_name) {
        this.playerA_name = playerA_name;
    }

    public String getPlayerB_name() {
        return playerB_name;
    }

    public void setPlayerB_name(String playerB_name) {
        this.playerB_name = playerB_name;
    }

    public newGameMenu(final tankstars game){
        this.game = game;
        this.backGround = new Texture("setGameBackground.jpg");
        tankImages.add(new Texture("Abrams.png"));
        tankImages.add(new Texture("Mammoth.png"));
        startButton = new Texture("start.png");
        gameLogo = new Texture("gameLogo.png");
        player1Text = new Texture("player1text.png");
        player2Text = new Texture("player2text.png");
        rightArrow = new Texture("rightArrow.jpg");
        button = new Texture("button2.png");

    }


//    public void slideRight()

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.15f, 0.15f, 0.3f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.batch.begin();
        game.batch.draw(backGround,150,0,510,500);
        game.batch.draw(gameLogo,0,350,150,130);
        game.batch.draw(tankImages.get(0),200,330,120,120);
        game.batch.draw(tankImages.get(1),470,345,100,70);
        game.batch.draw(startButton,0,-50,150,200);
        game.batch.draw(player1Text,120,320,200,250);
        game.batch.draw(player2Text,470,320,200,250);
        game.batch.draw(button,170,270,100,50);
        game.batch.draw(button,170,240,200,50);
        game.batch.draw(button,170,210,140,50);
        game.batch.draw(button,170,180,150,50);

        game.batch.draw(button,470,270,150,50);
        game.batch.draw(button,470,240,150,50);
        game.batch.draw(button,470,210,150,50);
        game.batch.draw(button,470,180,150,50);
//        game.batch.draw(rightArrow,230,200,50,50);
        game.batch.end();

        if(Gdx.input.isKeyPressed(Input.Keys.S)){
            GameScreen gS = new GameScreen(game);
            game.setScreen(gS);
        }
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
