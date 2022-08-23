package com.gra.builder.bean;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data 
@Entity
@Table(name="specialRules")
public class SpecialRule {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="cost_multiply", nullable=false)
	private float cost_multiply=1;
	
	@Column(name="cost_add", nullable=false)
	private float cost_add=0;
	
	@Column(name="camp_only", nullable=false)
	private Boolean camp_only=false;

	@Column(name="description", length = 1000 )
	private String description;
	
	  @ManyToMany(
		        cascade = {CascadeType.MERGE, CascadeType.PERSIST}
		    )
	    @JoinTable(
	            name = "weapons_specialrules",
	            joinColumns = @JoinColumn(name = "specialrule_id"),
	            inverseJoinColumns = @JoinColumn(name = "weapon_id")
	    )
	  private Set<Weapon> assignedWeapons = new HashSet<>();
	  /*
	private List<Weapon> assignedWeapons = new ArrayList<>();
	  
	  public void assignWeapon(Weapon weapon) {
		  assignedWeapons.add(weapon);
	  }*/
	  
	  
	
	@Override
	public String toString() {
		return "SpecialRule [id=" + id + ", name=" + name + ", cost_multiply=" + cost_multiply + ", cost_add="
				+ cost_add + ", camp_only=" + camp_only + ", description=" + description + "]";
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

	public float getCost_multiply() {
		return cost_multiply;
	}

	public void setCost_multiply(float cost_multiply) {
		this.cost_multiply = cost_multiply;
	}

	public float getCost_add() {
		return cost_add;
	}

	public void setCost_add(float cost_add) {
		this.cost_add = cost_add;
	}

	public Boolean getCamp_only() {
		return camp_only;
	}

	public void setCamp_only(Boolean camp_only) {
		this.camp_only = camp_only;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	


	
	
}
