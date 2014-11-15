/**
 * 
 */
package mta.se.factory.transport;

import java.util.List;

/**
 * @author IulianC
 *
 */
public abstract class Transport {
	protected String[] endPoints;
	protected String id;
	protected List<String> connections;
	protected double length;
	protected double maxSpeed;

	/**
	 * @param endPoints
	 *            Two Strings: source and destination
	 * @param id
	 *            Int: identification number of the Railway
	 * @param station
	 *            List<String>: list of Stations
	 * @param length
	 *            Double: length of the Railway(km)
	 * @param maxSpeed
	 *            Double: maximum speed allowed
	 */
	public Transport(String[] endPoints, String id, List<String> connections,
			double length, double maxSpeed) {
		super();
		this.endPoints = endPoints;
		this.id = id;
		this.connections = connections;
		this.length = length;
		this.maxSpeed = maxSpeed;
	}
}
