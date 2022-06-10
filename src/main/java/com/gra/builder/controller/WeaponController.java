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

import com.gra.builder.bean.Weapon;
import com.gra.builder.repository.WeaponRepository;
import com.gra.builder.service.WeaponService;

@RestController
@CrossOrigin
public class WeaponController {
	

	private WeaponService weaponService;
	
	public WeaponController(WeaponService weaponService) {
		super();
		this.weaponService = weaponService;
	}

	//GET ALL
	@GetMapping("/weapons")
		public List <Weapon> getAllWeapons() {
		return weaponService.getAllWeapons();
		//return java.util.Arrays.asList(new Weapon( "Miecz", "Opis"));
	}
	
	//GET BY ID
	@GetMapping("/weapons/{id}")
	public ResponseEntity<Weapon> getWeaponById(@PathVariable("id") long  id){
		return new ResponseEntity<Weapon>(weaponService.getWeaponByID(id), HttpStatus.OK);
	}
	
	
	
	//save
	@CrossOrigin 
	@PostMapping("/weapons")
	public ResponseEntity<Weapon> saveWeapon(@RequestBody Weapon weapon)
	{
		return new ResponseEntity<Weapon>(weaponService.saveWeapon(weapon), HttpStatus.CREATED);

	}

	
	//UPDATE
	@PutMapping("/weapons/{id}")
	public ResponseEntity<Weapon> updateWeapon(@PathVariable("id") long id, @RequestBody Weapon weapon){
		
		return new ResponseEntity<Weapon>(weaponService.uptadWeapon(weapon, id), HttpStatus.OK);
	}
	
	//Delete
	@DeleteMapping("/weapons/{id}")
	public ResponseEntity<String> deleteWeapon(@PathVariable("id") long id)
	{
		weaponService.deleteWeapon(id);
		return new ResponseEntity<String>("Weapon deleted", HttpStatus.OK);
		
	}
	
	
	
	
	@GetMapping("/hello")
	public String sayHi() {
	return "Hello world!!";
	}
	
	
	
}
