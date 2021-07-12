package com.skilldistillery.character.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "game_character")
public class GameCharacter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String race;
	@Column(name = "char_class")
	private String charClass;
	private String faction;

	public GameCharacter() {
	}

	public GameCharacter(String name, String race, String charClass, String faction) {
		name = this.name;
		race = this.race;
		charClass = this.charClass;
		faction = this.faction;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getCharClass() {
		return charClass;
	}

	public void setCharClass(String charClass) {
		this.charClass = charClass;
	}

	public String getFaction() {
		return faction;
	}

	public void setFaction(String faction) {
		this.faction = faction;
	}

	@Override
	public String toString() {
		return "Character ID: " + id + ", Name: " + name + ", Race: " + race + ", Class: " +
	charClass + ", Faction: " + faction;
	}

}
