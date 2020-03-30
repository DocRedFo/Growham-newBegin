package rf.gd.theoneboringmancompany.growham.actorsandbuttons.mainmenuscreen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Button;

import rf.gd.theoneboringmancompany.growham.Main;

public class BreakAndPlay extends Button {
    private final Main main;

    private final float ANIMATION_SPEED = 1/30f;
    private float elapsedTime = 0f;

    private TextureAtlas atlas;
    private Animation animation;

    public BreakAndPlay(Main main){
        this.main = main;
//        if (main.manager.isLoaded("Pictures/Buttons/Animation/BreakAndPlay/sprite.atlas", TextureAtlas.class)){
//            atlas = main.manager.get("Pictures/Buttons/Animation/BreakAndPlay/sprite.atlas", TextureAtlas.class);
//        }
//        else {
//            atlas = new TextureAtlas(Gdx.files.internal("Pictures/Buttons/Animation/BreakAndPlay/sprite.atlas"));
//        }
        atlas = new TextureAtlas(Gdx.files.internal("Pictures/Buttons/Animation/BreakAndPlay/sprite.atlas"));
        animation = new Animation(ANIMATION_SPEED, atlas.getRegions());

        this.setBounds(0, 0, main.CAMERA_WIDTH, main.CAMERA_HEIGHT);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        elapsedTime += Gdx.graphics.getDeltaTime();
        main.batch.draw((TextureRegion) animation.getKeyFrame(elapsedTime, true), getX(), getY());
        super.draw(batch, parentAlpha);
    }
}
