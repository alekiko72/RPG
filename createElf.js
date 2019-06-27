var stats = [20];
var d1;
var d2;
var tot;
var x = 0;
createDwa();

function createDwa(){

    getBaseStats(); 

    stats[8] = 1;
    getWounds();//stat9
    
    stats[10] = Math.floor(stats[2] / 10);//SB
    stats[11] = Math.floor(stats[3] / 10);//TB
    stats[12] = 5;
    stats[13] = 0;
    stats[14] = 0;
    getFate();

    console.log(stats);
}

function getBaseStats(){
    while(x < 8){
        d1 = Math.floor(Math.random() * (+11 - +1)) + +1;
        d2 = Math.floor(Math.random() * (+11 - +1)) + +1;
        
        switch(x){
            case 3 :
            case 7 :
            case 0 :
            case 2 :
            case 5 :
            case 6 :
                tot = d1 + d2 + 20;
                break;
            case 1 :
            case 4 :
                tot = d1 + d2 + 30;
                break;
        }
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
            stats[9] = 9;
            break;
        case 4 :
        case 5 :
        case 6 :
            stats[9] = 10;
            break;
        case 7 :
        case 8 :
        case 9 :
            stats[9] = 11;
            break;
        case 10 :
            stats[9] = 12;
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
            stats[15] = 1;
            break;
        case 5 :
        case 6 :
        case 7 :
        case 8 :
        case 9 :
        case 10 :
            stats[15] = 2;
            break;
    }
    d1 = 0;
}