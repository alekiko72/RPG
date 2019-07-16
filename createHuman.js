var stats = [20];
var d1;
var d2;
var tot;
var x = 0;
<<<<<<< Updated upstream
createHum();
=======
var talentCounter = 0;
var career;
testHumSkills();
>>>>>>> Stashed changes

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

<<<<<<< Updated upstream
    console.log(stats);
=======
    skills = skills.concat(getCarSki(career));
    talents = talents.concat(getCarTal(career));
    trappings = trappings.concat(getCarTrap(career));
    console.log("**********************");
    console.log(career);
    console.log(stats);
    
    console.log(skills);
    console.log(talents);
    console.log(trappings);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
}
=======
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
        return "Very Resilient";
    }
    else if(dTalent <= 95 && dTalent >= 92){
        return "Very Strong"
    }
    else if(dTalent <= 100 && dTalent >= 96){
        return "Warrior Born";
    }
}

function chooseHumCar(){
    var dCar = Math.floor(Math.random() * (+101 - +1))+ +1;

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
            return "Charcoal-Burner";
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
            var bone = ["Coolheaded","Streetwise", "Hardy", "Resistance to Disease"];
            return bone;
        case "Bounty Hunter" :
            var bounty = ["Marksman", "Strike to Stun", "Rover", "Specialist Weapon Group(Entangling)", "Sharpshooter", "Strike Mighty Blow"];
            return bounty;
        case "Burgher" :
            var burg = [ "Dealmaker", "Savvy", "Suave"];
            return burg;
        case "Camp Follower" :
            var camp = [ "Dealmaker", "Street Fighter", "Flee!", "Hardy", "Suave", "Resistance to Disease", "Seasoned Traveller"];
            return camp;
        case "Charcoal-Burner" :
            var charcoal = ["Savvy", "Very Strong"];
            return charcoal; 
        case "Coachman" :
            var coach = ["Quick Draw", "Seasoned Traveller", "Specialist Weapon Group(Gunpowder)"];
            return coach;
        case "Entertainer" :
            var entertain = ["Contortionist", "Lightning Reflexes", "Mimic", "Public Speaking", "Quick Draw", "Sharpshooter", "Specialist Weapon Group(Throwing)", "Trick Riding", "Very Strong", "Wrestling"];
            return entertain;
        case "Envoy" :
            var envoy = ["Deal Maker", "Seasoned Traveller"];
            return envoy;
        case "Estalian Diestro" :
            var estal = ["Lightning Reflexes", "Swashbuckler", "Quick Draw", "Strike to Injure", "Specialist Weapon Group(Fencing)", "Strike Mighty Blow"]
            return estal;
        case "Ferryman" :
            var ferry = ["Marksman", "Suave", "Specialist Weapon Group(Gunpowder)", "Street Fighting"];
            return ferry; 
        case "Fieldwarden" :
            var field = ["Fleet Footed", "Savvy", "Mighty Shot", "Rapid Reload", "Rover", "Quick Draw"];
            return field;
        case "Fisherman" :
            var fisher = [ "Hardy", "Savvy", "Orientation", "Street Fighting"];
            return fisher;
        case "Grave Robber" : 
            var grave = ["Flee!", "Resistance to Disease", "Streetwise", "Strongminded"];
            return grave;
        case "Hedge Wizard" :
            var hedge = ["Hedge Magic", "Petty Magic(Hedge)"];
            return hedge;
        case "Hunter" :
            var hunt = ["Hardy", "Specialist Weapon Group(Longbow)", "Lightning Reflexes", "Very Resilient", "Marksman", "Rover", "Rapid Reload"];
            return hunt;
        case "Initiate" :
            var init = ["Lightning Reflexes", "Very Strong", "Public Speaking", "Suave", "Warrior Born"];
            return init;
        case "Jailer" :
            var jail = ["Resistance to Disease", "Resistance to Poison", "Specialist Weapon Group(Entangling)", "Wrestling"];
            return jail; 
        case "Kislevite Kossar" :
            var kislev = ["Specialist Weapon Group(Two-handed)", "Strike to Injure"];
            return kislev;
        case "Kithband Warrior" :
            var kith = [ "Marksman", "Rover", "Rapid Reload", "Warrior Born"];
            return kith;
        case "Marine" :
            var marine = ["Disarm", "Quick Draw", "Strike Mighty Blow", "Strike to Stun"];
            return marine;
        case "Mercenary" :
            var merc = ["Disarm", "Quick Draw", "Rapid Reload", "Strike Mighty Blow", "Sharpshooter", "Strike to Stun"];
            return merc;
        case "Messenger" : 
            var mess = ["Orientation", "Seasoned Traveller"];
            return mess;
        case "Militiaman" :
            var militia = ["Specialist Weapon Group(Two-handed)", "Rapid Reload", "Strike Mighty Blow"];
            return militia;
        case "Miner" :
            var miner = ["Orientation", "Specialist Weapon Group(Two-handed)", "Very Resilient", "Warrior Born"];
            return miner;
        case "Noble" :
            var noble = ["Etiquette", "Luck", "Public Speaking", "Savvy", "Specialist Weapon(Fencing)", "Schemer", "Specialist Weapon(Parrying)"];
            return noble;
        case "Norse Berserker" :
            var norse = ["Frenzy", "Menacing", "Quick Draw", "Specialist Weapon Group(Two-handed)"];
            return norse;
        case "Outlaw" :
            var outlaw = [ "Rover", "Streetwise", "Sharpshooter", "Strike to Stun"];
            return outlaw;
        case "Outrider" :
            var outrider = ["Coolheaded", "Very Strong", "Orientation", "Specialist Weapon Group(Entangling)"];
            return outrider;
        case "Peasant" :
            var peasant = ["Hardy", "Rover", "Flee!", "Specialist Weapon Group(Sling)"];
            return peasant; 
        case "Pit Fighter" :
            var pit = ["Disarm", "Wrestling", "Quick Draw", "Strike to Injure", "Specialist Weapon Group(Flail)", "Specialist Weapon Group(Parrying)", "Specialist Weapon Group(Two-handed)", "Strike Mighty Blow", "Very Strong", "Strong-minded"];
            return pit;
        case "Protagonist" :
            var protag = ["Disarm", "Quick Draw", "Menacing", "Suave", "Street Fighting", "Strike Mighty Blow", "Strike to Injure", "Strike to Stun"];
            return protag;
        case "Rat Catcher" :
            var rat = ["Resistance to Disease", "Resistance to Poison", "Specialist Weapon Group(Sling)", "Tunnel Rat"];
            return rat;
        case "Roadwarden" :
            var road = ["Quick Draw", "Rapid Reload", "Specialist Weapons Group(Gunpowder)"];
            return road;
        case "Rogue" :
            var rogue = ["Flee!", "Streetwise", "Luck", "Sixth Sense", "Public Speaking"];
            return rogue;
        case "Runebearer" :
            var rune = ["Flee!", "Fleet Footed", "Sixth Sense", "Orientation", "Rapid Reload", "Very Resilient", "Very Strong"];
            return rune; 
        case "Scribe" :
            var scribe = ["Linguistics"];
            return scribe; 
        case "Seaman" :
            var sea = [ "Hardy", "Street Fighting", "Seasoned Traveller", "Strike Mighty Blow", "Swashbuckler"];
            return sea; 
        case "Servant" :
            var serve = ["Acute Hearing", "Flee!", "Etiquette", "Hardy", "Lightning Reflexes", "Very Resilient"];
            return serve;
        case "Shieldbreaker" :
            var shield = ["Acute Hearing", "Flee!", "Etiquette", "Hardy", "Lightning Reflexes", "Very Resilient"];
            return shield;
        case "Smuggler" :
            var smug = ["Dealmaker", "Streetwise"];
            return smug;
        case "Soldier" :
            var soldider = ["Disarm", "Quick Draw", "Sharpshooter", "Strike Mighty Blow", "Specialist Weapon Group(Gunpowder)", "Specialist Weapon Group(Two-handed)", "Strike to Injure", "Rapid Reload", "Strike to Stun", "Mighty Shot"]
        case "Squire" :
            var squire = ["Etiquette", "Specialist Weapon Group(Cavalry)", "Strike Mighty Blow"];
            return squire; 
        case "Student" :
            var student = ["Etiquette", "Linguistics", "Savvy", "Suave", "Seasoned Traveller", "Super Numerate"];
            return student;
        case "Thief" :
            var thief = ["Alley Cat", "Streetwise", "Super Numerate", "Trapfinder"];
            return thief;
        case "Thug" :
            var thug = ["Coolheaded", "Lightning Reflexes", "Disarm", "Resistance to Poison", "Quick Draw", "Strike to Injure", "Wrestling", "Strike to Stun"];
            return thug;
        case "Toll Keeper" :
            var toll = ["Lightning Reflexes", "Marksman"];
            return toll;
        case "Tomb Robber" :
            var tomb = [ "Luck", "Sixth Sense", "Trapfinder", "Tunnel Rat"];
            return tomb;
        case  "Tradesman" :
            var trades = ["Dealmaker", "Savvy"];
            return trades;
        case "Troll Slayer" :
            var troll = ["Disarm", "Quick Draw", "Hardy", "Lightning Reflexes", "Very Resilient", "Specialist Weapon Group(Two-handed)", "Street Fighter", "Strike Mighty Blow"];
            return troll;
        case "Vagabond" :
            var vaga = ["Fleet Footed", "Rover", "Marksman", "Orientation", "Seasoned Traveller"];
            return vaga;
        case "Valet" :
            var valet = ["Coolheaded", "Suave", "Dealmaker", "Seasoned Traveller", "Etiquette"];
            return valet;
        case "Watchman" :
            var watch = ["Coolheaded", "Savvy", "Disarm", "Street Fighting", "Strike Mighty Blow", "Strike to Stun"];
            return watch; 
        case "Woodsman" :
            var woods = ["Fleet Footed", "Very Resilient", "Rover", "Specialist Weapon Group(Two-handed)"];
            return woods; 
        case "Zealot" :
            var zealot = ["Coolheaded", "Very Strong", "Hardy", "Suave", "Public Speaking", "Specialist Weapon Group(Flail)"];
            return zealot;
    }



}

