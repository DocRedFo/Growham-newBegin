package rf.gd.theoneboringmancompany.growham.actors.playRoom;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Actor;

import rf.gd.theoneboringmancompany.growham.Main;

public class Hamster extends Actor {
    private final Main main;

    private int age = 0;
    private float n = 0f;

    private TextureAtlas atlas, atlasSit;
    private Animation<TextureAtlas.AtlasRegion> animation;

    public Hamster(Main main) {
        this.main = main;
        atlas = new TextureAtlas("Pictures/Hamster/Sit/Wow/Normal/sprite.atlas");
        animation = new Animation<TextureAtlas.AtlasRegion>(1/60f, atlas.getRegions());
    }

    public void humsterBody(){

    }

    public void hamsterUpdate(int age){
        if (age < 300){
            //метод установки вида
        }
        else if (age > 300 && age < 800){
            //метод ухода
            //метод установки вида
        }
        else if (age > 800 && age < 1095){
            //метод ухода
            //метод установки вида
        }
        else if (age >= 1095){
            //метод смерти
        }
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        n += Gdx.graphics.getDeltaTime();
        batch.draw(animation.getKeyFrame(n, true), 0, 0);
    }
}
