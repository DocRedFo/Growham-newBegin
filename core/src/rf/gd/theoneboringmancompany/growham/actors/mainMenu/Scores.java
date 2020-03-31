package rf.gd.theoneboringmancompany.growham.actors.mainMenu;

import rf.gd.theoneboringmancompany.growham.Main;
import rf.gd.theoneboringmancompany.growham.tools.classes.MySimpleMainMenuButton;

public class Scores extends MySimpleMainMenuButton {

    public Scores(Main main) {
        super(main, "Pictures/Buttons/Animation/Scores/sprite.atlas");
        setPosition(main.camera.viewportWidth - getBUTTON_SIZE(),
                main.camera.viewportHeight - getBUTTON_SIZE() + getBUTTON_SIZE()/4);
    }
}
