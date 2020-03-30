package rf.gd.theoneboringmancompany.growham.actorsandbuttons.mainmenuscreen;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Button;

import rf.gd.theoneboringmancompany.growham.Main;

public class BreakAndPlay extends Button {
    private final Main main;

    private TextureAtlas atlas;
    private Animation animation;

    public BreakAndPlay(Main main){
        this.main = main;
    }

}
