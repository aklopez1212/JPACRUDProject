package com.skilldistillery.character.data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.character.entities.GameCharacter;

@Service
@Transactional
public class GameCharacterDAOImpl implements GameCharacterDAO {
	@PersistenceContext
	private EntityManager em;

	@Override
	public GameCharacter findById(int id) {
		return em.find(GameCharacter.class, id);
	}

	@Override
	public GameCharacter create(GameCharacter gc) {
		em.persist(gc);
		return gc;
	}

	@Override
	public GameCharacter update(Integer id, GameCharacter gc) {
		GameCharacter mc = em.find(GameCharacter.class, id);
		mc.setName(gc.getName());
		mc.setRace(gc.getRace());
		mc.setCharClass(gc.getCharClass());
		mc.setFaction(gc.getFaction());
		System.out.println(mc);
		return mc;
	}

	@Override
	public boolean remove(int id) {
		boolean charCheck = false;
		GameCharacter gc = em.find(GameCharacter.class, id);
		if (gc != null) {
			em.remove(gc);
			return true;
			
		}
		return charCheck;
	}

//	@Override
//	public List<GameCharacter> showAll() {
//		List<GameCharacter> lgc = new ArrayList<>();
//		GameCharacter gc = new GameCharacter();
//		do {
//			int count = 1;
//		    gc = findById(count);
//			lgc.add(gc);
//			count++;
//			
//		}while(gc.getName() != null);
//		return lgc;
//	}

}
