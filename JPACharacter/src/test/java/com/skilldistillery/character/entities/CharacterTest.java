package com.skilldistillery.character.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CharacterTest {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private GameCharacter character;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("Character");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		character = em.find(GameCharacter.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		character = null;
	}

	@Test
	void test_character_mapping() {
		assertNotNull(character);
		assertEquals("Thorin Oakenshield", character.getName());
	}

}
