public class timeNextGen {

    private String m_strTime;

        public timeNextGen(String m_strTime) {
          this.m_strTime = m_strTime;
        }

        public int getHours() {
            String hours = this.m_strTime.substring(0,2);
            return Integer.parseInt(hours);
        }

        public int getMinutes() {
            String minutes = this.m_strTime.substring(3,5);
            return Integer.parseInt(minutes);
        }

        public int getSeconds() {
            String Seconds = this.m_strTime.substring(7,8);
            return Integer.parseInt(Seconds);
        }

        public void setHours(int _nHours) {
            String Hours,Minutes,Seconds;

            if ((_nHours > 24) || (_nHours <= 0)) {
                Hours = "00";
            } else if(_nHours < 10) {
                Hours = "0" + String.valueOf(_nHours);
            }else{
                Hours = String.valueOf(_nHours);
            }


            Seconds = this.m_strTime.substring(6,7);
            Minutes = this.m_strTime.substring(3,5);

            this.m_strTime = Hours + ":" + Minutes + ":" + Seconds;
        }

    public void setMinutes(int _nMinutes) {
        String Hours,Minutes,Seconds;
        if ((_nMinutes > 60) || (_nMinutes <= 0)) {
            Minutes = "00";
        } else if(_nMinutes < 10) {
            Minutes = "0" + String.valueOf(_nMinutes);
        }else{
            Minutes = String.valueOf(_nMinutes);
        }
        Seconds = this.m_strTime.substring(6,7);
        Hours = this.m_strTime.substring(0,2);




        this.m_strTime = Hours + ":" + Minutes + ":" + Seconds;
    }

        public void setSeconds(int _nSeconds) {
            String Hours,Minutes,Seconds;
            if ((_nSeconds > 60) || (_nSeconds <= 0)) {
                Seconds = "00";
            } else if(_nSeconds < 10) {
                Seconds = "0" + String.valueOf(_nSeconds);
            }else{
                Seconds = String.valueOf(_nSeconds);
            }

            Hours = this.m_strTime.substring(0,2);
            Minutes = this.m_strTime.substring(3,5);

            this.m_strTime = Hours + ":" + Minutes + ":" + Seconds;
        }

        public void print() {
            System.out.print(this.m_strTime);
        }

        public boolean isEquals(timeNextGen tmOther) {

            if (tmOther.getHours() == Integer.parseInt(this.m_strTime.substring(0,2))) {
                if (tmOther.getMinutes() == Integer.parseInt(this.m_strTime.substring(3,5))) {
                    if (tmOther.getSeconds() == Integer.parseInt(this.m_strTime.substring(6,7))) {
                        return true;
                    } else return false;
                } else return false;
            } else return false;
        }

        public boolean isLater(timeNextGen tmOther) {

            if (tmOther.getHours() < Integer.parseInt(this.m_strTime.substring(0,2))) {
                return true;
            } else if (tmOther.getHours() > Integer.parseInt(this.m_strTime.substring(0,2))) {
                return false;
            } else {
                if (tmOther.getMinutes() < Integer.parseInt(this.m_strTime.substring(3,5))) {
                    return true;
                } else if (tmOther.getMinutes() > Integer.parseInt(this.m_strTime.substring(3,5))) {
                    return false;
                } else {
                    if (tmOther.getSeconds() < Integer.parseInt(this.m_strTime.substring(6,7))){
                        return true;
                    }else{
                        return false;
                    }
                }
            }
        }

        public void setTo(timeNextGen tmTimeToSet) {
this.m_strTime = tmTimeToSet.toString();
        }

        private String toStringFormat(int nNumber) {

            if (nNumber < 10) return "0" + nNumber;
            else return String.valueOf(nNumber);
        }


}
