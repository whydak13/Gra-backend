package com.gra.builder.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.gra.builder.bean.Weapon;
import com.gra.builder.exceptions.ResourceNotFoundException;
import com.gra.builder.repository.WeaponRepository;
import com.gra.builder.service.WeaponService;
@Service
public class WeaponServiceImpl implements WeaponService{

	private WeaponRepository weaponRepository;

	public WeaponServiceImpl(WeaponRepository weaponRepository) {
		super();
		this.weaponRepository = weaponRepository;
	}



	@Override
	public Weapon saveWeapon(Weapon weapon) {

		return weaponRepository.save(weapon);
	}



	@Override
	public List<Weapon> getAllWeapons() {
		
		return weaponRepository.findAll();
	}



	@Override
	public Weapon getWeaponByID(long id) {
		Optional<Weapon> weapon =weaponRepository.findById(id);
		if (weapon.isPresent()) {
			return weapon.get();
		}else {
			throw new ResourceNotFoundException("Weapon", "Id", id);
		}
	}



	@Override
	public Weapon uptadWeapon(Weapon weapon, long id) {
		
		// check if exists
		Weapon weapon2 = weaponRepository.findById(id).orElseThrow(
		()-> new ResourceNotFoundException("Weapon", "Id", id));
		
		
		weapon2.setName(weapon.getName());
		weapon2.setDescription(weapon.getDescription());
		weapon2.setAgility(weapon.getAgility());
		weapon2.setImpact(weapon.getImpact());
		weapon2.setReach(weapon.getReach());
		weapon2.setCost(weapon.getCost());//weapon.getReach()*4+weapon.getAgility()*2+weapon.getImpact()*2+5);
		
		//save to DB
		weaponRepository.save(weapon2);
		return weapon2;
	}



	@Override
	public void deleteWeapon(long id) {
		
		
		weaponRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Weapon", "Id", id));
		
		weaponRepository.deleteById(id);
		
	}

	
}