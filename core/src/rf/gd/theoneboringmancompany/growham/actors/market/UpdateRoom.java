package rf.gd.theoneboringmancompany.growham.actors.market;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import rf.gd.theoneboringmancompany.growham.Main;
import rf.gd.theoneboringmancompany.growham.actors.playRoom.Hamster;

public class UpdateRoom extends Actor {
    private final Main main;
    private final Hamster hamster;

    private Sprite img;
    private Sprite button;
    private String howMuch = "10";

    public UpdateRoom(Main main, final Hamster hamster) {
        this.main = main;
        this.hamster = hamster;
        update();

        button = new Sprite(new Texture("Pictures/Buttons/NonAnimation/Buy/buy.png"));

        setPosition(main.camera.viewportWidth/2 + main.camera.viewportWidth/6,
                main.camera.viewportHeight/2 - img.getHeight());
        img.setPosition(getX() - main.camera.viewportWidth/5, getY());

        button.setPosition(getX(), getY());

        addListener(new ClickListener(){
            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                super.touchUp(event, x, y, pointer, button);
                hamster.level++;
                hamster.money -= Integer.parseInt(howMuch);
            }
        });
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        img.draw(batch);
        main.fontWarning.draw(batch, howMuch, getX() - main.camera.viewportWidth/10,
                getY());
        update();
    }

    public void update(){
        if (hamster.level == 0) {
            img = new Sprite(new Texture("Pictures/Other/Cell/One/cone.png"));
        }
        else if (hamster.level == 1){
            img = new Sprite(new Texture("Pictures/Other/Cell/Two/ctwo.png"));
            howMuch = "100";
        }
    }

}
