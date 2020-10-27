package edu.alenasoft.gildedrose;

public class ConjuredItemBehaivor implements ItemBehaivor {
    @Override
    public void updateQuality(Item item) {

        if (item.getSellIn() > 0)
            item.setQuality(item.getQuality() - 2);
        else
            item.setQuality(item.getQuality() - 4);

        item.validateQualityRange();

    }
}
