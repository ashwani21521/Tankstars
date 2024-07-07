package com.mygame.tankstars;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;

public class GamePauseMenu implements Screen  {

    final tankstars game;
    Texture backGround;
    Texture resumeGame;
    Texture saveGame;
    Texture exitGame;
    Texture onExitButton;
    Texture gameLogo;

    public GamePauseMenu(final tankstars game){
        this.game = game;
        backGround = new Texture("Plane_hill.jpg");
        resumeGame = new Texture("resumeButton.png");
        saveGame = new Texture("saveGame.png");
        exitGame = new Texture("exitButton.png");
        onExitButton = new Texture("onExitButton.png");
        gameLogo = new Texture("gameLogo.png");
    }

    public void resumeGame(){
        GameScreen gS = new GameScreen(game);
        game.setScreen(gS);

    }

    public void saveGame(){

    }

    public void exitGame(){

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.15f, 0.15f, 0.3f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.batch.begin();

        game.batch.draw(backGround,-50,-100,690,600);
        game.batch.draw(resumeGame,250,250,150,200);
        game.batch.draw(saveGame, 250, 180,150,200);
        game.batch.draw(exitGame, 250, 100,150,200);
        game.batch.draw(gameLogo, 0, 400,120,80);

        if(Gdx.input.isKeyPressed(Input.Keys.ENTER)){
            this.resumeGame();
        }
        if(Gdx.input.isKeyPressed(Input.Keys.E)){
            MainScreen mS = new MainScreen(game);
            game.setScreen(mS);
        }

//        if(Gdx.input.getX() > 700 && Gdx.input.getX()< 1200 ){
//            game.batch.draw(onExitButton, 240, 155,170,240);
//        }

        game.batch.end();

//        if(Gdx.input.isKeyPressed(Input.Keys.ENTER)){
//            this.resumeGame();
//        }

//        if(Gdx.input.getX() > 0 && Gdx.input.getX()< 500 ){
//            game.batch.draw(onExitButton, 250, 120,150,200);
//        }

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
