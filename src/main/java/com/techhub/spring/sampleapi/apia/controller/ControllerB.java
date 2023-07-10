package com.techhub.spring.sampleapi.apia.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techhub.spring.sampleapi.dto.SampleDTO;

/**
 * The TestController
 * 
 * @author ramniwash
 */
@RestController
@RequestMapping(value = "/api-a/")
public class ControllerB {


	/**
	 * The SAVE method demo
	 * 
	 * @return
	 */
	@PostMapping(value = "/save")
	private ResponseEntity<SampleDTO> postMethod(@RequestBody SampleDTO sampleDTO) {
		return ResponseEntity.ok(sampleDTO);
	}
	
}
