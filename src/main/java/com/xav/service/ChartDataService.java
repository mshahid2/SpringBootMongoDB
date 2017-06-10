package com.xav.service;

import java.util.List;

import com.xav.chart.ChartData;

public interface ChartDataService {
	
	List<ChartData> getAllCallDatailsWithLocation();
	ChartData getDatByMap(String mapData);

}
