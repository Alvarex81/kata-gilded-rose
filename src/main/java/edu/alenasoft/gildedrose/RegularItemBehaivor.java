package edu.alenasoft.gildedrose;

public class RegularItemBehaivor implements ItemBehaivor {
    @Override
    public void updateQuality(Item item) {

        if (item.getSellIn() > 0)
            item.setQuality(item.getQuality() - itemParameters.minModifierRegular);
        else
            item.setQuality(item.getQuality() - itemParameters.maxModifierRegular);

        item.validateQualityRange();

    }
}
