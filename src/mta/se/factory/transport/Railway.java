/**
 * 
 */
package mta.se.factory.transport;

import java.util.List;

/**
 * @author IulianC
 *
 */
public class Railway extends Transport implements ITransportInfrastructure {

	int type;

	/**
	 * @param endPoints
	 *            Two Strings: source and destination
	 * @param id
	 *            Int: identification number of the Railway
	 * @param conections
	 *            List<String>: list of stations
	 * @param length
	 *            Double: length of the Railway(km)
	 * @param maxSpeed
	 *            Double: maximum speed allowed
	 * @param type
	 *            Int: the Railway domain of use
	 */
	public Railway(String[] endPoints, String id, List<String> connections,
			double length, double maxSpeed, int type) {
		super(endPoints, id, connections, length, maxSpeed);
		this.type = type;
	}

	public String getName() {
		return railwayPrefix + this.type + this.id;
	}

	@Override
	public boolean Transport(String[] srcDest) {
		System.out.println("Am strabatut distanta de " + length + " cu trenul "
				+ railwayPrefix + this.type + this.id + ", intre localitatile "
				+ srcDest[0] + " si " + srcDest[1] + "");
		return true;
	}

}
