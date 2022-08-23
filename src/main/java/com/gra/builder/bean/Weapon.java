package com.gra.builder.bean;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data 
@Entity
@Table(name="weapons")
public class Weapon {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="reach", nullable=false)
	private float reach=1;

	@Column(name="agility", nullable=false)
	private float agility=0;
	
	@Column(name="impact", nullable=false)
	private float impact=0;
	
	@Column(name="cost", nullable=false)
	private float cost=0;


	@Column(name="description" )
	private String description;
	
	@ManyToMany(mappedBy = "assignedWeapons")
	//private Set<SpecialRule> specialRules = new HashSet<>();
	private List<SpecialRule> specialRules = new ArrayList<>(); 
	
	public void addSpecialRule(SpecialRule specialRule)
	
	{
		specialRules.add(specialRule);
	}
	
	
	

	public float getCost() {
		return cost;
	}



	public void setCost(float cost) {
		this.cost = cost;
	}






	
//	public Weapon(String name, String description) {
//		super();
//		this.name = name;
//		this.description = description;
//	}
//	
	
	
	public float getReach() {
		return reach;
	}



	public void setReach(float reach) {
		this.reach = reach;
	}



	public float getAgility() {
		return agility;
	}



	public void setAgility(float agility) {
		this.agility = agility;
	}



	public float getImpact() {
		return impact;
	}



	public void setImpact(float impact) {
		this.impact = impact;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	@Override
	public String toString() {
		return "Weapon [id=" + id + ", name=" + name + ", reach=" + reach + ", agility=" + agility + ", impact="
				+ impact + ", cost=" + cost + ", description=" + description + "]";
	}



//	@Override
//	public String toString() {
//		return "Weapon [id=" + id + ", name=" + name + ", description=" + description + "]";
//	}	
//	
}
