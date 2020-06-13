package it.univpm.ProgettoOOP.model;

public class NumericalStatistics extends Stats{
	
	public long avg;
	public int min;
	public int max;
	public double std;
	public int sum;
	
	public NumericalStatistics() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param avg rappresenta il valor medio
	 * @param min rappresenta il valore minimo
	 * @param max rappresenta il valore massimo
	 * @param std rappresenta la deviazione standard
	 * @param sum rappresenta la somma
	 */
	public NumericalStatistics(String field, int count, long avg, int min, int max, double std, int sum) {
		super(field, count);
		this.avg = avg;
		this.min = min;
		this.max = max;
		this.std = std;
		this.sum = sum;
	}

	/**
	 * @return the avg
	 */
	public long getAvg() {
		return avg;
	}

	/**
	 * @param avg the avg to set
	 */
	public void setAvg(long avg) {
		this.avg = avg;
	}

	/**
	 * @return the min
	 */
	public int getMin() {
		return min;
	}

	/**
	 * @param min the min to set
	 */
	public void setMin(int min) {
		this.min = min;
	}

	/**
	 * @return the max
	 */
	public int getMax() {
		return max;
	}

	/**
	 * @param max the max to set
	 */
	public void setMax(int max) {
		this.max = max;
	}

	/**
	 * @return the std
	 */
	public double getStd() {
		return std;
	}

	/**
	 * @param std the std to set
	 */
	public void setStd(double std) {
		this.std = std;
	}

	/**
	 * @return the sum
	 */
	public int getSum() {
		return sum;
	}

	/**
	 * @param sum the sum to set
	 */
	public void setSum(int sum) {
		this.sum = sum;
	}
}
