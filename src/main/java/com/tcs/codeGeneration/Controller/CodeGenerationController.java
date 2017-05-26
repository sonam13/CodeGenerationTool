package com.tcs.codeGeneration.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.tcs.codeGeneration.Request.Request;
import com.tcs.codeGeneration.Service.CodeGenerationService;

@Controller
public class CodeGenerationController {
	@Autowired CodeGenerationService service;
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public @ResponseBody Object getClientes(@RequestBody Request request) {
		//hii
		return service.message(request);
	}
}
