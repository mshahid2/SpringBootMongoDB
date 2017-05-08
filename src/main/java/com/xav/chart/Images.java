package com.xav.chart;

public class Images {
	private String title;

    private String height;

    private String width;

    private String longitude;

    private String latitude;

    private Pie pie;

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getHeight ()
    {
        return height;
    }

    public void setHeight (String height)
    {
        this.height = height;
    }

    public String getWidth ()
    {
        return width;
    }

    public void setWidth (String width)
    {
        this.width = width;
    }

    public String getLongitude ()
    {
        return longitude;
    }

    public void setLongitude (String longitude)
    {
        this.longitude = longitude;
    }

    public String getLatitude ()
    {
        return latitude;
    }

    public void setLatitude (String latitude)
    {
        this.latitude = latitude;
    }

    public Pie getPie ()
    {
        return pie;
    }

    public void setPie (Pie pie)
    {
        this.pie = pie;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [title = "+title+", height = "+height+", width = "+width+", longitude = "+longitude+", latitude = "+latitude+", pie = "+pie+"]";
    }
}
