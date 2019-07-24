package com.example.cop4331;

public class Traps
{
    public static String [] getTraps(String race, String career)
    {
        String [] basic = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Foil", "Rapier", "One set of Best Craftsmenship Clothes", "Perfume", "Cologne", "Healing Draught"};
        if (race.equalsIgnoreCase("human"))
        {
            switch(career){
                case "Agitator" :
                    String [] agitator = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "One set of Good Craftsmenship Clothes", "20 leaflets for String []ious causes"};
                    return agitator;

                case "Apprentice Wizard" :
                    String [] apprentice = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Quarter Staff", "Backpack", "Printed Book"};
                    return apprentice;

                case "Bailiff" :
                    String [] bailiff = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "Leather Skullcap", "Riding Horse", "Saddle", "Harness", "One Set of Good Craftsmenship Clothing"};
                    return bailiff;

                case  "Barber-Surgeon" :
                    String [] barber = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Trade Tools (Barber-Surgeon)"};
                    return barber;

                case "Boatman" :
                    String [] boatman = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "Row Boat"};
                    return boatman;

                case "Bodyguard" :
                    String [] bodyguard = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Buckler", "Knuckle-dusters", "A Pair of Throwing Axes", "Throwing Knives", "Leather Jack"};
                    return bodyguard;

                case "Bone Picker" :
                    String [] bone = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Cart", "3 Sacks"};
                    return bone;

                case "Bounty Hunter" :
                    String [] bounty = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Crossbow", "10 bolts", "Net", "Leather Jerkin", "Leather Skullcap", "Manacles", "10 Yards of Rope"};
                    return bounty;

                case "Burgher" :
                    String [] burg = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Abacus", "Lantern", "One Set of Good Clothing"};
                    return burg;

                case "Camp Follower" :
                    String [] camp = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Lucky Charm", "Trade Tools", "Pouch", "Tent"};
                    return camp;

