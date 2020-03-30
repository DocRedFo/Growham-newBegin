package rf.gd.theoneboringmancompany.growham.actorsandbuttons.mainmenuscreen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Button;

import rf.gd.theoneboringmancompany.growham.Main;

public class Play extends Button {
    private final Main main;

    private final float ANIMATION_SPEED = 1/45f;
    private float time = 0f;

    private final int BUTTON_SIZE = 512;

    private TextureAtlas atlas;
    private Animation<TextureAtlas.AtlasRegion> animation;

    public Play(Main main){
        this.main = main;

        atlas = new TextureAtlas(Gdx.files.internal("Pictures/Buttons/Animation/Play/sprite.atlas"));
        animation = new Animation<>(ANIMATION_SPEED, atlas.getRegions());

        this.setPosition(main.CAMERA_WIDTH/2 - BUTTON_SIZE/2, main.CAMERA_HEIGHT/2 - BUTTON_SIZE/2);
        this.setHeight(BUTTON_SIZE);
        this.setWidth(BUTTON_SIZE);

    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        time += Gdx.graphics.getDeltaTime();
        batch.draw(animation.getKeyFrame(time, true), getX(), getY());
    }
}