function getCarTrap(car){
    switch(car){
        case "Agitator" :
            var agitator = ["Leather Jack", "One set of Good Craftsmenship Clothes", "20 leaflets for various causes"]; 
            return agitator;
        case "Apprentice Wizard" :
            var apprentice = ["Quarter Staff", "Backpack", "Printed Book"];
            return apprentice;
        case "Bailiff" :
            var bailiff = ["Leather Jack", "Leather Skullcap", "Riding Horse", "Saddle", "Harness", "One Set of Good Craftsmenship Clothing"];
            return bailiff;
        case  "Barber-Surgeon" :
            var barber = ["Trade Tools (Barber-Surgeon)"];
            return barber;
        case "Boatman" :
            var boatman = ["Leather Jack", "Row Boat"];
            return boatman;
        case "Bodyguard" :
            var bodyguard = ["Buckler", "Knuckle-dusters", "A Pair of Throwing Axes", "Throwing Knives", "Leather Jack"];
            return bodyguard;
        case "Bone Picker" :
            var bone = ["Cart", "3 Sacks"];
            return bone;
        case "Bounty Hunter" :
            var bounty = ["Crossbow", "10 bolts", "Net", "Leather Jerkin", "Leather Skullcap", "Manacles", "10 Yards of Rope"];
            return bounty;
        case "Burgher" :
            var burg = ["Abacus", "Lantern", "One Set of Good Clothing"];
            return burg;
        case "Camp Follower" :
            var camp = ["Lucky Charm", "Trade Tools", "Pouch", "Tent"];
            return camp;
        case "Charcoal-Burner" :
            var charcoal = ["3 Torches", "Tinderbox", "Hatchet"];
            return charcoal; 
        case "Coachman" :
            var coach = ["Blunderbuss", "Powder/ammunition for 10 shots", "Mail Shirt", "Leather Jack", "Instrument (Coach Horn)"];
            return coach;
        case "Entertainer" :
            var entertain = ["Leather Jerkin", "Instrument (any)", "Trade Tools (Performer)", "3 Throwing Knives", "2 Throwing Axes", "Costume", "One Set of Good Craftsmenship Clothes"];
            return entertain;
        case "Envoy" :
            var envoy = ["Leather Jack", "2 sets of Good Craftsmenship Clothes", "Writing Kit"];
            return envoy;
        case "Estalian Diestro" :
            var estal = ["Foil", "Rapier", "One set of Best Craftsmenship Clothes", "Perfume", "Cologne", "Healing Draught"]
            return estal;
        case "Ferryman" :
            var ferry = ["Crossbow", "10 bolts", "Blunderbuss", "Powder/ammunition of 10 shots", "Leather Jack"];
            return ferry; 
        case "Fieldwarden" :
            var field = [ "Sling with Ammunition", "Lantern", "Lamp Oil", "Spade", "Pony", "Saddle", "Harness"];
            return field;
        case "Fisherman" :
            var fisher = ["Fish Hook and Line", "Spear"];
            return fisher;
        case "Grave Robber" : 
            var grave = ["Lantern", "Lamp Oil", "Pick", "Sack", "Spade"];
            return grave;
        case "Hedge Wizard" :
            var hedge = ["Healing Draught", "Hood"];
            return hedge;
        case "Hunter" :
            var hunt = ["Longbow", "10 Arrows", "2 Animal Traps", "Antitoxin Kit"];
            return hunt;
        case "Initiate" :
            var init = ["Religious Symbol", "Robes"];
            return init;
        case "Jailer" :
            var jail = ["Bottle of Common Wine", "Tankard", "Bola", "Lasso", "Net"];
            return jail; 
        case "Kislevite Kossar" :
            var kislev = ["Bow", "10 Arrows", "Twohanded Axe", "Mail Coat", "Leather Jack", "Leather Leggings"];
            return kislev;
        case "Kithband Warrior" :
            var kith = ["Elfbow", "10 Arrows", "Leather Jack"];
            return kith;
        case "Marine" :
            var marine = ["Bow", "Crossbow", "10 Arrows", "10 Bolts", "Leather Jack", "Shield", "Grappling Hook", "10 Yards of Rope"];
            return marine;
        case "Mercenary" :
            var merc = ["Crossbow", "10 Bolts", "Shield", "Mail Shirt", "Leather Jack", "Healing Draught"];
            return merc;
        case "Messenger" : 
            var mess = ["Leather Jack", "Map Case", "Riding Horse", "Saddle", "Harness", "Shield"];
            return mess;
        case "Militiaman" :
            var militia = ["Halberd", "Bow", "10 Arrows", "Leather Jack", "Leather Skullcap", "Uniform"];
            return militia;
        case "Miner" :
            var miner = ["Two-handed Pick", "Leather Jack", "Pick, Spade", "Storm Lantern", "Lamp Oi"];
            return miner;
        case "Noble" :
            var noble = ["Foil", "Main Gauche", "Noble’s Garb", "Riding Horse", "Saddle", "Harness", "10 Gold", "Jewellery worth 6d10 gc"];
            return noble;
        case "Norse Berserker" :
            var norse = ["Leather Jerkin", "Bottle of Spirits", "Great Weapon", "Shield"];
            return norse;
        case "Outlaw" :
            var outlaw = ["Bow", "10 Arrows", "Leather Jerkin", "Shield"];
            return outlaw;
        case "Outrider" :
            var outrider = ["Bow", "Crossbow", "10 Arrows", "10 Bolts", "Net", "Whip", "Lasso","Leather Jack", "Shield", "10 Yards of Rope", "Riding Horse", "Saddle", "Harness"];
            return outrider;
        case "Peasant" :
            var peasant = ["Sling", "Quarter Staff", "Leather Flask"];
            return peasant; 
        case "Pit Fighter" :
            var pit = ["Flail",  "Great Weapon", "Knuckle-duster", "Shield", "Buckler", "Mail Shirt", "Leather Jack"];
            return pit;
        case "Protagonist" :
            var protag = ["Mail Shirt",  "Leather Jack", "Shield", "Riding Horse", "Saddle", "Harness"];
            return protag;
        case "Rat Catcher" :
            var rat = ["Sling with Ammunition", "4 Animal Traps", "Pole with 10 dead rats", "Small but Vicious Dog"];
            return rat;
        case "Roadwarden" :
            var road = ["Pistol", "10 Firearm Balls and Gunpowder", "Mail Shirt", "Leather Jack", "Shield", "10 Yards of Rope", "Light Warhorse", "Saddle", "Harness"];
            return road;
        case "Rogue" :
            var rogue = ["One set of Best Craftsmenship Clothing", "Dice", "Deck of Cards", "10 Gold"];
            return rogue;
        case "Runebearer" :
            var rune = ["Crossbow", "10 Bolts", "Leather Jerkin", "Healing Draught", "Lucky Charm"];
            return rune; 
        case "Scribe" :
            var scribe = ["Knife", "A Pair of Candles", "Wax", "5 matches", "Illuminated Book", "Writing Kit"];
            return scribe; 
        case "Seaman" :
            var sea = ["Leather Jerkin", "Bottle of Poor Craftsmenship Spirits"];
            return sea; 
        case "Servant" :
            var serve = ["One Set of Good Craftsmenship Clothing", "Pewter Tankard", "Tinderbox", "Storm Lantern", "Lamp Oil"];
            return serve;
        case "Shieldbreaker" :
            var shield = ["Crossbow", "10 bolts", "Mail Coat", "Leather Jack", "Leather Leggings", "Shield", "Grappling Hook", "10 Yards of Rope", "Water Skin"];
            return shield;
        case "Smuggler" :
            var smug = ["Leather Jack", "2 Torches", "Draft Horse", "Cart", "Rowing Boat"];
            return smug;
        case "Soldier" :
            var soldider = ["Halberd",  "Firearm", "10 shots", "Shield" , "Full Leather Armour", "Uniform"]
        case "Squire" :
            var squire = ["Demilance", "Mail Shirt", "Mail Coif", "Leather Jack", "Shield", "Horse", "Saddle", "Harness"];
            return squire; 
        case "Student" :
            var student = ["Two Textbooks corresponding to Knowledge Skills", "Writing Kit"];
            return student;
        case "Thief" :
            var thief = ["Leather Jerkin", "Sack", "Lockpicks", "10 Yards of Rope"];
            return thief;
        case "Thug" :
            var thug = ["Knuckle-dusters","Mail Shirt", "Leather Jerkin"];
            return thug;
        case "Toll Keeper" :
            var toll = ["Chest", "Crossbow", "10 Bolts", "Mail Shirt", "Leather Jerkin", "Shield", "10 Gold"];
            return toll;
        case "Tomb Robber" :
            var tomb = ["Leather Jack", "Crowbar", "Lantern", "Lamp Oil", "10 Yards of Rope", "2 Sacks"];
            return tomb;
        case  "Tradesman" :
            var trades = ["Leather Jerkin", "10 Gold"];
            return trades;
        case "Troll Slayer" :
            var troll = [ "Great Weapon", "Leather Jerkin", "One Bottle of Poor Craftsmenship Spirits"];
            return troll;
        case "Vagabond" :
            var vaga = [ "Back Pack", "Rations (1 week)", "Tent", "Water Skin"];
            return vaga;
        case "Valet" :
            var valet = [ "Cologne", "Purse", "Two sets of Best Craftsmenship Clothing", "Uniform"];
            return valet;
        case "Watchman" :
            var watch = ["Leather Jack", "Lantern and Pole", "Lamp Oil", "Uniform"];
            return watch; 
        case "Woodsman" :
            var woods = ["Great Weapon(Two-handed Axe)", "Leather Jack", "Antitoxin Kit"];
            return woods; 
        case "Zealot" :
            var zealot = ["Flail", "Morning Star", "Leather Jack", "Bottle of Good Craftsmenship Spirits"];
            return zealot;
    }

}
<<<<<<< Updated upstream
testHum();
>>>>>>> Stashed changes
=======
function testHum()
{
    for(i=0;i<50;i++){
        createHum();
        stats = [];
        skills = [];
        talents = [];
        trappings = ["Common Clothing", "Breeches", "Worn Boots", "Tattered Cloak", "Dagger", "Sling", "Backpack",	"Blanket", "Wooden Tankard", "Wooden Cutlery Set", "Any Hand Weapon","13 Gold"];
        x = 0;
        talentCounter = 0;
    }

}
function testHumStats()
{
    for(i=0;i<50;i++)
    {
        //createHum() with only stats
        getBaseStats();
        stats[8] = 1;
        getWounds();
        stats[10] = Math.floor(stats[2] / 10);//SB
        stats[11] = Math.floor(stats[3] / 10);//TB
        stats[12] = 4;
        stats[13] = 0;
        stats[14] = 0;
        getFate();

        console.log(stats);
        x=0;
    }
}
function testHumSkills(){
    for(i=0;i<50;i++)
    {
    career = chooseHumCar();
    skills[0] = "Common Knowledge(Empire)";
    skills[1] = "Gossip";
    skills[2] = "Speak Language(Reikspiel)";
    skills = skills.concat(getCarSki(career));
    console.log(career);
    console.log(skills);
    skills=[];
    }
}
>>>>>>> Stashed changes
