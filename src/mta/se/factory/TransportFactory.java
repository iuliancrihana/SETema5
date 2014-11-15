/**
 * 
 */
package mta.se.factory;

import java.util.ArrayList;
import java.util.List;

import mta.se.constants.Constants;
import mta.se.factory.economic.IEconomicInfrastructure;
import mta.se.factory.transport.Highway;
import mta.se.factory.transport.ITransportInfrastructure;
import mta.se.factory.transport.Railway;

/**
 * @author IulianC
 *
 */
public class TransportFactory extends AbstractFactory {

	@Override
	public ITransportInfrastructure produceTransport(String choice) {
		List<String> connection = new ArrayList<String>();
		connection.add("buzau");
		connection.add("braila");
		String[] endPoints = { "galati", "bucuresti" };
		if (choice.equalsIgnoreCase("Railway")) {
			return new Railway(endPoints, "100", connection, 12.5, 60.3,
					Constants.trainsForPeopleTranportation);
		} else if (choice.equalsIgnoreCase("Highway")) {
			return new Highway(endPoints, "100", connection, 12.5, 60.3, 3.5);
		}
		return null;
	}

	// nu stiu daca e ok varianta de mai sus sau cea comentata, daca ai putea sa ma lamuresti ar fi super
	/*
	 * /**
	 * 
	 * @param endPoints
	 * 
	 * @param id
	 * 
	 * @param connections
	 * 
	 * @param length
	 * 
	 * @param maxSpeed
	 * 
	 * @param type Object: Daca parametrul este de tip int, acesta are
	 * semnificatia tipului de trenfolosit(tip specificat in clasa de constante
	 * Constants) Altfel, variabila info va fi de tipul Double si va contine
	 * greutatea maxima admisa
	 * 
	 * @return Un obiect de tipul Railway sau unul de tipul Highway
	 */
	/*
	 * @Override public ITransportInfrastructure produceTransport(String[]
	 * endPoints, String id, List<String> connections, double length, double
	 * maxSpeed, Object type) { if
	 * (type.getClass().toString().equals("class java.lang.Integer")) { return
	 * new Railway(endPoints, id, connections, length, maxSpeed,
	 * Integer.parseInt(type.toString())); } else if
	 * (type.getClass().toString().equals("class java.lang.Double")) { return
	 * new Highway(endPoints, id, connections, length, maxSpeed,
	 * Double.parseDouble(type.toString())); } return null;
	 * 
	 * }
	 */

	@Override
	public IEconomicInfrastructure produceEconomy(String choice) {
		return null;
	}

}
