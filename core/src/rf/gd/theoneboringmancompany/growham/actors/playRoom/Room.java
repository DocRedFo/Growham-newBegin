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
    private Sprite levelTwo;
    private Sprite levelCounter;
    private int levelRoom = 2;

    public Room(Main main) {
        this.main = main;

        sprite = new Sprite(new Texture("Pictures/Other/Room/room.png"));
        sprite.setPosition(0,0);

        levelCounter = new Sprite(new Texture("Pictures/Other/Room/DayTable/daytable.png"));
        levelCounter.setPosition(main.camera.viewportWidth/2 - levelCounter.getWidth()/2,
                main.camera.viewportHeight - levelCounter.getHeight());

        if (levelRoom == 1 || levelRoom == 2) {
            levelOne = new Sprite(new Texture("Pictures/Other/Room/BOF/bof.png"));
            levelOne.setPosition(main.camera.viewportWidth/5 + main.camera.viewportWidth/14 - levelOne.getWidth()/2,
                    main.camera.viewportHeight/6);
        }
        if (levelRoom == 2){
            levelTwo = new Sprite(new Texture("Pictures/Other/Room/Tube/tube.png"));
            levelTwo.setPosition(main.camera.viewportWidth/2 + main.camera.viewportWidth/5,
                    main.camera.viewportHeight/2 - main.camera.viewportWidth/5.3f);
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
        levelCounter.draw(batch);
        if (levelRoom == 1) levelOne.draw(batch);
        if (levelRoom == 2) {
            levelOne.draw(batch);
            levelTwo.draw(batch);
        }
    }
}
