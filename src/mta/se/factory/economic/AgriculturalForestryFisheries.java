/**
 * 
 */
package mta.se.factory.economic;

/**
 * @author IulianC
 *
 */
public class AgriculturalForestryFisheries extends Economic implements
		IEconomicInfrastructure {

	public String perioadaDeStagnare;

	/**
	 * @param location
	 *            String: Where is located
	 * @param production
	 *            String: What we Produce
	 * @param profit
	 *            Double: Income.
	 */
	public AgriculturalForestryFisheries(String location, String production,
			double profit, String perioadaDeStagnare) {
		super(location, production, profit);
	}

	/**
	 * @param perioadaDeStagnare
	 *            String:the perioadaDeStagnare to set
	 */
	public void setPerioadaDeStagnare(String perioadaDeStagnare) {
		this.perioadaDeStagnare = perioadaDeStagnare;
	}

	@Override
	public boolean profitExpectation(double expectation) {
		if (this.profit < expectation) {
			System.out.println("Productia de " + production
					+ " este sub asteptari");
			return false;
		} else if (this.profit >= expectation) {
			System.out.println("Productia de " + production
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
