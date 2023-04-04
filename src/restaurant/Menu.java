package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<item> menuItems = new ArrayList<>();
    private Date LastUpdated;

    public ArrayList<item> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<item> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return LastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        LastUpdated = lastUpdated;
    }
}