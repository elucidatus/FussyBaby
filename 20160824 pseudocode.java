int timerInSeconds =0;
byte[] isStages = new byte[4] {0, 0, 0, 0}; 

Boolean isMovementFor30s, isLightSensorFor30s, isRockingFor30s;



if (isStages[0]) //if the alarm goes off and the phone received movement
{
    timerInSeconds+= elapsedTimeInSeconds;
    if (timerInSeconds > 60 && !isStages[1] && isMovementFor30s) //after 60s, if there isn't 30s of movement
    {
        isStages[1] = true;
    }
    
    
}
