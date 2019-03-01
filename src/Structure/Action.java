package Structure;

import GlobalSources.Enums;
import javafx.scene.image.Image;

import java.util.List;

public class Action extends Card {
    private List<BonusAction> actions;
    public Action(int id, String name, int bonusAember, int chainsGain, Enums.Houses house, Image frontImage,List<BonusAction> actions) {
        super(id, name, bonusAember, chainsGain, house, frontImage);
        this.actions= actions;
    }

    @Override
    public void playCard() {

    }
}
