package rf.gd.theoneboringmancompany.growham.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;

import rf.gd.theoneboringmancompany.growham.Main;
import rf.gd.theoneboringmancompany.growham.actorsandbuttons.mainmenuscreen.BreakAndPlay;
import rf.gd.theoneboringmancompany.growham.actorsandbuttons.mainmenuscreen.Play;
import rf.gd.theoneboringmancompany.growham.actorsandbuttons.mainmenuscreen.Scores;

public class MainMenuScreen implements Screen {
    private final Main main;
    private Music music;

    public MainMenuScreen(Main main) {
        this.main = main;
    }

    @Override
    public void show() {
        main.stage.addActor(new Play(main));
        main.stage.addActor(new BreakAndPlay(main));
        main.stage.addActor(new Scores(main));

        music = Gdx.audio.newMusic(Gdx.files.internal("Audio/Music/Menu.mp3"));
        music.setLooping(true);
        music.setVolume(10/100f);
        music.play();

        Gdx.input.setInputProcessor(main.stage);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(109/255f,72/255f,215/255f,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

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

    }

    @Override
    public void dispose() {
        music.dispose();
    }
}
