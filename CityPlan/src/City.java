import java.util.ArrayList;

public class City {

    private ArrayList<Site> sites;

    public City() {
        this.setSites(new ArrayList<Site>());
    }

    public ArrayList<Site> sites() {
        return this.sites;
    }

    public void setSites(ArrayList<Site> sites) {
        this.sites = sites;
    }

    public void addSite(){
        IOOperations ioStream = new IOOperations();
    Site s = Site.addSite();
        boolean notExistYet = true;

        for (Site site : sites) {
            if (s.equals(site)) {
                notExistYet = false;
                ioStream.print("the site is already exist so you cant use it again");
            }
        }
        if(notExistYet){
            sites.add(s);
            ioStream.print("the site was added successfully");
        }
    }

public void deleteAllSites(){
    IOOperations ioStream = new IOOperations();

    ioStream.print("are you sure you want to delete all sites? press y for confirm");
    String confirmation = ioStream.getString();
    if(confirmation.equals("y")) {
        this.sites = new ArrayList<>();
        ioStream.print("all of the sites got deleted");
    }else{
        ioStream.print("you didn't delete the sites");
    }
}

public void removeSite(){
    IOOperations ioStream = new IOOperations();
    ioStream.print("please insert the site you want to remove");
    boolean removed = false;
    Site m = Site.addSite();

    for (int i = 0; i < sites.size(); i++ ) {
        if (m.equals(sites.get(i))){
            sites.remove(sites.get(i));
            ioStream.print("site number " + i +  " got removed successfully");
            removed = true;
        }
    }
    if(!removed){
        ioStream.print("System error. the System couldn't find the site you were looking for");
    }

}

    public void viewSitesDetails() {
        IOOperations ioStream = new IOOperations();

        for (int i = 0; i < sites.size();i++) {
            ioStream.print("for the " + (i+1) + " site " + sites.get(i));
        }

        if(sites.isEmpty()){
            ioStream.print("there are zero sites active right now");
        }
    }

    public void cityBorders() {
        IOOperations ioStream = new IOOperations();
           int min = 999999999, max = 0;

        if (this.sites().isEmpty()) {
            ioStream.print("No Sites in city therefore no Border");
        } else {
            for (Site site : sites) {
                Interval I = site.getScope();
                 if(I.getStartPosition() < min){
                     min = I.getStartPosition();
                 }
                if(I.getEndPosition() > max){
                    max = I.getEndPosition();
                }
            }

            ioStream.print("the city borders are from point: " + min + " to point " + max );
        }
    }

    public void area() {
        IOOperations ioStream = new IOOperations();

        int cityArea = 0;

        for (Site site : sites) {
            cityArea += site.getArea();
        }

        ioStream.print("The city area is: " + cityArea);
    }
}