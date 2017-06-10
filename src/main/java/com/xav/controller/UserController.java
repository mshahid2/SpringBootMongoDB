package com.xav.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xav.bean.User;
import com.xav.bean.drillDown.DrillDown;
import com.xav.chart.ChartData;
import com.xav.chart.DataProvider;
import com.xav.chart.Images;
import com.xav.chart.Pie;
import com.xav.chart.callDataDetail;
import com.xav.service.CallDataDetailService;
import com.xav.service.ChartDataService;
import com.xav.service.UserService;
/**
 * 
 * @author MD Shahid
 *
 */
@RestController
public class UserController {
	


	@Autowired
	UserService userService;

	@Autowired
	ChartDataService chartDataService;
	
	@Autowired
	CallDataDetailService callDataDetailService;

	@CrossOrigin(origins="https://angular4-project-heathenish-subconnation.cfapps.io")
	@RequestMapping("/getUser/{email}")
	public User getUsers(@PathVariable String email)
	{
		User user1 = null;
		System.out.println("Method Called as service.");
		Optional<User> user =userService.getUserByEmail(email);
		if(user.isPresent())
		{
			user1= user.get();
		}
		return user1;
	}

	@CrossOrigin(origins="https://angular4-project-heathenish-subconnation.cfapps.io")
	@RequestMapping("getUserByRole/{roleName}")
	public List<User> getUserByRole(@PathVariable String roleName)
	{
		List<User> user = userService.getUserByRole(roleName);
		return user;

	}
	@CrossOrigin(origins = "https://xavient.cfapps.io")
	@RequestMapping("getChartData")
	public ChartData getChartData(){
		
		ChartData lstData =chartDataService.getDatByMap("usa2Low");
		System.out.println("lstData Size : " + lstData);
		
		
		Images[] imgArray = new Images[1];
		ChartData cd = new ChartData();
		Images img = new Images();
		img.setTitle("Chicahgo");
		//img.setTitle("North America");
	/*	img.setLatitude("39.563353");
		img.setLongitude("-99.316406");*/
		img.setLatitude("41.8781136");
		img.setLongitude("-87.62979819999998");
		img.setWidth("100");
		img.setHeight("100");
		Pie pie = new Pie();
		pie.setType("pie");
		pie.setPullOutRadius("0");
		pie.setLabelRadius("0");
		DataProvider[] dpArray = new DataProvider[3];
		DataProvider dp1 = new DataProvider();
		dp1.setCategory("Late");
		dp1.setValue("200");
		dpArray[0]=dp1;
		DataProvider dp2 = new DataProvider();
		dp2.setCategory("In Route");
		dp2.setValue("500");
		dpArray[1]=dp2;
		DataProvider dp3 = new DataProvider();
		dp3.setCategory("On Time");
		dp3.setValue("700");
		dpArray[2]=dp3;
/*		DataProvider dp4 = new DataProvider();
		dp4.setCategory("Category #4");
		dp4.setValue("300");
		dpArray[3]=dp4;*/
		pie.setDataProvider(dpArray);
		pie.setLabelText("[[value]]%");
		pie.setValueField("value");
		pie.setTitleField("category");		
		img.setPie(pie);			
		imgArray[0] = img;
		cd.setImages(imgArray);
		//cd.setMap("continentsLow");
		//cd.setMap("usaLow");
		cd.setMap("usa2Low");
		//return cd;
		return lstData;
		
	}
	@CrossOrigin(origins = "https://xavient.cfapps.io")
	@RequestMapping("/getChartDataNormalied")
	ChartData getChartDataNormalied()
	{
		
		return null;
	}
	
	@CrossOrigin(origins="https://xavient.cfapps.io")
	@RequestMapping("/calDataDetail/{location}")
	List<callDataDetail> callDataDetail(@PathVariable String location)
	{
		List<callDataDetail> lstDetail = callDataDetailService.getCallDetailByLocation(location);
		return lstDetail;
	}
	
	@CrossOrigin(origins="https://xavient.cfapps.io")
	@RequestMapping("/getBarCharData")
	public List<DrillDown> getDrillDownData()
	{
		List<DrillDown> lstDrillDown =callDataDetailService.getDrillDownDetailForALocation("");
		return lstDrillDown;
				
	}


}
