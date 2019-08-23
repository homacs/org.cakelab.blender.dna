package org.cakelab.jdoxml.impl;

public class Log {

	private static int s_debugLevel = 0;
	
	public static void debug(int level, String format, Object ... args) {
		if (hasDebugLevel(level)) {
			System.err.printf(format, args);
		}
	}
	public static void setDebugLevel(int level)
	{
	  s_debugLevel = level;
	}
	
	/** 
	 * Allows to check whether the logging on given 'level' would produce any output.
	 * 
	 * @param level
	 * @return true if log would generate output for the given debug level
	 */
	public static boolean hasDebugLevel(int level) {
		return (level <= s_debugLevel);
	}

}
