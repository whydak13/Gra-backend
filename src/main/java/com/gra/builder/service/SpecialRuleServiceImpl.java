package com.gra.builder.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gra.builder.bean.SpecialRule;
import com.gra.builder.bean.Weapon;
import com.gra.builder.exceptions.ResourceNotFoundException;
import com.gra.builder.repository.SpecialRuleRepository;
import com.gra.builder.repository.WeaponRepository;
import com.gra.builder.service.SpecialRuleService;
import com.gra.builder.service.WeaponService;
@Service
public class SpecialRuleServiceImpl implements SpecialRuleService{

	private SpecialRuleRepository specialRuleRepository;


	public SpecialRuleServiceImpl(SpecialRuleRepository specialRuleRepository) {
		super();
		this.specialRuleRepository = specialRuleRepository;
	}



	@Override
	public SpecialRule saveSpecialRule(SpecialRule SpecialRule) {

		return specialRuleRepository.save(SpecialRule);
	}



	@Override
	public List<SpecialRule> getAllSpecialRules() {
		
		return specialRuleRepository.findAll();
	}



	@Override
	public SpecialRule getSpecialRuleByID(long id) {
		Optional<SpecialRule> SpecialRule =specialRuleRepository.findById(id);
		if (SpecialRule.isPresent()) {
			return SpecialRule.get();
		}else {
			throw new ResourceNotFoundException("SpecialRule", "Id", id);
		}
	}



	@Override
	public SpecialRule uptadSpecialRule(SpecialRule SpecialRule, long id) {
		
		// check if exists
		SpecialRule SpecialRule2 = specialRuleRepository.findById(id).orElseThrow(
		()-> new ResourceNotFoundException("SpecialRule", "Id", id));
		
		
		SpecialRule2.setName(SpecialRule.getName());
		SpecialRule2.setDescription(SpecialRule.getDescription());
		SpecialRule2.setCamp_only(SpecialRule.getCamp_only());
		SpecialRule2.setCost_add(SpecialRule.getCost_add());
		SpecialRule2.setCost_multiply(SpecialRule.getCost_multiply());
		
		//save to DB
		specialRuleRepository.save(SpecialRule2);
		return SpecialRule2;
	}



	@Override
	public void deleteSpecialRule(long id) {
		
		
		specialRuleRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("SpecialRule", "Id", id));
		
		specialRuleRepository.deleteById(id);
		
	}



	@Override
	@Transactional 
	public void assignRuleToWeapon(long r_id, long w_id) {
		
		SpecialRule SpecialRule = specialRuleRepository.findById(r_id).orElseThrow(()-> new ResourceNotFoundException("SpecialRule", "Id", r_id));	
		
		Weapon weapon = new Weapon(); 
		weapon.setId(w_id);
		//SpecialRule.assignWeapon(weapon);
	}

	
}