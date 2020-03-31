package rf.gd.theoneboringmancompany.growham.actors.scores;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import rf.gd.theoneboringmancompany.growham.Main;
import rf.gd.theoneboringmancompany.growham.screens.MainMenuScreen;
import rf.gd.theoneboringmancompany.growham.tools.classes.MyButton;

public class BackButton extends MyButton {

    public BackButton(final Main main) {
        super(main, "Pictures/Buttons/NonAnimation/Prev/prev.png", 197, 62);

        setPosition(0, main.camera.viewportHeight - 62);

        addListener(new ClickListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                main.stage.clear();
                main.setScreen(new MainMenuScreen(main));
                return super.touchDown(event, x, y, pointer, button);
            }
        });
    }
}
