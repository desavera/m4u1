package com.macro.pictasty.service.users;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang.StringUtils;

public class User implements Serializable {

	private final static long serialVersionUID = 1L;

	//
	// Data members
	//
	private Integer id;
	private Integer name;

	//
	// Accessors/Mutators
	//
	public Integer getId() {
		return id;
	}

	public void setId(Integer res_id) {
		this.id = res_id;
	}
	

	public Integer getOwner() {
		return name;
	}

	public void setOwner(Integer owner) {
		this.name = owner;
	}

	
	//
	// Methods
	//	
	public String toString() {
		
		StringBuffer str = new StringBuffer();
		str.append("Id : " + id + '\n');
		str.append("Name : " + name + '\n');
		
		return str.toString();
	}


}
