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
    public int money = 100;
    public int health = 100;
    public int hungry = 100;

    public int level = 0;

    public int emotions;

    private float n = 0f;
    private float[] sit;

    private float Width;
    private float Height;

    private TextureAtlas atlas;
    private Animation<TextureAtlas.AtlasRegion> animation;

    public Hamster(Main main) {
        this.main = main;

        setEmotions();

        atlas = new TextureAtlas("Pictures/Hamster/Sit/Wow/Normal/sprite.atlas");
        animation = new Animation<TextureAtlas.AtlasRegion>(1/80f, atlas.getRegions());

        sit = new float[]{(float) (main.camera.viewportWidth / 2 - atlas.createSprite("file").getWidth()),
                (float)(main.camera.viewportHeight/6 - atlas.createSprite("file").getHeight())};
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

    public void setEmotions(){
        emotions = (int) (health + hungry)/2;
        if ((emotions == 100) || (emotions > 75 && emotions <= 100)){
            emotions = 2;
        }
        else if (emotions > 25 && emotions <= 75){
            emotions = 1;
        }
        else {
            emotions = 0;
        }
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        setEmotions();
        n += Gdx.graphics.getDeltaTime();
        batch.draw(animation.getKeyFrame(n, true), 0, 0);
    }
}
