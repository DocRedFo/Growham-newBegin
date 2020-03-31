package rf.gd.theoneboringmancompany.growham.tools.classes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Button;

import rf.gd.theoneboringmancompany.growham.Main;

public abstract class MySimpleMainMenuButton extends Button {
    private final Main main;

    private float AnimationSpeed = 1/45f;
    private float time = 0f;

    private final int BUTTON_SIZE = 512;

    private TextureAtlas atlas;
    private Animation<TextureAtlas.AtlasRegion> animation;

    private String pathToTextureAtlas;

    public MySimpleMainMenuButton(Main main, String pathToTextureAtlas){
        this.pathToTextureAtlas = pathToTextureAtlas;
        this.main = main;

        atlas = new TextureAtlas(Gdx.files.internal(pathToTextureAtlas));
        animation = new Animation<>(AnimationSpeed, atlas.getRegions());

        this.setHeight(BUTTON_SIZE);
        this.setWidth(BUTTON_SIZE);

    }

    public void setAnimationSpeed(float animationSpeed) {
        this.AnimationSpeed = animationSpeed;
    }

    public int getBUTTON_SIZE() {
        return BUTTON_SIZE;
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        time += Gdx.graphics.getDeltaTime();
        batch.draw(animation.getKeyFrame(time, true), getX(), getY());
    }

}
