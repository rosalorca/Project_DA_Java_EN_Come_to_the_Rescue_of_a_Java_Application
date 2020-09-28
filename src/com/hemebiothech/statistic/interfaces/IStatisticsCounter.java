package com.hemebiothech.statistic.interfaces;

import java.util.List;
import java.util.Map;

public interface IStatisticsCounter {
	/**
	 * 
	 * @param symptoms
	 * @return
	 */
	public Map<String, Integer> count(List<String> symptoms);

}
