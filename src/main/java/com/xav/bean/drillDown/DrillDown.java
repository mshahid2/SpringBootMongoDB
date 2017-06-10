package com.xav.bean.drillDown;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Drilldown")
public class DrillDown {
	
	@Id
	private String id;
	private String category;

    private String color;

    private String description;

    private Departments[] departments;

    private String callVolume;

    private String url;

    public String getCategory ()
    {
        return category;
    }

    public void setCategory (String category)
    {
        this.category = category;
    }

    public String getColor ()
    {
        return color;
    }

    public void setColor (String color)
    {
        this.color = color;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public Departments[] getDepartments ()
    {
        return departments;
    }

    public void setDepartments (Departments[] departments)
    {
        this.departments = departments;
    }

    public String getCallVolume ()
    {
        return callVolume;
    }

    public void setCallVolume (String callVolume)
    {
        this.callVolume = callVolume;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [category = "+category+", color = "+color+", description = "+description+", departments = "+departments+", callVolume = "+callVolume+", url = "+url+"]";
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
