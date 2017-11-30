package com.zaid.flappybird;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.zaid.flappybird.States.GameStateManager;
import com.zaid.flappybird.States.MenuState;

public class FlappyBird extends ApplicationAdapter {
	public static final int WIDTH  = 400; //sets width of the screen
	public static final int HEIGHT = 800; //sets the height of the screen

	public static final String TITLE = "Flappy Bird";
	private GameStateManager gsm;
	private SpriteBatch batch;

	@Override
	public void create () {
		batch = new SpriteBatch();
		gsm = new GameStateManager();
		Gdx.gl.glClearColor(1, 0, 0, 1); //wipes the screen
		gsm.push(new MenuState(gsm)); //calls the menu state
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.render(batch);
	}
}
