package com.xav.chart;

public class ChartData {
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

    @Override
    public String toString()
    {
        return "ClassPojo [map = "+map+", images = "+images+"]";
    }
}
