package Structure;

import GlobalSources.Enums;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

public class Creature extends Card {
    private int position;
    private int hp;
    private int power;
    private int armor;
    private List<BonusAction> listOfActions;

    public Creature(int id, String name, int bonusAember, int chainsGain, Enums.Houses house, Image frontImage, int position , int power , int armor) {
        super(id, name, bonusAember, chainsGain, house, frontImage);
        this.position = position;
        this.hp = power;
        this.power=power;
        this.armor = armor;
        listOfActions = new ArrayList<>();
    }

    public void addAction(){

    }
    @Override
    public void playCard() {

    }
}
