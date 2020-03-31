package rf.gd.theoneboringmancompany.growham.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

import rf.gd.theoneboringmancompany.growham.Main;
import rf.gd.theoneboringmancompany.growham.actors.playRoom.Room;

public class PlayRoomScreen implements Screen {
    private final Main main;

    public PlayRoomScreen(Main main) {
        this.main = main;
    }

    @Override
    public void show() {
        main.stage.addActor(new Room(main));
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(111/255f,129/255f,214/255f,1);
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

    }
}
