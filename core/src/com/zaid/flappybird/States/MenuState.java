package com.zaid.flappybird.States;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.zaid.flappybird.FlappyBird;

/**
 * Created by Zaid on 11/30/2017.
 */

public class MenuState extends State {
    private Texture background;
    private Texture playButton;
    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        playButton = new Texture("playBtn.png");
    }

    @Override
    public void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0,0, FlappyBird.WIDTH, FlappyBird.HEIGHT);
        sb.draw(playButton, (FlappyBird.WIDTH / 2) - (playButton.getWidth() / 2), FlappyBird.HEIGHT / 2);
        sb.end();
    }
}
