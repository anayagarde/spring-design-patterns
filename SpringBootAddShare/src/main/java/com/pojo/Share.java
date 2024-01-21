package com.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="share")
public class Share {
	
	@Value(value="123")
	private int instrumentId;
	
	@Value(value="share name1")
	private String instrumentName;
	
	@Value(value="222.22")
	private double marketRate;
	
	public Share() {
		
	}

	public Share(int instrumentId, String instrumentName, double marketRate) {
		super();
		this.instrumentId = instrumentId;
		this.instrumentName = instrumentName;
		this.marketRate = marketRate;
	}
	public Share(String instrumentName, double marketRate) {
		super();
		this.instrumentName = instrumentName;
		this.marketRate = marketRate;
	}

	public int getInstrumentId() {
		return instrumentId;
	}

	public void setInstrumentId(int instrumentId) {
		this.instrumentId = instrumentId;
	}

	public String getInstrumentName() {
		return instrumentName;
	}

	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}

	public double getMarketRate() {
		return marketRate;
	}

	public void setMarketRate(double marketRate) {
		this.marketRate = marketRate;
	}

	@Override
	public String toString() {
		return "Share [instrumentId=" + instrumentId + ", instrumentName=" + instrumentName + ", marketRate="
				+ marketRate + "]";
	}
	
	
	
	

}
