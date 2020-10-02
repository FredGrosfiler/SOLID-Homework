package com.grosfiler;

public class TargetTracker implements HumanTrackable{

String target;

    public TargetTracker(String targetName){
        String target = targetName;
    }

    @Override
    public void findTarget (){
        //поиск цели
    }

    @Override
    public void followTarget (){
        //преследование цели
    }
}
