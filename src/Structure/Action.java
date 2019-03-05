package Structure;

import GlobalSources.Enums;
import javafx.scene.image.Image;

import java.util.List;

public class Action extends Card {
    private List<BonusAction> actions;
    public Action(int id, String name, int bonusAember, int chainsGain, Enums.Houses house, Image frontImage,List<BonusAction> actions, String traits,boolean isMaverick) {
        super(id, name, bonusAember, chainsGain, house, frontImage, traits , isMaverick);
        this.actions= actions;
    }

    @Override
    public void playCard() {

    }
}
