package com.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TempController {

	@RequestMapping(value="main")
	public String test() {
		return "main/main";
	}
}
