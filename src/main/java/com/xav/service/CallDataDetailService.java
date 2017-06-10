package com.xav.service;

import java.util.List;

import com.xav.bean.drillDown.DrillDown;
import com.xav.chart.callDataDetail;


public interface CallDataDetailService {
	
	List<callDataDetail> getCallDetail();
	
	List<callDataDetail> getCallDetailByLocation(String location);
	
	List<DrillDown> getDrillDownDetailForALocation(String location);

}
