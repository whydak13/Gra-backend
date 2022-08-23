package com.gra.builder.service;

import org.springframework.stereotype.Service;


import com.gra.builder.bean.SpecialRule;


import java.util.List;

@Service
public interface SpecialRuleService {
	
	
	SpecialRule saveSpecialRule(SpecialRule specialRule);
	//List<Weapon> getAllWeapons();
	
	List<SpecialRule> getAllSpecialRules();
	SpecialRule getSpecialRuleByID(long id);
	SpecialRule uptadSpecialRule(SpecialRule specialRule, long id);
	void deleteSpecialRule(long id);
	void assignRuleToWeapon(long r_id, long w_id);
}

