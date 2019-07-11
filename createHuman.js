var stats = [20];
var skills = [30];
var talents = [30]
var d1;
var d2;
var tot;
var x = 0;
var talentCounter = 0;
var career;
createHum();

function createHum(){

    getBaseStats(); 

    stats[8] = 1;
    getWounds();//stat9
    
    stats[10] = Math.floor(stats[2] / 10);//SB
    stats[11] = Math.floor(stats[3] / 10);//TB
    stats[12] = 4;
    stats[13] = 0;
    stats[14] = 0;
    getFate();
    career = chooseHumCar();//fix dice
    skills[0] = "Common Knowledge(Empire)";
    skills[1] = "Gossip";
    skills[2] = "Speak Language(Reikspiel)";
    talents[0] = randTalents();//fix dice
    talents[1] = randTalents();

    console.log(stats);
    console.log(career);
    console.log(skills);
    skills = skills.concat(getCarSki(career));
    console.log(skills);
    console.log(talents);
}

function getBaseStats(){
    while(x < 8){


        d1 = Math.floor(Math.random() * (+11 - +1)) + +1;
        d2 = Math.floor(Math.random() * (+11 - +1)) + +1;
        tot = d1+d2+20;
        stats[x] = tot;
        x++;
        d1 = 0;
        d2 = 0;
        } 
}

function getWounds(){
    d1 = Math.floor(Math.random() * (+11 - +1)) + +1;
    switch(d1){
        case 1 :
        case 2 :
        case 3 :
            stats[9] = 10;
            break;
        case 4 :
        case 5 :
        case 6 :
            stats[9] = 11;
            break;
        case 7 :
        case 8 :
        case 9 :
        case 9 :
            stats[9] = 12;
            break;
        case 10 :
            stats[9] = 13;
    }
    d1 = 0;
}

function getFate(){
    d1 = Math.floor(Math.random() * (+11 - +1)) + +1;
    switch(d1){
        case 1 :
        case 2 :
        case 3 :
        case 4 :
            stats[15] = 2;
            break;
        case 5 :
        case 6 :
        case 7 :
        case 8 :
        case 9 :
        case 10 :
            stats[15] = 3;
            break;
    }
    d1 = 0;
}

function randTalents(){
    var dTalent = Math.floor(Math.random() * (+101 - +1)) + +1

    if(dTalent <= 4 && dTalent >= 1){
        return "Acute Hearing";
    }
    else if(dTalent <= 9 && dTalent >= 5){
        return "Ambidextrous"
    }
    else if(dTalent <= 13 && dTalent >= 10){
        return "Coolheaded";
    }
    else if(dTalent <= 18 && dTalent >= 14){
        return "Excellent Vision";
    }
    else if(dTalent <= 22 && dTalent >= 19){
        return "Fleet Footed";
    }
    else if(dTalent <= 27 && dTalent >= 23){
        return "Hardy"
    }
    else if(dTalent <= 31 && dTalent >= 28){
        return "Lightning Reflexes"
    }
    else if(dTalent <= 35 && dTalent >= 32){
        return "Luck";
    }   
    else if(dTalent <= 40 && dTalent >= 36){
        return "Marksman";
    }
    else if(dTalent <= 44 && dTalent >= 41){
        return "Mimic";
    }
    else if(dTalent <= 49 && dTalent >= 45){
        return "Night Vision";
    }
    else if(dTalent <= 53 && dTalent >= 50){
        return "Resistence to Disease";
    }
    else if(dTalent <= 57 && dTalent >= 54){
        return "Resistence to Magic";
    }
    else if(dTalent <= 61 && dTalent >= 58){
        return "Resistence to Poison";
    }
    else if(dTalent <= 66 && dTalent >= 62){
        return "Savvy";
    }
    else if(dTalent <= 71 && dTalent >= 67){
        return "Sixth Sense";
    }
    else if(dTalent <= 75 && dTalent >= 172){
        return "Strong-Minded";
    }
    else if(dTalent <= 79 && dTalent >= 76){
        return "Sturdy";
    }
    else if(dTalent <= 83 && dTalent >= 80){
        return "Suave";
    }
    else if(dTalent <= 87 && dTalent >= 84){
        return "Super Numerate";
    }
    else if(dTalent <= 91 && dTalent >= 88){
        return "Vert Resilient";
    }
    else if(dTalent <= 100 && dTalent >= 96){
        return "Warrior Born";
    }
}

