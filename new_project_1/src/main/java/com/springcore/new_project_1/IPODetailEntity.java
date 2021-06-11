package com.springcore.new_project_1;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class IPODetailEntity 
{
@Id
private int id;
@OneToOne(mappedBy="ipo")
private CompanyEntity company;
@ManyToMany
private List<StockExchangeEntity> stockExchanges=new ArrayList<StockExchangeEntity>();
private float pricePerShare;
private Long totalShares;
private String openDateTime;
private String remarks;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public CompanyEntity getCompany() {
	return company;
}
public void setCompany(CompanyEntity company) {
	this.company = company;
}
public List<StockExchangeEntity> getStockExchanges() {
	return stockExchanges;
}
public void setStockExchanges(List<StockExchangeEntity> stockExchanges) {
	this.stockExchanges = stockExchanges;
}
public float getPricePerShare() {
	return pricePerShare;
}
public void setPricePerShare(float pricePerShare) {
	this.pricePerShare = pricePerShare;
}
public Long getTotalShares() {
	return totalShares;
}
public void setTotalShares(Long totalShares) {
	this.totalShares = totalShares;
}
public String getOpenDateTime() {
	return openDateTime;
}
public void setOpenDateTime(String openDateTime) {
	this.openDateTime = openDateTime;
}
public String getRemarks() {
	return remarks;
}
public void setRemarks(String remarks) {
	this.remarks = remarks;
}
@Override
public String toString() {
	return "IPODetailEntity [id=" + id + ", company=" + company + ", stockExchanges=" + stockExchanges
			+ ", pricePerShare=" + pricePerShare + ", totalShares=" + totalShares + ", openDateTime=" + openDateTime
			+ ", remarks=" + remarks + "]";
}
IPODetailEntity(int id, CompanyEntity company, List<StockExchangeEntity> stockExchanges, float pricePerShare,
		Long totalShares, String openDateTime, String remarks) {
	super();
	this.id = id;
	this.company = company;
	this.stockExchanges = stockExchanges;
	this.pricePerShare = pricePerShare;
	this.totalShares = totalShares;
	this.openDateTime = openDateTime;
	this.remarks = remarks;
}
IPODetailEntity() {
	super();
	// TODO Auto-generated constructor stub
}


}
