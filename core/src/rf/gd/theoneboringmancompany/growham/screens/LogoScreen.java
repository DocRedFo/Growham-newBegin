package rf.gd.theoneboringmancompany.growham.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

import rf.gd.theoneboringmancompany.growham.Main;
import rf.gd.theoneboringmancompany.growham.actors.logo.Logo;

public class LogoScreen implements Screen {
    private final Main main;

    public LogoScreen(Main main) {
        this.main = main;
    }

    @Override
    public void show() {
        main.stage.addActor(new Logo(main));

        Gdx.input.setInputProcessor(main.stage);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

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
        dispose();
    }

    @Override
    public void dispose() {

    }
}