function chooseHumCar(){
    var dCar = Math.floor(Math.random() * (+101 - +1));

    switch(dCar){
        case 1 :
        case 2 :
            return "Agitator";
        case 3 :
        case 4 :
            return "Apprentice Wizard";
        case 5 :
            return "Bailiff";
        case 6 : 
            return "Barber-Surgeon"
        case 7 :
        case 8 :
            return "Boatman";
        case 9 :
        case 10 :
            return "Bodyguard";
        case 11 : 
        case 12 :
            return "Bone Picker";
        case 13 : 
        case 14 :
            return "Bounty Hunter";
        case 15 :
        case 16 :
            return "Burgher"
        case 17 :
        case 18 :
            return "Camp Follower";
        case 19 :
        case 20 :
            return "Charcoal Burner";
        case 21 :
        case 22 :
            return "Coachman";
        case 23 : 
        case 24 :
            return "Entertainer";
        case 25 :
            return "Estalian Diestro";
        case 26 :
            return "Ferryman";
        case 27 :
        case 28 :
            return "Fisherman";
        case 29 :
        case 30 :
            return "Grave Robber";
        case 31 :
            return "Hedge Wizard";
        case 32 :
        case 33 : 
            return "Hunter"
        case 34 :
        case 35 :
            return "Initiate";
        case 36 :
            return "Jailer";
        case 37 :
            return "Kislevite Kossar";
        case 38 :
        case 39 :
            return "Marine";
        case 40 :
        case 41 :
            return "Mercenary"
        case 42 : 
        case 43 : 
            return "Messenger";
        case 44 :
        case 45 :
            return "Militiaman";
        case 46 :
        case 47 :
            return "Miner"
        case 48 :
        case 49 :
            return "Noble";
        case 50 :
            return "Norse Berserker";
        case 51 :
        case 52 :
            return "Outlaw";
        case 53 : 
        case 54 :
            return "Outrider";
        case 55 :
        case 56 :
            return "Peasant";
        case 57 :
        case 58 :
            return "Pit Fighter";
        case 59 :
        case 60 :
            return "Protagonist";
        case 61 :
        case 62 :
            return "Rat Catcher";
        case 63 : 
        case 64 :
            return "Roadwarden";
        case 65 :
        case 66 :
            return "Rogue";
        case 67 :
        case 68 :
            return "Scribe";
        case 69 :
        case 70 :
            return "Seaman";
        case 71 :
        case 72 :
            return "Servant";
        case 73 : 
        case 74 :
            return "Smuggler";
        case 75 :
        case 76 :
            return "Soldier";
        case 77 :
        case 78 :
            return "Squire";
        case 79 :
        case 80 :
            return "Student";
        case 81 :
        case 82 :    
            return "Thief";
        case 83 : 
        case 84 :
            return "Thug";
        case 85 :
        case 86 :
            return "Toll Keeper";
        case 87 :
        case 88 :
            return "Tomb Robber";
        case 89 :
        case 90 :
            return "Tradesman";
        case 91 :
        case 92 :
            return "Vagabond";
        case 93 : 
        case 94 :
            return "Valet";
        case 95 :
        case 96 :
            return "Watchman"
        case 97 :
        case 98 :
            return "Woodsman";
        case 99 :
        case 100 :
            return "Zealot";
                          
    }

}

