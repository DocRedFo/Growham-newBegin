package rf.gd.theoneboringmancompany.growham.actors.playRoom;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

import rf.gd.theoneboringmancompany.growham.Main;

public class Room extends Actor {
    private final Main main;

    private Sprite sprite;
    private Sprite levelOne;
    private Sprite levelCounter;
    private int levelRoom = 0;

    public Room(Main main) {
        this.main = main;
        sprite = new Sprite(new Texture("Pictures/Other/Room/room.png"));
        if (levelRoom == 1) {
            levelOne = new Sprite(new Texture("Pictures/Other/Room/BOF/bof.png"));
        }
    }

    public int getLevelRoom() {
        return levelRoom;
    }

    public void setLevelRoom(int levelRoom) {
        this.levelRoom = levelRoom;
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        sprite.draw(batch);
    }
}
