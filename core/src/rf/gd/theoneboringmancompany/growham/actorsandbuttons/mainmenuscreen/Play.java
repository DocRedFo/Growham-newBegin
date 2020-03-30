package rf.gd.theoneboringmancompany.growham.actorsandbuttons.mainmenuscreen;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Button;

import rf.gd.theoneboringmancompany.growham.Main;

public class Play extends Button {
    private final Main main;

    private TextureAtlas atlas;
    private Animation animation;

    public Play(Main main){
        this.main = main;
        if (main.manager.isLoaded("/Pictures/Buttons/Animation/Play/sprite.atlas", TextureAtlas.class)){
            atlas = main.manager.get("/Pictures/Buttons/Animation/Play/sprite.atlas", TextureAtlas.class);
        }
        else {

        }
    }

}
