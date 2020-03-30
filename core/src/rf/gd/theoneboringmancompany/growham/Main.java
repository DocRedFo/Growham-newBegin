package rf.gd.theoneboringmancompany.growham;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

import rf.gd.theoneboringmancompany.growham.screens.LogoScreen;

public class Main extends Game {
	public SpriteBatch batch;
	public BitmapFont fontOrdinary;
	public BitmapFont fontWarning;
	public OrthographicCamera camera;
	public ExtendViewport viewport;
	public Stage stage;

	public final float CAMERA_HEIGHT = 810;
	public final float CAMERA_WIDTH = 1440;

	@Override
	public void create() {
		batch = new SpriteBatch();

		fontOrdinary = new BitmapFont(Gdx.files.internal("BitmapFonts/OrdinaryText/ordinarytext.fnt"));
		fontWarning = new BitmapFont(Gdx.files.internal("BitmapFonts/WarningText/warningtext.fnt"));

		camera = new OrthographicCamera(CAMERA_WIDTH, CAMERA_HEIGHT);
		camera.position.set(CAMERA_WIDTH/2, CAMERA_HEIGHT/2, 0);
		viewport = new ExtendViewport(CAMERA_WIDTH, CAMERA_HEIGHT, camera);

		stage = new Stage(viewport);

		this.setScreen(new LogoScreen(this));

	}

	@Override
	public void dispose() {
		super.dispose();
		batch.dispose();
		fontOrdinary.dispose();
		fontWarning.dispose();
		stage.dispose();
	}
}
