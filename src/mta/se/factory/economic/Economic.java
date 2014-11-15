/**
 * 
 */
package mta.se.factory.economic;

/**
 * @author IulianC
 *
 */
public abstract class Economic {
	protected String location;
	protected String production;
	protected double profit;
	protected double lastYearIncome;

	/**
	 * @param location
	 *            String: Where is located
	 * @param production
	 *            String: What we Produce
	 * @param profit
	 *            Double: Income.
	 */
	public Economic(String location, String production, double profit) {
		this.location = location;
		this.production = production;
		this.profit = profit;
	}
}