                case "Charcoal-Burner" :
                    String [] charcoal = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "3 Torches", "Tinderbox", "Hatchet"};
                    return charcoal;

                case "Coachman" :
                    String [] coach = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Blunderbuss", "Powder/ammunition for 10 shots", "Mail Shirt", "Leather Jack", "Instrument (Coach Horn)"};
                    return coach;

                case "Entertainer" :
                    String [] entertain = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jerkin", "Instrument (any)", "Trade Tools (Performer)", "3 Throwing Knives", "2 Throwing Axes", "Costume", "One Set of Good Craftsmenship Clothes"};
                    return entertain;

                case "Envoy" :
                    String [] envoy = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "2 sets of Good Craftsmenship Clothes", "Writing Kit"};
                    return envoy;

                case "Estalian Diestro" :
                    String [] estal = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Foil", "Rapier", "One set of Best Craftsmenship Clothes", "Perfume", "Cologne", "Healing Draught"};
                    return estal;

                case "Ferryman" :
                    String [] ferry = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Crossbow", "10 bolts", "Blunderbuss", "Powder/ammunition of 10 shots", "Leather Jack"};
                    return ferry;

                case "Fieldwarden" :
                    String [] field = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Sling with Ammunition", "Lantern", "Lamp Oil", "Spade", "Pony", "Saddle", "Harness"};
                    return field;

                case "Fisherman" :
                    String [] fisher = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Fish Hook and Line", "Spear"};
                    return fisher;

                case "Grave Robber" :
                    String [] grave = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Lantern", "Lamp Oil", "Pick", "Sack", "Spade"};
                    return grave;

                case "Hedge Wizard" :
                    String [] hedge = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Healing Draught", "Hood"};
                    return hedge;

                case "Hunter" :
                    String [] hunt = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Longbow", "10 Arrows", "2 Animal Traps", "Antitoxin Kit"};
                    return hunt;

                case "Initiate" :
                    String [] init = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Religious Symbol", "Robes"};
                    return init;

                case "Jailer" :
                    String [] jail = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Bottle of Common Wine", "Tankard", "Bola", "Lasso", "Net"};
                    return jail;

                case "Kislevite Kossar" :
                    String [] kislev = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Bow", "10 Arrows", "Twohanded Axe", "Mail Coat", "Leather Jack", "Leather Leggings"};
                    return kislev;

                case "Kithband Warrior" :
                    String [] kith = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Elfbow", "10 Arrows", "Leather Jack"};
                    return kith;

                case "Marine" :
                    String [] marine = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Bow", "Crossbow", "10 Arrows", "10 Bolts", "Leather Jack", "Shield", "Grappling Hook", "10 Yards of Rope"};
                    return marine;

                case "Mercenary" :
                    String [] merc = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Crossbow", "10 Bolts", "Shield", "Mail Shirt", "Leather Jack", "Healing Draught"};
                    return merc;

                case "Messenger" :
                    String [] mess = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "Map Case", "Riding Horse", "Saddle", "Harness", "Shield"};
                    return mess;

                case "Militiaman" :
                    String [] militia = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Halberd", "Bow", "10 Arrows", "Leather Jack", "Leather Skullcap", "Uniform"};
                    return militia;

                case "Miner" :
                    String [] miner = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Two-handed Pick", "Leather Jack", "Pick, Spade", "Storm Lantern", "Lamp Oi"};
                    return miner;

                case "Noble" :
                    String [] noble = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Foil", "Main Gauche", "Noble’s Garb", "Riding Horse", "Saddle", "Harness", "10 Gold", "Jewellery worth 6d10 gc"};
                    return noble;

                case "Norse Berserker" :
                    String [] norse = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jerkin", "Bottle of Spirits", "Great Weapon", "Shield"};
                    return norse;

                case "Outlaw" :
                    String [] outlaw = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Bow", "10 Arrows", "Leather Jerkin", "Shield"};
                    return outlaw;

                case "Outrider" :
                    String [] outrider = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Bow", "Crossbow", "10 Arrows", "10 Bolts", "Net", "Whip", "Lasso","Leather Jack", "Shield", "10 Yards of Rope", "Riding Horse", "Saddle", "Harness"};
                    return outrider;

                case "Peasant" :
                    String [] peasant = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Sling", "Quarter Staff", "Leather Flask"};
                    return peasant;

                case "Pit Fighter" :
                    String [] pit = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Flail",  "Great Weapon", "Knuckle-duster", "Shield", "Buckler", "Mail Shirt", "Leather Jack"};
                    return pit;

                case "Protagonist" :
                    String [] protag = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Mail Shirt",  "Leather Jack", "Shield", "Riding Horse", "Saddle", "Harness"};
                    return protag;

                case "Rat Catcher" :
                    String [] rat = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Sling with Ammunition", "4 Animal Traps", "Pole with 10 dead rats", "Small but Vicious Dog"};
                    return rat;

                case "Roadwarden" :
                    String [] road = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Pistol", "10 Firearm Balls and Gunpowder", "Mail Shirt", "Leather Jack", "Shield", "10 Yards of Rope", "Light Warhorse", "Saddle", "Harness"};
                    return road;

                case "Rogue" :
                    String [] rogue = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "One set of Best Craftsmenship Clothing", "Dice", "Deck of Cards", "10 Gold"};
                    return rogue;

                case "Runebearer" :
                    String [] rune = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Crossbow", "10 Bolts", "Leather Jerkin", "Healing Draught", "Lucky Charm"};
                    return rune;

                case "Scribe" :
                    String [] scribe = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Knife", "A Pair of Candles", "Wax", "5 matches", "Illuminated Book", "Writing Kit"};
                    return scribe;

                case "Seaman" :
                    String [] sea = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jerkin", "Bottle of Poor Craftsmenship Spirits"};
                    return sea;

                case "Servant" :
                    String [] serve = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "One Set of Good Craftsmenship Clothing", "Pewter Tankard", "Tinderbox", "Storm Lantern", "Lamp Oil"};
                    return serve;

                case "Shieldbreaker" :
                    String [] shield = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Crossbow", "10 bolts", "Mail Coat", "Leather Jack", "Leather Leggings", "Shield", "Grappling Hook", "10 Yards of Rope", "Water Skin"};
                    return shield;

                case "Smuggler" :
                    String [] smug = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "2 Torches", "Draft Horse", "Cart", "Rowing Boat"};
                    return smug;

                case "Soldier" :
                    String [] soldier = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Halberd",  "Firearm", "10 shots", "Shield" , "Full Leather Armour", "Uniform"};
                    return soldier;

                case "Squire" :
                    String [] squire = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Demilance", "Mail Shirt", "Mail Coif", "Leather Jack", "Shield", "Horse", "Saddle", "Harness"};
                    return squire;

                case "Student" :
                    String [] student = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Two Textbooks corresponding to Knowledge Skills", "Writing Kit"};
                    return student;

                case "Thief" :
                    String [] thief = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jerkin", "Sack", "Lockpicks", "10 Yards of Rope"};
                    return thief;

                case "Thug" :
                    String [] thug = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Knuckle-dusters","Mail Shirt", "Leather Jerkin"};
                    return thug;

                case "Toll Keeper" :
                    String [] toll = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Chest", "Crossbow", "10 Bolts", "Mail Shirt", "Leather Jerkin", "Shield", "10 Gold"};
                    return toll;

                case "Tomb Robber" :
                    String [] tomb = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "Crowbar", "Lantern", "Lamp Oil", "10 Yards of Rope", "2 Sacks"};
                    return tomb;

                case  "Tradesman" :
                    String [] trades = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jerkin", "10 Gold"};
                    return trades;

                case "Troll Slayer" :
                    String [] troll = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Great Weapon", "Leather Jerkin", "One Bottle of Poor Craftsmenship Spirits"};
                    return troll;

                case "Vagabond" :
                    String [] vaga = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Back Pack", "Rations (1 week)", "Tent", "Water Skin"};
                    return vaga;

                case "Valet" :
                    String [] valet = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Cologne", "Purse", "Two sets of Best Craftsmenship Clothing", "Uniform"};
                    return valet;

                case "Watchman" :
                    String [] watch = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "Lantern and Pole", "Lamp Oil", "Uniform"};
                    return watch;

                case "Woodsman" :
                    String [] woods = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Great Weapon(Two-handed Axe)", "Leather Jack", "Antitoxin Kit"};
                    return woods;

                case "Zealot" :
                    String [] zealot = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Flail", "Morning Star", "Leather Jack", "Bottle of Good Craftsmenship Spirits"};
                    return zealot;
            }
        }
        else if (race.equalsIgnoreCase("elf"))
        {
            switch(career){
                case "Agitator" :
                    String [] agitator = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "One set of Good Craftsmenship Clothes", "20 leaflets for String []ious causes"};
                    return agitator;
                case "Apprentice Wizard" :
                    String [] apprentice = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Quarter Staff", "Backpack", "Printed Book"};
                    return apprentice;
                case "Bailiff" :
                    String [] bailiff = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "Leather Skullcap", "Riding Horse", "Saddle", "Harness", "One Set of Good Craftsmenship Clothing"};
                    return bailiff;
                case  "Barber-Surgeon" :
                    String [] barber = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Trade Tools (Barber-Surgeon)"};
                    return barber;
                case "Boatman" :
                    String [] boatman = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "Row Boat"};
                    return boatman;
                case "Bodyguard" :
                    String [] bodyguard = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Buckler", "Knuckle-dusters", "A Pair of Throwing Axes", "Throwing Knives", "Leather Jack"};
                    return bodyguard;
                case "Bone Picker" :
                    String [] bone = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Cart", "3 Sacks"};
                    return bone;
                case "Bounty Hunter" :
                    String [] bounty = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Crossbow", "10 bolts", "Net", "Leather Jerkin", "Leather Skullcap", "Manacles", "10 Yards of Rope"};
                    return bounty;
                case "Burgher" :
                    String [] burg = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Abacus", "Lantern", "One Set of Good Clothing"};
                    return burg;
                case "Camp Follower" :
                    String [] camp = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Lucky Charm", "Trade Tools", "Pouch", "Tent"};
                    return camp;
                case "Charcoal-Burner" :
                    String [] charcoal = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "3 Torches", "Tinderbox", "Hatchet"};
                    return charcoal;
                case "Coachman" :
                    String [] coach = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Blunderbuss", "Powder/ammunition for 10 shots", "Mail Shirt", "Leather Jack", "Instrument (Coach Horn)"};
                    return coach;
                case "Entertainer" :
                    String [] entertain = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jerkin", "Instrument (any)", "Trade Tools (Performer)", "3 Throwing Knives", "2 Throwing Axes", "Costume", "One Set of Good Craftsmenship Clothes"};
                    return entertain;
                case "Envoy" :
                    String [] envoy = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "2 sets of Good Craftsmenship Clothes", "Writing Kit"};
                    return envoy;
                case "Estalian Diestro" :
                    String [] estal = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Foil", "Rapier", "One set of Best Craftsmenship Clothes", "Perfume", "Cologne", "Healing Draught"};
                    return estal;
                case "Ferryman" :
                    String [] ferry = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Crossbow", "10 bolts", "Blunderbuss", "Powder/ammunition of 10 shots", "Leather Jack"};
                    return ferry;
                case "Fieldwarden" :
                    String [] field = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Sling with Ammunition", "Lantern", "Lamp Oil", "Spade", "Pony", "Saddle", "Harness"};
                    return field;
                case "Fisherman" :
                    String [] fisher = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Fish Hook and Line", "Spear"};
                    return fisher;
                case "Grave Robber" :
                    String [] grave = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Lantern", "Lamp Oil", "Pick", "Sack", "Spade"};
                    return grave;
                case "Hedge Wizard" :
                    String [] hedge = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Healing Draught", "Hood"};
                    return hedge;
                case "Hunter" :
                    String [] hunt = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Longbow", "10 Arrows", "2 Animal Traps", "Antitoxin Kit"};
                    return hunt;
                case "Initiate" :
                    String [] init = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Religious Symbol", "Robes"};
                    return init;
                case "Jailer" :
                    String [] jail = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Bottle of Common Wine", "Tankard", "Bola", "Lasso", "Net"};
                    return jail;
                case "Kislevite Kossar" :
                    String [] kislev = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Bow", "10 Arrows", "Twohanded Axe", "Mail Coat", "Leather Jack", "Leather Leggings"};
                    return kislev;
                case "Kithband Warrior" :
                    String [] kith = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Elfbow", "10 Arrows", "Leather Jack"};
                    return kith;
                case "Marine" :
                    String [] marine = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Bow", "Crossbow", "10 Arrows", "10 Bolts", "Leather Jack", "Shield", "Grappling Hook", "10 Yards of Rope"};
                    return marine;
                case "Mercenary" :
                    String [] merc = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Crossbow", "10 Bolts", "Shield", "Mail Shirt", "Leather Jack", "Healing Draught"};
                    return merc;
                case "Messenger" :
                    String [] mess = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "Map Case", "Riding Horse", "Saddle", "Harness", "Shield"};
                    return mess;
                case "Militiaman" :
                    String [] militia = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Halberd", "Bow", "10 Arrows", "Leather Jack", "Leather Skullcap", "Uniform"};
                    return militia;
                case "Miner" :
                    String [] miner = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Two-handed Pick", "Leather Jack", "Pick, Spade", "Storm Lantern", "Lamp Oi"};
                    return miner;
                case "Noble" :
                    String [] noble = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Foil", "Main Gauche", "Noble’s Garb", "Riding Horse", "Saddle", "Harness", "10 Gold", "Jewellery worth 6d10 gc"};
                    return noble;
                case "Norse Berserker" :
                    String [] norse = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jerkin", "Bottle of Spirits", "Great Weapon", "Shield"};
                    return norse;
                case "Outlaw" :
                    String [] outlaw = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack", "Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Bow", "10 Arrows", "Leather Jerkin", "Shield"};
                    return outlaw;
                case "Outrider" :
                    String [] outrider = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Bow", "Crossbow", "10 Arrows", "10 Bolts", "Net", "Whip", "Lasso","Leather Jack", "Shield", "10 Yards of Rope", "Riding Horse", "Saddle", "Harness"};
                    return outrider;
                case "Peasant" :
                    String [] peasant = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Sling", "Quarter Staff", "Leather Flask"};
                    return peasant;
                case "Pit Fighter" :
                    String [] pit = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Flail",  "Great Weapon", "Knuckle-duster", "Shield", "Buckler", "Mail Shirt", "Leather Jack"};
                    return pit;
                case "Protagonist" :
                    String [] protag = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Mail Shirt",  "Leather Jack", "Shield", "Riding Horse", "Saddle", "Harness"};
                    return protag;
                case "Rat Catcher" :
                    String [] rat = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Sling with Ammunition", "4 Animal Traps", "Pole with 10 dead rats", "Small but Vicious Dog"};
                    return rat;
                case "Roadwarden" :
                    String [] road = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Pistol", "10 Firearm Balls and Gunpowder", "Mail Shirt", "Leather Jack", "Shield", "10 Yards of Rope", "Light Warhorse", "Saddle", "Harness"};
                    return road;
                case "Rogue" :
                    String [] rogue = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "One set of Best Craftsmenship Clothing", "Dice", "Deck of Cards", "10 Gold"};
                    return rogue;
                case "Runebearer" :
                    String [] rune = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Crossbow", "10 Bolts", "Leather Jerkin", "Healing Draught", "Lucky Charm"};
                    return rune;
                case "Scribe" :
                    String [] scribe = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Knife", "A Pair of Candles", "Wax", "5 matches", "Illuminated Book", "Writing Kit"};
                    return scribe;
                case "Seaman" :
                    String [] sea = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jerkin", "Bottle of Poor Craftsmenship Spirits"};
                    return sea;
                case "Servant" :
                    String [] serve = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "One Set of Good Craftsmenship Clothing", "Pewter Tankard", "Tinderbox", "Storm Lantern", "Lamp Oil"};
                    return serve;
                case "Shieldbreaker" :
                    String [] shield = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Crossbow", "10 bolts", "Mail Coat", "Leather Jack", "Leather Leggings", "Shield", "Grappling Hook", "10 Yards of Rope", "Water Skin"};
                    return shield;
                case "Smuggler" :
                    String [] smug = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "2 Torches", "Draft Horse", "Cart", "Rowing Boat"};
                    return smug;
                case "Soldier" :
                    String [] soldier = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Halberd",  "Firearm", "10 shots", "Shield" , "Full Leather Armour", "Uniform"};
                    return soldier;
                case "Squire" :
                    String [] squire = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Demilance", "Mail Shirt", "Mail Coif", "Leather Jack", "Shield", "Horse", "Saddle", "Harness"};
                    return squire;
                case "Student" :
                    String [] student = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Two Textbooks corresponding to Knowledge Skills", "Writing Kit"};
                    return student;
                case "Thief" :
                    String [] thief = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jerkin", "Sack", "Lockpicks", "10 Yards of Rope"};
                    return thief;
                case "Thug" :
                    String [] thug = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Knuckle-dusters","Mail Shirt", "Leather Jerkin"};
                    return thug;
                case "Toll Keeper" :
                    String [] toll = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Chest", "Crossbow", "10 Bolts", "Mail Shirt", "Leather Jerkin", "Shield", "10 Gold"};
                    return toll;
                case "Tomb Robber" :
                    String [] tomb = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "Crowbar", "Lantern", "Lamp Oil", "10 Yards of Rope", "2 Sacks"};
                    return tomb;
                case  "Tradesman" :
                    String [] trades = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jerkin", "10 Gold"};
                    return trades;
                case "Troll Slayer" :
                    String [] troll = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Great Weapon", "Leather Jerkin", "One Bottle of Poor Craftsmenship Spirits"};
                    return troll;
                case "Vagabond" :
                    String [] vaga = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Back Pack", "Rations (1 week)", "Tent", "Water Skin"};
                    return vaga;
                case "Valet" :
                    String [] valet = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Cologne", "Purse", "Two sets of Best Craftsmenship Clothing", "Uniform"};
                    return valet;
                case "Watchman" :
                    String [] watch = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "Lantern and Pole", "Lamp Oil", "Uniform"};
                    return watch;
                case "Woodsman" :
                    String [] woods = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Great Weapon(Two-handed Axe)", "Leather Jack", "Antitoxin Kit"};
                    return woods;
                case "Zealot" :
                    String [] zealot = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Flail", "Morning Star", "Leather Jack", "Bottle of Good Craftsmenship Spirits"};
                    return zealot;
            }
        }
        else if (race.equalsIgnoreCase("dwarf"))
        {
            switch(career){
                case "Agitator" :
                    String [] agitator = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "One set of Good Craftsmenship Clothes", "20 leaflets for String []ious causes"};
                    return agitator;
                case "Apprentice Wizard" :
                    String [] apprentice = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Quarter Staff", "Backpack", "Printed Book"};
                    return apprentice;
                case "Bailiff" :
                    String [] bailiff = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "Leather Skullcap", "Riding Horse", "Saddle", "Harness", "One Set of Good Craftsmenship Clothing"};
                    return bailiff;
                case  "Barber-Surgeon" :
                    String [] barber = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Trade Tools (Barber-Surgeon)"};
                    return barber;
                case "Boatman" :
                    String [] boatman = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "Row Boat"};
                    return boatman;
                case "Bodyguard" :
                    String [] bodyguard = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Buckler", "Knuckle-dusters", "A Pair of Throwing Axes", "Throwing Knives", "Leather Jack"};
                    return bodyguard;
                case "Bone Picker" :
                    String [] bone = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Cart", "3 Sacks"};
                    return bone;
                case "Bounty Hunter" :
                    String [] bounty = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Crossbow", "10 bolts", "Net", "Leather Jerkin", "Leather Skullcap", "Manacles", "10 Yards of Rope"};
                    return bounty;
                case "Burgher" :
                    String [] burg = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Abacus", "Lantern", "One Set of Good Clothing"};
                    return burg;
                case "Camp Follower" :
                    String [] camp = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Lucky Charm", "Trade Tools", "Pouch", "Tent"};
                    return camp;
                case "Charcoal-Burner" :
                    String [] charcoal = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "3 Torches", "Tinderbox", "Hatchet"};
                    return charcoal;
                case "Coachman" :
                    String [] coach = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Blunderbuss", "Powder/ammunition for 10 shots", "Mail Shirt", "Leather Jack", "Instrument (Coach Horn)"};
                    return coach;
                case "Entertainer" :
                    String [] entertain = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jerkin", "Instrument (any)", "Trade Tools (Performer)", "3 Throwing Knives", "2 Throwing Axes", "Costume", "One Set of Good Craftsmenship Clothes"};
                    return entertain;
                case "Envoy" :
                    String [] envoy = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "2 sets of Good Craftsmenship Clothes", "Writing Kit"};
                    return envoy;
                case "Estalian Diestro" :
                    String [] estal = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Foil", "Rapier", "One set of Best Craftsmenship Clothes", "Perfume", "Cologne", "Healing Draught"};
                    return estal;
                case "Ferryman" :
                    String [] ferry = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Crossbow", "10 bolts", "Blunderbuss", "Powder/ammunition of 10 shots", "Leather Jack"};
                    return ferry;
                case "Fieldwarden" :
                    String [] field = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Sling with Ammunition", "Lantern", "Lamp Oil", "Spade", "Pony", "Saddle", "Harness"};
                    return field;
                case "Fisherman" :
                    String [] fisher = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Fish Hook and Line", "Spear"};
                    return fisher;
                case "Grave Robber" :
                    String [] grave = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Lantern", "Lamp Oil", "Pick", "Sack", "Spade"};
                    return grave;
                case "Hedge Wizard" :
                    String [] hedge = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Healing Draught", "Hood"};
                    return hedge;
                case "Hunter" :
                    String [] hunt = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Longbow", "10 Arrows", "2 Animal Traps", "Antitoxin Kit"};
                    return hunt;
                case "Initiate" :
                    String [] init = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Religious Symbol", "Robes"};
                    return init;
                case "Jailer" :
                    String [] jail = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Bottle of Common Wine", "Tankard", "Bola", "Lasso", "Net"};
                    return jail;
                case "Kislevite Kossar" :
                    String [] kislev = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Bow", "10 Arrows", "Twohanded Axe", "Mail Coat", "Leather Jack", "Leather Leggings"};
                    return kislev;
                case "Kithband Warrior" :
                    String [] kith = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Elfbow", "10 Arrows", "Leather Jack"};
                    return kith;
                case "Marine" :
                    String [] marine = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Bow", "Crossbow", "10 Arrows", "10 Bolts", "Leather Jack", "Shield", "Grappling Hook", "10 Yards of Rope"};
                    return marine;
                case "Mercenary" :
                    String [] merc = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Crossbow", "10 Bolts", "Shield", "Mail Shirt", "Leather Jack", "Healing Draught"};
                    return merc;
                case "Messenger" :
                    String [] mess = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "Map Case", "Riding Horse", "Saddle", "Harness", "Shield"};
                    return mess;
                case "Militiaman" :
                    String [] militia = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Halberd", "Bow", "10 Arrows", "Leather Jack", "Leather Skullcap", "Uniform"};
                    return militia;
                case "Miner" :
                    String [] miner = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Two-handed Pick", "Leather Jack", "Pick, Spade", "Storm Lantern", "Lamp Oi"};
                    return miner;
                case "Noble" :
                    String [] noble = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Foil", "Main Gauche", "Noble’s Garb", "Riding Horse", "Saddle", "Harness", "10 Gold", "Jewellery worth 6d10 gc"};
                    return noble;
                case "Norse Berserker" :
                    String [] norse = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jerkin", "Bottle of Spirits", "Great Weapon", "Shield"};
                    return norse;
                case "Outlaw" :
                    String [] outlaw = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Bow", "10 Arrows", "Leather Jerkin", "Shield"};
                    return outlaw;
                case "Outrider" :
                    String [] outrider = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Bow", "Crossbow", "10 Arrows", "10 Bolts", "Net", "Whip", "Lasso","Leather Jack", "Shield", "10 Yards of Rope", "Riding Horse", "Saddle", "Harness"};
                    return outrider;
                case "Peasant" :
                    String [] peasant = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Sling", "Quarter Staff", "Leather Flask"};
                    return peasant;
                case "Pit Fighter" :
                    String [] pit = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Flail",  "Great Weapon", "Knuckle-duster", "Shield", "Buckler", "Mail Shirt", "Leather Jack"};
                    return pit;
                case "Protagonist" :
                    String [] protag = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Mail Shirt",  "Leather Jack", "Shield", "Riding Horse", "Saddle", "Harness"};
                    return protag;
                case "Rat Catcher" :
                    String [] rat = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Sling with Ammunition", "4 Animal Traps", "Pole with 10 dead rats", "Small but Vicious Dog"};
                    return rat;
                case "Roadwarden" :
                    String [] road = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Pistol", "10 Firearm Balls and Gunpowder", "Mail Shirt", "Leather Jack", "Shield", "10 Yards of Rope", "Light Warhorse", "Saddle", "Harness"};
                    return road;
                case "Rogue" :
                    String [] rogue = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "One set of Best Craftsmenship Clothing", "Dice", "Deck of Cards", "10 Gold"};
                    return rogue;
                case "Runebearer" :
                    String [] rune = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Crossbow", "10 Bolts", "Leather Jerkin", "Healing Draught", "Lucky Charm"};
                    return rune;
                case "Scribe" :
                    String [] scribe = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Knife", "A Pair of Candles", "Wax", "5 matches", "Illuminated Book", "Writing Kit"};
                    return scribe;
                case "Seaman" :
                    String [] sea = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jerkin", "Bottle of Poor Craftsmenship Spirits"};
                    return sea;
                case "Servant" :
                    String [] serve = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "One Set of Good Craftsmenship Clothing", "Pewter Tankard", "Tinderbox", "Storm Lantern", "Lamp Oil"};
                    return serve;
                case "Shieldbreaker" :
                    String [] shield = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Crossbow", "10 bolts", "Mail Coat", "Leather Jack", "Leather Leggings", "Shield", "Grappling Hook", "10 Yards of Rope", "Water Skin"};
                    return shield;
                case "Smuggler" :
                    String [] smug = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "2 Torches", "Draft Horse", "Cart", "Rowing Boat"};
                    return smug;
                case "Soldier" :
                    String [] soldier = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Halberd",  "Firearm", "10 shots", "Shield" , "Full Leather Armour", "Uniform"};
                    return soldier;
                case "Squire" :
                    String [] squire = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Demilance", "Mail Shirt", "Mail Coif", "Leather Jack", "Shield", "Horse", "Saddle", "Harness"};
                    return squire;
                case "Student" :
                    String [] student = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Two Textbooks corresponding to Knowledge Skills", "Writing Kit"};
                    return student;
                case "Thief" :
                    String [] thief = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jerkin", "Sack", "Lockpicks", "10 Yards of Rope"};
                    return thief;
                case "Thug" :
                    String [] thug = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Knuckle-dusters","Mail Shirt", "Leather Jerkin"};
                    return thug;
                case "Toll Keeper" :
                    String [] toll = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Chest", "Crossbow", "10 Bolts", "Mail Shirt", "Leather Jerkin", "Shield", "10 Gold"};
                    return toll;
                case "Tomb Robber" :
                    String [] tomb = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "Crowbar", "Lantern", "Lamp Oil", "10 Yards of Rope", "2 Sacks"};
                    return tomb;
                case  "Tradesman" :
                    String [] trades = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jerkin", "10 Gold"};
                    return trades;
                case "Troll Slayer" :
                    String [] troll = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Great Weapon", "Leather Jerkin", "One Bottle of Poor Craftsmenship Spirits"};
                    return troll;
                case "Vagabond" :
                    String [] vaga = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Back Pack", "Rations (1 week)", "Tent", "Water Skin"};
                    return vaga;
                case "Valet" :
                    String [] valet = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Cologne", "Purse", "Two sets of Best Craftsmenship Clothing", "Uniform"};
                    return valet;
                case "Watchman" :
                    String [] watch = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "Lantern and Pole", "Lamp Oil", "Uniform"};
                    return watch;
                case "Woodsman" :
                    String [] woods = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Great Weapon(Two-handed Axe)", "Leather Jack", "Antitoxin Kit"};
                    return woods;
                case "Zealot" :
                    String [] zealot = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Flail", "Morning Star", "Leather Jack", "Bottle of Good Craftsmenship Spirits"};
                    return zealot;
            }

        }
        else
        {
            switch(career){
                case "Agitator" :
                    String [] agitator = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "One set of Good Craftsmenship Clothes", "20 leaflets for String []ious causes"};
                    return agitator;
                case "Apprentice Wizard" :
                    String [] apprentice = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Quarter Staff", "Backpack", "Printed Book"};
                    return apprentice;
                case "Bailiff" :
                    String [] bailiff = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "Leather Skullcap", "Riding Horse", "Saddle", "Harness", "One Set of Good Craftsmenship Clothing"};
                    return bailiff;
                case  "Barber-Surgeon" :
                    String [] barber = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Trade Tools (Barber-Surgeon)"};
                    return barber;
                case "Boatman" :
                    String [] boatman = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "Row Boat"};
                    return boatman;
                case "Bodyguard" :
                    String [] bodyguard = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Buckler", "Knuckle-dusters", "A Pair of Throwing Axes", "Throwing Knives", "Leather Jack"};
                    return bodyguard;
                case "Bone Picker" :
                    String [] bone = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Cart", "3 Sacks"};
                    return bone;
                case "Bounty Hunter" :
                    String [] bounty = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Crossbow", "10 bolts", "Net", "Leather Jerkin", "Leather Skullcap", "Manacles", "10 Yards of Rope"};
                    return bounty;
                case "Burgher" :
                    String [] burg = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Abacus", "Lantern", "One Set of Good Clothing"};
                    return burg;
                case "Camp Follower" :
                    String [] camp = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Lucky Charm", "Trade Tools", "Pouch", "Tent"};
                    return camp;
                case "Charcoal-Burner" :
                    String [] charcoal = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "3 Torches", "Tinderbox", "Hatchet"};
                    return charcoal;
                case "Coachman" :
                    String [] coach = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Blunderbuss", "Powder/ammunition for 10 shots", "Mail Shirt", "Leather Jack", "Instrument (Coach Horn)"};
                    return coach;
                case "Entertainer" :
                    String [] entertain = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jerkin", "Instrument (any)", "Trade Tools (Performer)", "3 Throwing Knives", "2 Throwing Axes", "Costume", "One Set of Good Craftsmenship Clothes"};
                    return entertain;
                case "Envoy" :
                    String [] envoy = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "2 sets of Good Craftsmenship Clothes", "Writing Kit"};
                    return envoy;
                case "Estalian Diestro" :
                    String [] estal = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Foil", "Rapier", "One set of Best Craftsmenship Clothes", "Perfume", "Cologne", "Healing Draught"};
                    return estal;
                case "Ferryman" :
                    String [] ferry = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Crossbow", "10 bolts", "Blunderbuss", "Powder/ammunition of 10 shots", "Leather Jack"};
                    return ferry;
                case "Fieldwarden" :
                    String [] field = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Sling with Ammunition", "Lantern", "Lamp Oil", "Spade", "Pony", "Saddle", "Harness"};
                    return field;
                case "Fisherman" :
                    String [] fisher = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Fish Hook and Line", "Spear"};
                    return fisher;
                case "Grave Robber" :
                    String [] grave = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Lantern", "Lamp Oil", "Pick", "Sack", "Spade"};
                    return grave;
                case "Hedge Wizard" :
                    String [] hedge = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Healing Draught", "Hood"};
                    return hedge;
                case "Hunter" :
                    String [] hunt = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Longbow", "10 Arrows", "2 Animal Traps", "Antitoxin Kit"};
                    return hunt;
                case "Initiate" :
                    String [] init = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Religious Symbol", "Robes"};
                    return init;
                case "Jailer" :
                    String [] jail = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Bottle of Common Wine", "Tankard", "Bola", "Lasso", "Net"};
                    return jail;
                case "Kislevite Kossar" :
                    String [] kislev = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Bow", "10 Arrows", "Twohanded Axe", "Mail Coat", "Leather Jack", "Leather Leggings"};
                    return kislev;
                case "Kithband Warrior" :
                    String [] kith = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Elfbow", "10 Arrows", "Leather Jack"};
                    return kith;
                case "Marine" :
                    String [] marine = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Bow", "Crossbow", "10 Arrows", "10 Bolts", "Leather Jack", "Shield", "Grappling Hook", "10 Yards of Rope"};
                    return marine;
                case "Mercenary" :
                    String [] merc = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Crossbow", "10 Bolts", "Shield", "Mail Shirt", "Leather Jack", "Healing Draught"};
                    return merc;
                case "Messenger" :
                    String [] mess = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "Map Case", "Riding Horse", "Saddle", "Harness", "Shield"};
                    return mess;
                case "Militiaman" :
                    String [] militia = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Halberd", "Bow", "10 Arrows", "Leather Jack", "Leather Skullcap", "Uniform"};
                    return militia;
                case "Miner" :
                    String [] miner = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Two-handed Pick", "Leather Jack", "Pick, Spade", "Storm Lantern", "Lamp Oi"};
                    return miner;
                case "Noble" :
                    String [] noble = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Foil", "Main Gauche", "Noble’s Garb", "Riding Horse", "Saddle", "Harness", "10 Gold", "Jewellery worth 6d10 gc"};
                    return noble;
                case "Norse Berserker" :
                    String [] norse = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jerkin", "Bottle of Spirits", "Great Weapon", "Shield"};
                    return norse;
                case "Outlaw" :
                    String [] outlaw = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Bow", "10 Arrows", "Leather Jerkin", "Shield"};
                    return outlaw;
                case "Outrider" :
                    String [] outrider = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Bow", "Crossbow", "10 Arrows", "10 Bolts", "Net", "Whip", "Lasso","Leather Jack", "Shield", "10 Yards of Rope", "Riding Horse", "Saddle", "Harness"};
                    return outrider;
                case "Peasant" :
                    String [] peasant = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Sling", "Quarter Staff", "Leather Flask"};
                    return peasant;
                case "Pit Fighter" :
                    String [] pit = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Flail",  "Great Weapon", "Knuckle-duster", "Shield", "Buckler", "Mail Shirt", "Leather Jack"};
                    return pit;
                case "Protagonist" :
                    String [] protag = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Mail Shirt",  "Leather Jack", "Shield", "Riding Horse", "Saddle", "Harness"};
                    return protag;
                case "Rat Catcher" :
                    String [] rat = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Sling with Ammunition", "4 Animal Traps", "Pole with 10 dead rats", "Small but Vicious Dog"};
                    return rat;
                case "Roadwarden" :
                    String [] road = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Pistol", "10 Firearm Balls and Gunpowder", "Mail Shirt", "Leather Jack", "Shield", "10 Yards of Rope", "Light Warhorse", "Saddle", "Harness"};
                    return road;
                case "Rogue" :
                    String [] rogue = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "One set of Best Craftsmenship Clothing", "Dice", "Deck of Cards", "10 Gold"};
                    return rogue;
                case "Runebearer" :
                    String [] rune = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Crossbow", "10 Bolts", "Leather Jerkin", "Healing Draught", "Lucky Charm"};
                    return rune;
                case "Scribe" :
                    String [] scribe = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Knife", "A Pair of Candles", "Wax", "5 matches", "Illuminated Book", "Writing Kit"};
                    return scribe;
                case "Seaman" :
                    String [] sea = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jerkin", "Bottle of Poor Craftsmenship Spirits"};
                    return sea;
                case "Servant" :
                    String [] serve = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "One Set of Good Craftsmenship Clothing", "Pewter Tankard", "Tinderbox", "Storm Lantern", "Lamp Oil"};
                    return serve;
                case "Shieldbreaker" :
                    String [] shield = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Crossbow", "10 bolts", "Mail Coat", "Leather Jack", "Leather Leggings", "Shield", "Grappling Hook", "10 Yards of Rope", "Water Skin"};
                    return shield;
                case "Smuggler" :
                    String [] smug = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "2 Torches", "Draft Horse", "Cart", "Rowing Boat"};
                    return smug;
                case "Soldier" :
                    String [] soldier = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Halberd",  "Firearm", "10 shots", "Shield" , "Full Leather Armour", "Uniform"};
                    return soldier;
                case "Squire" :
                    String [] squire = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Demilance", "Mail Shirt", "Mail Coif", "Leather Jack", "Shield", "Horse", "Saddle", "Harness"};
                    return squire;
                case "Student" :
                    String [] student = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Two Textbooks corresponding to Knowledge Skills", "Writing Kit"};
                    return student;
                case "Thief" :
                    String [] thief = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jerkin", "Sack", "Lockpicks", "10 Yards of Rope"};
                    return thief;
                case "Thug" :
                    String [] thug = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Knuckle-dusters","Mail Shirt", "Leather Jerkin"};
                    return thug;
                case "Toll Keeper" :
                    String [] toll = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Chest", "Crossbow", "10 Bolts", "Mail Shirt", "Leather Jerkin", "Shield", "10 Gold"};
                    return toll;
                case "Tomb Robber" :
                    String [] tomb = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "Crowbar", "Lantern", "Lamp Oil", "10 Yards of Rope", "2 Sacks"};
                    return tomb;
                case  "Tradesman" :
                    String [] trades = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jerkin", "10 Gold"};
                    return trades;
                case "Troll Slayer" :
                    String [] troll = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Great Weapon", "Leather Jerkin", "One Bottle of Poor Craftsmenship Spirits"};
                    return troll;
                case "Vagabond" :
                    String [] vaga = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Back Pack", "Rations (1 week)", "Tent", "Water Skin"};
                    return vaga;
                case "Valet" :
                    String [] valet = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Cologne", "Purse", "Two sets of Best Craftsmenship Clothing", "Uniform"};
                    return valet;
                case "Watchman" :
                    String [] watch = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Leather Jack", "Lantern and Pole", "Lamp Oil", "Uniform"};
                    return watch;
                case "Woodsman" :
                    String [] woods = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Great Weapon(Two-handed Axe)", "Leather Jack", "Antitoxin Kit"};
                    return woods;
                case "Zealot" :
                    String [] zealot = {"Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold", "Flail", "Morning Star", "Leather Jack", "Bottle of Good Craftsmenship Spirits"};
                    return zealot;
            }
        }

        return basic;
    }
}
