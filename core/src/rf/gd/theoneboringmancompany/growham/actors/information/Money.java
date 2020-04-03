package rf.gd.theoneboringmancompany.growham.actors.information;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

import rf.gd.theoneboringmancompany.growham.Main;
import rf.gd.theoneboringmancompany.growham.actors.playRoom.Hamster;

public class Money extends Actor {
    private final Main main;
    private final Hamster hamster;

    private Sprite img;

    public Money(Main main, Hamster hamster) {
        this.main = main;
        this.hamster = hamster;
        img = new Sprite(new Texture("Pictures/Other/Indications/Money/money.png"));
        setPosition(main.camera.viewportWidth/16, main.camera.viewportHeight-img.getHeight()*3 - img.getHeight()*2 - img.getHeight());
        img.setPosition(getX(), getY());
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        img.draw(batch);
        main.fontWarning.draw(batch, Float.toString(hamster.money) + " / 100", getX() + main.camera.viewportWidth/12, getY() + img.getHeight()/2);
    }
}