function getCarSki(car){

    
        switch(car){
            case "Agitator" :
                var agitator = ["Academic Knowledge(History)", "Gossip", "Academic Knowledge(Law)", "Common Knowledge(Empire)", "Concealment", "Charm", "Perception", "Read/Write", "Speak Language(Breton)", "Speak Language(Reikspiel)"] 
                return agitator;
            case "Apprentice Wizard" :
                var apprentice = ["Academic Knowledge(Magic)", "Channelling", "Magical Sense", "Perception", "Search", "Speak Arcane Language(Magick)", "Speak Language(Classical)"];
                return apprentice;
            case "Bailiff" :
                var bailiff = ["Academic Knowledge(Law)", "Animal Care", "Gossip", "Charm", "Command", "Navigation", "Intimidiate", "Common Knowledge(the Empire)", "Perception", "Read/Write", "Ride"];
                return bailiff;
            case  "Barber-Surgeon" :
                var barber = ["Charm", "Drive", "Swim", "Haggle", "Heal", "Perception", "Read/Write", "Speak Language(Breton)", "Speak Language(Tilean)", "Trade(Apothecary)"];
                return barber;
            case "Boatman" :
                var boatman = ["Common Knowledge(the Empire)", "Common Knowledge(Kislev)", "Consume Alcohol", "Gossip", "Navigation", "Outdoor Survival", "Perception", "Row", "Sail", "Secret Language(Ranger)", "Speak Language(Kislevian)", "Swim",]
            case "Bodyguard" :
                var bodyguard = ["Dodge Blow", "Intimidate", "Perception"];
                return bodyguard;
            case "Bone Picker" :
                var bone = ["Animal Care", "Charm", "Gossip", "Drive", "Common Knowledge(the Empire)", "Evaluate", "Haggle", "Perception", "Search"];
                return bone;
            case "Bounty Hunter" :
                var bounty = ["Follow Trail", "Intimidate", "Outdoor Survival", "Perception", "Search", "Shadowing", "Silent Move"];
                return bounty;
            case "Burgher" :
                var burg = ["Common Knowledge(the Empire)", "Consomue Alcohol", "Drive", "Evaluate", "Gossip", "Read/Write", "Haggle", "Perception", "Search", "Speak Language(Breton)", "Speak Language(Kislevian)", "Speak Language(Tilean)", "Speak Language(Reikspeil)"];
                return burg;
            case "Camp Follower" :
                var camp = ["Animal Care","Drive", "Charm", "Evaluate", "Gossip", "Haggle", "Perception", "Search", "Trade(Armourer)", "Trade(Bowyer)", "Trade(Cartographer)", "Trade(Cook)", "Trade(Gunsmith)", "Trade(Herbalist)", "Trade(Tailor)", "Trade(Weaponsmith)", "Speak Language(Breton)", "Speak Language(Kislevian)", "Speak Language(Tilean)", "Sleight of Hand"];
                return camp;
            case "Charcoal-Burner" :
                var charcoal = ["Common Knowledge(the Empire)", "Concealment", "Drive", "Gossip", "Haggle", "Outdoor Survival", "Perception", "Scale Sheer Surface", "Search", "Secret Signs(Ranger)"];
                return charcoal;
            case "Coachman" :
                var coach = ["Animal Care", "Drive", "Gossip", "Haggle", "Heal", "Ride", "Navigation", "Perception", "Secret Signs(Ranger)", "Speak Language(Breton)","Speak Language(Kislevian)", "Speak Language(Tilean)"];
                return coach;
            case "Entertainer" :
                var entertain = ["Animal Care", "Swim", "Charm",  "Common Knowledge(the Empire)", "Evaluate", "Gossip", "Perception", "Performer(any)","Performer(any)", "Animal Training" , "Blather", "Charm Animal", "Hypnotism", "Ride", "Scale Sheer Surface" , "Sleight of Hand" ,"Ventriloquism"];
                return entertain;
            case "Envoy" :
                var envoy = ["Charm", "Common Knowledge(the Empire)", "Common Knowledge(the Empire)", "Common Knowledge(the Wasteland)", "Evaluate", "Gossip", "Haggle", "Perception", "Read/Write", "Secret Language(Guild Tongue)", "Swim", "Trade(Merchant)"];
                return envoy;
            case "Estalian Diestro" :
                var estal = ["Academic Knowledge(Science)", "Common Knowledge(Estalia)", "Dodge Blow", "Read/Write", "Speak Language(Estalian)"];
                return estal;
            case "Ferryman" :
                var ferry = ["Charm", "Common Knowledge(the Empire)", "Evaluate", "Secret Language(Ranger Tongue)", "Gossip", "Intimidate", "Haggle", "Perception","Row", "Swim"];
                return ferry;
            case "Fieldwarden" :
                var field = ["Academic Knowledge(Necromancy)", "Common Knowledge(the Empire)", "Concealment", "Follow Trail", "Outdoor Survival", "Perception", "Search", "Silent Move" ];
                return field; 
            case "Fisherman" :
                var fisher = ["Common Knowledge(the Empire)", "Common Knowledge(the Wasteland)", "Consume Alcohol", "Haggle", "Navigation", "Trade(Merchant)", "Outdoor Survival", "Perception", "Row", "Sail", "Speak Language(Reikspiel)", "Speak Language(Norse)", "Swim"];
                return fisher;
            case "Grave Robber" :
                var grave = ["Drive", "Gossip", "Haggle", "Perception", "Scale Sheer Surface", "Search", "Secret Signs(Thief)", "Silent Move"];
                return grave;
            case "Hedge Wizard" :
                var hedge = ["Animal Care", "Haggle", "Charm", "Intimidate", "Channelling", "Charm Animal", "Trade(Apothecary)", "Heal", "Hypnotism", "Magical Sense", "Perception", "Search"];
                return hedge;
            case "Hunter" :
                var hunt = ["Concealment", "Follow Trail", "Outdoor Survival", "Perception", "Search", "Swim", "Secret Signs(Ranger)", "Silent Move", "Set Trap"];
                return hunt;
            case "Initiate" :
                var init = ["Academic Knowledge(Astronomy)", "Academic Knowledge(History)", "Academic Knowledge(Theology)", "Charm", "Heal", "Perception", "Read/Write", "Speak Language(Classical)", "Speak Language(Reikspiel)"];
                return init;
            case "Jailer" :
                var jail = ["Command", "Consume Alcohol", "Dodge Blow", "Heal", "Sleight of Hand", "Intimidate", "Perception", "Search"];
                return jail;
            case "Kislevite Kossar" :
                var kislev = ["Common Knowledge(Kislev)", "Consume Alcohol", "Dodge Blow", "Gamble", "Gossip", "Outdoor Survival", "Perception", "Search", "Speak Language(Kislevian)"];
                return kislev;
            case "Kithband Warrior" :
                var kith = ["Concealment", "Dodge Blow", "Follow Trail", "Heal", "Search", "Outdoor Survival", "Perception", "Scale Sheer Surface", "Silent Move"];
                return kith;
            case "Marine" :
                var marine = ["Common Knowledge(the Wasteland)","Gamble", "Consume Alcohol", "Dodge Blow", "Gossip", "Secret Language(Battle Tongue)", "Intimidate", "Row", "Swim"];
                return marine; 
            case "Mercenary" :
                var merc = ["Animal Care", "Gamble", "Common Knowledge(Bretonnia)", "Common Knowledge(Kislev)", "Common Knowledge(Tilea)", "Dodge Blow", "Drive", 'Ride', "Gossip", "Haggle", "Perception", "Search", "Secret Language(Battle Tongue)", "Speak Language (Tilean)", "Swim"];
                return merc;
            case "Messenger" :
                var mess = ["Animal Care", "Common Knowledge(the Empire)", "Common Knowledge(the Wasteland)", "Gossip", "Navigation", "Outdoor Survival", "Secret Signs(Scout)", "Perception", "Ride", "Speak Language(Reikspiel)", "Swim"];
                return mess; 
            case "Militiaman" :
                var militia = ["Animal Care", "Dodge Blow", "Drive", "Swim", "Gamble", "Gossip", "Outdoor Survival", "Perception", "Search", "Trade(any)"];
                return militia;
            case "Miner" :
                var miner = ["Animal Care", "Concealment", "Drive", "Evaluate", "Outdoor Survival", "Navigation", "Perception", "Scale Sheer Surface", "Trade(Miner)", "Trade(Prospector)"];
                return miner;
            case "Noble" :
                var noble = ["Blather", "Command", "Common Knowledge(the Empire)", "Consume Alcohol", "Performer (Musician)", "Charm", "Gamble", "Gossip", "Read/Write", "Ride", "Speak Language(Reikspiel)"];
                return noble;
            case "Norse Berserker" :
                var norse = ["Common Knowledge(Norsca)", "Consume Alcohol", "Intimidate", "Performer(Storyteller)", "Speak Language(Norse)", "Swim"];
                return norse;
            case "Outlaw" :
                var outlaw = ["Animal Care", "Common Knowledge(the Empire)", "Concealment", "Dodge Blow", "Drive", "Ride", "Gossip", "Secret Signs(Thief)", "Perception", "Scale Sheer Surface", "Set Trap", "Swim", "Silent Move"];
                return outlaw;
            case "Outrider" :
                var outrider = ["Animal Care", "Follow Trail", "Navigation", "Outdoor Survival", "Perception", "Ride", "Search", "Silent Move"];
                return outrider;
            case "Peasant" :
                var peasant = ["Animal Care", "Charm", "Animal Training", "Swim", "Charm Animal", "Trade (Cook)", "Concealment", "Drive", "Trade(Bowyer)", "Gamble", "Performer(Dancer)", "Performer(Singer)", "Outdoor Survival","Trade(Farmer)", "Row" ,"Set Trap", "Scale Sheer Surface", "Silent Move"];
                return peasant;
            case "Pit Fighter" :
                var pit = [ "Dodge Blow", "Intimidate"];
                return pit; 
            case "Protagonist" :
                var protag = ["Dodge Blow", "Gossip","Haggle", "Intimidate", "Ride"];
                return protag;
            case "Rat Catcher" :
                var rat = ["Animal Care", "Animal Trainer", "Concealment", "Perception", "Search", "Set Trap", "Silent Move"];
                return rat;
            case "Roadwarden" :
                var road = ["Animal Care", "Common Knowledge(the Empire)", "Gossip", "Drive", "Follow Trail","Secret Signs(Scout)", "Navigation", "Outdoor Survival", "Perception", "Ride", "Search"];
                return road;
            case "Rogue" :
                var rogue = ["Blather", "Charm", "Evaluate", "Gamble", "Secret Signs(Thief)", "Gossip", "Haggle", "Perception", "Performer(Actor)", "Peformer(Storyteller)", "Search", "Secret Language(Thieves’ Tongue)", "Speak Language(Reikspiel)"]
            case "Runebearer" :
                var rune = ["Dodge Blow", "Navigation", "Outdoor Survival", "Secret Signs(Scout)", "Perception", "Swim"];
                return rune; 
            case "Scribe" :
                var scribe = ["Academic Knowledge(any)", "Common Knowledge(the Empire)", "Gossip", "Perception", "Read/Write", "Secret Language(Guild Tongue)", "Speak Language(Breton)", "Speak Language(Classical)", "Speak Language(Reikspiel)", "Speak Language(Tilean)", "Trade (Calligrapher)"];
                return scribe;
            case "Seaman" :
                var seaman = ["Common Knowledge (Bretonnia)", "Common Knowledge(Norsca)", "Common Knowledge(Tilea)", "Common Knowledge(the Wasteland)", "Consume Alcohol", "Perception", "Dodge Blow", "Row", "Sail", "Scale Sheer Surface", "Speak Language(Breton)","Speak Language(Norse)","Speak Language(Tilean)", "Swim"];
                return seaman;
            case "Servant" :
                var serve = ["Animal Care", "Trade (Cook)", "Blather", "Dodge Blow", "Drive", "Search", "Evaluate","Haggle", "Gossip", "Perception", "Read/Write", "Sleight of Hand"];
                return serve;
            case "Shieldbreaker" :
                var shield = ["Dodge Blow", "Navigation", "Perception", "Scale Sheer Surface", "Shadowing"];
                return shield; 
            case "Smuggler" :
                var smugg = ["Drive", "Evaluate", "Gossip", "Secret Language(Thieves’ Tongue)", "Haggle", "Perception", "Row", "Search", "Silent Move", "Speak Language(Breton)", "Speak Language(Kislevian)","Secret Signs(Thief)", "Swim"];
                return smugg;
            case "Soldier" :
                var soldier = [ "Animal Care", "Heal", "Common Knowledge(the Empire)", "Perception", "Dodge Blow", "Drive", "Ride", "Gamble", "Gossip", "Intimidate"];
                return soldier;
            case "Squire" :
                var squire = ["Academic Knowledge(Genealogy/Heraldry)","Common Knowledge(Bretonnia)", "Animal Care", "Animal Training", "Charm", "Gossip", "Dodge Blow", "Ride", "Speak Language(Breton)", "Speak Language(Reikspiel)"];
                return squire;
            case "Student" :
                var study = ["Academic Knowledge (any)", "Academic Knowledge(any)", "Gossip", "Charm", "Consume Alcohol", "Heal", "Search", "Perception", "Read/Write", "Speak Language(Classical)", "Speak Language(Reikspiel)"];
                return study;
            case "Thief" :
                var thief = [ "Charm","Scale Sheer Surface", "Concealment", "Evaluate", "Disguise", "Gamble", "Pick Lock", "Perception", "Read/Write", "Sleight of Hand", "Search", "Secret Language(Thieves’ Tongue)", "Secret Signs(Thief)", "Silent Move"];
                return thief;
            case "Thug" :
                var thug = ["Consume Alcohol", "Dodge Blow", "Gamble", "Intimidate", "Secret Language(Thieves’ Tongue)"];
                return thug; 
            case "Toll Keeper" :
                var toll = ["Dodge Blow", "Evaluate", "Gossip", "Haggle", "Perception", "Read/Write", "Search", "Speak Language(Breton)", "Speak Language(Kislevian)", "Speak Language(Tilean)"];
                return toll;
            case "Tomb Robber" :
                var tomb = ["Common Knowledge(the Empire)", "Secret Signs(Thief)", "Concealment", "Outdoor Survival", "Evaluate", "Perception", "Pick Lock", "Silent Move", "Read/Write", "Scale Sheer Surface", "Search", "Speak Language(Classical)", "Speak Language(Khazalid)", "Speak Language(Eltharin)"];;
                return tomb;
            case  "Tradesman" : 
                var trades = ["Animal Care", "Gossip", "Drive", "Haggle", "Evaluate", "Perception", "Read/Write", "Secret Language(Guild Tongue)", "Trade(any)", "Trade(any)"];
                return trades;
            case "Troll Slayer" :
                var troll = ["Consume Alcohol", "Dodge Blow", "Intimidate"];
                return troll;
            case "Vagabond" :
                var vaga = ["Common Knowledge(Bretonnia)", "Common Knowledge(Estalia)", "Common Knowledge(Kislev)", "Common Knowledge(Tilea)", "Gossip", "Secret Language(Ranger Tongue)", "Secret Language(Thieves’ Tongue)", "Haggle", "Swim", "Heal","Perception", "Navigation", "Outdoor Survival", "Performer(Dancer)", "Performer(Singer)","Performer(Storyteller)", "Secret Signs(Ranger)","Secret Signs(Thief)", "Silent Move"];
                return vaga;
            case "Valet" :
                var valet = ["Academic Knowledge(Genealogy/Heraldry)", "Blather", "Evaluate", "Gossip", "Speak Language(Breton)", "Speak Language(Reikspiel)", "Haggle", "Perception", "Read/Write", "Search"];
                return valet;
            case "Watchman" :
                var watch = ["Academic Knowledge(Law)", "Dodge Blow", "Follow Trail", "Gossip", "Intimidate", "Perception", "Search"];
                return watch;
            case "Woodsman" :
                var woods = [ "Concealment", "Follow Trail", "Set Trap", "Perception", "Scale Sheer Surface", "Secret Language(Ranger Tongue)", "Secret Signs(Ranger)", "Silent Move"];
                return woods;
            case "Zealot" :
                var zeal = ["Academic Knowledge (Theology)", "Charm", "Common Knowledge(the Empire)", "Intimidate", "Read/Write"];
                return zeal;
        }
    


}

