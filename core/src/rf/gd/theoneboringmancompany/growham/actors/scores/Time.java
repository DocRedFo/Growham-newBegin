package rf.gd.theoneboringmancompany.growham.actors.scores;

import rf.gd.theoneboringmancompany.growham.Main;
import rf.gd.theoneboringmancompany.growham.tools.classes.MyPicture;

public class Time extends MyPicture {

    public Time(Main main) {
        super(main, "Pictures/Other/Scores/Time/time.png",
                168, 160,
                main.camera.viewportWidth/2 + 168*2,
                main.camera.viewportHeight/2 + main.camera.viewportHeight/4 - 160/2);
    }
}
