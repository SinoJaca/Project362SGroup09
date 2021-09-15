package za.ac.cput.entity;
/**
 * Entertainment.java
 * Entity for Entertainment
 * Author: Andy Hine(219259038)
 * Date: 15 September 2021
 **/

public class Entertainment
{
    private String ChooseEvent, about, date, time, location, cost;

    public Entertainment(Entertainment.Builder builder) {
        this.ChooseEvent = builder.ChooseEvent;
        this.about = builder.about;
        this.date = builder.date;
        this.time = builder.time;
        this.location = builder.location;
        this.cost = builder.cost;
    }

    //getters
    public String getChooseEvent() {
        return ChooseEvent;
    }
    public String getAbout() {
        return about;
    }
    public String getDate() {return date;}
    public String getTime() {
        return time;
    }
    public String getLocation() {
        return location;
    }
    public String getCost() {
        return cost;
    }

    //setters
    public void setChooseEvent(String ChooseEvent) {
        this.ChooseEvent = ChooseEvent;
    }
    public void setAbout(String about) {
        this.about = about;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setCost(String cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Entertainment{" +
                "Choose Event=" + ChooseEvent +
                ", About='" + about + '\'' +
                ", Date='" + date + '\'' +
                ", Time='" + time + '\'' +
                ", Location='" + location + '\'' +
                ", Cost='" + cost + '\'' +
                '}';
    }

    public static class Builder {

        //attributes
        private String ChooseEvent, about, date, time, location, cost;

        //setters for builder pattern
        public Entertainment.Builder setChooseEvent(String chooseEvent) {
            this.ChooseEvent = chooseEvent;
            return this;
        }

        public Entertainment.Builder setAbout(String about) {
            this.about = about;
            return this;
        }

        public Entertainment.Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Entertainment.Builder setTime(String time) {
            this.time = time;
            return this;
        }

        public Entertainment.Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Entertainment.Builder setCost(String cost) {
            this.cost = cost;
            return this;
        }

        public Entertainment build()
        {
            return new Entertainment(this);
        }

        public Entertainment.Builder copy(Builder entertainment)
        {
            this.ChooseEvent = entertainment.ChooseEvent;
            this.about = entertainment.about;
            this.date = entertainment.date;
            this.time = entertainment.time;
            this.location = entertainment.location;
            this.cost = entertainment.cost;

            return this;
        }
    }
}
