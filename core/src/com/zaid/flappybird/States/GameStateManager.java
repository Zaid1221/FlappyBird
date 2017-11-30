package com.zaid.flappybird.States;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

/**
 * Created by Zaid on 11/30/2017.
 */

public class GameStateManager {
    private Stack<State> states;

    public GameStateManager() {
        states = new Stack<State>();
    }

    public void push(State state){
        states.push(state);
    }

    public void pop(){
        states.pop();
    }

    public void set (State state){
        states.pop();
        states.push(state);
    }

    //update the state
    public void update(float dt){
        states.peek().update(dt);
    }

    //draws the spirtes to the state
    public void render(SpriteBatch sb){
        states.peek().render(sb);
    }
}
