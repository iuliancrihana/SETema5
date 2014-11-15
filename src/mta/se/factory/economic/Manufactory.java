/**
 * 
 */
package mta.se.factory.economic;

/**
 * @author IulianC
 *
 */
public class Manufactory extends Economic implements IEconomicInfrastructure {

	private int nivelPoluare;

	/**
	 * @param location
	 *            String: Where is located
	 * @param production
	 *            String: What we Produce
	 * @param profit
	 *            Double: Income.
	 */
	public Manufactory(String location, String production, double profit,
			int nivelPoluare) {
		super(location, production, profit);
		this.nivelPoluare = nivelPoluare;
	}

	/**
	 * @param lastYearIncome
	 *            ser lastYearIncome
	 */
	public void setLastYearIncome(double lastYearIncome) {
		this.lastYearIncome = lastYearIncome;
	}

	/**
	 * @param nivelPoluare
	 *            set nivelPoluare
	 */
	public void setNivelPoluare(int nivelPoluare) {
		this.nivelPoluare = nivelPoluare;
	}

	@Override
	public boolean profitExpectation(double expectation) {
		if (this.profit < expectation) {
			System.out.println("Productia in fabrica de " + production
					+ " este sub asteptari");
			return false;
		} else if (this.profit >= expectation) {
			System.out.println("Productia in fabrica de " + production
					+ " este peste asteptari");
			return true;
		}
		return false;
	}

	@Override
	public boolean economyGrowth() {
		if (this.profit < lastYearIncome)
			return false;
		else if (this.profit >= lastYearIncome) {
			return true;
		}
		return false;
	}

}
