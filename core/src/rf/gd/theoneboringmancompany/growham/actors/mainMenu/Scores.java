package rf.gd.theoneboringmancompany.growham.actors.mainMenu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import rf.gd.theoneboringmancompany.growham.Main;
import rf.gd.theoneboringmancompany.growham.screens.ScoresScreen;
import rf.gd.theoneboringmancompany.growham.tools.classes.MySimpleMainMenuButton;

public class Scores extends MySimpleMainMenuButton {

    public Scores(final Main main) {
        super(main, "Pictures/Buttons/Animation/Scores/sprite.atlas");

        setPosition(main.camera.viewportWidth - getBUTTON_SIZE(),
                main.camera.viewportHeight - getBUTTON_SIZE() + getBUTTON_SIZE()/4);

        addListener(new ClickListener() {
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                Gdx.input.vibrate(20);
                main.setScreen(new ScoresScreen(main));
                dispose();
                return super.touchDown(event, x, y, pointer, button);
            }
        });
    }
}
