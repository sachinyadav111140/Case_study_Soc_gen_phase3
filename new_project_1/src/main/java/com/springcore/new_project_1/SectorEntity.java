package com.springcore.new_project_1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class SectorEntity 
{

@Id
private int id;
private String sector;
private String brief;
@OneToOne(mappedBy="sector")
private CompanyEntity company;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSector() {
	return sector;
}
public void setSector(String sector) {
	this.sector = sector;
}
public String getBrief() {
	return brief;
}
public void setBrief(String brief) {
	this.brief = brief;
}
public CompanyEntity getCompany() {
	return company;
}
public void setCompany(CompanyEntity company) {
	this.company = company;
}
public SectorEntity(int id, String sector, String brief, CompanyEntity company) {
	super();
	this.id = id;
	this.sector = sector;
	this.brief = brief;
	this.company = company;
}
public SectorEntity() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "SectorEntity [id=" + id + ", sector=" + sector + ", brief=" + brief + ", company=" + company + "]";
}



}
