public class Time {

  private int m_nHours;

  private int m_nMinutes;

  private int m_nSeconds;

  public Time(int seconds, int minutes, int hours) {
    this.m_nHours = hours;
    this.m_nMinutes = minutes;
    this.m_nSeconds = seconds;
  }

  public int getHours() {
    return m_nHours;
  }

  public int getMinutes() {
    return m_nMinutes;
  }

  public int getSeconds() {
    return m_nSeconds;
  }

  public void setHours(int _nHours) {
    if ((_nHours > 24) || (_nHours <= 0)) {
      this.m_nHours = 0;
    } else {
      this.m_nHours = _nHours;
    }
  }

  public void setMinutes(int _nMinutes) {
    if ((_nMinutes > 60) || (_nMinutes <= 0)) {
      this.m_nMinutes = 0;
    } else {
      this.m_nMinutes = _nMinutes;
    }
  }

  public void setSeconds(int _nSeconds) {
    if ((_nSeconds > 60) || (_nSeconds <= 0)) {
      this.m_nSeconds = 0;
    } else {
      this.m_nSeconds = _nSeconds;
    }
  }

  public void print() {
    String hours = "", minutes = "", seconds = "";
    if (this.m_nHours < 10) {
      hours = "0" + this.m_nHours;
    } else {
      hours = String.valueOf(this.m_nHours);
    }

    if (this.m_nMinutes < 10) {
      minutes = "0" + this.m_nMinutes;
    } else {
      minutes = String.valueOf(this.m_nMinutes);
    }

    if (this.m_nSeconds < 10) {
      seconds = "0" + this.m_nSeconds;
    } else {
      seconds = String.valueOf(this.m_nSeconds);
    }

    String time = hours + ":" + minutes + ":" + seconds;
    System.out.print(time);
  }

  public boolean isEquals(Time tmOther) {
    if (tmOther.getHours() == this.m_nHours) {
      if (tmOther.getMinutes() == this.m_nMinutes) {
        if (tmOther.getSeconds() == this.m_nSeconds) {
          return true;
        } else return false;
      } else return false;
    } else return false;
  }

  public boolean isLater(Time tmOther) {

    if (tmOther.getHours() < this.m_nHours) {
      return true;
    } else if (tmOther.getHours() > this.m_nHours) {
      return false;
    } else {
      if (tmOther.getMinutes() < this.m_nMinutes) {
        return true;
      } else if (tmOther.getMinutes() > this.m_nMinutes) {
        return false;
      } else {
        return tmOther.getSeconds() < this.m_nSeconds;
      }
    }
  }

  public void setTo(Time tmTimeToSet) {
    this.m_nSeconds = tmTimeToSet.getSeconds();
    this.m_nMinutes = tmTimeToSet.getMinutes();
    this.m_nHours = tmTimeToSet.getHours();
  }

  private String toStringFormat(int nNumber) {

    if (nNumber < 10) return "0" + nNumber;
    else return String.valueOf(nNumber);
  }
}
