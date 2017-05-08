package com.xav.chart;

public class Pie {
	private String labelText;

    private DataProvider[] dataProvider;

    private String titleField;

    private String valueField;

    private String type;

    private String pullOutRadius;

    private String labelRadius;

    public String getLabelText ()
    {
        return labelText;
    }

    public void setLabelText (String labelText)
    {
        this.labelText = labelText;
    }

    public DataProvider[] getDataProvider ()
    {
        return dataProvider;
    }

    public void setDataProvider (DataProvider[] dataProvider)
    {
        this.dataProvider = dataProvider;
    }

    public String getTitleField ()
    {
        return titleField;
    }

    public void setTitleField (String titleField)
    {
        this.titleField = titleField;
    }

    public String getValueField ()
    {
        return valueField;
    }

    public void setValueField (String valueField)
    {
        this.valueField = valueField;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getPullOutRadius ()
    {
        return pullOutRadius;
    }

    public void setPullOutRadius (String pullOutRadius)
    {
        this.pullOutRadius = pullOutRadius;
    }

    public String getLabelRadius ()
    {
        return labelRadius;
    }

    public void setLabelRadius (String labelRadius)
    {
        this.labelRadius = labelRadius;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [labelText = "+labelText+", dataProvider = "+dataProvider+", titleField = "+titleField+", valueField = "+valueField+", type = "+type+", pullOutRadius = "+pullOutRadius+", labelRadius = "+labelRadius+"]";
    }
}
