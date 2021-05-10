package Concretes;

import Abstracts.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " baþarýlý bir þekilde eklendi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " baþarýlý bir þekilde güncellendi");
		
	}

	@Override
	public void remove(Game game) {
		System.out.println(game.getGameName() + " baþarýlý bir þekilde kaldýrýldý");
		
	}

}
