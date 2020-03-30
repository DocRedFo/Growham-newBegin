package rf.gd.theoneboringmancompany.growham.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import rf.gd.theoneboringmancompany.growham.Main;
import rf.gd.theoneboringmancompany.growham.actorsandbuttons.logoscreen.Logo;

public class LogoScreen implements Screen {
    private final Main main;

    public LogoScreen(Main main) {
        this.main = main;
    }

    @Override
    public void show() {
        main.stage.addActor(new Logo(main));

        Gdx.input.setInputProcessor(main.stage);

        main.manager.load("/Pictures/Buttons/Animation/BreakAndPlay/sprite.atlas", TextureAtlas.class);
        main.manager.load("/Pictures/Buttons/Animation/Play/sprite.atlas", TextureAtlas.class);
        main.manager.load("/Pictures/Buttons/Animation/Scores/sprite.atlas", TextureAtlas.class);
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

    }

    @Override
    public void dispose() {

    }
}
