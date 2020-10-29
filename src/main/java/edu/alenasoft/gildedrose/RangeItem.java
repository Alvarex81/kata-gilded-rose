package edu.alenasoft.gildedrose;

public class RangeItem {

    private Integer minValue;
    private Integer maxValue;
    private Integer modifier;
    private String action;

    RangeItem (Integer minValue, Integer maxValue, Integer modifier, String action){
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.modifier = modifier;
        this.action = action;
    }

    RangeItem (Integer value, Integer modifier, String action, String limite){

        if (limite.equals("INFERIOR")) this.minValue = value;
        if (limite.equals("SUPERIOR")) this.maxValue = value;

        this.modifier = modifier;
        this.action = action;
    }

    boolean inRange (Integer value){
        if (this.minValue == null){

            return value <= this.maxValue;

        }
        else if (this.maxValue == null){

            return this.minValue <= value;
        }
        else return (this.minValue <= value) && (value < this.maxValue);
    }

    public String getAction() {
        return action;
    }

    public Integer getModifier() {
        return modifier;
    }
}
