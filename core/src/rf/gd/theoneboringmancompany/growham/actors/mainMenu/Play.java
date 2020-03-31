package rf.gd.theoneboringmancompany.growham.actors.mainMenu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import rf.gd.theoneboringmancompany.growham.Main;
import rf.gd.theoneboringmancompany.growham.screens.PlayRoomScreen;
import rf.gd.theoneboringmancompany.growham.tools.classes.MySimpleMainMenuButton;

public class Play extends MySimpleMainMenuButton {

    public Play(final Main main) {
        super(main, "Pictures/Buttons/Animation/Play/sprite.atlas");

        setPosition(main.camera.viewportWidth/2 - getBUTTON_SIZE()/3,
                main.camera.viewportHeight/2 - getBUTTON_SIZE()/4 - getBUTTON_SIZE()/3.5f);

        addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                Gdx.input.vibrate(20);
                dispose();
                main.setScreen(new PlayRoomScreen(main));
            }
        });
    }

}
