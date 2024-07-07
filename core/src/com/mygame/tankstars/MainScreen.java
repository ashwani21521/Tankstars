package com.mygame.tankstars;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;

public class MainScreen implements Screen {
    final tankstars game;

    private int Button_Width;
    private int Button_height;

    Texture savedGamesButton;
    Texture exitButton;
    Texture newGameButton , gameLogo ;
    private Texture backgroundImage;
    private TextureRegion backgroundTexture;

    Music gameMusic ;
    public int isMusicOn = 1;

    Texture MusicOn;
    Texture MusicOff;

    Texture abrams , helios , blazer, Mark, pumpkin, Mammoth;

    public MainScreen(final tankstars game){
        this.game = game;
        backgroundImage = new Texture("MainMenuBackground.png");
        backgroundTexture = new TextureRegion(backgroundImage,0,0,1000,1000);
        savedGamesButton = new Texture("savedGames.png");
        exitButton = new Texture("exitButton.png");
        newGameButton = new Texture("newGame.png");
        abrams = new Texture("Abrams.png");
        helios = new Texture("Helios.png");
        blazer = new Texture("Blazer.png");
        pumpkin = new Texture("Pumpkin.png");
        Mark = new Texture("Mark.png");
        Mammoth = new Texture("Mammoth.png");
        gameLogo = new Texture("gameLogo.png");


        MusicOn = new Texture(Gdx.files.internal("music_ON.png"));
        MusicOff = new Texture(Gdx.files.internal("music_OFF.png"));

        gameMusic = Gdx.audio.newMusic(Gdx.files.internal("music.mp3"));
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
        game.batch.draw(gameLogo,225,370,170,130);
        game.batch.draw(abrams,-200,-130,500,500);
        game.batch.draw(Mammoth,450,0,200,250);
        game.batch.draw(newGameButton,240,220,150,200);
        game.batch.draw(savedGamesButton,240,150,160,200);
        game.batch.draw(exitButton,240,80,150,200);
        game.batch.draw(MusicOn,20,400,20,30);
//        game.batch.draw(abrams,30,330,100,100);
//        game.batch.draw(helios,150,330,100,100);
//        game.batch.draw(Mark,150,200,80,80);
//        game.batch.draw(blazer,150,200,80,80);
//        game.batch.draw(helios,200,350,30,30);


        game.batch.end();

        if(isMusicOn==1){
            gameMusic.play();
        }
        if(Gdx.input.isKeyPressed(Input.Keys.M)){
            if(isMusicOn==1){
                isMusicOn = 0;
            gameMusic.pause();
            }

            else{
                isMusicOn = 1;
                gameMusic.play();
            }

        }

        if(Gdx.input.isKeyPressed(Input.Keys.N)){
            newGameMenu gS = new newGameMenu(game);
//            gameMusic.pause();
            game.setScreen(gS);
        }

        if(Gdx.input.isKeyPressed(Input.Keys.S)){
            savedGames gS = new savedGames(game);
            game.setScreen(gS);
        }

//        if(Gdx.input.isKeyPressed(Input.Keys.ENTER)){
//
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
        Gdx.input.setInputProcessor(null);
    }
}
