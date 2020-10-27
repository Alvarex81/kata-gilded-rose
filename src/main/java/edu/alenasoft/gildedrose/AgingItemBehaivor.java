package edu.alenasoft.gildedrose;

public class AgingItemBehaivor implements ItemBehaivor {
    @Override
    public void updateQuality(Item item) {

        if (item.getSellIn() > 10) {item.setQuality(item.getQuality() + 1);}
        else if ((item.getSellIn() > 5) && (item.getSellIn() <= 10)) {item.setQuality(item.getQuality() + 2);}
        else if ((item.getSellIn() > 0) && (item.getSellIn() <= 5)) {item.setQuality(item.getQuality() + 3);}
        else item.setQuality(0);

        item.validateQualityRange();
    }
}
