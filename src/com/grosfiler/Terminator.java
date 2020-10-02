package com.grosfiler;

public class Terminator {

    public Terminator(String targetName, iColdWeapon currentWeapon){
        BlendInModuleWithClothes blendInModuleWithClothes = new BlendInModuleWithClothes();
        TargetTracker targetTracker = new TargetTracker(targetName);
        TerminationProcessor terminationProcessor = new TerminationProcessor(currentWeapon);
    }
}
