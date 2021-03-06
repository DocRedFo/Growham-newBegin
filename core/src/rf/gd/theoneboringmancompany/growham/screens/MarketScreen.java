package rf.gd.theoneboringmancompany.growham.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

import rf.gd.theoneboringmancompany.growham.Main;
import rf.gd.theoneboringmancompany.growham.actors.market.BackButtonMarket;
import rf.gd.theoneboringmancompany.growham.actors.market.FoodOne;
import rf.gd.theoneboringmancompany.growham.actors.market.FoodTwo;
import rf.gd.theoneboringmancompany.growham.actors.market.Med;
import rf.gd.theoneboringmancompany.growham.actors.market.UpdateRoom;
import rf.gd.theoneboringmancompany.growham.actors.playRoom.Hamster;

public class MarketScreen implements Screen {
    private final Main main;
    private final Hamster hamster;
    private final PlayRoomScreen playRoomScreen;

    public MarketScreen(Main main, Hamster hamster, PlayRoomScreen playRoomScreen) {
        this.main = main;
        this.hamster = hamster;
        this.playRoomScreen = playRoomScreen;
    }

    @Override
    public void show() {
        main.stage.addActor(new BackButtonMarket(main));
        main.stage.addActor(new FoodOne(main, hamster));
        main.stage.addActor(new FoodTwo(main, hamster));
        main.stage.addActor(new Med(main, hamster));
        main.stage.addActor(new UpdateRoom(main, hamster));
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0,0,9,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        if (Gdx.input.isKeyPressed (Input.Keys.BACK)){
            main.stage.clear();
            Gdx.input.vibrate(20);
            main.setScreen(playRoomScreen);
        }

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
