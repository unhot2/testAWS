package com.yg.aws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.yg.aws.repository.MainRepository;

@Controller
public class MainController {

	@Autowired
	private MainRepository mainRepository;

	/* INDEX 화면 */
	@RequestMapping({"","/"})
	public String index(Model model) {
		model.addAttribute("age",mainRepository.testAWS());
		return "index";
	}
}
