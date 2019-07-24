package com.example.cop4331;

public class Talents
{
    public static String randomTalents()
    {
        int talent = (int)(Math.random() * 100) + 1;

        if (talent <= 4 && talent >= 1)
        {
            return "Acute Hearing";
        } else if (talent <= 9 && talent >= 5)
        {
            return "Ambidextrous";
        } else if (talent <= 13 && talent >= 10)
        {
            return "Coolheaded";
        } else if (talent <= 18 && talent >= 14)
        {
            return "Excellent Vision";
        } else if (talent <= 22 && talent >= 19)
        {
            return "Fleet Footed";
        } else if (talent <= 27 && talent >= 23)
        {
            return "Hardy";
        } else if (talent <= 31 && talent >= 28)
        {
            return "Lightning Reflexes";
        } else if (talent <= 35 && talent >= 32)
        {
            return "Luck";
        } else if (talent <= 40 && talent >= 36)
        {
            return "Marksman";
        } else if (talent <= 44 && talent >= 41)
        {
            return "Mimic";
        } else if (talent <= 49 && talent >= 45)
        {
            return "Night Vision";
        } else if (talent <= 53 && talent >= 50)
        {
            return "Resistence to Disease";
        } else if (talent <= 57 && talent >= 54)
        {
            return "Resistence to Magic";
        } else if (talent <= 61 && talent >= 58)
        {
            return "Resistence to Poison";
        } else if (talent <= 66 && talent >= 62)
        {
            return "Savvy";
        } else if (talent <= 71 && talent >= 67)
        {
            return "Sixth Sense";
        } else if (talent <= 75 && talent >= 172)
        {
            return "Strong-Minded";
        } else if (talent <= 79 && talent >= 76)
        {
            return "Sturdy";
        } else if (talent <= 83 && talent >= 80)
        {
            return "Suave";
        } else if (talent <= 87 && talent >= 84)
        {
            return "Super Numerate";
        } else if (talent <= 91 && talent >= 88)
        {
            return "Very Resilient";
        } else if (talent <= 95 && talent >= 92)
        {
            return "Very Strong";
        } else if (talent <= 100 && talent >= 96)
        {
            return "Warrior Born";
        }

        return "Craft";
    }


