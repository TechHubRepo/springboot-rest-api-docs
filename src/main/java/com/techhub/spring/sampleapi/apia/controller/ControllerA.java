package com.techhub.spring.sampleapi.apia.controller;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techhub.spring.sampleapi.dto.SampleDTO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * The TestController
 * 
 * @author ramniwash
 */
@RestController
@RequestMapping(value = "/api-a/")
@Tag( name = "Controller A",description = "The Sample API Controller A")
public class ControllerA {

	/**
	 * The GET method demo
	 * 
	 * @return
	 */
	@GetMapping(value = "/get")
	private ResponseEntity<SampleDTO> getMethod() {
		SampleDTO sampleDTO = new SampleDTO();
		sampleDTO.setName("Ram Niwash");
		sampleDTO.setEmail("ram@abc.com");
		sampleDTO.setMobileNumber(9876543210l);
		sampleDTO.setDob(new Date());
		sampleDTO.setActive(true);
		return ResponseEntity.ok(sampleDTO);
	}

	/**
	 * The POST method demo
	 * 
	 * @return
	 */
	@Operation(summary = "Post the SampleDTO")
	@Parameters(@Parameter(name = "sampleDTO",description = "A SampleDTO for request payload data",required = true))
	@PostMapping(value = "/post")
	private ResponseEntity<SampleDTO> postMethod(@RequestBody SampleDTO sampleDTO) {
		return ResponseEntity.ok(sampleDTO);
	}

	/**
	 * The PUT method demo
	 * 
	 * @return
	 */
	@PutMapping(value = "/put")
	private ResponseEntity<SampleDTO> putMethod(@RequestBody SampleDTO sampleDTO) {
		return ResponseEntity.ok(sampleDTO);
	}

	/**
	 * The DELETE method demo
	 * 
	 * @return
	 */
	@DeleteMapping(value = "/delete")
	private ResponseEntity<SampleDTO> deleteMethod() {
		SampleDTO sampleDTO = new SampleDTO();
		sampleDTO.setName("Ram Niwash");
		sampleDTO.setEmail("ram@abc.com");
		sampleDTO.setMobileNumber(9876543210l);
		sampleDTO.setDob(new Date());
		sampleDTO.setActive(true);
		return ResponseEntity.ok(sampleDTO);
	}
}
