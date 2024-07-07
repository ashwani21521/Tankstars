package com.mygame.tankstars;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;

import java.util.ArrayList;

public class savedGames implements Screen {
    final tankstars game;
    ArrayList<Game>  savedGames;
    private Texture backgroundImage;
    Texture head , lastplayed, gameNo, playgame, deletegame , num, date;

    public savedGames(final tankstars game) {
//        savedGames = new ArrayList<>(20);
        this.game =game;
        backgroundImage = new Texture("MainMenuBackground.png");
        head = new Texture("savedGamesText.png");
        lastplayed = new Texture("lastPlayed.png");
        playgame = new Texture("play_in_saved_games.png");
        deletegame = new Texture("delete.png");
        num = new Texture("#1.png");
        gameNo = new Texture("game_no.png");
        date = new Texture("time.png");

    }

    private void showSavedGames(){

    }

    private void startSelectedGame(){

    }

    private void exitSavedGameMenu(){

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.15f, 0.15f, 0.3f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        game.batch.begin();
        game.batch.draw(backgroundImage,-50,-50,690,600);
        game.batch.draw(head,200,240,260,350);
        game.batch.draw(gameNo,0,200,200,250);
        game.batch.draw(lastplayed,200,200,200,250);
        game.batch.draw(num,0,160,180,230);
        game.batch.draw(date,220,165,200,240);
        game.batch.draw(playgame,400,218,90,120);
        game.batch.draw(deletegame,500,218,90,120);



        game.batch.end();

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
