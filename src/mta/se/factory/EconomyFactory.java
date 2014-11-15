/**
 * 
 */
package mta.se.factory;

import java.util.ArrayList;
import java.util.List;

import mta.se.constants.Constants;
import mta.se.factory.economic.AgriculturalForestryFisheries;
import mta.se.factory.economic.IEconomicInfrastructure;
import mta.se.factory.economic.Manufactory;
import mta.se.factory.transport.Highway;
import mta.se.factory.transport.ITransportInfrastructure;
import mta.se.factory.transport.Railway;

/**
 * @author IulianC
 *
 */
public class EconomyFactory extends AbstractFactory {

	@Override
	public IEconomicInfrastructure produceEconomy(String choice) {
		if (choice.equalsIgnoreCase("Agricultura")) {
			return new AgriculturalForestryFisheries("bucuresti", "orez", 14.5,
					"ianuarie-martie");
		} else if (choice.equalsIgnoreCase("Fabrici")) {
			return new Manufactory("galati", "masini", 50.1, Constants.lowLevel);
		}
		return null;
	}

	// Aceeasi intrebare ca in TransportFactory
	/*
	 * /**
	 * 
	 * @param location
	 * 
	 * @param production
	 * 
	 * @param profit
	 * 
	 * @param info Object: Daca parametrul este de tip int, acesta are
	 * semnificatia unui nivel de poluare(nivel specificat in clasa de constante
	 * Constants) Altfel, variabila info va fi de tip String si va contine
	 * perioada de Stagnare
	 * 
	 * @return Un obiect de tipul Manufactorym sau unul de tipul
	 * AgriculturalForestryFisheries
	 */
	/*
	 * @Override public IEconomicInfrastructure profitExpectation(String
	 * location, String production, double profit, Object info) { if
	 * (info.getClass().toString().equals("class java.lang.Integer")) { return
	 * new Manufactory(location, production, profit,
	 * Integer.parseInt(info.toString())); } else if
	 * (info.getClass().toString().equals("class java.lang.String")) { return
	 * new AgriculturalForestryFisheries(location, production, profit,
	 * info.toString()); } return null; }
	 */

	@Override
	public ITransportInfrastructure produceTransport(String choice) {
		return null;
	}
}
