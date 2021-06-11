package com.springcore.new_project_1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class StockPriceEntity 
{
@Id
private int id;
@ManyToOne
private CompanyEntity company;
@ManyToOne
private StockExchangeEntity stockExchange;
private float stockPrice;
private String date;
private String time;
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
public StockExchangeEntity getStockExchange() {
	return stockExchange;
}
public void setStockExchange(StockExchangeEntity stockExchange) {
	this.stockExchange = stockExchange;
}
public float getStockPrice() {
	return stockPrice;
}
public void setStockPrice(float stockPrice) {
	this.stockPrice = stockPrice;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
@Override
public String toString() {
	return "StockPriceEntity [id=" + id + ", company=" + company + ", stockExchange=" + stockExchange + ", stockPrice="
			+ stockPrice + ", date=" + date + ", time=" + time + "]";
}
StockPriceEntity(int id, CompanyEntity company, StockExchangeEntity stockExchange, float stockPrice, String date,
		String time) {
	super();
	this.id = id;
	this.company = company;
	this.stockExchange = stockExchange;
	this.stockPrice = stockPrice;
	this.date = date;
	this.time = time;
}
StockPriceEntity() {
	super();
	// TODO Auto-generated constructor stub
}


}
