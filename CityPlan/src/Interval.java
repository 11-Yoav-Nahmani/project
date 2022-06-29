import java.util.Objects;

public class Interval {
    public int start,end;

   public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }


    public static Interval add(){
        IOOperations ioStream = new IOOperations();
        ioStream.print("please type the start value");
         int start = ioStream.getNumber();
        ioStream.print("please type the end value");
        int end = ioStream.getNumber();

        while(end < start || start < 0 ){
            ioStream.print("error. interval input is not accepted");
            ioStream.print("the two numbers has to be higher than 0 and the end number has to higher then the start number");
            ioStream.print("please type the start value again");
            start = ioStream.getNumber();
            ioStream.print("please type the end value again");
            end = ioStream.getNumber();
        }
        return new Interval(start,end);
    }

    public int getEndPosition() {
        return end;
    }


    public int getStartPosition() {
        return start;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interval interval = (Interval) o;
        return this.getStartPosition() == interval.getStartPosition() && this.getEndPosition() == interval.getEndPosition();
    }



    @Override
    public String toString(){
        return this.start + " - " + this.end;
    }

    public int getDistance(){
       return this.getEndPosition() - this.getStartPosition();
    }

    public Interval intervalArea(Interval i){
       int max,min;

       if(this.getStartPosition() < i.getStartPosition()){
           min = this.getStartPosition();
       }else{
           min = i.getStartPosition();
       }
        if(this.getEndPosition() > i.getEndPosition()){
            max = this.getEndPosition();
        }else{
            max = i.getEndPosition();
        }
       return new Interval(min,max);
    }

}
