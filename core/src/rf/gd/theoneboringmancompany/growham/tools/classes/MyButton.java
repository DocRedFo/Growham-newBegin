package rf.gd.theoneboringmancompany.growham.tools.classes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.ui.Button;

import rf.gd.theoneboringmancompany.growham.Main;

public abstract class MyButton extends Button {
    private final Main main;

    private Sprite sprite;

    public MyButton(Main main, String pathToPicture, float buttonWidth, float buttonHeight){
        this.main = main;
        sprite = new Sprite(new Texture(Gdx.files.internal(pathToPicture)));

        setWidth(buttonWidth);
        setHeight(buttonHeight);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(sprite, getX(), getY());
    }
}