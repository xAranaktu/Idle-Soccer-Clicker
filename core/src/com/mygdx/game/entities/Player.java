package com.mygdx.game.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Player extends Image{
	private final static int WIDTH = 77;
	private final static int HEIGHT = 152;

	private final static int ButtonPosX = 200;
	private final static int ButtonPosY = 300;

	public Player() {
		super(new Texture("Ball.png"));


		this.setOrigin(WIDTH / 2, HEIGHT / 2);
		this.setSize(WIDTH, HEIGHT);

		// starting position
		this.setPosition(ButtonPosX, ButtonPosY);
	}

}