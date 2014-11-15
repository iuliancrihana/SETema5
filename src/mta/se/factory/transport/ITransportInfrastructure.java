/**
 * 
 */
package mta.se.factory.transport;

/**
 * @author IulianC
 *
 */
public interface ITransportInfrastructure {
	static public final String railwayPrefix = "R";
	static public final String highwayPrefix = "A";

	/**
	 * @param srcDest
	 *            String[]: the source and destination of the place I want to
	 *            travel
	 * @return true if the connection is available or false if it is not
	 */
	public boolean Transport(String[] srcDest);

	/**
	 * Find the name of the Transportation Route
	 */
	public String getName();
}
