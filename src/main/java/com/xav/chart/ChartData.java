package com.xav.chart;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="ChartData")
public class ChartData {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String map;

    private Images[] images;

    public String getMap ()
    {
        return map;
    }

    public void setMap (String map)
    {
        this.map = map;
    }

    public Images[] getImages ()
    {
        return images;
    }

    public void setImages (Images[] images)
    {
        this.images = images;
    }
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


    @Override
    public String toString()
    {
        return "ClassPojo [map = "+map+", images = "+images+"]";
    }
}
