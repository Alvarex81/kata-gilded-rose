package edu.alenasoft.gildedrose;

public class RegularItemBehaivor implements ItemBehaivor {
    @Override
    public void updateQuality(Item item) {

        if (item.getSellIn() > 0)
            item.setQuality(item.getQuality() - 1);
        else
            item.setQuality(item.getQuality() - 2);

        item.validateQualityRange();

    }
}
