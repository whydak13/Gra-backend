package com.gra.builder.service;

import org.springframework.stereotype.Service;


import com.gra.builder.bean.Weapon;


import java.util.List;

@Service
public interface WeaponService {
	
	
	Weapon saveWeapon(Weapon weapon);
	//List<Weapon> getAllWeapons();
	
	List<Weapon> getAllWeapons();
	Weapon getWeaponByID(long id);
	Weapon uptadWeapon(Weapon weapon, long id);
	void deleteWeapon(long id);
}

