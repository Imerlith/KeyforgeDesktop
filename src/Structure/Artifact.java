package Structure;

import GlobalSources.Enums;
import javafx.scene.image.Image;

public class Artifact extends Card{
    private boolean isOmni;
    private BonusAction action;
    public Artifact(int id, String name, int bonusAember, int chainsGain, Enums.Houses house, Image frontImage,boolean isOmni , BonusAction action, String traits,boolean isMaverick) {
        super(id, name, bonusAember, chainsGain, house, frontImage, traits , isMaverick);
        this.isOmni= isOmni;
        this.action= action;
    }

    @Override
    public void playCard() {

    }
}
