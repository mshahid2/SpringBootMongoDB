package com.xav.bean.drillDown;

public class Departments {
	
	private String category;

    private String callVolume;

    public String getCategory ()
    {
        return category;
    }

    public void setCategory (String category)
    {
        this.category = category;
    }

    public String getCallVolume ()
    {
        return callVolume;
    }

    public void setCallVolume (String callVolume)
    {
        this.callVolume = callVolume;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [category = "+category+", callVolume = "+callVolume+"]";
    }

}
