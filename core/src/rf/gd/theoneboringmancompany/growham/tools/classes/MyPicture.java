package rf.gd.theoneboringmancompany.growham.tools.classes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

import rf.gd.theoneboringmancompany.growham.Main;

public class MyPicture extends Actor {
    private final Main main;

    public Sprite sprite;

    public MyPicture(Main main, String pathToPicture, float x, float y){
        this.main = main;
        sprite = new Sprite(new Texture(Gdx.files.internal(pathToPicture)));
        setPosition(x, y);
        setHeightAndWidth();
    }

    public void setHeightAndWidth(){
        setWidth(sprite.getWidth());
        setHeight(sprite.getHeight());
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(sprite, getX(), getY());
    }

}
