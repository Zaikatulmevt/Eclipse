package Concretes;

import Abstracts.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " ba�ar�l� bir �ekilde eklendi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " ba�ar�l� bir �ekilde g�ncellendi");
		
	}

	@Override
	public void remove(Game game) {
		System.out.println(game.getGameName() + " ba�ar�l� bir �ekilde kald�r�ld�");
		
	}

}
