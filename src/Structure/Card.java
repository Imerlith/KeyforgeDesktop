package Structure;

import GlobalSources.Enums;
import javafx.scene.image.Image;

public abstract class Card {
    private int id;
    private String name;
    private int bonusAember;
    private int chainsGain;
    private  Enums.Houses house;
    private Image frontImage;
    private Enums.Statuses status;
    private String traits;
    private boolean isMaverick;
    public Card(int id, String name, int bonusAember, int chainsGain, Enums.Houses house, Image frontImage, String traits, boolean isMaverick) {
        this.id = id;
        this.name = name;
        this.bonusAember = bonusAember;
        this.chainsGain = chainsGain;
        this.house = house;
        this.frontImage = frontImage;
        status = Enums.Statuses.Unplayed;
        this.traits = traits;
        this.isMaverick = isMaverick;
    }

    public abstract void playCard();

}
