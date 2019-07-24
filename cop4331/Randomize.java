package com.example.cop4331;


import android.widget.ImageView;

public class Randomize
{

    public static String[] getStats(String race)
    {
        String [] stats = new String[16];
        int index = 0, randomNumber1 = 0, randomNumber2 = 0, total = 0;

        if (race.equalsIgnoreCase("human"))
        {
            // Half stats from WS TO FEL
            while (index < 8)
            {
                randomNumber1 = ((int) (Math.random() * 10)) + 1;
                randomNumber2 = ((int) (Math.random() * 10)) + 1;

                total = randomNumber1 + randomNumber2 + 20;

                stats[index++] = Integer.toString(total);

                randomNumber1 = randomNumber2 = 0;
            }

            stats[8] = "1"; // A

            // W(wounds)
            randomNumber1 = ((int) (Math.random() * 10)) + 1;

            switch (randomNumber1)
            {
                case 1 :
                case 2 :
                case 3 :
                    stats[9] = "10";
                    break;

                case 4 :
                case 5 :
                case 6 :
                    stats[9] = "11";
                    break;

                case 7 :
                case 8 :
                case 9 :
                    stats[9] = "12";
                    break;

                case 10 :
                    stats[9] = "13";
                    break;
            }

            randomNumber1 = 0;

            // SP to IP
            stats[10] = Integer.toString((int) Integer.parseInt(stats[2]) / 10);// SB
            stats[11] = Integer.toString((int)Integer.parseInt(stats[3]) / 10);// TB
            stats[12] = "4"; // MAG
            stats[13] = "0"; // M
            stats[14] = "0"; // IP

            // FPP
            randomNumber1 = ((int) (Math.random() * 10)) + 1;

            switch (randomNumber1)
            {
                case 1 :
                case 2 :
                case 3 :
                case 4 :
                    stats[15] = "2";
                    break;
                case 5 :
                case 6 :
                case 7 :
                case 8 :
                case 9 :
                case 10 :
                    stats[15] = "3";
                    break;
            }

            randomNumber1 = 0;

            return stats;
        }
        else if (race.equalsIgnoreCase("elf"))
        {
            // WS TO FEL
            while (index < 8)
            {
                randomNumber1 = ((int) (Math.random() * 10)) + 1;
                randomNumber2 = ((int) (Math.random() * 10)) + 1;

                switch (index)
                {
                    case 3 :
                    case 7 :
                    case 0 :
                    case 2 :
                    case 5 :
                    case 6 :
                        total = randomNumber1 + randomNumber2 + 20;
                        break;

                    case 1 :
                    case 4 :
                        total = randomNumber1 + randomNumber2 + 30;
                        break;
                }

                stats[index++] = Integer.toString(total);

                randomNumber1 = randomNumber2 = 0;
            }

            stats[8] = "1"; // A

            // W(wounds)
            randomNumber1 = ((int) (Math.random() * 10)) + 1;

            switch (randomNumber1)
            {
                case 1 :
                case 2 :
                case 3 :
                    stats[9] = "9";
                    break;

                case 4 :
                case 5 :
                case 6 :
                    stats[9] = "10";
                    break;
                case 7 :
                case 8 :
                case 9 :
                    stats[9] = "11";
                    break;
                case 10 :
                    stats[9] = "12";
            }

            randomNumber1 = 0;

            // SB to IP
            stats[10] = Integer.toString((int) Integer.parseInt(stats[2]) / 10);// SB
            stats[11] = Integer.toString((int)Integer.parseInt(stats[3]) / 10);// TB
            stats[12] = "5"; // MAG
            stats[13] = "0"; // M
            stats[14] = "0"; // IP

            // FPP
            randomNumber1 = ((int) (Math.random() * 10)) + 1;

            switch (randomNumber1)
            {
                case 1 :
                case 2 :
                case 3 :
                case 4 :
                    stats[15] = "1";
                    break;

                case 5 :
                case 6 :
                case 7 :
                case 8 :
                case 9 :
                case 10 :
                    stats[15] = "2";
                    break;
            }

            randomNumber1 = 0;

            return stats;
        }
        else if (race.equalsIgnoreCase("Dwarf"))
        {
            // WS TO FEL
            while (index < 8)
            {
                randomNumber1 = ((int) (Math.random() * 10)) + 1;
                randomNumber2 = ((int) (Math.random() * 10)) + 1;

                switch (index)
                {
                    case 4 :
                    case 7 :
                        total = randomNumber1 + randomNumber2 + 10;
                        break;

                    case 1 :
                    case 2 :
                    case 5 :
                    case 6 :
                        total = randomNumber1 + randomNumber2 + 20;
                        break;

                    case 0 :
                    case 3 :
                        total = randomNumber1 + randomNumber2 + 30;
                        break;
                }

                stats[index++] = Integer.toString(total);
                randomNumber1 = randomNumber2 = 0;
            }

            stats[8] = "1"; // A


            // W(wounds)
            randomNumber1 = ((int) (Math.random() * 10)) + 1;

            switch (randomNumber1)
            {
                case 1 :
                case 2 :
                case 3 :
                    stats[9] = "11";
                    break;

                case 4 :
                case 5 :
                case 6 :
                    stats[9] = "12";
                    break;

                case 7 :
                case 8 :
                case 9 :
                    stats[9] = "13";
                    break;

                case 10 :
                    stats[9] = "14";
                    break;
            }

            randomNumber1 = 0;

            // SB to IP
            stats[10] = Integer.toString((int) Integer.parseInt(stats[2]) / 10);// SB
            stats[11] = Integer.toString((int)Integer.parseInt(stats[3]) / 10);// TB
            stats[12] = "3"; // MAG
            stats[13] = "0"; // M
            stats[14] = "0"; // IP

            randomNumber1 = ((int) (Math.random() * 10)) + 1;

            switch (randomNumber1)
            {
                case 1 :
                case 2 :
                case 3 :
                case 4 :
                    stats[15] = "1";
                    break;

                case 5 :
                case 6 :
                case 7 :
                    stats[15] = "2";
                    break;

                case 8 :
                case 9 :
                case 10 :
                    stats[15] = "3";
                    break;
            }

            randomNumber1 = 0;

            return stats;

        }
        else
        {
            // Half stats from WS TO FEL
            while (index < 8)
            {
                randomNumber1 = ((int) (Math.random() * 10)) + 1;
                randomNumber2 = ((int) (Math.random() * 10)) + 1;


                switch (index)
                {
                    case 0:
                    case 2:
                    case 3:
                        total = randomNumber1 + randomNumber2 + 10;
                        break;

                    case 5:
                    case 6:
                        total = randomNumber1 + randomNumber2 + 20;
                        break;

                    case 1:
                    case 4:
                    case 7:
                        total = randomNumber1 + randomNumber2 + 30;
                        break;
                }

                stats[index++] = Integer.toString(total);
                randomNumber1 = randomNumber2 = 0;
            }


            stats[8] = "1"; // A


            // W(wounds)
            randomNumber1 = ((int) (Math.random() * 10)) + 1;

            switch (randomNumber1)
            {
                case 1:
                case 2:
                case 3:
                    stats[9] = "8";
                    break;

                case 4:
                case 5:
                case 6:
                    stats[9] = "9";
                    break;

                case 7:
                case 8:
                case 9:
                    stats[9] = "10";
                    break;

                case 10:
                    stats[9] = "11";
                    break;
            }

            randomNumber1 = 0;

            // SB to IP
            stats[10] = Integer.toString((int) Integer.parseInt(stats[2]) / 10);// SB
            stats[11] = Integer.toString((int)Integer.parseInt(stats[3]) / 10);// TB
            stats[12] = "4"; // MAG
            stats[13] = "0"; // M
            stats[14] = "0"; // IP

            // FPP
            randomNumber1 = ((int) (Math.random() * 10)) + 1;

            switch (randomNumber1)
            {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    stats[15] = "2";
                    break;
                case 8:
                case 9:
                case 10:
                    stats[15] = "3";
                    break;
            }

            randomNumber1 = 0;

            return stats;
        }
    }

