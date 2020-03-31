package rf.gd.theoneboringmancompany.growham.actors.mainMenu;

import rf.gd.theoneboringmancompany.growham.Main;
import rf.gd.theoneboringmancompany.growham.tools.classes.MySimpleMainMenuButton;

public class BreakAndPlay extends MySimpleMainMenuButton {

    public BreakAndPlay(Main main) {
        super(main, "Pictures/Buttons/Animation/BreakAndPlay/sprite.atlas");
        setPosition(0,
                main.camera.viewportHeight - getBUTTON_SIZE()
                        + getBUTTON_SIZE()/4 - getBUTTON_SIZE()/3.5f + getBUTTON_SIZE()/6);
    }
}
