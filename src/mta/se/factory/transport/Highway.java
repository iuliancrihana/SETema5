/**
 * 
 */
package mta.se.factory.transport;

import java.util.List;

/**
 * @author IulianC
 *
 */
public class Highway extends Transport implements ITransportInfrastructure {

	double maxWeight;

	/**
	 * @param endPoints
	 *            Two Strings: source and destination
	 * @param id
	 *            Int: identification number of the Highway
	 * @param conections
	 *            List<String>: list of important connections
	 * @param length
	 *            Double: length of the Highway(km)
	 * @param maxSpeed
	 *            Double: maximum speed allowed
	 * @param maxWeight
	 *            Double: maximum Weight allowed
	 */
	public Highway(String[] endPoints, String id, List<String> connections,
			double length, double maxSpeed, double maxWeight) {
		super(endPoints, id, connections, length, maxSpeed);
		this.maxWeight = maxWeight;
	}

	@Override
	public String getName() {
		return highwayPrefix + this.id;
	}

	@Override
	public boolean Transport(String[] srcDest) {
		System.out.println("Am strabatut distanta de " + length + " pe autostrada "
				+ highwayPrefix + this.id + ", intre localitatile " + srcDest[0]
				+ " si " + srcDest[1] + "");
		return true;
	}

}
