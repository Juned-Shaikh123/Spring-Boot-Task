package com.js1.Student.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name = "tbl_Student")
public class Student {
	
	@Id
	private int r_no;

	@Column(name = "s_name")
	String s_name;

	@Column(name = "b_date")
	String b_date;
	
	@Column(name = "s_cont")
	String s_cont;

	public int getR_no() {
		return r_no;
	}

	public void setR_no(int r_no) {
		this.r_no = r_no;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getB_date() {
		return b_date;
	}

	public void setB_date(String b_date) {
		this.b_date = b_date;
	}

	public String getS_cont() {
		return s_cont;
	}

	public void setS_cont(String s_cont) {
		this.s_cont = s_cont;
	}
	
	
	
	
	
	
	
	

	
}
