package rf.gd.theoneboringmancompany.growham.actors.playRoom;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import rf.gd.theoneboringmancompany.growham.Main;
import rf.gd.theoneboringmancompany.growham.screens.InformationScreen;
import rf.gd.theoneboringmancompany.growham.screens.PlayRoomScreen;

public class Emotions extends Button {
    private final Main main;
    private final Hamster hamster;

    private Sprite sprite;

    public Emotions(final Main main, final Hamster hamster, final PlayRoomScreen playRoomScreen){
        this.main = main;
        this.hamster = hamster;

        if (hamster.emotions == 0) {
            sprite = new Sprite(new Texture("Pictures/Other/Emotions/0.png"));
        }
        else if (hamster.emotions == 1){
            sprite = new Sprite(new Texture("Pictures/Other/Emotions/1.png"));
        }
        else if (hamster.emotions == 2){
            sprite = new Sprite(new Texture("Pictures/Other/Emotions/2.png"));
        }
        setPosition(0, main.camera.viewportHeight-sprite.getHeight());
        sprite.setPosition(getX(), getY());
        setWidth(sprite.getWidth());
        setHeight(sprite.getHeight());
        addListener(new ClickListener(){
            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                main.setScreen(new InformationScreen(main, hamster, playRoomScreen));
            }
        });
    }
    @Override
    public void draw(Batch batch, float parentAlpha) {
        sprite.draw(batch);
    }
}