    public static String selectCareer(String race)
    {
        String carrer = "error";
        int randomNumber = ((int) (Math.random() * 100)) + 1;

        if (race.equalsIgnoreCase("human"))
        {
            switch (randomNumber)
            {
                case 1 :
                case 2 :
                    return "Agitator";

                case 3 :
                case 4 :
                    return "Apprentice Wizard";

                case 5 :
                    return "Bailiff";

                case 6 :
                    return "Barber-Surgeon";

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
                    return "Burgher";

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
                    return "Hunter";

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
                    return "Mercenary";

                case 42 :
                case 43 :
                    return "Messenger";

                case 44 :
                case 45 :
                    return "Militiaman";

                case 46 :
                case 47 :
                    return "Miner";

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
                    return "Watchman";

                case 97 :
                case 98 :
                    return "Woodsman";

                case 99 :
                case 100 :
                    return "Zealot";
            }


        }
        else if (race.equalsIgnoreCase("elf"))
        {
            switch (randomNumber)
            {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    return "Apprentice Wizard";

                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    return "Entertainer";

                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    return "Estalian Diestro";

                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    return "Hunter";

                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                    return "Kithband Warrior";

                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                    return "Mercenary";

                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                    return "Messenger";

                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                    return "Outlaw";

                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    return "Outrider";

                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                    return "Rogue";

                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                    return "Scribe";

                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                    return "Seaman";

                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                    return "Student";

                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                    return "Thief";

                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                    return "Tradesman";

                case 94:
                case 95:
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                    return "Vagabond";
            }
        }
        else if (race.equalsIgnoreCase("dwarf"))
        {
            switch (randomNumber)
            {
                case 1 :
                case 2 :
                    return "Agitator";

                case 3 :
                case 4 :
                case 5 :
                case 6 :
                    return "Bodyguard";

                case 7 :
                case 8 :
                case 9 :
                case 10 :
                    return "Burgher";

                case 11 :
                case 12 :
                    return "Coachman";

                case 13 :
                case 14 :
                case 15 :
                    return "Entertainer";

                case 16 :
                case 17 :
                case 18 :
                case 19 :
                    return "Hunter";

                case 20 :
                case 21 :
                case 22 :
                case 23 :
                    return "Jailer";

                case 24 :
                    return "Marine";

                case 25 :
                case 26 :
                case 27 :
                case 28 :
                case 29 :
                case 30 :
                    return "Mercenary";

                case 31 :
                case 32 :
                case 33 :
                case 34 :
                    return "Militiaman";

                case 35 :
                case 36 :
                case 37 :
                case 38 :
                case 39 :
                case 40 :
                    return "Miner";

                case 41 :
                case 42 :
                    return "Noble";

                case 43 :
                case 44 :
                case 45 :
                    return "Outlaw";

                case 46 :
                case 47 :
                case 48 :
                case 49 :
                case 50 :
                    return "Pit Fighter";

                case 51 :
                case 52 :
                case 53 :
                case 54 :
                    return "Protagonist";

                case 55 :
                case 56 :
                case 57 :
                case 58 :
                    return "Rat Catcher";

                case 59 :
                case 60 :
                case 61 :
                case 62 :
                case 63 :
                    return "Runebearer";

                case 64 :
                case 65 :
                    return "Scribe";

                case 66 :
                    return "Seaman";

                case 67 :
                case 68 :
                    return "Servant";

                case 69 :
                case 70 :
                case 71 :
                case 72 :
                    return "Shieldbreaker";

                case 73 :
                case 74 :
                case 75 :
                    return "Smuggler";

                case 76 :
                case 77 :
                case 78 :
                case 79 :
                    return "Soldier";

                case 80 :
                case 81 :
                    return "Student";

                case 82 :
                case 83 :
                case 84 :
                    return "Thief";

                case 85 :
                case 86 :
                case 87 :
                    return "Toll Keeper";

                case 88 :
                case 89 :
                case 90 :
                    return "Tomb Robber";

                case 91 :
                case 92 :
                case 93 :
                case 94 :
                    return "Tradesman";

                case 95 :
                case 96 :
                case 97 :
                case 98 :
                    return "Troll Slayer";

                case 99 :
                case 100 :
                    return "Watchman";
            }
        }
        else
        {
            switch (randomNumber)
            {
                case 1 :
                case 2 :
                case 3 :
                    return "Agitator";

                case 4 :
                    return "Barber-Surgeon";

                case 5 :
                    return "Bone Picker";

                case 6 :
                case 7 :
                    return "Bounty Hunter";

                case 8 :
                case 9 :
                    return "Burgher";

                case 10 :
                case 11 :
                    return "Camp Follower";

                case 12 :
                case 13 :
                case 14 :
                    return "Charcoal-Burner";

                case 15 :
                case 16 :
                case 17 :
                    return "Entertainer";

                case 18 :
                    return "Ferryman";

                case 19 :
                case 20 :
                case 21 :
                case 22 :
                    return "Fieldwarden";

                case 23 :
                    return "Fisherman";

                case 24 :
                case 25 :
                case 26 :
                    return "Grave Robber";

                case 27 :
                case 28 :
                case 29 :
                case 30 :
                case 31 :
                    return "Hunter";

                case 32 :
                case 33 :
                case 34 :
                case 35 :
                    return "Mercenary";

                case 36 :
                case 37 :
                case 38 :
                case 39 :
                case 40 :
                    return "Messenger";

                case 41 :
                case 42 :
                case 43 :
                case 44 :
                case 45 :
                    return "Militiaman";

                case 46 :
                case 47 :
                case 48 :
                    return "Outlaw";

                case 49 :
                case 50 :
                case 51 :
                case 52 :
                case 53 :
                case 54 :
                    return "Peasant";

                case 55 :
                    return "Rat Catcher";

                case 56 :
                case 57 :
                case 58 :
                case 59 :
                case 60 :
                    return "Rogue";

                case 61 :
                case 62 :
                case 63 :
                case 64 :
                case 65 :
                    return "Servant";

                case 66 :
                case 67 :
                case 68 :
                    return "Smuggler";

                case 69 :
                case 70 :
                    return "Soldier";

                case 71 :
                case 72 :
                    return "Student";

                case 73 :
                case 74 :
                case 75 :
                case 76 :
                case 77 :
                case 78 :
                    return "Thief";

                case 79 :
                case 80 :
                    return "Toll Keeper";

                case 81 :
                case 82 :
                case 83 :
                case 84 :
                case 85 :
                    return "Tomb Robber";

                case 86 :
                case 87 :
                case 88 :
                case 89 :
                case 90 :
                    return "Tradesman";

                case 91 :
                case 92 :
                case 93 :
                case 94 :
                    return "Vagabond";

                case 95 :
                case 96 :
                    return "Valet";

                case 97 :
                case 98 :
                case 99 :
                case 100 :
                    return "Watchman";

            }
        }

        return carrer;
    }
}
