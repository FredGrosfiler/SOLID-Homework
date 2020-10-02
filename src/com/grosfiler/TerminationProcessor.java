package com.grosfiler;

public class TerminationProcessor {
    /*
    ColdWeapon currentWeapon = new ColdWeapon();

    public void termination(){
        currentWeapon.hit();
    }
    */

    private iColdWeapon currentWeapon;

    public TerminationProcessor(iColdWeapon coldWeapon){
        currentWeapon = coldWeapon;
    }

    public void termination(){
        currentWeapon.hit();
    }
}
