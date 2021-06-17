package game.map;

import game.controls.MapObserver;
import game.item.ConstantAttack;
import game.item.Item;
import game.item.RandomAttack;
import game.item.Token;
import game.monster.Monster;

public class Pony extends GameMap {
    private Room ponyVille;
    private Room hillTop;
    private Room appleWood;
    private Room rockVille;
    private Room badLands;
    private Room smokeyMountains;
    private Room sugerville;
    @Override
    protected void howToWin() {
        MapObserver.clear();
        MapObserver.setWinningAmountOfMonsters(2);
        MapObserver.setWinningAmountOfTokens(4);
    }

    @Override
    protected void initialize() {
        ponyVille = new Room("Ponyville", "a small town of ponies");
        hillTop = new Room("hill top", "grass covered hill with tons for flowers");
        appleWood = new Room("Apple woods", "apples every where as the eye can see");
        rockVille = new Room("Rockville", "mostly rocks");
        badLands = new Room("BadLands", "evil in every conner");
        smokeyMountains = new Room("Smokey Mountains", "every so little, and you can see Ponyville from up here.");
        sugerville = new Room("Sugerville", "every is sweet form the candy threes to chocolate rivers");

    }

    @Override
    protected void directionsSetup() {
        String n = "north";
        String s = "south";
        String e = "east";
        String w = "west";

        sugerville.setRoom(e, smokeyMountains);

        smokeyMountains.setRoom(w, sugerville);
        smokeyMountains.setRoom(n, ponyVille);

        ponyVille.setRoom(s, smokeyMountains);
        ponyVille.setRoom(n, hillTop);
        ponyVille.setRoom(e, appleWood);

        hillTop.setRoom(s, ponyVille);

        appleWood.setRoom(w, ponyVille);
        appleWood.setRoom(n, rockVille);
        appleWood.setRoom(e, badLands);

        rockVille.setRoom(s, appleWood);

        badLands.setRoom(w, appleWood);
    }

    @Override
    protected void itemSetup() {
        Item dandelion = new Token("Dandelion", "its shows the beauty in this world");
        Item balloon = new Token("Balloo", "it farts when you let some air out of it");
        Item crystalHart = new Token("Crystal Hart", "it's so shiny ");
        Item Gems = new Token("Gems", "There are very hard to break");

        Item stick = new RandomAttack("Stick", "you can attack with it", 0, 1);
        Item lassoOfTruth = new ConstantAttack("Lasso of truth", "you can set the truth out of people", 5);
        Item cannon = new RandomAttack("Cannon", "it's big and power sometimes", 0, 20);

        sugerville.setItem(crystalHart);
        smokeyMountains.setItem(cannon);
        ponyVille.setItem(stick);
        hillTop.setItem(dandelion);
        appleWood.setItem(lassoOfTruth);
        rockVille.setItem(balloon);
        badLands.setItem(Gems);

    }

    @Override
    protected void monsterSetup() {
        Monster pinkiePie = new Monster("Pinkie Pie", "she is pink", 8, 3, 9);
        Monster spike = new Monster("Spike", "he looks like a harmless dragon", 5, 0, 1);
        Monster appleJack = new Monster("Apple Jack", "he loves apples", 30, 0, 3);
        Monster rainBowDash = new Monster("Rainbow Dash", "she has rainbow powers", 4, 5);
        Monster twilightSparkle = new Monster("Twilight Sparkle", "every thing this hard", 50, 0, 3);

        sugerville.setMonster(pinkiePie);
        ponyVille.setMonster(spike);
        hillTop.setMonster(rainBowDash);
        appleWood.setMonster(appleJack);
        rockVille.setMonster(twilightSparkle);



    }

    @Override
    public String mapName() {
        return "myLittlePony";
    }

    @Override
    public Room getStartingRoom() {
        return ponyVille;
    }
}
