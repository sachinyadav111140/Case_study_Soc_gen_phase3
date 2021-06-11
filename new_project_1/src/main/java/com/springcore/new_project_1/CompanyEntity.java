package com.springcore.new_project_1;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class CompanyEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;
	private float turnover;
	private String CEO;
	private String board_of_directors;
	@OneToOne
	private SectorEntity sector;
	@ManyToMany
	private List<StockExchangeEntity> stockExchanges=new ArrayList<StockExchangeEntity>();
	@OneToMany(mappedBy="company")
	private List<StockPriceEntity> stockprices=new ArrayList<StockPriceEntity>();
	private String brief_writeup;
	@OneToOne
	private IPODetailEntity ipo;
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
	public float getTurnover() {
		return turnover;
	}
	public void setTurnover(float turnover) {
		this.turnover = turnover;
	}
	public String getCEO() {
		return CEO;
	}
	public void setCEO(String cEO) {
		CEO = cEO;
	}
	public String getBoard_of_directors() {
		return board_of_directors;
	}
	public void setBoard_of_directors(String board_of_directors) {
		this.board_of_directors = board_of_directors;
	}
	public SectorEntity getSector() {
		return sector;
	}

	public void setSector(SectorEntity sector) {
		this.sector = sector;
	}
	public List<StockExchangeEntity> getStockExchanges() {
		return stockExchanges;
	}
	public void setStockExchanges(List<StockExchangeEntity> stockExchanges) {
		this.stockExchanges = stockExchanges;
	}
	public List<StockPriceEntity> getStockprices() {
		return stockprices;
	}
	public void setStockprices(List<StockPriceEntity> stockprices) {
		this.stockprices = stockprices;
	}
	public String getBrief_writeup() {
		return brief_writeup;
	}
	public void setBrief_writeup(String brief_writeup) {
		this.brief_writeup = brief_writeup;
	}
	public IPODetailEntity getIpo() {
		return ipo;
	}
	public void setIpo(IPODetailEntity ipo) {
		this.ipo = ipo;
	}
	@Override
	public String toString() {
		return "CompanyEntity [id=" + id + ", name=" + name + ", turnover=" + turnover + ", CEO=" + CEO
				+ ", board_of_directors=" + board_of_directors + ", sector=" + sector + ", stockExchanges="
				+ stockExchanges + ", stockprices=" + stockprices + ", brief_writeup=" + brief_writeup + ", ipo=" + ipo
				+ "]";
	}
	CompanyEntity(long id, String name, float turnover, String cEO, String board_of_directors, SectorEntity sector,
			List<StockExchangeEntity> stockExchanges, List<StockPriceEntity> stockprices, String brief_writeup,
			IPODetailEntity ipo) {
		super();
		this.id = id;
		this.name = name;
		this.turnover = turnover;
		CEO = cEO;
		this.board_of_directors = board_of_directors;
		this.sector = sector;
		this.stockExchanges = stockExchanges;
		this.stockprices = stockprices;
		this.brief_writeup = brief_writeup;
		this.ipo = ipo;
	}
	CompanyEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	
	

}
