package rf.gd.theoneboringmancompany.growham.actorsandbuttons.mainmenuscreen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Button;

import rf.gd.theoneboringmancompany.growham.Main;

public class Scores extends Button {
    private final Main main;

    private final float ANIMATION_SPEED = 5/20f;
    private float delta = 0;

    private TextureAtlas atlas;
    private Animation animation;

    public Scores(Main main){
        this.main = main;
        atlas = new TextureAtlas(Gdx.files.internal("Pictures/Buttons/Animation/Scores/sprite.atlas"));
        animation = new Animation(ANIMATION_SPEED, atlas.getRegions());

        this.setPosition(main.CAMERA_WIDTH - atlas.getRegions().size, main.CAMERA_HEIGHT);

    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        delta += Gdx.graphics.getDeltaTime();
        main.batch.draw((TextureRegion) animation.getKeyFrame(delta, true), getX(), getY());
    }
}