    public static String [] getTalents(String race, String career)
    {
        String [] basic = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Coolheaded", "Street Fighting", "Flee!", "Public Speaking"};

        if (race.equalsIgnoreCase("human"))
        {
            switch(career){
                case "Agitator" :
                    String [] agitator = {randomTalents(), randomTalents(), "Coolheaded", "Street Fighting", "Flee!", "Public Speaking"};
                    return agitator;

                case "Apprentice Wizard" :
                    String [] apprentice = {randomTalents(), randomTalents(), "Aethyric Attunement", "Fast Hands", "Petty Magic(Arcane)", "Savvy", "Very Resilient"};
                    return apprentice;

                case "Bailiff" :
                    String [] bailiff = {randomTalents(), randomTalents(), "Etiquette", "Super Numerate", "Public Speaking"};
                    return bailiff;

                case  "Barber-Surgeon" :
                    String [] barber = {randomTalents(), randomTalents(), "Resistence to Disease", "Savvy", "Suave", "Very Resilient", "Surgery"};
                    return barber;

                case "Boatman" :
                    String [] boatman = {randomTalents(), randomTalents(), "Orientation", "Seasoned Traveler"};
                    return boatman;

                case "Bodyguard" :
                    String [] bodyguard = {randomTalents(), randomTalents(), "Disarm", "Quick Draw", "Specialist Weapon Group(Parrying)", "Specialist Weapon Group(Throwing)"};
                    return bodyguard;

                case "Bone Picker" :
                    String [] bone = {randomTalents(), randomTalents(), "Coolheaded","Streetwise", "Hardy", "Resistance to Disease"};
                    return bone;

                case "Bounty Hunter" :
                    String [] bounty = {randomTalents(), randomTalents(), "Marksman", "Strike to Stun", "Rover", "Specialist Weapon Group(Entangling)", "Sharpshooter", "Strike Mighty Blow"};
                    return bounty;

                case "Burgher" :
                    String [] burg = {randomTalents(), randomTalents(), "Dealmaker", "Savvy", "Suave"};
                    return burg;

                case "Camp Follower" :
                    String [] camp = {randomTalents(), randomTalents(), "Dealmaker", "Street Fighter", "Flee!", "Hardy", "Suave", "Resistance to Disease", "Seasoned Traveller"};
                    return camp;

                case "Charcoal-Burner" :
                    String [] charcoal = {randomTalents(), randomTalents(), "Savvy", "Very Strong"};
                    return charcoal;

                case "Coachman" :
                    String [] coach = {randomTalents(), randomTalents(), "Quick Draw", "Seasoned Traveller", "Specialist Weapon Group(Gunpowder)"};
                    return coach;

                case "Entertainer" :
                    String [] entertain = {randomTalents(), randomTalents(), "Contortionist", "Lightning Reflexes", "Mimic", "Public Speaking", "Quick Draw", "Sharpshooter", "Specialist Weapon Group(Throwing)", "Trick Riding", "Very Strong", "Wrestling"};
                    return entertain;

                case "Envoy" :
                    String [] envoy = {randomTalents(), randomTalents(), "Deal Maker", "Seasoned Traveller"};
                    return envoy;

                case "Estalian Diestro" :
                    String [] estal = {randomTalents(), randomTalents(), "Lightning Reflexes", "Swashbuckler", "Quick Draw", "Strike to Injure", "Specialist Weapon Group(Fencing)", "Strike Mighty Blow"};
                    return estal;

                case "Ferryman" :
                    String [] ferry = {randomTalents(), randomTalents(), "Marksman", "Suave", "Specialist Weapon Group(Gunpowder)", "Street Fighting"};
                    return ferry;

                case "Fieldwarden" :
                    String [] field = {randomTalents(), randomTalents(), "Fleet Footed", "Savvy", "Mighty Shot", "Rapid Reload", "Rover", "Quick Draw"};
                    return field;

                case "Fisherman" :
                    String [] fisher = {randomTalents(), randomTalents(), "Hardy", "Savvy", "Orientation", "Street Fighting"};
                    return fisher;

                case "Grave Robber":
                    String [] grave = {randomTalents(), randomTalents(), "Flee!", "Resistance to Disease", "Streetwise", "Strongminded"};
                    return grave;

                case "Hedge Wizard":
                    String [] hedge = {randomTalents(), randomTalents(), "Hedge Magic", "Petty Magic(Hedge)"};
                    return hedge;

                case "Hunter":
                    String [] hunt = {randomTalents(), randomTalents(), "Hardy", "Specialist Weapon Group(Longbow)", "Lightning Reflexes", "Very Resilient", "Marksman", "Rover", "Rapid Reload"};
                    return hunt;

                case "Initiate":
                    String [] init = {randomTalents(), randomTalents(), "Lightning Reflexes", "Very Strong", "Public Speaking", "Suave", "Warrior Born"};
                    return init;

                case "Jailer" :
                    String [] jail = {randomTalents(), randomTalents(), "Resistance to Disease", "Resistance to Poison", "Specialist Weapon Group(Entangling)", "Wrestling"};
                    return jail;

                case "Kislevite Kossar" :
                    String [] kislev = {randomTalents(), randomTalents(), "Specialist Weapon Group(Two-handed)", "Strike to Injure"};
                    return kislev;

                case "Kithband Warrior" :
                    String [] kith = {randomTalents(), randomTalents(), "Marksman", "Rover", "Rapid Reload", "Warrior Born"};
                    return kith;

                case "Marine" :
                    String [] marine = {randomTalents(), randomTalents(), "Disarm", "Quick Draw", "Strike Mighty Blow", "Strike to Stun"};
                    return marine;

                case "Mercenary" :
                    String [] merc = {randomTalents(), randomTalents(), "Disarm", "Quick Draw", "Rapid Reload", "Strike Mighty Blow", "Sharpshooter", "Strike to Stun"};
                    return merc;

                case "Messenger" :
                    String [] mess = {randomTalents(), randomTalents(), "Orientation", "Seasoned Traveller"};
                    return mess;

                case "Militiaman" :
                    String [] militia = {randomTalents(), randomTalents(), "Specialist Weapon Group(Two-handed)", "Rapid Reload", "Strike Mighty Blow"};
                    return militia;

                case "Miner" :
                    String [] miner = {randomTalents(), randomTalents(), "Orientation", "Specialist Weapon Group(Two-handed)", "Very Resilient", "Warrior Born"};
                    return miner;

                case "Noble" :
                    String [] noble = {randomTalents(), randomTalents(), "Etiquette", "Luck", "Public Speaking", "Savvy", "Specialist Weapon(Fencing)", "Schemer", "Specialist Weapon(Parrying)"};
                    return noble;

                case "Norse Berserker" :
                    String [] norse = {randomTalents(), randomTalents(), "Frenzy", "Menacing", "Quick Draw", "Specialist Weapon Group(Two-handed)"};
                    return norse;

                case "Outlaw" :
                    String [] outlaw = {randomTalents(), randomTalents(), "Rover", "Streetwise", "Sharpshooter", "Strike to Stun"};
                    return outlaw;

                case "Outrider" :
                    String [] outrider = {randomTalents(), randomTalents(), "Coolheaded", "Very Strong", "Orientation", "Specialist Weapon Group(Entangling)"};
                    return outrider;

                case "Peasant" :
                    String [] peasant = {randomTalents(), randomTalents(), "Hardy", "Rover", "Flee!", "Specialist Weapon Group(Sling)"};
                    return peasant;

                case "Pit Fighter" :
                    String [] pit = {randomTalents(), randomTalents(), "Disarm", "Wrestling", "Quick Draw", "Strike to Injure", "Specialist Weapon Group(Flail)", "Specialist Weapon Group(Parrying)", "Specialist Weapon Group(Two-handed)", "Strike Mighty Blow", "Very Strong", "Strong-minded"};
                    return pit;

                case "Protagonist" :
                    String [] protag = {randomTalents(), randomTalents(), "Disarm", "Quick Draw", "Menacing", "Suave", "Street Fighting", "Strike Mighty Blow", "Strike to Injure", "Strike to Stun"};
                    return protag;

                case "Rat Catcher" :
                    String [] rat = {randomTalents(), randomTalents(), "Resistance to Disease", "Resistance to Poison", "Specialist Weapon Group(Sling)", "Tunnel Rat"};
                    return rat;

                case "Roadwarden" :
                    String [] road = {randomTalents(), randomTalents(), "Quick Draw", "Rapid Reload", "Specialist Weapons Group(Gunpowder)"};
                    return road;

                case "Rogue" :
                    String [] rogue = {randomTalents(), randomTalents(), "Flee!", "Streetwise", "Luck", "Sixth Sense", "Public Speaking"};
                    return rogue;

                case "Runebearer" :
                    String [] rune = {randomTalents(), randomTalents(), "Flee!", "Fleet Footed", "Sixth Sense", "Orientation", "Rapid Reload", "Very Resilient", "Very Strong"};
                    return rune;

                case "Scribe" :
                    String [] scribe = {randomTalents(), randomTalents(), "Linguistics"};
                    return scribe;

                case "Seaman" :
                    String [] sea = {randomTalents(), randomTalents(), "Hardy", "Street Fighting", "Seasoned Traveller", "Strike Mighty Blow", "Swashbuckler"};
                    return sea;

                case "Servant" :
                    String [] serve = {randomTalents(), randomTalents(), "Acute Hearing", "Flee!", "Etiquette", "Hardy", "Lightning Reflexes", "Very Resilient"};
                    return serve;

                case "Shieldbreaker" :
                    String [] shield = {randomTalents(), randomTalents(), "Acute Hearing", "Flee!", "Etiquette", "Hardy", "Lightning Reflexes", "Very Resilient"};
                    return shield;

                case "Smuggler" :
                    String [] smug = {randomTalents(), randomTalents(), "Dealmaker", "Streetwise"};
                    return smug;

                case "Soldier" :
                    String [] soldider = {randomTalents(), randomTalents(), "Disarm", "Quick Draw", "Sharpshooter", "Strike Mighty Blow", "Specialist Weapon Group(Gunpowder)", "Specialist Weapon Group(Two-handed)", "Strike to Injure", "Rapid Reload", "Strike to Stun", "Mighty Shot"};
                    return soldider;

                case "Squire" :
                    String [] squire = {randomTalents(), randomTalents(), "Etiquette", "Specialist Weapon Group(Cavalry)", "Strike Mighty Blow"};
                    return squire;

                case "Student" :
                    String [] student = {randomTalents(), randomTalents(), "Etiquette", "Linguistics", "Savvy", "Suave", "Seasoned Traveller", "Super Numerate"};
                    return student;

                case "Thief" :
                    String [] thief = {randomTalents(), randomTalents(), "Alley Cat", "Streetwise", "Super Numerate", "Trapfinder"};
                    return thief;

                case "Thug" :
                    String [] thug = {randomTalents(), randomTalents(), "Coolheaded", "Lightning Reflexes", "Disarm", "Resistance to Poison", "Quick Draw", "Strike to Injure", "Wrestling", "Strike to Stun"};
                    return thug;

                case "Toll Keeper" :
                    String [] toll = {randomTalents(), randomTalents(), "Lightning Reflexes", "Marksman"};
                    return toll;

                case "Tomb Robber" :
                    String [] tomb = {randomTalents(), randomTalents(), "Luck", "Sixth Sense", "Trapfinder", "Tunnel Rat"};
                    return tomb;

                case  "Tradesman" :
                    String [] trades = {randomTalents(), randomTalents(), "Dealmaker", "Savvy"};
                    return trades;

                case "Troll Slayer" :
                    String [] troll = {randomTalents(), randomTalents(), "Disarm", "Quick Draw", "Hardy", "Lightning Reflexes", "Very Resilient", "Specialist Weapon Group(Two-handed)", "Street Fighter", "Strike Mighty Blow"};
                    return troll;

                case "Vagabond" :
                    String [] vaga = {randomTalents(), randomTalents(), "Fleet Footed", "Rover", "Marksman", "Orientation", "Seasoned Traveller"};
                    return vaga;

                case "Valet" :
                    String [] valet = {randomTalents(), randomTalents(), "Coolheaded", "Suave", "Dealmaker", "Seasoned Traveller", "Etiquette"};
                    return valet;

                case "Watchman" :
                    String [] watch = {randomTalents(), randomTalents(), "Coolheaded", "Savvy", "Disarm", "Street Fighting", "Strike Mighty Blow", "Strike to Stun"};
                    return watch;

                case "Woodsman" :
                    String [] woods = {randomTalents(), randomTalents(), "Fleet Footed", "Very Resilient", "Rover", "Specialist Weapon Group(Two-handed)"};
                    return woods;

                case "Zealot" :
                    String [] zealot = {randomTalents(), randomTalents(), "Coolheaded", "Very Strong", "Hardy", "Suave", "Public Speaking", "Specialist Weapon Group(Flail)"};
                    return zealot;
            }

        }
        else if (race.equalsIgnoreCase("elf"))
        {
            switch(career){
                case "Agitator" :
                    String [] agitator = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Coolheaded", "Street Fighting", "Flee!", "Public Speaking"};
                    return agitator;

                case "Apprentice Wizard" :
                    String [] apprentice = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Aethyric Attunement", "Fast Hands", "Petty Magic(Arcane)", "Savvy", "Very Resilient"};
                    return apprentice;

                case "Bailiff" :
                    String [] bailiff = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Etiquette", "Super Numerate", "Public Speaking"};
                    return bailiff;

                case  "Barber-Surgeon" :
                    String [] barber = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Resistence to Disease", "Savvy", "Suave", "Very Resilient", "Surgery"};
                    return barber;

                case "Boatman" :
                    String [] boatman = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Orientation", "Seasoned Traveler"};
                    return boatman;

                case "Bodyguard" :
                    String [] bodyguard = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Disarm", "Quick Draw", "Specialist Weapon Group(Parrying)", "Specialist Weapon Group(Throwing)"};
                    return bodyguard;

                case "Bone Picker" :
                    String [] bone = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Coolheaded","Streetwise", "Hardy", "Resistance to Disease"};
                    return bone;

                case "Bounty Hunter" :
                    String [] bounty = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Marksman", "Strike to Stun", "Rover", "Specialist Weapon Group(Entangling)", "Sharpshooter", "Strike Mighty Blow"};
                    return bounty;

                case "Burgher" :
                    String [] burg = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Dealmaker", "Savvy", "Suave"};
                    return burg;

                case "Camp Follower" :
                    String [] camp = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Dealmaker", "Street Fighter", "Flee!", "Hardy", "Suave", "Resistance to Disease", "Seasoned Traveller"};
                    return camp;

                case "Charcoal-Burner" :
                    String [] charcoal = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Savvy", "Very Strong"};
                    return charcoal;

                case "Coachman" :
                    String [] coach = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Quick Draw", "Seasoned Traveller", "Specialist Weapon Group(Gunpowder)"};
                    return coach;

                case "Entertainer" :
                    String [] entertain = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Contortionist", "Lightning Reflexes", "Mimic", "Public Speaking", "Quick Draw", "Sharpshooter", "Specialist Weapon Group(Throwing)", "Trick Riding", "Very Strong", "Wrestling"};
                    return entertain;

                case "Envoy" :
                    String [] envoy = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Deal Maker", "Seasoned Traveller"};
                    return envoy;

                case "Estalian Diestro" :
                    String [] estal = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Lightning Reflexes", "Swashbuckler", "Quick Draw", "Strike to Injure", "Specialist Weapon Group(Fencing)", "Strike Mighty Blow"};
                    return estal;

                case "Ferryman" :
                    String [] ferry = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Marksman", "Suave", "Specialist Weapon Group(Gunpowder)", "Street Fighting"};
                    return ferry;

                case "Fieldwarden" :
                    String [] field = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Fleet Footed", "Savvy", "Mighty Shot", "Rapid Reload", "Rover", "Quick Draw"};
                    return field;

                case "Fisherman" :
                    String [] fisher = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Hardy", "Savvy", "Orientation", "Street Fighting"};
                    return fisher;

                case "Grave Robber" :
                    String [] grave = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Flee!", "Resistance to Disease", "Streetwise", "Strongminded"};
                    return grave;

                case "Hedge Wizard" :
                    String [] hedge = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Hedge Magic", "Petty Magic(Hedge)"};
                    return hedge;

                case "Hunter" :
                    String [] hunt = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Hardy", "Specialist Weapon Group(Longbow)", "Lightning Reflexes", "Very Resilient", "Marksman", "Rover", "Rapid Reload"};
                    return hunt;

                case "Initiate" :
                    String [] init = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Lightning Reflexes", "Very Strong", "Public Speaking", "Suave", "Warrior Born"};
                    return init;

                case "Jailer" :
                    String [] jail = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Resistance to Disease", "Resistance to Poison", "Specialist Weapon Group(Entangling)", "Wrestling"};
                    return jail;

                case "Kislevite Kossar" :
                    String [] kislev = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Specialist Weapon Group(Two-handed)", "Strike to Injure"};
                    return kislev;

                case "Kithband Warrior" :
                    String [] kith = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Marksman", "Rover", "Rapid Reload", "Warrior Born"};
                    return kith;

                case "Marine" :
                    String [] marine = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Disarm", "Quick Draw", "Strike Mighty Blow", "Strike to Stun"};
                    return marine;

                case "Mercenary" :
                    String [] merc = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Disarm", "Quick Draw", "Rapid Reload", "Strike Mighty Blow", "Sharpshooter", "Strike to Stun"};
                    return merc;

                case "Messenger" :
                    String [] mess = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Orientation", "Seasoned Traveller"};
                    return mess;

                case "Militiaman" :
                    String [] militia = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Specialist Weapon Group(Two-handed)", "Rapid Reload", "Strike Mighty Blow"};
                    return militia;

                case "Miner" :
                    String [] miner = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Orientation", "Specialist Weapon Group(Two-handed)", "Very Resilient", "Warrior Born"};
                    return miner;

                case "Noble" :
                    String [] noble = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Etiquette", "Luck", "Public Speaking", "Savvy", "Specialist Weapon(Fencing)", "Schemer", "Specialist Weapon(Parrying)"};
                    return noble;

                case "Norse Berserker" :
                    String [] norse = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Frenzy", "Menacing", "Quick Draw", "Specialist Weapon Group(Two-handed)"};
                    return norse;

                case "Outlaw" :
                    String [] outlaw = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Rover", "Streetwise", "Sharpshooter", "Strike to Stun"};
                    return outlaw;

                case "Outrider" :
                    String [] outrider = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Coolheaded", "Very Strong", "Orientation", "Specialist Weapon Group(Entangling)"};
                    return outrider;

                case "Peasant" :
                    String [] peasant = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Hardy", "Rover", "Flee!", "Specialist Weapon Group(Sling)"};
                    return peasant;

                case "Pit Fighter" :
                    String [] pit = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Disarm", "Wrestling", "Quick Draw", "Strike to Injure", "Specialist Weapon Group(Flail)", "Specialist Weapon Group(Parrying)", "Specialist Weapon Group(Two-handed)", "Strike Mighty Blow", "Very Strong", "Strong-minded"};
                    return pit;

                case "Protagonist" :
                    String [] protag = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Disarm", "Quick Draw", "Menacing", "Suave", "Street Fighting", "Strike Mighty Blow", "Strike to Injure", "Strike to Stun"};
                    return protag;

                case "Rat Catcher" :
                    String [] rat = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Resistance to Disease", "Resistance to Poison", "Specialist Weapon Group(Sling)", "Tunnel Rat"};
                    return rat;

                case "Roadwarden" :
                    String [] road = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Quick Draw", "Rapid Reload", "Specialist Weapons Group(Gunpowder)"};
                    return road;

                case "Rogue" :
                    String [] rogue = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Flee!", "Streetwise", "Luck", "Sixth Sense", "Public Speaking"};
                    return rogue;

                case "Runebearer" :
                    String [] rune = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Flee!", "Fleet Footed", "Sixth Sense", "Orientation", "Rapid Reload", "Very Resilient", "Very Strong"};
                    return rune;

                case "Scribe" :
                    String [] scribe = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Linguistics"};
                    return scribe;

                case "Seaman" :
                    String [] sea = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Hardy", "Street Fighting", "Seasoned Traveller", "Strike Mighty Blow", "Swashbuckler"};
                    return sea;

                case "Servant" :
                    String [] serve = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Acute Hearing", "Flee!", "Etiquette", "Hardy", "Lightning Reflexes", "Very Resilient"};
                    return serve;

                case "Shieldbreaker" :
                    String [] shield = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Acute Hearing", "Flee!", "Etiquette", "Hardy", "Lightning Reflexes", "Very Resilient"};
                    return shield;

                case "Smuggler" :
                    String [] smug = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Dealmaker", "Streetwise"};
                    return smug;

                case "Soldier" :
                    String [] Soldier = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Disarm", "Quick Draw", "Sharpshooter", "Strike Mighty Blow", "Specialist Weapon Group(Gunpowder)", "Specialist Weapon Group(Two-handed)", "Strike to Injure", "Rapid Reload", "Strike to Stun", "Mighty Shot"};
                    return Soldier;
                case "Squire" :

                    String [] squire = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Etiquette", "Specialist Weapon Group(Cavalry)", "Strike Mighty Blow"};
                    return squire;

                case "Student" :
                    String [] student = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Etiquette", "Linguistics", "Savvy", "Suave", "Seasoned Traveller", "Super Numerate"};
                    return student;

                case "Thief" :
                    String [] thief = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Alley Cat", "Streetwise", "Super Numerate", "Trapfinder"};
                    return thief;

                case "Thug" :
                    String [] thug = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Coolheaded", "Lightning Reflexes", "Disarm", "Resistance to Poison", "Quick Draw", "Strike to Injure", "Wrestling", "Strike to Stun"};
                    return thug;

                case "Toll Keeper" :
                    String [] toll = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Lightning Reflexes", "Marksman"};
                    return toll;

                case "Tomb Robber" :
                    String [] tomb = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Luck", "Sixth Sense", "Trapfinder", "Tunnel Rat"};
                    return tomb;

                case  "Tradesman" :
                    String [] trades = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Dealmaker", "Savvy"};
                    return trades;

                case "Troll Slayer" :
                    String [] troll = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Disarm", "Quick Draw", "Hardy", "Lightning Reflexes", "Very Resilient", "Specialist Weapon Group(Two-handed)", "Street Fighter", "Strike Mighty Blow"};
                    return troll;

                case "Vagabond" :
                    String [] vaga = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Fleet Footed", "Rover", "Marksman", "Orientation", "Seasoned Traveller"};
                    return vaga;

                case "Valet" :
                    String [] valet = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Coolheaded", "Suave", "Dealmaker", "Seasoned Traveller", "Etiquette"};
                    return valet;

                case "Watchman" :
                    String [] watch = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Coolheaded", "Savvy", "Disarm", "Street Fighting", "Strike Mighty Blow", "Strike to Stun"};
                    return watch;

                case "Woodsman" :
                    String [] woods = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Fleet Footed", "Very Resilient", "Rover", "Specialist Weapon Group(Two-handed)"};
                    return woods;

                case "Zealot" :
                    String [] zealot = {"Aethyric Attunement", "Specialist Weapon Group(Longbow)", "Coolheaded", "Savvy", "Excellent Vision", "Night Vision", " Coolheaded", "Very Strong", "Hardy", "Suave", "Public Speaking", "Specialist Weapon Group(Flail)"};
                    return zealot;
            }
        }
        else if (race.equalsIgnoreCase("dwarf"))
        {
            switch(career){
                case "Agitator" :
                    String [] agitator = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Coolheaded", "Street Fighting", "Flee!", "Public Speaking"};
                    return agitator;

                case "Apprentice Wizard" :
                    String [] apprentice = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Aethyric Attunement", "Fast Hands", "Petty Magic(Arcane)", "Savvy", "Very Resilient"};
                    return apprentice;

                case "Bailiff" :
                    String [] bailiff = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Etiquette", "Super Numerate", "Public Speaking"};
                    return bailiff;

                case  "Barber-Surgeon" :
                    String [] barber = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Resistence to Disease", "Savvy", "Suave", "Very Resilient", "Surgery"};
                    return barber;

                case "Boatman" :
                    String [] boatman = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Orientation", "Seasoned Traveler"};
                    return boatman;

                case "Bodyguard" :
                    String [] bodyguard = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Disarm", "Quick Draw", "Specialist Weapon Group(Parrying)", "Specialist Weapon Group(Throwing)"};
                    return bodyguard;

                case "Bone Picker" :
                    String [] bone = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Coolheaded","Streetwise", "Hardy", "Resistance to Disease"};
                    return bone;

                case "Bounty Hunter" :
                    String [] bounty = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Marksman", "Strike to Stun", "Rover", "Specialist Weapon Group(Entangling)", "Sharpshooter", "Strike Mighty Blow"};
                    return bounty;

                case "Burgher" :
                    String [] burg = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Dealmaker", "Savvy", "Suave"};
                    return burg;
                case "Camp Follower" :

                    String [] camp = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Dealmaker", "Street Fighter", "Flee!", "Hardy", "Suave", "Resistance to Disease", "Seasoned Traveller"};
                    return camp;

                case "Charcoal-Burner" :
                    String [] charcoal = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Savvy", "Very Strong"};
                    return charcoal;

                case "Coachman" :
                    String [] coach = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Quick Draw", "Seasoned Traveller", "Specialist Weapon Group(Gunpowder)"};
                    return coach;

                case "Entertainer" :
                    String [] entertain = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Contortionist", "Lightning Reflexes", "Mimic", "Public Speaking", "Quick Draw", "Sharpshooter", "Specialist Weapon Group(Throwing)", "Trick Riding", "Very Strong", "Wrestling"};
                    return entertain;

                case "Envoy" :
                    String [] envoy = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Deal Maker", "Seasoned Traveller"};
                    return envoy;

                case "Estalian Diestro" :
                    String [] estal = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Lightning Reflexes", "Swashbuckler", "Quick Draw", "Strike to Injure", "Specialist Weapon Group(Fencing)", "Strike Mighty Blow"};
                    return estal;

                case "Ferryman" :
                    String [] ferry = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Marksman", "Suave", "Specialist Weapon Group(Gunpowder)", "Street Fighting"};
                    return ferry;

                case "Fieldwarden" :
                    String [] field = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Fleet Footed", "Savvy", "Mighty Shot", "Rapid Reload", "Rover", "Quick Draw"};
                    return field;

                case "Fisherman" :
                    String [] fisher = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Hardy", "Savvy", "Orientation", "Street Fighting"};
                    return fisher;

                case "Grave Robber" :
                    String [] grave = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Flee!", "Resistance to Disease", "Streetwise", "Strongminded"};
                    return grave;

                case "Hedge Wizard" :
                    String [] hedge = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Hedge Magic", "Petty Magic(Hedge)"};
                    return hedge;

                case "Hunter" :
                    String [] hunt = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Hardy", "Specialist Weapon Group(Longbow)", "Lightning Reflexes", "Very Resilient", "Marksman", "Rover", "Rapid Reload"};
                    return hunt;

                case "Initiate" :
                    String [] init = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Lightning Reflexes", "Very Strong", "Public Speaking", "Suave", "Warrior Born"};
                    return init;

                case "Jailer" :
                    String [] jail = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Resistance to Disease", "Resistance to Poison", "Specialist Weapon Group(Entangling)", "Wrestling"};
                    return jail;

                case "Kislevite Kossar" :
                    String [] kislev = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Specialist Weapon Group(Two-handed)", "Strike to Injure"};
                    return kislev;

                case "Kithband Warrior" :
                    String [] kith = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Marksman", "Rover", "Rapid Reload", "Warrior Born"};
                    return kith;

                case "Marine" :
                    String [] marine = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Disarm", "Quick Draw", "Strike Mighty Blow", "Strike to Stun"};
                    return marine;

                case "Mercenary" :
                    String [] merc = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Disarm", "Quick Draw", "Rapid Reload", "Strike Mighty Blow", "Sharpshooter", "Strike to Stun"};
                    return merc;

                case "Messenger" :
                    String [] mess = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Orientation", "Seasoned Traveller"};
                    return mess;
                case "Militiaman" :

                    String [] militia = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Specialist Weapon Group(Two-handed)", "Rapid Reload", "Strike Mighty Blow"};
                    return militia;

                case "Miner" :
                    String [] miner = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Orientation", "Specialist Weapon Group(Two-handed)", "Very Resilient", "Warrior Born"};
                    return miner;

                case "Noble" :
                    String [] noble = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Etiquette", "Luck", "Public Speaking", "Savvy", "Specialist Weapon(Fencing)", "Schemer", "Specialist Weapon(Parrying)"};
                    return noble;

                case "Norse Berserker" :
                    String [] norse = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Frenzy", "Menacing", "Quick Draw", "Specialist Weapon Group(Two-handed)"};
                    return norse;

                case "Outlaw" :
                    String [] outlaw = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Rover", "Streetwise", "Sharpshooter", "Strike to Stun"};
                    return outlaw;

                case "Outrider" :
                    String [] outrider = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Coolheaded", "Very Strong", "Orientation", "Specialist Weapon Group(Entangling)"};
                    return outrider;

                case "Peasant" :
                    String [] peasant = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Hardy", "Rover", "Flee!", "Specialist Weapon Group(Sling)"};
                    return peasant;

                case "Pit Fighter" :
                    String [] pit = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Disarm", "Wrestling", "Quick Draw", "Strike to Injure", "Specialist Weapon Group(Flail)", "Specialist Weapon Group(Parrying)", "Specialist Weapon Group(Two-handed)", "Strike Mighty Blow", "Very Strong", "Strong-minded"};
                    return pit;

                case "Protagonist" :
                    String [] protag = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Disarm", "Quick Draw", "Menacing", "Suave", "Street Fighting", "Strike Mighty Blow", "Strike to Injure", "Strike to Stun"};
                    return protag;

                case "Rat Catcher" :
                    String [] rat = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Resistance to Disease", "Resistance to Poison", "Specialist Weapon Group(Sling)", "Tunnel Rat"};
                    return rat;

                case "Roadwarden" :
                    String [] road = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Quick Draw", "Rapid Reload", "Specialist Weapons Group(Gunpowder)"};
                    return road;

                case "Rogue" :
                    String [] rogue = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Flee!", "Streetwise", "Luck", "Sixth Sense", "Public Speaking"};
                    return rogue;

                case "Runebearer" :
                    String [] rune = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Flee!", "Fleet Footed", "Sixth Sense", "Orientation", "Rapid Reload", "Very Resilient", "Very Strong"};
                    return rune;

                case "Scribe" :
                    String [] scribe = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Linguistics"};
                    return scribe;

                case "Seaman" :
                    String [] sea = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Hardy", "Street Fighting", "Seasoned Traveller", "Strike Mighty Blow", "Swashbuckler"};
                    return sea;

                case "Servant" :
                    String [] serve = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Acute Hearing", "Flee!", "Etiquette", "Hardy", "Lightning Reflexes", "Very Resilient"};
                    return serve;

                case "Shieldbreaker" :
                    String [] shield = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Acute Hearing", "Flee!", "Etiquette", "Hardy", "Lightning Reflexes", "Very Resilient"};
                    return shield;

                case "Smuggler" :
                    String [] smug = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Dealmaker", "Streetwise"};
                    return smug;

                case "Soldier" :
                    String [] soldier = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Disarm", "Quick Draw", "Sharpshooter", "Strike Mighty Blow", "Specialist Weapon Group(Gunpowder)", "Specialist Weapon Group(Two-handed)", "Strike to Injure", "Rapid Reload", "Strike to Stun", "Mighty Shot"};
                    return soldier;

                case "Squire" :
                    String [] squire = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Etiquette", "Specialist Weapon Group(Cavalry)", "Strike Mighty Blow"};
                    return squire;

                case "Student" :
                    String [] student = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Etiquette", "Linguistics", "Savvy", "Suave", "Seasoned Traveller", "Super Numerate"};
                    return student;

                case "Thief" :
                    String [] thief = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Alley Cat", "Streetwise", "Super Numerate", "Trapfinder"};
                    return thief;

                case "Thug" :
                    String [] thug = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Coolheaded", "Lightning Reflexes", "Disarm", "Resistance to Poison", "Quick Draw", "Strike to Injure", "Wrestling", "Strike to Stun"};
                    return thug;

                case "Toll Keeper" :
                    String [] toll = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Lightning Reflexes", "Marksman"};
                    return toll;

                case "Tomb Robber" :
                    String [] tomb = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Luck", "Sixth Sense", "Trapfinder", "Tunnel Rat"};
                    return tomb;

                case  "Tradesman" :
                    String [] trades = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Dealmaker", "Savvy"};
                    return trades;

                case "Troll Slayer" :
                    String [] troll = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Disarm", "Quick Draw", "Hardy", "Lightning Reflexes", "Very Resilient", "Specialist Weapon Group(Two-handed)", "Street Fighter", "Strike Mighty Blow"};
                    return troll;

                case "Vagabond" :
                    String [] vaga = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Fleet Footed", "Rover", "Marksman", "Orientation", "Seasoned Traveller"};
                    return vaga;

                case "Valet" :
                    String [] valet = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Coolheaded", "Suave", "Dealmaker", "Seasoned Traveller", "Etiquette"};
                    return valet;

                case "Watchman" :
                    String [] watch = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Coolheaded", "Savvy", "Disarm", "Street Fighting", "Strike Mighty Blow", "Strike to Stun"};
                    return watch;

                case "Woodsman" :
                    String [] woods = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Fleet Footed", "Very Resilient", "Rover", "Specialist Weapon Group(Two-handed)"};
                    return woods;

                case "Zealot" :
                    String [] zealot = {"Dwarfcraft", "Grudge-born Fury", "Night Vision", "Resistance to Magic", "Stout-hearted", "Sturdy", " Coolheaded", "Very Strong", "Hardy", "Suave", "Public Speaking", "Specialist Weapon Group(Flail)"};
                    return zealot;
            }

        }
        else
        {
            switch(career){
                case "Agitator" :
                    String [] agitator = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Coolheaded", "Street Fighting", "Flee!", "Public Speaking"};
                    return agitator;

                case "Apprentice Wizard" :
                    String [] apprentice = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Aethyric Attunement", "Fast Hands", "Petty Magic(Arcane)", "Savvy", "Very Resilient"};
                    return apprentice;

                case "Bailiff" :
                    String [] bailiff = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Etiquette", "Super Numerate", "Public Speaking"};
                    return bailiff;

                case  "Barber-Surgeon" :
                    String [] barber = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Resistence to Disease", "Savvy", "Suave", "Very Resilient", "Surgery"};
                    return barber;

                case "Boatman" :
                    String [] boatman = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Orientation", "Seasoned Traveler"};
                    return boatman;

                case "Bodyguard" :
                    String [] bodyguard = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Disarm", "Quick Draw", "Specialist Weapon Group(Parrying)", "Specialist Weapon Group(Throwing)"};
                    return bodyguard;

                case "Bone Picker" :
                    String [] bone = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Coolheaded","Streetwise", "Hardy", "Resistance to Disease"};
                    return bone;

                case "Bounty Hunter" :
                    String [] bounty = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Marksman", "Strike to Stun", "Rover", "Specialist Weapon Group(Entangling)", "Sharpshooter", "Strike Mighty Blow"};
                    return bounty;

                case "Burgher" :
                    String [] burg = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Dealmaker", "Savvy", "Suave"};
                    return burg;

                case "Camp Follower" :
                    String [] camp = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Dealmaker", "Street Fighter", "Flee!", "Hardy", "Suave", "Resistance to Disease", "Seasoned Traveller"};
                    return camp;

                case "Charcoal-Burner" :
                    String [] charcoal = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Savvy", "Very Strong"};
                    return charcoal;

                case "Coachman" :
                    String [] coach = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Quick Draw", "Seasoned Traveller", "Specialist Weapon Group(Gunpowder)"};
                    return coach;

                case "Entertainer" :
                    String [] entertain = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Contortionist", "Lightning Reflexes", "Mimic", "Public Speaking", "Quick Draw", "Sharpshooter", "Specialist Weapon Group(Throwing)", "Trick Riding", "Very Strong", "Wrestling"};
                    return entertain;

                case "Envoy" :
                    String [] envoy = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Deal Maker", "Seasoned Traveller"};
                    return envoy;

                case "Estalian Diestro" :
                    String [] estal = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Lightning Reflexes", "Swashbuckler", "Quick Draw", "Strike to Injure", "Specialist Weapon Group(Fencing)", "Strike Mighty Blow"};
                    return estal;

                case "Ferryman" :
                    String [] ferry = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Marksman", "Suave", "Specialist Weapon Group(Gunpowder)", "Street Fighting"};
                    return ferry;

                case "Fieldwarden" :
                    String [] field = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Fleet Footed", "Savvy", "Mighty Shot", "Rapid Reload", "Rover", "Quick Draw"};
                    return field;

                case "Fisherman" :
                    String [] fisher = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Hardy", "Savvy", "Orientation", "Street Fighting"};
                    return fisher;

                case "Grave Robber" :
                    String [] grave = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Flee!", "Resistance to Disease", "Streetwise", "Strongminded"};
                    return grave;

                case "Hedge Wizard" :
                    String [] hedge = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Hedge Magic", "Petty Magic(Hedge)"};
                    return hedge;

                case "Hunter" :
                    String [] hunt = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Hardy", "Specialist Weapon Group(Longbow)", "Lightning Reflexes", "Very Resilient", "Marksman", "Rover", "Rapid Reload"};
                    return hunt;

                case "Initiate" :
                    String [] init = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Lightning Reflexes", "Very Strong", "Public Speaking", "Suave", "Warrior Born"};
                    return init;

                case "Jailer" :
                    String [] jail = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Resistance to Disease", "Resistance to Poison", "Specialist Weapon Group(Entangling)", "Wrestling"};
                    return jail;

                case "Kislevite Kossar" :
                    String [] kislev = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Specialist Weapon Group(Two-handed)", "Strike to Injure"};
                    return kislev;

                case "Kithband Warrior" :
                    String [] kith = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Marksman", "Rover", "Rapid Reload", "Warrior Born"};
                    return kith;

                case "Marine" :
                    String [] marine = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Disarm", "Quick Draw", "Strike Mighty Blow", "Strike to Stun"};
                    return marine;

                case "Mercenary" :
                    String [] merc = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Disarm", "Quick Draw", "Rapid Reload", "Strike Mighty Blow", "Sharpshooter", "Strike to Stun"};
                    return merc;

                case "Messenger" :
                    String [] mess = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Orientation", "Seasoned Traveller"};
                    return mess;

                case "Militiaman" :
                    String [] militia = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Specialist Weapon Group(Two-handed)", "Rapid Reload", "Strike Mighty Blow"};
                    return militia;

                case "Miner" :
                    String [] miner = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Orientation", "Specialist Weapon Group(Two-handed)", "Very Resilient", "Warrior Born"};
                    return miner;

                case "Noble" :
                    String [] noble = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Etiquette", "Luck", "Public Speaking", "Savvy", "Specialist Weapon(Fencing)", "Schemer", "Specialist Weapon(Parrying)"};
                    return noble;

                case "Norse Berserker" :
                    String [] norse = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Frenzy", "Menacing", "Quick Draw", "Specialist Weapon Group(Two-handed)"};
                    return norse;

                case "Outlaw" :
                    String [] outlaw = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Rover", "Streetwise", "Sharpshooter", "Strike to Stun"};
                    return outlaw;

                case "Outrider" :
                    String [] outrider = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Coolheaded", "Very Strong", "Orientation", "Specialist Weapon Group(Entangling)"};
                    return outrider;

                case "Peasant" :
                    String [] peasant = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Hardy", "Rover", "Flee!", "Specialist Weapon Group(Sling)"};
                    return peasant;

                case "Pit Fighter" :
                    String [] pit = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Disarm", "Wrestling", "Quick Draw", "Strike to Injure", "Specialist Weapon Group(Flail)", "Specialist Weapon Group(Parrying)", "Specialist Weapon Group(Two-handed)", "Strike Mighty Blow", "Very Strong", "Strong-minded"};
                    return pit;

                case "Protagonist" :
                    String [] protag = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Disarm", "Quick Draw", "Menacing", "Suave", "Street Fighting", "Strike Mighty Blow", "Strike to Injure", "Strike to Stun"};
                    return protag;

                case "Rat Catcher" :
                    String [] rat = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Resistance to Disease", "Resistance to Poison", "Specialist Weapon Group(Sling)", "Tunnel Rat"};
                    return rat;

                case "Roadwarden" :
                    String [] road = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Quick Draw", "Rapid Reload", "Specialist Weapons Group(Gunpowder)"};
                    return road;

                case "Rogue" :
                    String [] rogue = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Flee!", "Streetwise", "Luck", "Sixth Sense", "Public Speaking"};
                    return rogue;

                case "Runebearer" :
                    String [] rune = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Flee!", "Fleet Footed", "Sixth Sense", "Orientation", "Rapid Reload", "Very Resilient", "Very Strong"};
                    return rune;

                case "Scribe" :
                    String [] scribe = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Linguistics"};
                    return scribe;

                case "Seaman" :
                    String [] sea = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Hardy", "Street Fighting", "Seasoned Traveller", "Strike Mighty Blow", "Swashbuckler"};
                    return sea;

                case "Servant" :
                    String [] serve = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Acute Hearing", "Flee!", "Etiquette", "Hardy", "Lightning Reflexes", "Very Resilient"};
                    return serve;

                case "Shieldbreaker" :
                    String [] shield = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Acute Hearing", "Flee!", "Etiquette", "Hardy", "Lightning Reflexes", "Very Resilient"};
                    return shield;

                case "Smuggler" :
                    String [] smug = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Dealmaker", "Streetwise"};
                    return smug;

                case "Soldier" :
                    String [] soldier = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Disarm", "Quick Draw", "Sharpshooter", "Strike Mighty Blow", "Specialist Weapon Group(Gunpowder)", "Specialist Weapon Group(Two-handed)", "Strike to Injure", "Rapid Reload", "Strike to Stun", "Mighty Shot"};
                    return soldier;

                case "Squire" :
                    String [] squire = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Etiquette", "Specialist Weapon Group(Cavalry)", "Strike Mighty Blow"};
                    return squire;

                case "Student" :
                    String [] student = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Etiquette", "Linguistics", "Savvy", "Suave", "Seasoned Traveller", "Super Numerate"};
                    return student;

                case "Thief" :
                    String [] thief = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Alley Cat", "Streetwise", "Super Numerate", "Trapfinder"};
                    return thief;

                case "Thug" :
                    String [] thug = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Coolheaded", "Lightning Reflexes", "Disarm", "Resistance to Poison", "Quick Draw", "Strike to Injure", "Wrestling", "Strike to Stun"};
                    return thug;

                case "Toll Keeper" :
                    String [] toll = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Lightning Reflexes", "Marksman"};
                    return toll;

                case "Tomb Robber" :
                    String [] tomb = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Luck", "Sixth Sense", "Trapfinder", "Tunnel Rat"};
                    return tomb;

                case  "Tradesman" :
                    String [] trades = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Dealmaker", "Savvy"};
                    return trades;

                case "Troll Slayer" :
                    String [] troll = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Disarm", "Quick Draw", "Hardy", "Lightning Reflexes", "Very Resilient", "Specialist Weapon Group(Two-handed)", "Street Fighter", "Strike Mighty Blow"};
                    return troll;

                case "Vagabond" :
                    String [] vaga = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Fleet Footed", "Rover", "Marksman", "Orientation", "Seasoned Traveller"};
                    return vaga;

                case "Valet" :
                    String [] valet = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Coolheaded", "Suave", "Dealmaker", "Seasoned Traveller", "Etiquette"};
                    return valet;

                case "Watchman" :
                    String [] watch = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Coolheaded", "Savvy", "Disarm", "Street Fighting", "Strike Mighty Blow", "Strike to Stun"};
                    return watch;

                case "Woodsman" :
                    String [] woods = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Fleet Footed", "Very Resilient", "Rover", "Specialist Weapon Group(Two-handed)"};
                    return woods;

                case "Zealot" :
                    String [] zealot = {randomTalents(), "Night Vision", "Resistance to Chaos", "Specialist Weapon Group(Sling)", "Coolheaded", "Very Strong", "Hardy", "Suave", "Public Speaking", "Specialist Weapon Group(Flail)"};
                    return zealot;
            }

        }
        return basic;
    }
}
