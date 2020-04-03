package rf.gd.theoneboringmancompany.growham.actors.scores;

import rf.gd.theoneboringmancompany.growham.Main;
import rf.gd.theoneboringmancompany.growham.tools.classes.MyPicture;

public class Who extends MyPicture {

    public Who(Main main) {
        super(main, "Pictures/Other/Scores/Who/who.png",
                main.camera.viewportWidth/2 - 168*3,
                main.camera.viewportHeight/2 + main.camera.viewportHeight/4 - 160/2);
    }
}
