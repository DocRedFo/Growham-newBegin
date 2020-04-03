package rf.gd.theoneboringmancompany.growham.actors.playRoom;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import rf.gd.theoneboringmancompany.growham.Main;
import rf.gd.theoneboringmancompany.growham.screens.MarketScreen;
import rf.gd.theoneboringmancompany.growham.screens.PlayRoomScreen;

public class Market extends Button {
    private final Main main;
    private final Hamster hamster;

    private Sprite sprite;

    public Market(final Main main, final Hamster hamster, final PlayRoomScreen playRoomScreen){
        this.main = main;
        this.hamster = hamster;

        sprite = new Sprite(new Texture("Pictures/Other/Market/market.png"));
        setPosition(main.camera.viewportWidth-sprite.getWidth(), main.camera.viewportHeight - sprite.getHeight());
        sprite.setPosition(getX(), getY());
        setHeight(sprite.getHeight());
        setWidth(sprite.getWidth());

        addListener(new ClickListener(){
            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                super.touchUp(event, x, y, pointer, button);
                main.setScreen(new MarketScreen(main, hamster, playRoomScreen));
            }
        });
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        sprite.draw(batch);
    }
}
