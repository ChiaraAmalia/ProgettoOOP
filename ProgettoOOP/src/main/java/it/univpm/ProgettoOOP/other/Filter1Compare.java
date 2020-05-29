package it.univpm.ProgettoOOP.other;

public class Filter1Compare (Object paramCompare) {
	protected String paramCompare;
	
	if(paramCompare istanceofString) {
		this.paramCompare=(String)paramCompare;
	} else {
		throw new IllegalArgumentException ("Unexpected request:String")
	}
	
	public void setParamToCompare (Object paramCompare) {
		if(paramCompare istanceof String) {
			this.paramCompare=(String)paramCompare;
		}else {throw new IllegalArgumentException ("Unexpected request:String")
		}
	}
	
	public void setParamToCompare (String paramCompare) {
		this.paramCompare=paramCompare;
	}
	
	public String getParamToCompare() {
		return paramCompare;
	}
	

}
