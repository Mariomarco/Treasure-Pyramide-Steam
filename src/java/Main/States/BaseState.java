package Main.States;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;

import Main.Game;

public abstract class BaseState implements GameState{

	protected Game mainGame;
	
	public BaseState(Game mainGame) {
		this.mainGame = mainGame;
	}
	
	@Override
	public void mouseClicked(int arg0, int arg1, int arg2, int arg3) {
		
	}

	@Override
	public void mouseDragged(int arg0, int arg1, int arg2, int arg3) {
		
	}

	@Override
	public void mouseMoved(int arg0, int arg1, int arg2, int arg3) {
		
	}

	@Override
	public void mousePressed(int arg0, int arg1, int arg2) {
		
	}

	@Override
	public void mouseReleased(int arg0, int arg1, int arg2) {
		
	}

	@Override
	public void mouseWheelMoved(int arg0) {
		
	}

	@Override
	public void inputEnded() {
		
	}

	@Override
	public void inputStarted() {
		
	}


	@Override
	public void setInput(Input arg0) {
		
	}

	@Override
	public void controllerButtonPressed(int arg0, int arg1) {
		
	}

	@Override
	public void controllerButtonReleased(int arg0, int arg1) {
		
	}

	@Override
	public void controllerDownPressed(int arg0) {
		
	}

	@Override
	public void controllerDownReleased(int arg0) {
		
	}

	@Override
	public void controllerLeftPressed(int arg0) {
		
	}

	@Override
	public void controllerLeftReleased(int arg0) {
		
	}

	@Override
	public void controllerRightPressed(int arg0) {
		
	}

	@Override
	public void controllerRightReleased(int arg0) {
		
	}

	@Override
	public void controllerUpPressed(int arg0) {
		
	}

	@Override
	public void controllerUpReleased(int arg0) {
		
	}

	@Override
	public void enter(GameContainer arg0, StateBasedGame arg1)
			throws SlickException {
		
	}

	@Override
	public void leave(GameContainer arg0, StateBasedGame arg1)
			throws SlickException {
		
	}
	
	public abstract boolean isAcceptingInput();
	
	public abstract int getID();

	public abstract void keyPressed(int arg0, char arg1);

	public abstract void keyReleased(int arg0, char arg1);
	
	public abstract void init(GameContainer arg0, StateBasedGame arg1) throws SlickException;
	
	public abstract void render(GameContainer arg0, StateBasedGame arg1, Graphics arg2) throws SlickException;

	public abstract void update(GameContainer arg0, StateBasedGame arg1, int arg2) throws SlickException;

	public abstract void pause();
	
	public abstract void unpause();
	
}