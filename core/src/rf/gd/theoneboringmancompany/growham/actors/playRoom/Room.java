package rf.gd.theoneboringmancompany.growham.actors.playRoom;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

import rf.gd.theoneboringmancompany.growham.Main;

public class Room extends Actor {
    private final Main main;

    private Sprite sprite;

    public Room(Main main){
        this.main = main;
        sprite = new Sprite(new Texture("Pictures/Other/Room/room.png"));
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        sprite.draw(batch);
    }
}
