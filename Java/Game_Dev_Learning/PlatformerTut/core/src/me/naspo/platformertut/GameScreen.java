package me.naspo.platformertut;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.Contact;
import com.badlogic.gdx.physics.box2d.World;
import me.naspo.platformertut.helper.Constants;

public class GameScreen extends ScreenAdapter {

    private OrthographicCamera cam;
    private SpriteBatch batch;
    private World world;
    private Box2DDebugRenderer box2DDebugRenderer;

    GameScreen(OrthographicCamera cam) {
        this.cam = cam;
        this.batch = new SpriteBatch();
        this.world = new World(new Vector2(0, 0), false);
        this.box2DDebugRenderer = new Box2DDebugRenderer();
    }

    public void update() {
        world.step(1 / 60f, 6, 2);
    }

    @Override
    public void render(float dt) {
        update();

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();

        batch.end();
        box2DDebugRenderer.render(world, cam.combined.scl(Constants.PPM));
    }

}
