package rf.gd.theoneboringmancompany.growham.actors.logo;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import rf.gd.theoneboringmancompany.growham.Main;
import rf.gd.theoneboringmancompany.growham.screens.MainMenuScreen;

public class Logo extends Actor {
    private final Main main;
    private Sprite sprite;
    private Sound clickOk;

    private final String TEXT = "Нажмите дважды для начала";
    private final String pathToPicture = "Pictures/Other/Logo/logo.png";
    private final String pathToSound = "Audio/UI/ok.mp3";
    private final float clickOkVolume = 20/100f;

    public Logo(final Main main) {
        this.main = main;
        this.sprite = new Sprite(new Texture(Gdx.files.internal(pathToPicture)));

        this.clickOk = Gdx.audio.newSound(Gdx.files.internal(pathToSound));

        this.setBounds(0,0, main.camera.viewportWidth, main.camera.viewportHeight);

        this.addListener(new ClickListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                clickOk.play(clickOkVolume);
                return super.touchDown(event, x, y, pointer, button);
            }

            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                main.setScreen(new MainMenuScreen(main));
                clickOk.dispose();
                super.touchUp(event, x, y, pointer, button);
            }
        });
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        sprite.draw(batch);
        main.fontOrdinary.draw(batch, TEXT, main.camera.viewportWidth/2, main.camera.viewportHeight/10);
    }
}
