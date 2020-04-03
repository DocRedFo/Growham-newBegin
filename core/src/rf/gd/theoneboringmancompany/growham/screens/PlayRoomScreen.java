package rf.gd.theoneboringmancompany.growham.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;

import rf.gd.theoneboringmancompany.growham.Main;
import rf.gd.theoneboringmancompany.growham.actors.playRoom.Emotions;
import rf.gd.theoneboringmancompany.growham.actors.playRoom.Hamster;
import rf.gd.theoneboringmancompany.growham.actors.playRoom.Market;
import rf.gd.theoneboringmancompany.growham.actors.playRoom.Room;

public class PlayRoomScreen implements Screen {
    private final Main main;
    private Music music;

    public PlayRoomScreen(Main main) {
        this.main = main;
    }

    @Override
    public void show() {
        main.stage.addActor(new Room(main));
        Hamster hamster = new Hamster(main);
        main.stage.addActor(hamster);
        main.stage.addActor(new Emotions(main, hamster, this));
        main.stage.addActor(new Market(main, hamster, this));

        //TO-DO Кнопки

        music = Gdx.audio.newMusic(Gdx.files.internal("Audio/Music/Ordinary.mp3"));
        music.setVolume(20/100f);
        music.setLooping(true);
        music.play();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0,0,9,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        main.stage.act(delta);

        main.batch.begin();
        main.stage.draw();
        main.batch.end();

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
        music.dispose();
    }
}
