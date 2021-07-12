package com.skilldistillery.character.data;

import java.util.List;

import com.skilldistillery.character.entities.GameCharacter;

public interface GameCharacterDAO {

	public GameCharacter findById(int id);
	public GameCharacter create(GameCharacter gc);
	public GameCharacter update(Integer id, GameCharacter gc);
	public boolean remove(int id);
//	public List<GameCharacter> showAll();
}
