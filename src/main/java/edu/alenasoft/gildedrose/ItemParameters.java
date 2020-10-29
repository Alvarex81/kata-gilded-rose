package edu.alenasoft.gildedrose;

public  class  ItemParameters {

    public final int minQualityValue = 0;
    public final int maxQualityValue = 50;

    public final int minModifierRegular = 1;
    public final int maxModifierRegular = 2;

    public final int legendValue = 80;

    public final int minModifierConjured = 2;
    public final int maxModifierConjured = 4;

    private RangeItem[] agingRanges;

    ItemParameters () {

        agingRanges = new RangeItem[4];
        agingRanges[0] = new RangeItem(0, 0, "SET", "SUPERIOR");
        agingRanges[1] = new RangeItem(0, 5, 3, "ADD");
        agingRanges[2] = new RangeItem(5, 10, 2, "ADD");
        agingRanges[3] = new RangeItem(10, 1, "ADD", "INFERIOR");

    }

    public int applyModifier (int valueRange, int valueApplyModifier){

        int newValue = valueApplyModifier;

        for (RangeItem range: this.agingRanges){
            if (range.inRange(valueRange)) {
                switch (range.getAction()){
                    case "ADD":{
                        newValue = valueApplyModifier + range.getModifier();
                        break;
                    }
                    case "SET":{
                        newValue = range.getModifier();
                        break;
                    }
                    default:{
                        newValue = valueApplyModifier;
                        break;
                    }
                }
            }
        }

        return newValue;

    }


}
