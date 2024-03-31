package assignment;

import java.util.Calendar;

public class TimeTable {
    Course[][] timeTable = new Course[5][10];
    Course subject = new Course();
    
    public enum DAYS {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
    }
    
    public TimeTable() {
        initialize();
    }
    
    private void initialize() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 3) { // Lunch period
                    timeTable[i][j] = new Course("LUNCH", "", "");
                    
                } else if (j == 7) { // Dinner period
                    timeTable[i][j] = new Course("DINNER", "", "");
                    
                } else {
                    timeTable[i][j] = new Course("----", "", "");
                    
                }
            }
        }
    }
    
    public String getSchedule(String day, int period) {
        int dayIndex = DAYS.valueOf(day.toUpperCase()).ordinal();
        String schedule = "At that time you have: \n" + timeTable[dayIndex][period-1].getDetails();
        return schedule;
    }
    
    public boolean setSchedule(String day, int period, String name, String tutor, String room) {
        int dayIndex = DAYS.valueOf(day.toUpperCase()).ordinal();
        if (period == 4 || period == 8) {
            return false; // Can't schedule during lunch or dinner
        } 
        else if (timeTable[dayIndex][period-1].getName() != "----" ) {
        	return false;
        }
        
        else {
            timeTable[dayIndex][period-1] = new Course(name, tutor, room);
            return true;
        }
    }
    
    public String toString() {
        String timetableString = "";
        for (int i = 0; i < 5; i++) {
            DAYS day = DAYS.values()[i];
            timetableString += "\t"+ String.format("%10s", day.toString());
        }
        timetableString += "\n";
        for (int j = 0 ; j < 10; j++) { 
        	timetableString += (j+1);
            for (int i = 0; i < 5; i++) {
               
                timetableString += "\t" + String.format("%10s", timeTable[i][j].getName());
            }
            timetableString += "\n";
        }
        return timetableString;
    }
    
    public String oneDaySchedule(String day) {
        int dayIndex = DAYS.valueOf(day.toUpperCase()).ordinal();
        String scheduleString ="";
        scheduleString += day.toUpperCase() + "\n";
        for (int i = 0; i < 10; i++) {
            scheduleString += timeTable[dayIndex][i].getName() + "\n";
        }
        return scheduleString;
    }
    
    public String subjectSchedule(String sub) {
   
         String result = "";
         for(int i = 0; i < timeTable.length; i++) {
             for(int j = 0; j < timeTable[i].length; j++) {
                 if(timeTable[i][j].getName().equals(sub)) {
                     result += "Subject: " + sub + "\n";
                     result += "Day: " + DAYS.values()[i] + "\n";
                     result += "Lecture: " + (j + 1) + "\n";
                     result += "Professor: " + timeTable[i][j].getProfessor() + "\n";
                     result += "Room No: " + timeTable[i][j].getRoom() + "\n";
                     return result;
                 }
             }
         }
         return "No schedule found for " + sub;
    }
    
    public Calendar setInputDate(String dateString) {
        // Convert the input string to year, month, and day integers
        int year = Integer.parseInt(dateString.substring(0, 4));
        int month = Integer.parseInt(dateString.substring(4, 6));
        int day = Integer.parseInt(dateString.substring(6, 8));

        // Create a new Calendar instance and set the date information
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1); // Note: months in Calendar class are 0-indexed
        calendar.set(Calendar.DAY_OF_MONTH, day);

        return calendar;
    }
}

