package com.gra.builder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gra.builder.bean.SpecialRule;
import com.gra.builder.bean.Weapon;

@Repository
public interface SpecialRuleRepository extends JpaRepository<SpecialRule, Long>{

	//Weapon saveWeapon(Weapon weapon);

//	Weapon saveWeapon(Weapon weapon);
	
}
