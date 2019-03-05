package Structure;

import GlobalSources.Enums;
import javafx.scene.image.Image;

import java.util.List;

public class Upgrade extends Card {
    private Creature attatchedTo;
    private List<BonusAction> actions;
    public Upgrade(int id, String name, int bonusAember, int chainsGain, Enums.Houses house, Image frontImage, List<BonusAction> actions, String traits,boolean isMaverick) {
        super(id, name, bonusAember, chainsGain, house, frontImage,traits,isMaverick);
        this.actions = actions;
    }
    private void attach(Creature creature){
        attatchedTo = creature;

    }

    @Override
    public void playCard() {
    }
}