function getCarTal(car){

    
    switch(car){
        case "Agitator" :
            var agitator = ["Coolheaded", "Street Fighting", "Flee!", "Public Speaking"]; 
            return agitator;
        case "Apprentice Wizard" :
            var apprentice = ["Aethyric Attunement", "Fast Hands", "Petty Magic(Arcane)", "Savvy", "Very Resilient"];
            return apprentice;
        case "Bailiff" :
            var bailiff = ["Etiquette", "Super Numerate", "Public Speaking"];
            return bailiff;
        case  "Barber-Surgeon" :
            var barber = ["Resistence to Disease", "Savvy", "Suave", "Very Resilient", "Surgery"];
            return barber;
        case "Boatman" :
            var boatman = ["Orientation", "Seasoned Traveler"];
            return boatman;
        case "Bodyguard" :
            var bodyguard = ["Disarm", "Quick Draw", "Specialist Weapon Group(Parrying)", "Specialist Weapon Group(Throwing)",];
            return bodyguard;
        case "Bone Picker" :
        case "Bounty Hunter" :
        case "Burgher" :
        case "Camp Follower" :
        case "Charcoal-Burner" :
        case "Coachman" :
        case "Entertainer" :
        case "Envoy" :
        case "Estalian Diestro" :
        case "Ferryman" :
        case "Fieldwarden" :
        case "Fisherman" :
        case "Grave Robber" :
        case "Hedge Wizard" :
        case "Hunter" :
        case "Initiate" :
        case "Jailer" :
        case "Kislevite Kossar" :
        case "Kithband Warrior" :
        case "Marine" :
        case "Mercenary" :
        case "Messenger" :
        case "Militiaman" :
        case "Miner" :
        case "Noble" :
        case "Norse Berserker" :
        case "Outlaw" :
        case "Outrider" :
        case "Peasant" :
        case "Pit Fighter" :
        case "Protagonist" :
        case "Rat Catcher" :
        case "Roadwarden" :
        case "Rogue" :
        case "Runebearer" :
        case "Scribe" :
        case "Seaman" :
        case "Servant" :
        case "Shieldbreaker" :
        case "Smuggler" :
        case "Soldier" :
        case "Squire" :
        case "Student" :
        case "Thief" :
        case "Thug" :
        case "Toll Keeper" :
        case "Tomb Robber" :
        case  "Tradesman" :
        case "Troll Slayer" :
        case "Vagabond" :
        case "Valet" :
        case "Watchman" :
        case "Woodsman" :
        case "Zealot" :
    }



}