package me.naspo.platformertut;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class Main extends Game {
	public static Game INSTANCE;
	private int widthScreen, heightScreen;
	private OrthographicCamera cam;

	public Main() {
		INSTANCE = this;
	}

	
	@Override
	public void create () {
		widthScreen = Gdx.graphics.getWidth();
		heightScreen = Gdx.graphics.getHeight();
		cam = new OrthographicCamera();
		cam.setToOrtho(false, widthScreen, heightScreen);
		setScreen(new GameScreen(cam));
	}

	@Override
	public void render () {

	}
	
	@Override
	public void dispose () {

	}
}
