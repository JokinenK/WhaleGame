package com.whale.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by Kalle on 4.12.2015.
 */
public class BaseLevel implements Screen {
    private Sprite m_object[];
    private Sprite m_player = null;
    private WhaleGame m_game;
    private boolean m_paused;


    public BaseLevel(WhaleGame game) {
        m_game = game;
        m_player = new Sprite();
    }

    @Override
    public void show() {

    }

    private void update(float delta) {
        if (m_paused) {
            return;
        }
    }

    @Override
    public void render(float delta) {
        // Call update
        update(delta);

        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        m_game.batch.begin();
        //m_game.batch.draw(img,0,0);
        m_game.batch.end();

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
