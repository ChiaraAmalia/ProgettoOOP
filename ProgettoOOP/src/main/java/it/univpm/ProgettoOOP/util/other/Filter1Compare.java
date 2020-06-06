package it.univpm.ProgettoOOP.util.other;

public class Filter1Compare{
	
	protected String paramCompare;
	
public Filter1Compare (Object paramCompare) {
	
	if(paramCompare instanceof String) 
		this.paramCompare=(String)paramCompare;
	 else 
		throw new IllegalArgumentException ("Unexpected request:String");
}
	
	public void setParamToCompare (Object paramCompare) {
		if(paramCompare instanceof String)
			this.paramCompare=(String)paramCompare;
		else throw new IllegalArgumentException ("Unexpected request:String");
	}
	
	public void setParamToCompare (String paramCompare) {
		this.paramCompare=paramCompare;
	}
	
	public String getParamToCompare() {
		return paramCompare;
	}
	

}
