package Structure;

import GlobalSources.Enums;
import javafx.scene.image.Image;

public class Artifact extends Card{
    private boolean isOmni;
    private BonusAction action;
    public Artifact(int id, String name, int bonusAember, int chainsGain, Enums.Houses house, Image frontImage,boolean isOmni , BonusAction action) {
        super(id, name, bonusAember, chainsGain, house, frontImage);
        this.isOmni= isOmni;
        this.action= action;
    }

    @Override
    public void playCard() {

    }
}
