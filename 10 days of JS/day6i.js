function getDayName(dateString) {
    let dayName = new Date(dateString).toString().split(' ');
    switch(dayName[0]){
        case 'Sun': dayName = 'Sunday';
            break;
        case 'Mon': dayName = 'Monday';
            break;
        case 'Tue': dayName = 'Tuesday';
            break;
        case 'Wed': dayName = 'Wednesday';
            break;
        case 'Thu': dayName = 'Thursday';
            break;
        case 'Fri': dayName = 'Friday';
            break;
        case 'Sat': dayName = 'Saturday';
            break;
    }
    return dayName;
}