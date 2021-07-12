package com.skilldistillery.character.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.character.data.GameCharacterDAO;
import com.skilldistillery.character.entities.GameCharacter;

@Controller
public class GameCharacterController {

	@Autowired
	private GameCharacterDAO dao;

	@RequestMapping(path = { "/", "home.do" })
	public String index(Model model) {
		model.addAttribute("GameCharacter", dao.findById(1)); // Debug purposes
		return "index";
	}
	@RequestMapping(path="create")
	public String createForm() {
		return "create";
	}
	@RequestMapping(path="create.do", method = RequestMethod.POST)
	public String createChar(GameCharacter gc, Model model) {
		model.addAttribute("GameCharacter", dao.create(gc));
		return "success";
	}
	@RequestMapping(path="delete.do", method = RequestMethod.GET)
	public String deleteChar(int id) {
		if(dao.remove(id)) {
			return "delete";
		}
		return "failed";
	}
	@RequestMapping(path="update.do")
	public String updateChar(Integer id, String name, String race, String charClass, String faction) {
		GameCharacter gc = new GameCharacter();
		gc.setName(name);
		gc.setRace(race);
		gc.setCharClass(charClass);
		gc.setFaction(faction);
		System.out.println(dao.update(id, gc));
		return "updatesuccess";
	}
	@RequestMapping(path="updateChar.do")
	public String updateCharForm(Integer id, Model model) {
		GameCharacter gc = dao.findById(id);
		model.addAttribute("GameCharacter", gc);
		return "update";
	}
//	@RequestMapping(path="list.do")
//	public ModelAndView showAll() {
//		ModelAndView mv = new ModelAndView();
//		List<GameCharacter> lgc = dao.showAll();
//		if(lgc == null) {
//			mv.setViewName("failed");
//		} else {
//			mv.addObject("GameCharacters", lgc);
//			mv.setViewName("list");
//		}
//		return mv;
//	}
}
