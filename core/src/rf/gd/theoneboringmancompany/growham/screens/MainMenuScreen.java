package rf.gd.theoneboringmancompany.growham.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;

import rf.gd.theoneboringmancompany.growham.Main;
import rf.gd.theoneboringmancompany.growham.actors.mainMenu.BreakAndPlay;
import rf.gd.theoneboringmancompany.growham.actors.mainMenu.Play;
import rf.gd.theoneboringmancompany.growham.actors.mainMenu.Scores;

public class MainMenuScreen implements Screen {
    private final Main main;
    private Music music;

    private final String pathToMusic = "Audio/Music/Menu.mp3";
    private final float musicVolume = 10/100f;

    public MainMenuScreen(Main main) {
        this.main = main;
    }

    @Override
    public void show() {
        main.stage.addActor((new Play(main)));
        main.stage.addActor(new BreakAndPlay(main));
        main.stage.addActor(new Scores(main));

        music = Gdx.audio.newMusic(Gdx.files.internal(pathToMusic));
        music.setLooping(true);
        music.setVolume(musicVolume);
        music.play();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0,0,9,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        if (Gdx.input.isKeyPressed (Input.Keys.BACK)){
            Gdx.input.vibrate(20);
            main.dispose();
            Gdx.app.exit();
        }

        main.stage.act(delta);

        main.batch.begin();
        main.stage.draw();
        main.batch.end();
    }

    @Override
    public void resize(int width, int height) {
        main.viewport.update(width, height, true);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {
        main.stage.clear();
        music.pause();
        dispose();
    }

    @Override
    public void dispose() {
        music.dispose();
    }
}
