package bean;

public class YearTerm {

	private int startYear;
	private int term;
	
	public YearTerm() {
		super();
		this.startYear = -1;
		this.term = -1;
	}
	public YearTerm(int startYear, int term) {
		super();
		this.startYear = startYear;
		this.term = term;
	}
	public int getStartYear() {
		return startYear;
	}
	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	
	public boolean equal(YearTerm data){
		if(this.startYear==data.startYear&&this.term==data.term)
			return true;
		else return false;
	}	
}
