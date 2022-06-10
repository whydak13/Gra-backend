
package com.gra.builder.controller;

//API layer, Front end interface

import java.util.List;

import org.aspectj.weaver.patterns.ArgsAnnotationPointcut;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gra.builder.bean.SpecialRule;
import com.gra.builder.repository.SpecialRuleRepository;
import com.gra.builder.service.SpecialRuleService;

@RestController
@CrossOrigin
public class SpecialRuleController {
	

	private SpecialRuleService specialRuleService;
	
	public SpecialRuleController(SpecialRuleService specialRuleService) {
		super();
		this.specialRuleService = specialRuleService;
	}

	//GET ALL
	@GetMapping("/specialrules")
		public List <SpecialRule> getAllSpecialRules() {
		return specialRuleService.getAllSpecialRules();
		//return java.util.Arrays.asList(new SpecialRule( "Miecz", "Opis"));
	}
	
	//GET BY ID
	@GetMapping("/specialrules/{id}")
	public ResponseEntity<SpecialRule> getSpecialRuleById(@PathVariable("id") long  id){
		return new ResponseEntity<SpecialRule>(specialRuleService.getSpecialRuleByID(id), HttpStatus.OK);
	}
	
	
	
	//save
	@CrossOrigin 
	@PostMapping("/specialrules")
	public ResponseEntity<SpecialRule> saveSpecialRule(@RequestBody SpecialRule specialRule)
	{
		return new ResponseEntity<SpecialRule>(specialRuleService.saveSpecialRule(specialRule), HttpStatus.CREATED);

	}

	
	//UPDATE
	@PutMapping("/specialrules/{id}")
	public ResponseEntity<SpecialRule> updateSpecialRule(@PathVariable("id") long id, @RequestBody SpecialRule specialRule){
		
		return new ResponseEntity<SpecialRule>(specialRuleService.uptadSpecialRule(specialRule, id), HttpStatus.OK);
	}
	
	//Delete
	@DeleteMapping("/specialrules/{id}")
	public ResponseEntity<String> deleteSpecialRule(@PathVariable("id") long id)
	{
		specialRuleService.deleteSpecialRule(id);
		return new ResponseEntity<String>("SpecialRule deleted", HttpStatus.OK);
		
	}
	
	
	
	
	@GetMapping("/hello2")
	public String sayHi2() {
	return "Hello world!!22";
	}
	
	
	
}
