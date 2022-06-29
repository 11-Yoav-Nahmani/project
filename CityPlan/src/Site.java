public class Site {

    public Interval horizontal;
    public Interval vertical;

    private Site(Interval horizontal, Interval vertical){
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

     public static Site addSite(){
        Interval horizontal = Interval.add();
        Interval vertical = Interval.add();

        return new Site(vertical,horizontal);
    }

    public Interval getHorizontal() {
        return horizontal;
    }

    public Interval getVertical() {
        return vertical;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Site site = (Site) o;
        return this.getVertical().equals(site.getVertical())  && this.getHorizontal().equals(site.getHorizontal());
    }

    public String toString(){
            return "the lines are: " + this.vertical.toString() +" vertically and " + this.horizontal.toString() + " horizontally";
        }

        public int getArea(){
        int pathA = this.horizontal.getDistance(),pathB = this.vertical.getDistance();
            return pathA*pathB;
        }

        public Interval getScope(){
            return this.getHorizontal().intervalArea(this.getVertical());
        }

    }

