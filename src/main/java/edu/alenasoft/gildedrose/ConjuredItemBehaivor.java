package edu.alenasoft.gildedrose;

public class ConjuredItemBehaivor implements ItemBehaivor {
    @Override
    public void updateQuality(Item item) {

        if (item.getSellIn() > 0)
            item.setQuality(item.getQuality() - itemParameters.minModifierConjured);
        else
            item.setQuality(item.getQuality() - itemParameters.maxModifierConjured);

        item.validateQualityRange();

    }
}
