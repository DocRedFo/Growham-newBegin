package rf.gd.theoneboringmancompany.growham.actors.market;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import rf.gd.theoneboringmancompany.growham.Main;
import rf.gd.theoneboringmancompany.growham.screens.PlayRoomScreen;

public class BackButtonMarket extends Button {
    private final Main main;

    private Sprite sprite;

    public BackButtonMarket(final Main main){
        this.main = main;

        sprite = new Sprite(new Texture("Pictures/Buttons/NonAnimation/Prev/prev.png"));
        setPosition(0, main.camera.viewportHeight-sprite.getHeight());
        sprite.setPosition(getX(), getY());
        setWidth(sprite.getWidth());
        setHeight(sprite.getHeight());

        addListener(new ClickListener(){
            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                super.touchUp(event, x, y, pointer, button);
                main.setScreen(new PlayRoomScreen(main));
            }
        });
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        sprite.draw(batch);
    }
}
