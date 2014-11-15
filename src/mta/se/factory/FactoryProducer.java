/**
 * 
 */
package mta.se.factory;

/**
 * @author IulianC
 *
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("Transport")) {
			return new TransportFactory();
		} else if (choice.equalsIgnoreCase("Economy")) {
			return new EconomyFactory();
		}
		return null;
	}
}
