package edu.alenasoft.gildedrose;

public class AgingItemBehaivor implements ItemBehaivor {
    @Override
    public void updateQuality(Item item) {

        item.setQuality(itemParameters.applyModifier(item.getSellIn(), item.getQuality()));
        item.validateQualityRange();
    }
}
