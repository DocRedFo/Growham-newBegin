package rf.gd.theoneboringmancompany.growham.actors.market;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import rf.gd.theoneboringmancompany.growham.Main;
import rf.gd.theoneboringmancompany.growham.actors.playRoom.Hamster;

public class Med extends Actor {
    private final Main main;
    private final Hamster hamster;

    private Sprite img;
    private Sprite button;
    private final String howMuch = "10";

    public Med(final Main main, final Hamster hamster) {
        this.main = main;
        this.hamster = hamster;

        img = new Sprite(new Texture("Pictures/Other/Med/med.png"));
        img.setPosition(main.camera.viewportWidth/14, main.camera.viewportHeight/2 + main.camera.viewportHeight/10);

        button = new Sprite(new Texture("Pictures/Buttons/NonAnimation/Buy/buy.png"));
        button.setPosition(main.camera.viewportWidth/2 - button.getWidth(), main.camera.viewportHeight/2 + main.camera.viewportHeight/10);

        setPosition(button.getX(), button.getY());

        setWidth(button.getWidth());
        setHeight(button.getHeight());

        addListener(new ClickListener(){
            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                super.touchUp(event, x, y, pointer, button);
                hamster.money -= 10;
                hamster.health += 5;
            }
        });
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        img.draw(batch);
        button.draw(batch);
        main.fontWarning.draw(batch, howMuch, getX() - main.camera.viewportWidth/12, getY());
    }
}
