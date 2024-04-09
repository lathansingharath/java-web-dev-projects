package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> menufood = new ArrayList<>();
    private Date lastUpdate;
    private Boolean hasKidsMenue;


    public Menu(ArrayList<MenuItem> menufood, Date lastUpdate, Boolean hasKidsMenue) {
        this.menufood = menufood;
        this.lastUpdate = lastUpdate;
        this.hasKidsMenue = hasKidsMenue;
    }

    public ArrayList<MenuItem> getMenufood() {
        return menufood;
    }

    public void setMenufood(ArrayList<MenuItem> menufood) {
        this.menufood = menufood;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Boolean getHasKidsMenue() {
        return hasKidsMenue;
    }

    public void setHasKidsMenue(Boolean hasKidsMenue) {
        this.hasKidsMenue = hasKidsMenue;
    }
}
