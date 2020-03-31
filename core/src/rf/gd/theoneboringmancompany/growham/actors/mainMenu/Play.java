package rf.gd.theoneboringmancompany.growham.actors.mainMenu;

import rf.gd.theoneboringmancompany.growham.Main;
import rf.gd.theoneboringmancompany.growham.tools.classes.MySimpleMainMenuButton;

public class Play extends MySimpleMainMenuButton {

    public Play(Main main) {
        super(main, "Pictures/Buttons/Animation/Play/sprite.atlas");
        setPosition(main.camera.viewportWidth/2 - getBUTTON_SIZE()/3,
                main.camera.viewportHeight/2 - getBUTTON_SIZE()/4 - getBUTTON_SIZE()/3.5f);
    }

}
