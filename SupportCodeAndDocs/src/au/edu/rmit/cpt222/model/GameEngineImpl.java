package au.edu.rmit.cpt222.model;

import java.util.Collection;

import au.edu.rmit.cpt222.model.exceptions.InsufficientFundsException;
import au.edu.rmit.cpt222.model.interfaces.GameEngine;
import au.edu.rmit.cpt222.model.interfaces.GameEngineCallback;
import au.edu.rmit.cpt222.model.interfaces.Player;

public class GameEngineImpl implements GameEngine {

	public GameEngineImpl() {
		
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addGameEngineCallback(GameEngineCallback gameEngineCallback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String addPlayer(Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void calculateResult() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<Player> getAllPlayers() {
		Arraylist Allplayers = new Arraylist
				
		return All;
	}

	@Override
	public Player getPlayer(String playerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void placeBet(Player player, int betPoints) throws InsufficientFundsException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeGameEngineCallback(GameEngineCallback gameEngineCallback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean removePlayer(String playerId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void rollHouse(int initialDelay, int finalDelay, int delayIncrement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rollPlayer(Player player, int initialDelay, int finalDelay, int delayIncrement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPlayerPoints(String playerId, int totalPoints) {
		// TODO Auto-generated method stub
		
	}

}
