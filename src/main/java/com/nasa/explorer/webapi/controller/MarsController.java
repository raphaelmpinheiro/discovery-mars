package com.nasa.explorer.webapi.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.nasa.explorer.domain.Mars;
import com.nasa.explorer.domain.Robot;
import com.nasa.explorer.domain.Terrain;
import com.nasa.explorer.domain.command.Compiler;
import com.nasa.explorer.webapi.model.MarsRequestModel;
import com.nasa.explorer.webapi.model.MarsResponseModel;

@SpringBootApplication
@RestController
@RequestMapping("/rest/mars")
public class MarsController {

	@RequestMapping(method = RequestMethod.POST, value = "/{commands}")
	public ResponseEntity<MarsResponseModel> execute(@ModelAttribute("commands") MarsRequestModel model) {

		Mars mars = new Mars();
		Terrain terrain = mars.getTerrain();
		Robot c3po = new Robot(terrain);

		Compiler compilator = new Compiler(model.getCommand());
		compilator.executeCommands(c3po);

		MarsResponseModel response = new MarsResponseModel();
		response.setResult(c3po.getPosition().toString());

		return new ResponseEntity<MarsResponseModel>(response, HttpStatus.OK);
	}

	@ExceptionHandler
	void handleIllegalArgumentException(IllegalArgumentException e, HttpServletResponse response) throws IOException {
		response.sendError(HttpStatus.BAD_REQUEST.value(), e.getMessage());
	}

}
