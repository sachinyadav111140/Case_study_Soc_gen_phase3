package com.springcore.new_project_1;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;



@Entity
public class StockExchangeEntity 
{
	@Id
	private int id;
	private String stockExchange;
	@ManyToMany(mappedBy="stockExchanges")
	private List<CompanyEntity> companies=new ArrayList<CompanyEntity>();
	@ManyToMany
	private List<IPODetailEntity> ipos= new ArrayList<IPODetailEntity>();
	@OneToMany
	private List<StockPriceEntity> stockPrices=new ArrayList<StockPriceEntity>();
	private String brief;
	private String contactAddress;
	private String remarks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public List<CompanyEntity> getCompanies() {
		return companies;
	}
	public void setCompanies(List<CompanyEntity> companies) {
		this.companies = companies;
	}
	public List<IPODetailEntity> getIpos() {
		return ipos;
	}
	public void setIpos(List<IPODetailEntity> ipos) {
		this.ipos = ipos;
	}
	public List<StockPriceEntity> getStockPrices() {
		return stockPrices;
	}
	public void setStockPrices(List<StockPriceEntity> stockPrices) {
		this.stockPrices = stockPrices;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getContactAddress() {
		return contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "StockExchangeEntity [id=" + id + ", stockExchange=" + stockExchange + ", companies=" + companies
				+ ", ipos=" + ipos + ", stockPrices=" + stockPrices + ", brief=" + brief + ", contactAddress="
				+ contactAddress + ", remarks=" + remarks + "]";
	}
	public StockExchangeEntity(int id, String stockExchange, List<CompanyEntity> companies, List<IPODetailEntity> ipos,
			List<StockPriceEntity> stockPrices, String brief, String contactAddress, String remarks) {
		super();
		this.id = id;
		this.stockExchange = stockExchange;
		this.companies = companies;
		this.ipos = ipos;
		this.stockPrices = stockPrices;
		this.brief = brief;
		this.contactAddress = contactAddress;
		this.remarks = remarks;
	}
	StockExchangeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
