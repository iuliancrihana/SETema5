/**
 * 
 */
package mta.se;

import java.util.ArrayList;
import java.util.List;

import mta.se.constants.Constants;
import mta.se.factory.AbstractFactory;
import mta.se.factory.FactoryProducer;
import mta.se.factory.TransportFactory;
import mta.se.factory.economic.IEconomicInfrastructure;
import mta.se.factory.transport.ITransportInfrastructure;
import mta.se.factory.transport.Railway;

/**
 * @author IulianC
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] srcDest = { "galati", "bucuresti" };

		AbstractFactory newTransport = FactoryProducer.getFactory("Transport");
		ITransportInfrastructure newHighway = newTransport
				.produceTransport("railway");
		newHighway.Transport(srcDest);

		AbstractFactory newEconomy = FactoryProducer.getFactory("Economy");
		IEconomicInfrastructure newManufactory = newEconomy
				.produceEconomy("Fabrici");
		newManufactory.profitExpectation(12.5);
		
		
		
		/*
		 * ITransportInfrastructure newInfrastructure=new
		 * TransportFactory().produceTransport(endPoints, "100", connection,
		 * TransportFactory newTransport = new TransportFactory(); List<String>
		 * connection = new ArrayList<String>(); connection.add("buzau");
		 * connection.add("braila"); String[] endPoints = { "galati",
		 * "bucuresti" }; ITransportInfrastructure newInfrastructure =
		 * newTransport .produceTransport(endPoints, "100", connection, 12.5,
		 * 60.3, Constants.trainsForPeopleTranportation);
		 * newInfrastructure.Transport(endPoints);
		 */
	}
}
