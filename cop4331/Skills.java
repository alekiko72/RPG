package com.example.cop4331;

public class Skills
{
    public static String [] getSkills(String race, String career)
    {
        String [] basic = {"Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Academic Knowledge(History)", "Gossip", "Academic Knowledge(Law)", "Common Knowledge(Empire)", "Concealment", "Charm", "Perception", "Read/Write", "Speak Language(Breton)", "Speak Language(Reikspiel)"};
        if (race.equalsIgnoreCase("dwarf"))
        {
            switch(career)
            {
                case "Agitator":
                    String [] agitator = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Academic Knowledge(History)", "Gossip", "Academic Knowledge(Law)", "Common Knowledge(Empire)", "Concealment", "Charm", "Perception", "Read/Write", "Speak Language(Breton)", "Speak Language(Reikspiel)"};
                    return agitator;

                case "Apprentice Wizard" :
                    String [] apprentice = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Academic Knowledge(Magic)", "Channelling", "Magical Sense", "Perception", "Search", "Speak Arcane Language(Magick)", "Speak Language(Classical)"};
                    return apprentice;

                case "Bailiff" :
                    String [] bailiff = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Academic Knowledge(Law)", "Animal Care", "Gossip", "Charm", "Command", "Navigation", "Intimidiate", "Common Knowledge(the Empire)", "Perception", "Read/Write", "Ride"};
                    return bailiff;

                case  "Barber-Surgeon" :
                    String [] barber = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Charm", "Drive", "Swim", "Haggle", "Heal", "Perception", "Read/Write", "Speak Language(Breton)", "Speak Language(Tilean)", "Trade(Apothecary)"};
                    return barber;

                case "Boatman" :
                    String [] boatman = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Common Knowledge(the Empire)", "Common Knowledge(Kislev)", "Consume Alcohol", "Gossip", "Navigation", "Outdoor Survival", "Perception", "Row", "Sail", "Secret Language(Ranger)", "Speak Language(Kislevian)", "Swim"};
                    return boatman;

                case "Bodyguard" :
                    String [] bodyguard = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Dodge Blow", "Intimidate", "Perception"};
                    return bodyguard;

                case "Bone Picker" :
                    String [] bone = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Animal Care", "Charm", "Gossip", "Drive", "Common Knowledge(the Empire)", "Evaluate", "Haggle", "Perception", "Search"};
                    return bone;

                case "Bounty Hunter" :
                    String [] bounty = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Follow Trail", "Intimidate", "Outdoor Survival", "Perception", "Search", "Shadowing", "Silent Move"};
                    return bounty;

                case "Burgher" :
                    String [] burg = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Common Knowledge(the Empire)", "Consomue Alcohol", "Drive", "Evaluate", "Gossip", "Read/Write", "Haggle", "Perception", "Search", "Speak Language(Breton)", "Speak Language(Kislevian)", "Speak Language(Tilean)", "Speak Language(Reikspeil)"};
                    return burg;

                case "Camp Follower" :
                    String [] camp = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Animal Care","Drive", "Charm", "Evaluate", "Gossip", "Haggle", "Perception", "Search", "Trade(Armourer)", "Trade(Bowyer)", "Trade(Cartographer)", "Trade(Cook)", "Trade(Gunsmith)", "Trade(Herbalist)", "Trade(Tailor)", "Trade(Weaponsmith)", "Speak Language(Breton)", "Speak Language(Kislevian)", "Speak Language(Tilean)", "Sleight of Hand"};
                    return camp;

                case "Charcoal-Burner" :
                    String [] charcoal = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Common Knowledge(the Empire)", "Concealment", "Drive", "Gossip", "Haggle", "Outdoor Survival", "Perception", "Scale Sheer Surface", "Search", "Secret Signs(Ranger)"};
                    return charcoal;

                case "Coachman" :
                    String [] coach = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Animal Care", "Drive", "Gossip", "Haggle", "Heal", "Ride", "Navigation", "Perception", "Secret Signs(Ranger)", "Speak Language(Breton)","Speak Language(Kislevian)", "Speak Language(Tilean)"};
                    return coach;

                case "Entertainer" :
                    String [] entertain = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Animal Care", "Swim", "Charm",  "Common Knowledge(the Empire)", "Evaluate", "Gossip", "Perception", "Performer(any)","Performer(any)", "Animal Training" , "Blather", "Charm Animal", "Hypnotism", "Ride", "Scale Sheer Surface" , "Sleight of Hand" ,"Ventriloquism"};
                    return entertain;

                case "Envoy" :
                    String [] envoy = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Charm", "Common Knowledge(the Empire)", "Common Knowledge(the Empire)", "Common Knowledge(the Wasteland)", "Evaluate", "Gossip", "Haggle", "Perception", "Read/Write", "Secret Language(Guild Tongue)", "Swim", "Trade(Merchant)"};
                    return envoy;

                case "Estalian Diestro" :
                    String [] estal = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Academic Knowledge(Science)", "Common Knowledge(Estalia)", "Dodge Blow", "Read/Write", "Speak Language(Estalian)"};
                    return estal;

                case "Ferryman" :
                    String [] ferry = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Charm", "Common Knowledge(the Empire)", "Evaluate", "Secret Language(Ranger Tongue)", "Gossip", "Intimidate", "Haggle", "Perception","Row", "Swim"};
                    return ferry;

                case "Fieldwarden" :
                    String [] field = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Academic Knowledge(Necromancy)", "Common Knowledge(the Empire)", "Concealment", "Follow Trail", "Outdoor Survival", "Perception", "Search", "Silent Move"};
                    return field;

                case "Fisherman" :
                    String [] fisher = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Common Knowledge(the Empire)", "Common Knowledge(the Wasteland)", "Consume Alcohol", "Haggle", "Navigation", "Trade(Merchant)", "Outdoor Survival", "Perception", "Row", "Sail", "Speak Language(Reikspiel)", "Speak Language(Norse)", "Swim"};
                    return fisher;

                case "Grave Robber" :
                    String [] grave = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Drive", "Gossip", "Haggle", "Perception", "Scale Sheer Surface", "Search", "Secret Signs(Thief)", "Silent Move"};
                    return grave;

                case "Hedge Wizard" :
                    String [] hedge = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Animal Care", "Haggle", "Charm", "Intimidate", "Channelling", "Charm Animal", "Trade(Apothecary)", "Heal", "Hypnotism", "Magical Sense", "Perception", "Search"};
                    return hedge;

                case "Hunter" :
                    String [] hunt = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Concealment", "Follow Trail", "Outdoor Survival", "Perception", "Search", "Swim", "Secret Signs(Ranger)", "Silent Move", "Set Trap"};
                    return hunt;

                case "Initiate" :
                    String [] init = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Academic Knowledge(Astronomy)", "Academic Knowledge(History)", "Academic Knowledge(Theology)", "Charm", "Heal", "Perception", "Read/Write", "Speak Language(Classical)", "Speak Language(Reikspiel)"};
                    return init;

                case "Jailer" :
                    String [] jail = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Command", "Consume Alcohol", "Dodge Blow", "Heal", "Sleight of Hand", "Intimidate", "Perception", "Search"};
                    return jail;

                case "Kislevite Kossar" :
                    String [] kislev = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Common Knowledge(Kislev)", "Consume Alcohol", "Dodge Blow", "Gamble", "Gossip", "Outdoor Survival", "Perception", "Search", "Speak Language(Kislevian)"};
                    return kislev;

                case "Kithband Warrior" :
                    String [] kith = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Concealment", "Dodge Blow", "Follow Trail", "Heal", "Search", "Outdoor Survival", "Perception", "Scale Sheer Surface", "Silent Move"};
                    return kith;

                case "Marine" :
                    String [] marine = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Common Knowledge(the Wasteland)","Gamble", "Consume Alcohol", "Dodge Blow", "Gossip", "Secret Language(Battle Tongue)", "Intimidate", "Row", "Swim"};
                    return marine;

                case "Mercenary" :
                    String [] merc = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Animal Care", "Gamble", "Common Knowledge(Bretonnia)", "Common Knowledge(Kislev)", "Common Knowledge(Tilea)", "Dodge Blow", "Drive", "Ride", "Gossip", "Haggle", "Perception", "Search", "Secret Language(Battle Tongue)", "Speak Language (Tilean)", "Swim"};
                    return merc;

                case "Messenger" :
                    String [] mess = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Animal Care", "Common Knowledge(the Empire)", "Common Knowledge(the Wasteland)", "Gossip", "Navigation", "Outdoor Survival", "Secret Signs(Scout)", "Perception", "Ride", "Speak Language(Reikspiel)", "Swim"};
                    return mess;

                case "Militiaman" :
                    String [] militia = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Animal Care", "Dodge Blow", "Drive", "Swim", "Gamble", "Gossip", "Outdoor Survival", "Perception", "Search", "Trade(any)"};
                    return militia;

                case "Miner" :
                    String [] miner = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Animal Care", "Concealment", "Drive", "Evaluate", "Outdoor Survival", "Navigation", "Perception", "Scale Sheer Surface", "Trade(Miner)", "Trade(Prospector)"};
                    return miner;

                case "Noble" :
                    String [] noble = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Blather", "Command", "Common Knowledge(the Empire)", "Consume Alcohol", "Performer (Musician)", "Charm", "Gamble", "Gossip", "Read/Write", "Ride", "Speak Language(Reikspiel)"};
                    return noble;

                case "Norse Berserker" :
                    String [] norse = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Common Knowledge(Norsca)", "Consume Alcohol", "Intimidate", "Performer(Storyteller)", "Speak Language(Norse)", "Swim"};
                    return norse;

                case "Outlaw" :
                    String [] outlaw = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Animal Care", "Common Knowledge(the Empire)", "Concealment", "Dodge Blow", "Drive", "Ride", "Gossip", "Secret Signs(Thief)", "Perception", "Scale Sheer Surface", "Set Trap", "Swim", "Silent Move"};
                    return outlaw;

                case "Outrider" :
                    String [] outrider = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Animal Care", "Follow Trail", "Navigation", "Outdoor Survival", "Perception", "Ride", "Search", "Silent Move"};
                    return outrider;

                case "Peasant" :
                    String [] peasant = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Animal Care", "Charm", "Animal Training", "Swim", "Charm Animal", "Trade (Cook)", "Concealment", "Drive", "Trade(Bowyer)", "Gamble", "Performer(Dancer)", "Performer(Singer)", "Outdoor Survival","Trade(Farmer)", "Row" ,"Set Trap", "Scale Sheer Surface", "Silent Move"};
                    return peasant;

                case "Pit Fighter" :
                    String [] pit = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Dodge Blow", "Intimidate"};
                    return pit;

                case "Protagonist" :
                    String [] protag = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Dodge Blow", "Gossip","Haggle", "Intimidate", "Ride"};
                    return protag;

                case "Rat Catcher" :
                    String [] rat = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Animal Care", "Animal Trainer", "Concealment", "Perception", "Search", "Set Trap", "Silent Move"};
                    return rat;

                case "Roadwarden" :
                    String [] road = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Animal Care", "Common Knowledge(the Empire)", "Gossip", "Drive", "Follow Trail","Secret Signs(Scout)", "Navigation", "Outdoor Survival", "Perception", "Ride", "Search"};
                    return road;

                case "Rogue" :
                    String [] rogue = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Blather", "Charm", "Evaluate", "Gamble", "Secret Signs(Thief)", "Gossip", "Haggle", "Perception", "Performer(Actor)", "Peformer(Storyteller)", "Search", "Secret Language(Thieves’ Tongue)", "Speak Language(Reikspiel)"};
                    return rogue;

                case "Runebearer" :
                    String [] rune = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Dodge Blow", "Navigation", "Outdoor Survival", "Secret Signs(Scout)", "Perception", "Swim"};
                    return rune;

                case "Scribe" :
                    String [] scribe = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Academic Knowledge(any)", "Common Knowledge(the Empire)", "Gossip", "Perception", "Read/Write", "Secret Language(Guild Tongue)", "Speak Language(Breton)", "Speak Language(Classical)", "Speak Language(Reikspiel)", "Speak Language(Tilean)", "Trade (Calligrapher)"};
                    return scribe;

                case "Seaman" :
                    String [] seaman = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Common Knowledge (Bretonnia)", "Common Knowledge(Norsca)", "Common Knowledge(Tilea)", "Common Knowledge(the Wasteland)", "Consume Alcohol", "Perception", "Dodge Blow", "Row", "Sail", "Scale Sheer Surface", "Speak Language(Breton)","Speak Language(Norse)","Speak Language(Tilean)", "Swim"};
                    return seaman;

                case "Servant" :
                    String [] serve = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Animal Care", "Trade (Cook)", "Blather", "Dodge Blow", "Drive", "Search", "Evaluate","Haggle", "Gossip", "Perception", "Read/Write", "Sleight of Hand"};
                    return serve;

                case "Shieldbreaker" :
                    String [] shield = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Dodge Blow", "Navigation", "Perception", "Scale Sheer Surface", "Shadowing"};
                    return shield;

                case "Smuggler" :
                    String [] smugg = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Drive", "Evaluate", "Gossip", "Secret Language(Thieves’ Tongue)", "Haggle", "Perception", "Row", "Search", "Silent Move", "Speak Language(Breton)", "Speak Language(Kislevian)","Secret Signs(Thief)", "Swim"};
                    return smugg;

                case "Soldier" :
                    String [] soldier = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Animal Care", "Heal", "Common Knowledge(the Empire)", "Perception", "Dodge Blow", "Drive", "Ride", "Gamble", "Gossip", "Intimidate"};
                    return soldier;

                case "Squire" :
                    String [] squire = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Academic Knowledge(Genealogy/Heraldry)","Common Knowledge(Bretonnia)", "Animal Care", "Animal Training", "Charm", "Gossip", "Dodge Blow", "Ride", "Speak Language(Breton)", "Speak Language(Reikspiel)"};
                    return squire;

                case "Student" :
                    String [] study = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Academic Knowledge (any)", "Academic Knowledge(any)", "Gossip", "Charm", "Consume Alcohol", "Heal", "Search", "Perception", "Read/Write", "Speak Language(Classical)", "Speak Language(Reikspiel)"};
                    return study;

                case "Thief" :
                    String [] thief = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Charm","Scale Sheer Surface", "Concealment", "Evaluate", "Disguise", "Gamble", "Pick Lock", "Perception", "Read/Write", "Sleight of Hand", "Search", "Secret Language(Thieves’ Tongue)", "Secret Signs(Thief)", "Silent Move"};
                    return thief;

                case "Thug" :
                    String [] thug = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Consume Alcohol", "Dodge Blow", "Gamble", "Intimidate", "Secret Language(Thieves’ Tongue)"};
                    return thug;

                case "Toll Keeper" :
                    String [] toll = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Dodge Blow", "Evaluate", "Gossip", "Haggle", "Perception", "Read/Write", "Search", "Speak Language(Breton)", "Speak Language(Kislevian)", "Speak Language(Tilean)"};
                    return toll;

                case "Tomb Robber" :
                    String [] tomb = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Common Knowledge(the Empire)", "Secret Signs(Thief)", "Concealment", "Outdoor Survival", "Evaluate", "Perception", "Pick Lock", "Silent Move", "Read/Write", "Scale Sheer Surface", "Search", "Speak Language(Classical)", "Speak Language(Khazalid)", "Speak Language(Eltharin)"};;
                    return tomb;

                case  "Tradesman" :
                    String [] trades = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Animal Care", "Gossip", "Drive", "Haggle", "Evaluate", "Perception", "Read/Write", "Secret Language(Guild Tongue)", "Trade(any)", "Trade(any)"};
                    return trades;

                case "Troll Slayer" :
                    String [] troll = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Consume Alcohol", "Dodge Blow", "Intimidate"};
                    return troll;

                case "Vagabond" :
                    String [] vaga = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Common Knowledge(Bretonnia)", "Common Knowledge(Estalia)", "Common Knowledge(Kislev)", "Common Knowledge(Tilea)", "Gossip", "Secret Language(Ranger Tongue)", "Secret Language(Thieves’ Tongue)", "Haggle", "Swim", "Heal","Perception", "Navigation", "Outdoor Survival", "Performer(Dancer)", "Performer(Singer)","Performer(Storyteller)", "Secret Signs(Ranger)","Secret Signs(Thief)", "Silent Move"};
                    return vaga;

                case "Valet" :
                    String [] valet = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Academic Knowledge(Genealogy/Heraldry)", "Blather", "Evaluate", "Gossip", "Speak Language(Breton)", "Speak Language(Reikspiel)", "Haggle", "Perception", "Read/Write", "Search"};
                    return valet;

                case "Watchman" :
                    String [] watch = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Academic Knowledge(Law)", "Dodge Blow", "Follow Trail", "Gossip", "Intimidate", "Perception", "Search"};
                    return watch;

                case "Woodsman" :
                    String [] woods = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Concealment", "Follow Trail", "Set Trap", "Perception", "Scale Sheer Surface", "Secret Language(Ranger Tongue)", "Secret Signs(Ranger)", "Silent Move"};
                    return woods;

                case "Zealot" :
                    String [] zeal = {"Common Knowledge(Dwarfs)", "Gossip", "Speak Language(Reikspiel)", "Speak Language(Khazalid)", "Trade(Stoneworker)", "Trade(Smith)", "Trade(Miner)", "Academic Knowledge (Theology)", "Charm", "Common Knowledge(the Empire)", "Intimidate", "Read/Write"};
                    return zeal;
            }
        }
        else if (race.equalsIgnoreCase("elf"))
        {
            switch(career){
                case "Agitator" :
                    String [] agitator = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Academic Knowledge(History)", "Gossip", "Academic Knowledge(Law)", "Common Knowledge(Empire)", "Concealment", "Charm", "Perception", "Read/Write", "Speak Language(Breton)", "Speak Language(Reikspiel)"};
                    return agitator;

                case "Apprentice Wizard" :
                    String [] apprentice = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Academic Knowledge(Magic)", "Channelling", "Magical Sense", "Perception", "Search", "Speak Arcane Language(Magick)", "Speak Language(Classical)"};
                    return apprentice;

                case "Bailiff" :
                    String [] bailiff = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Academic Knowledge(Law)", "Animal Care", "Gossip", "Charm", "Command", "Navigation", "Intimidiate", "Common Knowledge(the Empire)", "Perception", "Read/Write", "Ride"};
                    return bailiff;

                case  "Barber-Surgeon" :
                    String [] barber = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Charm", "Drive", "Swim", "Haggle", "Heal", "Perception", "Read/Write", "Speak Language(Breton)", "Speak Language(Tilean)", "Trade(Apothecary)"};
                    return barber;

                case "Boatman" :
                    String [] boatman = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Common Knowledge(the Empire)", "Common Knowledge(Kislev)", "Consume Alcohol", "Gossip", "Navigation", "Outdoor Survival", "Perception", "Row", "Sail", "Secret Language(Ranger)", "Speak Language(Kislevian)", "Swim",};
                    return boatman;

                case "Bodyguard" :
                    String [] bodyguard = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Dodge Blow", "Intimidate", "Perception"};
                    return bodyguard;

                case "Bone Picker" :
                    String [] bone = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Animal Care", "Charm", "Gossip", "Drive", "Common Knowledge(the Empire)", "Evaluate", "Haggle", "Perception", "Search"};
                    return bone;

                case "Bounty Hunter" :
                    String [] bounty = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Follow Trail", "Intimidate", "Outdoor Survival", "Perception", "Search", "Shadowing", "Silent Move"};
                    return bounty;

                case "Burgher" :
                    String [] burg = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Common Knowledge(the Empire)", "Consomue Alcohol", "Drive", "Evaluate", "Gossip", "Read/Write", "Haggle", "Perception", "Search", "Speak Language(Breton)", "Speak Language(Kislevian)", "Speak Language(Tilean)", "Speak Language(Reikspeil)"};
                    return burg;

                case "Camp Follower" :
                    String [] camp = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Animal Care","Drive", "Charm", "Evaluate", "Gossip", "Haggle", "Perception", "Search", "Trade(Armourer)", "Trade(Bowyer)", "Trade(Cartographer)", "Trade(Cook)", "Trade(Gunsmith)", "Trade(Herbalist)", "Trade(Tailor)", "Trade(Weaponsmith)", "Speak Language(Breton)", "Speak Language(Kislevian)", "Speak Language(Tilean)", "Sleight of Hand"};
                    return camp;

                case "Charcoal-Burner" :
                    String [] charcoal = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Common Knowledge(the Empire)", "Concealment", "Drive", "Gossip", "Haggle", "Outdoor Survival", "Perception", "Scale Sheer Surface", "Search", "Secret Signs(Ranger)"};
                    return charcoal;

                case "Coachman" :
                    String [] coach = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Animal Care", "Drive", "Gossip", "Haggle", "Heal", "Ride", "Navigation", "Perception", "Secret Signs(Ranger)", "Speak Language(Breton)","Speak Language(Kislevian)", "Speak Language(Tilean)"};
                    return coach;

                case "Entertainer" :
                    String [] entertain = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Animal Care", "Swim", "Charm",  "Common Knowledge(the Empire)", "Evaluate", "Gossip", "Perception", "Performer(any)","Performer(any)", "Animal Training" , "Blather", "Charm Animal", "Hypnotism", "Ride", "Scale Sheer Surface" , "Sleight of Hand" ,"Ventriloquism"};
                    return entertain;

                case "Envoy" :
                    String [] envoy = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Charm", "Common Knowledge(the Empire)", "Common Knowledge(the Empire)", "Common Knowledge(the Wasteland)", "Evaluate", "Gossip", "Haggle", "Perception", "Read/Write", "Secret Language(Guild Tongue)", "Swim", "Trade(Merchant)"};
                    return envoy;

                case "Estalian Diestro" :
                    String [] estal = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Academic Knowledge(Science)", "Common Knowledge(Estalia)", "Dodge Blow", "Read/Write", "Speak Language(Estalian)"};
                    return estal;

                case "Ferryman" :
                    String [] ferry = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Charm", "Common Knowledge(the Empire)", "Evaluate", "Secret Language(Ranger Tongue)", "Gossip", "Intimidate", "Haggle", "Perception","Row", "Swim"};
                    return ferry;

                case "Fieldwarden" :
                    String [] field = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Academic Knowledge(Necromancy)", "Common Knowledge(the Empire)", "Concealment", "Follow Trail", "Outdoor Survival", "Perception", "Search", "Silent Move"};
                    return field;

                case "Fisherman" :
                    String [] fisher = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Common Knowledge(the Empire)", "Common Knowledge(the Wasteland)", "Consume Alcohol", "Haggle", "Navigation", "Trade(Merchant)", "Outdoor Survival", "Perception", "Row", "Sail", "Speak Language(Reikspiel)", "Speak Language(Norse)", "Swim"};
                    return fisher;

                case "Grave Robber" :
                    String [] grave = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Drive", "Gossip", "Haggle", "Perception", "Scale Sheer Surface", "Search", "Secret Signs(Thief)", "Silent Move"};
                    return grave;

                case "Hedge Wizard" :
                    String [] hedge = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Animal Care", "Haggle", "Charm", "Intimidate", "Channelling", "Charm Animal", "Trade(Apothecary)", "Heal", "Hypnotism", "Magical Sense", "Perception", "Search"};
                    return hedge;

                case "Hunter" :
                    String [] hunt = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Concealment", "Follow Trail", "Outdoor Survival", "Perception", "Search", "Swim", "Secret Signs(Ranger)", "Silent Move", "Set Trap"};
                    return hunt;

                case "Initiate" :
                    String [] init = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Academic Knowledge(Astronomy)", "Academic Knowledge(History)", "Academic Knowledge(Theology)", "Charm", "Heal", "Perception", "Read/Write", "Speak Language(Classical)", "Speak Language(Reikspiel)"};
                    return init;

                case "Jailer" :
                    String [] jail = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Command", "Consume Alcohol", "Dodge Blow", "Heal", "Sleight of Hand", "Intimidate", "Perception", "Search"};
                    return jail;

                case "Kislevite Kossar" :
                    String [] kislev = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Common Knowledge(Kislev)", "Consume Alcohol", "Dodge Blow", "Gamble", "Gossip", "Outdoor Survival", "Perception", "Search", "Speak Language(Kislevian)"};
                    return kislev;

                case "Kithband Warrior" :
                    String [] kith = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Concealment", "Dodge Blow", "Follow Trail", "Heal", "Search", "Outdoor Survival", "Perception", "Scale Sheer Surface", "Silent Move"};
                    return kith;

                case "Marine" :
                    String [] marine = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Common Knowledge(the Wasteland)","Gamble", "Consume Alcohol", "Dodge Blow", "Gossip", "Secret Language(Battle Tongue)", "Intimidate", "Row", "Swim"};
                    return marine;

                case "Mercenary" :
                    String [] merc = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Animal Care", "Gamble", "Common Knowledge(Bretonnia)", "Common Knowledge(Kislev)", "Common Knowledge(Tilea)", "Dodge Blow", "Drive", "Ride", "Gossip", "Haggle", "Perception", "Search", "Secret Language(Battle Tongue)", "Speak Language (Tilean)", "Swim"};
                    return merc;

                case "Messenger" :
                    String [] mess = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Animal Care", "Common Knowledge(the Empire)", "Common Knowledge(the Wasteland)", "Gossip", "Navigation", "Outdoor Survival", "Secret Signs(Scout)", "Perception", "Ride", "Speak Language(Reikspiel)", "Swim"};
                    return mess;

                case "Militiaman" :
                    String [] militia = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Animal Care", "Dodge Blow", "Drive", "Swim", "Gamble", "Gossip", "Outdoor Survival", "Perception", "Search", "Trade(any)"};
                    return militia;

                case "Miner" :
                    String [] miner = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Animal Care", "Concealment", "Drive", "Evaluate", "Outdoor Survival", "Navigation", "Perception", "Scale Sheer Surface", "Trade(Miner)", "Trade(Prospector)"};
                    return miner;

                case "Noble" :
                    String [] noble = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Blather", "Command", "Common Knowledge(the Empire)", "Consume Alcohol", "Performer (Musician)", "Charm", "Gamble", "Gossip", "Read/Write", "Ride", "Speak Language(Reikspiel)"};
                    return noble;

                case "Norse Berserker" :
                    String [] norse = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Common Knowledge(Norsca)", "Consume Alcohol", "Intimidate", "Performer(Storyteller)", "Speak Language(Norse)", "Swim"};
                    return norse;

                case "Outlaw" :
                    String [] outlaw = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Animal Care", "Common Knowledge(the Empire)", "Concealment", "Dodge Blow", "Drive", "Ride", "Gossip", "Secret Signs(Thief)", "Perception", "Scale Sheer Surface", "Set Trap", "Swim", "Silent Move"};
                    return outlaw;

                case "Outrider" :
                    String [] outrider = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Animal Care", "Follow Trail", "Navigation", "Outdoor Survival", "Perception", "Ride", "Search", "Silent Move"};
                    return outrider;

                case "Peasant" :
                    String [] peasant = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Animal Care", "Charm", "Animal Training", "Swim", "Charm Animal", "Trade (Cook)", "Concealment", "Drive", "Trade(Bowyer)", "Gamble", "Performer(Dancer)", "Performer(Singer)", "Outdoor Survival","Trade(Farmer)", "Row" ,"Set Trap", "Scale Sheer Surface", "Silent Move"};
                    return peasant;

                case "Pit Fighter" :
                    String [] pit = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Dodge Blow", "Intimidate"};
                    return pit;

                case "Protagonist" :
                    String [] protag = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Dodge Blow", "Gossip","Haggle", "Intimidate", "Ride"};
                    return protag;

                case "Rat Catcher" :
                    String [] rat = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Animal Care", "Animal Trainer", "Concealment", "Perception", "Search", "Set Trap", "Silent Move"};
                    return rat;

                case "Roadwarden" :
                    String [] road = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Animal Care", "Common Knowledge(the Empire)", "Gossip", "Drive", "Follow Trail","Secret Signs(Scout)", "Navigation", "Outdoor Survival", "Perception", "Ride", "Search"};
                    return road;

                case "Rogue" :
                    String [] rogue = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Blather", "Charm", "Evaluate", "Gamble", "Secret Signs(Thief)", "Gossip", "Haggle", "Perception", "Performer(Actor)", "Peformer(Storyteller)", "Search", "Secret Language(Thieves’ Tongue)", "Speak Language(Reikspiel)"};
                    return rogue;

                case "Runebearer" :
                    String [] rune = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Dodge Blow", "Navigation", "Outdoor Survival", "Secret Signs(Scout)", "Perception", "Swim"};
                    return rune;

                case "Scribe" :
                    String [] scribe = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Academic Knowledge(any)", "Common Knowledge(the Empire)", "Gossip", "Perception", "Read/Write", "Secret Language(Guild Tongue)", "Speak Language(Breton)", "Speak Language(Classical)", "Speak Language(Reikspiel)", "Speak Language(Tilean)", "Trade (Calligrapher)"};
                    return scribe;

                case "Seaman" :
                    String [] seaman = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Common Knowledge (Bretonnia)", "Common Knowledge(Norsca)", "Common Knowledge(Tilea)", "Common Knowledge(the Wasteland)", "Consume Alcohol", "Perception", "Dodge Blow", "Row", "Sail", "Scale Sheer Surface", "Speak Language(Breton)","Speak Language(Norse)","Speak Language(Tilean)", "Swim"};
                    return seaman;

                case "Servant" :
                    String [] serve = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Animal Care", "Trade (Cook)", "Blather", "Dodge Blow", "Drive", "Search", "Evaluate","Haggle", "Gossip", "Perception", "Read/Write", "Sleight of Hand"};
                    return serve;

                case "Shieldbreaker" :
                    String [] shield = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Dodge Blow", "Navigation", "Perception", "Scale Sheer Surface", "Shadowing"};
                    return shield;

                case "Smuggler" :
                    String [] smugg = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Drive", "Evaluate", "Gossip", "Secret Language(Thieves’ Tongue)", "Haggle", "Perception", "Row", "Search", "Silent Move", "Speak Language(Breton)", "Speak Language(Kislevian)","Secret Signs(Thief)", "Swim"};
                    return smugg;

                case "Soldier" :
                    String [] soldier = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Animal Care", "Heal", "Common Knowledge(the Empire)", "Perception", "Dodge Blow", "Drive", "Ride", "Gamble", "Gossip", "Intimidate"};
                    return soldier;

                case "Squire" :
                    String [] squire = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Academic Knowledge(Genealogy/Heraldry)","Common Knowledge(Bretonnia)", "Animal Care", "Animal Training", "Charm", "Gossip", "Dodge Blow", "Ride", "Speak Language(Breton)", "Speak Language(Reikspiel)"};
                    return squire;

                case "Student" :
                    String [] study = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Academic Knowledge (any)", "Academic Knowledge(any)", "Gossip", "Charm", "Consume Alcohol", "Heal", "Search", "Perception", "Read/Write", "Speak Language(Classical)", "Speak Language(Reikspiel)"};
                    return study;

                case "Thief" :
                    String [] thief = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Charm","Scale Sheer Surface", "Concealment", "Evaluate", "Disguise", "Gamble", "Pick Lock", "Perception", "Read/Write", "Sleight of Hand", "Search", "Secret Language(Thieves’ Tongue)", "Secret Signs(Thief)", "Silent Move"};
                    return thief;

                case "Thug" :
                    String [] thug = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Consume Alcohol", "Dodge Blow", "Gamble", "Intimidate", "Secret Language(Thieves’ Tongue)"};
                    return thug;

                case "Toll Keeper" :
                    String [] toll = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Dodge Blow", "Evaluate", "Gossip", "Haggle", "Perception", "Read/Write", "Search", "Speak Language(Breton)", "Speak Language(Kislevian)", "Speak Language(Tilean)"};
                    return toll;

                case "Tomb Robber" :
                    String [] tomb = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Common Knowledge(the Empire)", "Secret Signs(Thief)", "Concealment", "Outdoor Survival", "Evaluate", "Perception", "Pick Lock", "Silent Move", "Read/Write", "Scale Sheer Surface", "Search", "Speak Language(Classical)", "Speak Language(Khazalid)", "Speak Language(Eltharin)"};;
                    return tomb;

                case  "Tradesman" :
                    String [] trades = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Animal Care", "Gossip", "Drive", "Haggle", "Evaluate", "Perception", "Read/Write", "Secret Language(Guild Tongue)", "Trade(any)", "Trade(any)"};
                    return trades;

                case "Troll Slayer" :
                    String [] troll = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Consume Alcohol", "Dodge Blow", "Intimidate"};
                    return troll;

                case "Vagabond" :
                    String [] vaga = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Common Knowledge(Bretonnia)", "Common Knowledge(Estalia)", "Common Knowledge(Kislev)", "Common Knowledge(Tilea)", "Gossip", "Secret Language(Ranger Tongue)", "Secret Language(Thieves’ Tongue)", "Haggle", "Swim", "Heal","Perception", "Navigation", "Outdoor Survival", "Performer(Dancer)", "Performer(Singer)","Performer(Storyteller)", "Secret Signs(Ranger)","Secret Signs(Thief)", "Silent Move"};
                    return vaga;

                case "Valet" :
                    String [] valet = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Academic Knowledge(Genealogy/Heraldry)", "Blather", "Evaluate", "Gossip", "Speak Language(Breton)", "Speak Language(Reikspiel)", "Haggle", "Perception", "Read/Write", "Search"};
                    return valet;

                case "Watchman" :
                    String [] watch = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Academic Knowledge(Law)", "Dodge Blow", "Follow Trail", "Gossip", "Intimidate", "Perception", "Search"};
                    return watch;

                case "Woodsman" :
                    String [] woods = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Concealment", "Follow Trail", "Set Trap", "Perception", "Scale Sheer Surface", "Secret Language(Ranger Tongue)", "Secret Signs(Ranger)", "Silent Move"};
                    return woods;

                case "Zealot" :
                    String [] zeal = {"Common Knowledge(Elves)", "Speak Language(Eltharin)", "Speak Language(Reikspiel)", "Academic Knowledge (Theology)", "Charm", "Common Knowledge(the Empire)", "Intimidate", "Read/Write"};
                    return zeal;

            }

        }
        else if (race.equalsIgnoreCase("Human"))
        {
            switch(career)
            {
                case "Agitator" :
                    String [] agitator = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Academic Knowledge(History)", "Gossip", "Academic Knowledge(Law)", "Common Knowledge(Empire)", "Concealment", "Charm", "Perception", "Read/Write", "Speak Language(Breton)", "Speak Language(Reikspiel)"};
                    return agitator;

                case "Apprentice Wizard" :
                    String [] apprentice = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Academic Knowledge(Magic)", "Channelling", "Magical Sense", "Perception", "Search", "Speak Arcane Language(Magick)", "Speak Language(Classical)"};
                    return apprentice;

                case "Bailiff" :
                    String [] bailiff = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Academic Knowledge(Law)", "Animal Care", "Gossip", "Charm", "Command", "Navigation", "Intimidiate", "Common Knowledge(the Empire)", "Perception", "Read/Write", "Ride"};
                    return bailiff;

                case  "Barber-Surgeon" :
                    String [] barber = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Charm", "Drive", "Swim", "Haggle", "Heal", "Perception", "Read/Write", "Speak Language(Breton)", "Speak Language(Tilean)", "Trade(Apothecary)"};
                    return barber;

                case "Boatman" :
                    String [] boatman = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Common Knowledge(the Empire)", "Common Knowledge(Kislev)", "Consume Alcohol", "Gossip", "Navigation", "Outdoor Survival", "Perception", "Row", "Sail", "Secret Language(Ranger)", "Speak Language(Kislevian)", "Swim"};
                    return boatman;

                case "Bodyguard" :
                    String [] bodyguard = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Dodge Blow", "Intimidate", "Perception"};
                    return bodyguard;

                case "Bone Picker" :
                    String [] bone = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Animal Care", "Charm", "Gossip", "Drive", "Common Knowledge(the Empire)", "Evaluate", "Haggle", "Perception", "Search"};
                    return bone;

                case "Bounty Hunter" :
                    String [] bounty = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Follow Trail", "Intimidate", "Outdoor Survival", "Perception", "Search", "Shadowing", "Silent Move"};
                    return bounty;

                case "Burgher" :
                    String [] burg = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Common Knowledge(the Empire)", "Consomue Alcohol", "Drive", "Evaluate", "Gossip", "Read/Write", "Haggle", "Perception", "Search", "Speak Language(Breton)", "Speak Language(Kislevian)", "Speak Language(Tilean)", "Speak Language(Reikspeil)"};
                    return burg;

                case "Camp Follower" :
                    String [] camp = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Animal Care","Drive", "Charm", "Evaluate", "Gossip", "Haggle", "Perception", "Search", "Trade(Armourer)", "Trade(Bowyer)", "Trade(Cartographer)", "Trade(Cook)", "Trade(Gunsmith)", "Trade(Herbalist)", "Trade(Tailor)", "Trade(Weaponsmith)", "Speak Language(Breton)", "Speak Language(Kislevian)", "Speak Language(Tilean)", "Sleight of Hand"};
                    return camp;

                case "Charcoal-Burner" :
                    String [] charcoal = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Common Knowledge(the Empire)", "Concealment", "Drive", "Gossip", "Haggle", "Outdoor Survival", "Perception", "Scale Sheer Surface", "Search", "Secret Signs(Ranger)"};
                    return charcoal;

                case "Coachman" :
                    String [] coach = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Animal Care", "Drive", "Gossip", "Haggle", "Heal", "Ride", "Navigation", "Perception", "Secret Signs(Ranger)", "Speak Language(Breton)","Speak Language(Kislevian)", "Speak Language(Tilean)"};
                    return coach;

                case "Entertainer" :
                    String [] entertain = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Animal Care", "Swim", "Charm",  "Common Knowledge(the Empire)", "Evaluate", "Gossip", "Perception", "Performer(any)","Performer(any)", "Animal Training" , "Blather", "Charm Animal", "Hypnotism", "Ride", "Scale Sheer Surface" , "Sleight of Hand" ,"Ventriloquism"};
                    return entertain;

                case "Envoy" :
                    String [] envoy = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Charm", "Common Knowledge(the Empire)", "Common Knowledge(the Empire)", "Common Knowledge(the Wasteland)", "Evaluate", "Gossip", "Haggle", "Perception", "Read/Write", "Secret Language(Guild Tongue)", "Swim", "Trade(Merchant)"};
                    return envoy;

                case "Estalian Diestro" :
                    String [] estal = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Academic Knowledge(Science)", "Common Knowledge(Estalia)", "Dodge Blow", "Read/Write", "Speak Language(Estalian)"};
                    return estal;

                case "Ferryman" :
                    String [] ferry = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Charm", "Common Knowledge(the Empire)", "Evaluate", "Secret Language(Ranger Tongue)", "Gossip", "Intimidate", "Haggle", "Perception","Row", "Swim"};
                    return ferry;

                case "Fieldwarden" :
                    String [] field = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Academic Knowledge(Necromancy)", "Common Knowledge(the Empire)", "Concealment", "Follow Trail", "Outdoor Survival", "Perception", "Search", "Silent Move"};
                    return field;

                case "Fisherman" :
                    String [] fisher = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Common Knowledge(the Empire)", "Common Knowledge(the Wasteland)", "Consume Alcohol", "Haggle", "Navigation", "Trade(Merchant)", "Outdoor Survival", "Perception", "Row", "Sail", "Speak Language(Reikspiel)", "Speak Language(Norse)", "Swim"};
                    return fisher;

                case "Grave Robber" :
                    String [] grave = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Drive", "Gossip", "Haggle", "Perception", "Scale Sheer Surface", "Search", "Secret Signs(Thief)", "Silent Move"};
                    return grave;

                case "Hedge Wizard" :
                    String [] hedge = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Animal Care", "Haggle", "Charm", "Intimidate", "Channelling", "Charm Animal", "Trade(Apothecary)", "Heal", "Hypnotism", "Magical Sense", "Perception", "Search"};
                    return hedge;

                case "Hunter" :
                    String [] hunt = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Concealment", "Follow Trail", "Outdoor Survival", "Perception", "Search", "Swim", "Secret Signs(Ranger)", "Silent Move", "Set Trap"};
                    return hunt;

                case "Initiate" :
                    String [] init = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Academic Knowledge(Astronomy)", "Academic Knowledge(History)", "Academic Knowledge(Theology)", "Charm", "Heal", "Perception", "Read/Write", "Speak Language(Classical)", "Speak Language(Reikspiel)"};
                    return init;

                case "Jailer" :
                    String [] jail = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Command", "Consume Alcohol", "Dodge Blow", "Heal", "Sleight of Hand", "Intimidate", "Perception", "Search"};
                    return jail;

                case "Kislevite Kossar" :
                    String [] kislev = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Common Knowledge(Kislev)", "Consume Alcohol", "Dodge Blow", "Gamble", "Gossip", "Outdoor Survival", "Perception", "Search", "Speak Language(Kislevian)"};
                    return kislev;

                case "Kithband Warrior" :
                    String [] kith = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Concealment", "Dodge Blow", "Follow Trail", "Heal", "Search", "Outdoor Survival", "Perception", "Scale Sheer Surface", "Silent Move"};
                    return kith;

                case "Marine" :
                    String [] marine = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Common Knowledge(the Wasteland)","Gamble", "Consume Alcohol", "Dodge Blow", "Gossip", "Secret Language(Battle Tongue)", "Intimidate", "Row", "Swim"};
                    return marine;

                case "Mercenary" :
                    String [] merc = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Animal Care", "Gamble", "Common Knowledge(Bretonnia)", "Common Knowledge(Kislev)", "Common Knowledge(Tilea)", "Dodge Blow", "Drive", "Ride", "Gossip", "Haggle", "Perception", "Search", "Secret Language(Battle Tongue)", "Speak Language (Tilean)", "Swim"};
                    return merc;

                case "Messenger" :
                    String [] mess = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Animal Care", "Common Knowledge(the Empire)", "Common Knowledge(the Wasteland)", "Gossip", "Navigation", "Outdoor Survival", "Secret Signs(Scout)", "Perception", "Ride", "Speak Language(Reikspiel)", "Swim"};
                    return mess;

                case "Militiaman" :
                    String [] militia = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Animal Care", "Dodge Blow", "Drive", "Swim", "Gamble", "Gossip", "Outdoor Survival", "Perception", "Search", "Trade(any)"};
                    return militia;

                case "Miner" :
                    String [] miner = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Animal Care", "Concealment", "Drive", "Evaluate", "Outdoor Survival", "Navigation", "Perception", "Scale Sheer Surface", "Trade(Miner)", "Trade(Prospector)"};
                    return miner;

                case "Noble" :
                    String [] noble = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Blather", "Command", "Common Knowledge(the Empire)", "Consume Alcohol", "Performer (Musician)", "Charm", "Gamble", "Gossip", "Read/Write", "Ride", "Speak Language(Reikspiel)"};
                    return noble;

                case "Norse Berserker" :
                    String [] norse = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Common Knowledge(Norsca)", "Consume Alcohol", "Intimidate", "Performer(Storyteller)", "Speak Language(Norse)", "Swim"};
                    return norse;

                case "Outlaw" :
                    String [] outlaw = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Animal Care", "Common Knowledge(the Empire)", "Concealment", "Dodge Blow", "Drive", "Ride", "Gossip", "Secret Signs(Thief)", "Perception", "Scale Sheer Surface", "Set Trap", "Swim", "Silent Move"};
                    return outlaw;

                case "Outrider" :
                    String [] outrider = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Animal Care", "Follow Trail", "Navigation", "Outdoor Survival", "Perception", "Ride", "Search", "Silent Move"};
                    return outrider;

                case "Peasant" :
                    String [] peasant = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Animal Care", "Charm", "Animal Training", "Swim", "Charm Animal", "Trade (Cook)", "Concealment", "Drive", "Trade(Bowyer)", "Gamble", "Performer(Dancer)", "Performer(Singer)", "Outdoor Survival","Trade(Farmer)", "Row" ,"Set Trap", "Scale Sheer Surface", "Silent Move"};
                    return peasant;

                case "Pit Fighter" :
                    String [] pit = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Dodge Blow", "Intimidate"};
                    return pit;

                case "Protagonist" :
                    String [] protag = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Dodge Blow", "Gossip","Haggle", "Intimidate", "Ride"};
                    return protag;

                case "Rat Catcher" :
                    String [] rat = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Animal Care", "Animal Trainer", "Concealment", "Perception", "Search", "Set Trap", "Silent Move"};
                    return rat;

                case "Roadwarden" :
                    String [] road = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Animal Care", "Common Knowledge(the Empire)", "Gossip", "Drive", "Follow Trail","Secret Signs(Scout)", "Navigation", "Outdoor Survival", "Perception", "Ride", "Search"};
                    return road;

                case "Rogue" :
                    String [] rogue = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Blather", "Charm", "Evaluate", "Gamble", "Secret Signs(Thief)", "Gossip", "Haggle", "Perception", "Performer(Actor)", "Peformer(Storyteller)", "Search", "Secret Language(Thieves’ Tongue)", "Speak Language(Reikspiel)"};
                    return rogue;

                case "Runebearer" :
                    String [] rune = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Dodge Blow", "Navigation", "Outdoor Survival", "Secret Signs(Scout)", "Perception", "Swim"};
                    return rune;

                case "Scribe" :
                    String [] scribe = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Academic Knowledge(any)", "Common Knowledge(the Empire)", "Gossip", "Perception", "Read/Write", "Secret Language(Guild Tongue)", "Speak Language(Breton)", "Speak Language(Classical)", "Speak Language(Reikspiel)", "Speak Language(Tilean)", "Trade (Calligrapher)"};
                    return scribe;

                case "Seaman" :
                    String [] seaman = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Common Knowledge (Bretonnia)", "Common Knowledge(Norsca)", "Common Knowledge(Tilea)", "Common Knowledge(the Wasteland)", "Consume Alcohol", "Perception", "Dodge Blow", "Row", "Sail", "Scale Sheer Surface", "Speak Language(Breton)","Speak Language(Norse)","Speak Language(Tilean)", "Swim"};
                    return seaman;

                case "Servant" :
                    String [] serve = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Animal Care", "Trade (Cook)", "Blather", "Dodge Blow", "Drive", "Search", "Evaluate","Haggle", "Gossip", "Perception", "Read/Write", "Sleight of Hand"};
                    return serve;

                case "Shieldbreaker" :
                    String [] shield = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Dodge Blow", "Navigation", "Perception", "Scale Sheer Surface", "Shadowing"};
                    return shield;

                case "Smuggler" :
                    String [] smugg = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Drive", "Evaluate", "Gossip", "Secret Language(Thieves’ Tongue)", "Haggle", "Perception", "Row", "Search", "Silent Move", "Speak Language(Breton)", "Speak Language(Kislevian)","Secret Signs(Thief)", "Swim"};
                    return smugg;

                case "Soldier" :
                    String [] soldier = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Animal Care", "Heal", "Common Knowledge(the Empire)", "Perception", "Dodge Blow", "Drive", "Ride", "Gamble", "Gossip", "Intimidate"};
                    return soldier;

                case "Squire" :
                    String [] squire = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Academic Knowledge(Genealogy/Heraldry)","Common Knowledge(Bretonnia)", "Animal Care", "Animal Training", "Charm", "Gossip", "Dodge Blow", "Ride", "Speak Language(Breton)", "Speak Language(Reikspiel)"};
                    return squire;

                case "Student" :
                    String [] study = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Academic Knowledge (any)", "Academic Knowledge(any)", "Gossip", "Charm", "Consume Alcohol", "Heal", "Search", "Perception", "Read/Write", "Speak Language(Classical)", "Speak Language(Reikspiel)"};
                    return study;

                case "Thief" :
                    String [] thief = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Charm","Scale Sheer Surface", "Concealment", "Evaluate", "Disguise", "Gamble", "Pick Lock", "Perception", "Read/Write", "Sleight of Hand", "Search", "Secret Language(Thieves’ Tongue)", "Secret Signs(Thief)", "Silent Move"};
                    return thief;

                case "Thug" :
                    String [] thug = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Consume Alcohol", "Dodge Blow", "Gamble", "Intimidate", "Secret Language(Thieves’ Tongue)"};
                    return thug;

                case "Toll Keeper" :
                    String [] toll = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Dodge Blow", "Evaluate", "Gossip", "Haggle", "Perception", "Read/Write", "Search", "Speak Language(Breton)", "Speak Language(Kislevian)", "Speak Language(Tilean)"};
                    return toll;

                case "Tomb Robber" :
                    String [] tomb = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Common Knowledge(the Empire)", "Secret Signs(Thief)", "Concealment", "Outdoor Survival", "Evaluate", "Perception", "Pick Lock", "Silent Move", "Read/Write", "Scale Sheer Surface", "Search", "Speak Language(Classical)", "Speak Language(Khazalid)", "Speak Language(Eltharin)"};;
                    return tomb;

                case  "Tradesman" :
                    String [] trades = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Animal Care", "Gossip", "Drive", "Haggle", "Evaluate", "Perception", "Read/Write", "Secret Language(Guild Tongue)", "Trade(any)", "Trade(any)"};
                    return trades;

                case "Troll Slayer" :
                    String [] troll = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Consume Alcohol", "Dodge Blow", "Intimidate"};
                    return troll;

                case "Vagabond" :
                    String [] vaga = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Common Knowledge(Bretonnia)", "Common Knowledge(Estalia)", "Common Knowledge(Kislev)", "Common Knowledge(Tilea)", "Gossip", "Secret Language(Ranger Tongue)", "Secret Language(Thieves’ Tongue)", "Haggle", "Swim", "Heal","Perception", "Navigation", "Outdoor Survival", "Performer(Dancer)", "Performer(Singer)","Performer(Storyteller)", "Secret Signs(Ranger)","Secret Signs(Thief)", "Silent Move"};
                    return vaga;

                case "Valet" :
                    String [] valet = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Academic Knowledge(Genealogy/Heraldry)", "Blather", "Evaluate", "Gossip", "Speak Language(Breton)", "Speak Language(Reikspiel)", "Haggle", "Perception", "Read/Write", "Search"};
                    return valet;

                case "Watchman" :
                    String [] watch = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Academic Knowledge(Law)", "Dodge Blow", "Follow Trail", "Gossip", "Intimidate", "Perception", "Search"};
                    return watch;

                case "Woodsman" :
                    String [] woods = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Concealment", "Follow Trail", "Set Trap", "Perception", "Scale Sheer Surface", "Secret Language(Ranger Tongue)", "Secret Signs(Ranger)", "Silent Move"};
                    return woods;

                case "Zealot" :
                    String [] zeal = {"Common Knowledge(Empire)", "Gossip", "Speak Language(Reikspiel)", "Academic Knowledge (Theology)", "Charm", "Common Knowledge(the Empire)", "Intimidate", "Read/Write"};
                    return zeal;
            }

        }
        else
        {
            switch(career)
            {
                case "Agitator" :
                    String [] agitator = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Academic Knowledge(History)", "Gossip", "Academic Knowledge(Law)", "Common Knowledge(Empire)", "Concealment", "Charm", "Perception", "Read/Write", "Speak Language(Breton)", "Speak Language(Reikspiel)"};
                    return agitator;

                case "Apprentice Wizard" :
                    String [] apprentice = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Academic Knowledge(Magic)", "Channelling", "Magical Sense", "Perception", "Search", "Speak Arcane Language(Magick)", "Speak Language(Classical)"};
                    return apprentice;

                case "Bailiff" :
                    String [] bailiff = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Academic Knowledge(Law)", "Animal Care", "Gossip", "Charm", "Command", "Navigation", "Intimidiate", "Common Knowledge(the Empire)", "Perception", "Read/Write", "Ride"};
                    return bailiff;

                case  "Barber-Surgeon" :
                    String [] barber = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Charm", "Drive", "Swim", "Haggle", "Heal", "Perception", "Read/Write", "Speak Language(Breton)", "Speak Language(Tilean)", "Trade(Apothecary)"};
                    return barber;

                case "Boatman" :
                    String [] boatman = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Common Knowledge(the Empire)", "Common Knowledge(Kislev)", "Consume Alcohol", "Gossip", "Navigation", "Outdoor Survival", "Perception", "Row", "Sail", "Secret Language(Ranger)", "Speak Language(Kislevian)", "Swim",};
                    return boatman;

                case "Bodyguard" :
                    String [] bodyguard = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Dodge Blow", "Intimidate", "Perception"};
                    return bodyguard;

                case "Bone Picker" :
                    String [] bone = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Animal Care", "Charm", "Gossip", "Drive", "Common Knowledge(the Empire)", "Evaluate", "Haggle", "Perception", "Search"};
                    return bone;

                case "Bounty Hunter" :
                    String [] bounty = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Follow Trail", "Intimidate", "Outdoor Survival", "Perception", "Search", "Shadowing", "Silent Move"};
                    return bounty;

                case "Burgher" :
                    String [] burg = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Common Knowledge(the Empire)", "Consomue Alcohol", "Drive", "Evaluate", "Gossip", "Read/Write", "Haggle", "Perception", "Search", "Speak Language(Breton)", "Speak Language(Kislevian)", "Speak Language(Tilean)", "Speak Language(Reikspeil)"};
                    return burg;

                case "Camp Follower" :
                    String [] camp = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Animal Care","Drive", "Charm", "Evaluate", "Gossip", "Haggle", "Perception", "Search", "Trade(Armourer)", "Trade(Bowyer)", "Trade(Cartographer)", "Trade(Cook)", "Trade(Gunsmith)", "Trade(Herbalist)", "Trade(Tailor)", "Trade(Weaponsmith)", "Speak Language(Breton)", "Speak Language(Kislevian)", "Speak Language(Tilean)", "Sleight of Hand"};
                    return camp;

                case "Charcoal-Burner" :
                    String [] charcoal = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Common Knowledge(the Empire)", "Concealment", "Drive", "Gossip", "Haggle", "Outdoor Survival", "Perception", "Scale Sheer Surface", "Search", "Secret Signs(Ranger)"};
                    return charcoal;

                case "Coachman" :
                    String [] coach = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Animal Care", "Drive", "Gossip", "Haggle", "Heal", "Ride", "Navigation", "Perception", "Secret Signs(Ranger)", "Speak Language(Breton)","Speak Language(Kislevian)", "Speak Language(Tilean)"};
                    return coach;

                case "Entertainer" :
                    String [] entertain = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Animal Care", "Swim", "Charm",  "Common Knowledge(the Empire)", "Evaluate", "Gossip", "Perception", "Performer(any)","Performer(any)", "Animal Training" , "Blather", "Charm Animal", "Hypnotism", "Ride", "Scale Sheer Surface" , "Sleight of Hand" ,"Ventriloquism"};
                    return entertain;

                case "Envoy" :
                    String [] envoy = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Charm", "Common Knowledge(the Empire)", "Common Knowledge(the Empire)", "Common Knowledge(the Wasteland)", "Evaluate", "Gossip", "Haggle", "Perception", "Read/Write", "Secret Language(Guild Tongue)", "Swim", "Trade(Merchant)"};
                    return envoy;

                case "Estalian Diestro" :
                    String [] estal = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Academic Knowledge(Science)", "Common Knowledge(Estalia)", "Dodge Blow", "Read/Write", "Speak Language(Estalian)"};
                    return estal;

                case "Ferryman" :
                    String [] ferry = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Charm", "Common Knowledge(the Empire)", "Evaluate", "Secret Language(Ranger Tongue)", "Gossip", "Intimidate", "Haggle", "Perception","Row", "Swim"};
                    return ferry;

                case "Fieldwarden" :
                    String [] field = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Academic Knowledge(Necromancy)", "Common Knowledge(the Empire)", "Concealment", "Follow Trail", "Outdoor Survival", "Perception", "Search", "Silent Move" };
                    return field;

                case "Fisherman" :
                    String [] fisher = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Common Knowledge(the Empire)", "Common Knowledge(the Wasteland)", "Consume Alcohol", "Haggle", "Navigation", "Trade(Merchant)", "Outdoor Survival", "Perception", "Row", "Sail", "Speak Language(Reikspiel)", "Speak Language(Norse)", "Swim"};
                    return fisher;

                case "Grave Robber" :
                    String [] grave = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Drive", "Gossip", "Haggle", "Perception", "Scale Sheer Surface", "Search", "Secret Signs(Thief)", "Silent Move"};
                    return grave;

                case "Hedge Wizard" :
                    String [] hedge = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Animal Care", "Haggle", "Charm", "Intimidate", "Channelling", "Charm Animal", "Trade(Apothecary)", "Heal", "Hypnotism", "Magical Sense", "Perception", "Search"};
                    return hedge;

                case "Hunter" :
                    String [] hunt = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Concealment", "Follow Trail", "Outdoor Survival", "Perception", "Search", "Swim", "Secret Signs(Ranger)", "Silent Move", "Set Trap"};
                    return hunt;

                case "Initiate" :
                    String [] init = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Academic Knowledge(Astronomy)", "Academic Knowledge(History)", "Academic Knowledge(Theology)", "Charm", "Heal", "Perception", "Read/Write", "Speak Language(Classical)", "Speak Language(Reikspiel)"};
                    return init;

                case "Jailer" :
                    String [] jail = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Command", "Consume Alcohol", "Dodge Blow", "Heal", "Sleight of Hand", "Intimidate", "Perception", "Search"};
                    return jail;

                case "Kislevite Kossar" :
                    String [] kislev = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Common Knowledge(Kislev)", "Consume Alcohol", "Dodge Blow", "Gamble", "Gossip", "Outdoor Survival", "Perception", "Search", "Speak Language(Kislevian)"};
                    return kislev;

                case "Kithband Warrior" :
                    String [] kith = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Concealment", "Dodge Blow", "Follow Trail", "Heal", "Search", "Outdoor Survival", "Perception", "Scale Sheer Surface", "Silent Move"};
                    return kith;

                case "Marine" :
                    String [] marine = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Common Knowledge(the Wasteland)","Gamble", "Consume Alcohol", "Dodge Blow", "Gossip", "Secret Language(Battle Tongue)", "Intimidate", "Row", "Swim"};
                    return marine;

                case "Mercenary" :
                    String [] merc = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Animal Care", "Gamble", "Common Knowledge(Bretonnia)", "Common Knowledge(Kislev)", "Common Knowledge(Tilea)", "Dodge Blow", "Drive", "Ride", "Gossip", "Haggle", "Perception", "Search", "Secret Language(Battle Tongue)", "Speak Language (Tilean)", "Swim"};
                    return merc;

                case "Messenger" :
                    String [] mess = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Animal Care", "Common Knowledge(the Empire)", "Common Knowledge(the Wasteland)", "Gossip", "Navigation", "Outdoor Survival", "Secret Signs(Scout)", "Perception", "Ride", "Speak Language(Reikspiel)", "Swim"};
                    return mess;

                case "Militiaman" :
                    String [] militia = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Animal Care", "Dodge Blow", "Drive", "Swim", "Gamble", "Gossip", "Outdoor Survival", "Perception", "Search", "Trade(any)"};
                    return militia;

                case "Miner" :
                    String [] miner = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Animal Care", "Concealment", "Drive", "Evaluate", "Outdoor Survival", "Navigation", "Perception", "Scale Sheer Surface", "Trade(Miner)", "Trade(Prospector)"};
                    return miner;

                case "Noble" :
                    String [] noble = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Blather", "Command", "Common Knowledge(the Empire)", "Consume Alcohol", "Performer (Musician)", "Charm", "Gamble", "Gossip", "Read/Write", "Ride", "Speak Language(Reikspiel)"};
                    return noble;

                case "Norse Berserker" :
                    String [] norse = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Common Knowledge(Norsca)", "Consume Alcohol", "Intimidate", "Performer(Storyteller)", "Speak Language(Norse)", "Swim"};
                    return norse;

                case "Outlaw" :
                    String [] outlaw = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Animal Care", "Common Knowledge(the Empire)", "Concealment", "Dodge Blow", "Drive", "Ride", "Gossip", "Secret Signs(Thief)", "Perception", "Scale Sheer Surface", "Set Trap", "Swim", "Silent Move"};
                    return outlaw;

                case "Outrider" :
                    String [] outrider = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Animal Care", "Follow Trail", "Navigation", "Outdoor Survival", "Perception", "Ride", "Search", "Silent Move"};
                    return outrider;

                case "Peasant" :
                    String [] peasant = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Animal Care", "Charm", "Animal Training", "Swim", "Charm Animal", "Trade (Cook)", "Concealment", "Drive", "Trade(Bowyer)", "Gamble", "Performer(Dancer)", "Performer(Singer)", "Outdoor Survival","Trade(Farmer)", "Row" ,"Set Trap", "Scale Sheer Surface", "Silent Move"};
                    return peasant;

                case "Pit Fighter" :
                    String [] pit = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Dodge Blow", "Intimidate"};
                    return pit;

                case "Protagonist" :
                    String [] protag = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Dodge Blow", "Gossip","Haggle", "Intimidate", "Ride"};
                    return protag;

                case "Rat Catcher" :
                    String [] rat = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Animal Care", "Animal Trainer", "Concealment", "Perception", "Search", "Set Trap", "Silent Move"};
                    return rat;

                case "Roadwarden" :
                    String [] road = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Animal Care", "Common Knowledge(the Empire)", "Gossip", "Drive", "Follow Trail","Secret Signs(Scout)", "Navigation", "Outdoor Survival", "Perception", "Ride", "Search"};
                    return road;

                case "Rogue" :
                    String [] rogue = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Blather", "Charm", "Evaluate", "Gamble", "Secret Signs(Thief)", "Gossip", "Haggle", "Perception", "Performer(Actor)", "Peformer(Storyteller)", "Search", "Secret Language(Thieves’ Tongue)", "Speak Language(Reikspiel)"};
                    return rogue;

                case "Runebearer" :
                    String [] rune = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Dodge Blow", "Navigation", "Outdoor Survival", "Secret Signs(Scout)", "Perception", "Swim"};
                    return rune;

                case "Scribe" :
                    String [] scribe = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Academic Knowledge(any)", "Common Knowledge(the Empire)", "Gossip", "Perception", "Read/Write", "Secret Language(Guild Tongue)", "Speak Language(Breton)", "Speak Language(Classical)", "Speak Language(Reikspiel)", "Speak Language(Tilean)", "Trade (Calligrapher)"};
                    return scribe;

                case "Seaman" :
                    String [] seaman = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Common Knowledge (Bretonnia)", "Common Knowledge(Norsca)", "Common Knowledge(Tilea)", "Common Knowledge(the Wasteland)", "Consume Alcohol", "Perception", "Dodge Blow", "Row", "Sail", "Scale Sheer Surface", "Speak Language(Breton)","Speak Language(Norse)","Speak Language(Tilean)", "Swim"};
                    return seaman;
                case "Servant" :
                    String [] serve = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Animal Care", "Trade (Cook)", "Blather", "Dodge Blow", "Drive", "Search", "Evaluate","Haggle", "Gossip", "Perception", "Read/Write", "Sleight of Hand"};
                    return serve;

                case "Shieldbreaker" :
                    String [] shield = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Dodge Blow", "Navigation", "Perception", "Scale Sheer Surface", "Shadowing"};
                    return shield;

                case "Smuggler" :
                    String [] smugg = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Drive", "Evaluate", "Gossip", "Secret Language(Thieves’ Tongue)", "Haggle", "Perception", "Row", "Search", "Silent Move", "Speak Language(Breton)", "Speak Language(Kislevian)","Secret Signs(Thief)", "Swim"};
                    return smugg;

                case "Soldier" :
                    String [] soldier = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Animal Care", "Heal", "Common Knowledge(the Empire)", "Perception", "Dodge Blow", "Drive", "Ride", "Gamble", "Gossip", "Intimidate"};
                    return soldier;

                case "Squire" :
                    String [] squire = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Academic Knowledge(Genealogy/Heraldry)","Common Knowledge(Bretonnia)", "Animal Care", "Animal Training", "Charm", "Gossip", "Dodge Blow", "Ride", "Speak Language(Breton)", "Speak Language(Reikspiel)"};
                    return squire;

                case "Student" :
                    String [] study = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Academic Knowledge (any)", "Academic Knowledge(any)", "Gossip", "Charm", "Consume Alcohol", "Heal", "Search", "Perception", "Read/Write", "Speak Language(Classical)", "Speak Language(Reikspiel)"};
                    return study;
                case "Thief" :
                    String [] thief = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Charm","Scale Sheer Surface", "Concealment", "Evaluate", "Disguise", "Gamble", "Pick Lock", "Perception", "Read/Write", "Sleight of Hand", "Search", "Secret Language(Thieves’ Tongue)", "Secret Signs(Thief)", "Silent Move"};
                    return thief;

                case "Thug" :
                    String [] thug = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Consume Alcohol", "Dodge Blow", "Gamble", "Intimidate", "Secret Language(Thieves’ Tongue)"};
                    return thug;

                case "Toll Keeper" :
                    String [] toll = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Dodge Blow", "Evaluate", "Gossip", "Haggle", "Perception", "Read/Write", "Search", "Speak Language(Breton)", "Speak Language(Kislevian)", "Speak Language(Tilean)"};
                    return toll;

                case "Tomb Robber" :
                    String [] tomb = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Common Knowledge(the Empire)", "Secret Signs(Thief)", "Concealment", "Outdoor Survival", "Evaluate", "Perception", "Pick Lock", "Silent Move", "Read/Write", "Scale Sheer Surface", "Search", "Speak Language(Classical)", "Speak Language(Khazalid)", "Speak Language(Eltharin)"};;
                    return tomb;
                case  "Tradesman" :
                    String [] trades = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Animal Care", "Gossip", "Drive", "Haggle", "Evaluate", "Perception", "Read/Write", "Secret Language(Guild Tongue)", "Trade(any)", "Trade(any)"};
                    return trades;

                case "Troll Slayer" :
                    String [] troll = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Consume Alcohol", "Dodge Blow", "Intimidate"};
                    return troll;

                case "Vagabond" :
                    String [] vaga = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Common Knowledge(Bretonnia)", "Common Knowledge(Estalia)", "Common Knowledge(Kislev)", "Common Knowledge(Tilea)", "Gossip", "Secret Language(Ranger Tongue)", "Secret Language(Thieves’ Tongue)", "Haggle", "Swim", "Heal","Perception", "Navigation", "Outdoor Survival", "Performer(Dancer)", "Performer(Singer)","Performer(Storyteller)", "Secret Signs(Ranger)","Secret Signs(Thief)", "Silent Move"};
                    return vaga;

                case "Valet" :
                    String [] valet = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Academic Knowledge(Genealogy/Heraldry)", "Blather", "Evaluate", "Gossip", "Speak Language(Breton)", "Speak Language(Reikspiel)", "Haggle", "Perception", "Read/Write", "Search"};
                    return valet;

                case "Watchman" :
                    String [] watch = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Academic Knowledge(Law)", "Dodge Blow", "Follow Trail", "Gossip", "Intimidate", "Perception", "Search"};
                    return watch;

                case "Woodsman" :
                    String [] woods = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Concealment", "Follow Trail", "Set Trap", "Perception", "Scale Sheer Surface", "Secret Language(Ranger Tongue)", "Secret Signs(Ranger)", "Silent Move"};
                    return woods;

                case "Zealot" :
                    String [] zeal = {"Common Knowledge(Geneaology)", "Academic Knowledge(Heraldry)", "Common Knowledge(Halflings)", "Speak Language(Halfling)", "Speak Language(Reikspiel)", "Trade(Cook)", "Trade(Farmer)", "Academic Knowledge (Theology)", "Charm", "Common Knowledge(the Empire)", "Intimidate", "Read/Write"};
                    return zeal;
            }
        }
        return basic;
    }
}
