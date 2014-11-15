/**
 * 
 */
package mta.se.factory;

import java.util.List;

import mta.se.factory.economic.IEconomicInfrastructure;
import mta.se.factory.transport.ITransportInfrastructure;

/**
 * @author IulianC
 *
 */
public abstract class AbstractFactory {

	public abstract ITransportInfrastructure produceTransport(String choice);
	
	public abstract IEconomicInfrastructure produceEconomy(String choice);
	
	
	/*public abstract ITransportInfrastructure produceTransport(String[] endPoints,
			String id, List<String> connections, double length,
			double maxSpeed, Object type);

	public abstract IEconomicInfrastructure profitExpectation(String location,
			String production, double profit, Object info);*/
}
