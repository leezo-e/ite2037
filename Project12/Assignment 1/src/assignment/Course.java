package assignment;

public class Course {
    private String name;
    private String professor;
    private String roomNumber;
    private boolean isValid = true;

    public Course() {
        /* 기본생성자 */
    }

    public Course(String name, String tutor, String room) {
       
        this.name = name;
        this.professor = tutor;
        this.roomNumber = room;
    }

    public Course(String name) {
      
        this.name = name;
    }

    public Course(Course copy) {
       
        this.name = copy.name;
        this.professor = copy.professor;
        this.roomNumber = copy.roomNumber;
    }

    public String getName() {
        
        return this.name;
    }

    public String getProfessor() {
    
        return this.professor;
    }

    public String getRoom() {
  
        return this.roomNumber;
    }

    public void setState(String tutor, String room) {
  
        this.professor = tutor;
        this.roomNumber = room;
    }

    public boolean equals(Course s) {
     
        if (s == null) {
            return false;
        }
        if (this == s) {
            return true;
        }
        return this.name.equals(s.name) && this.professor.equals(s.professor) && this.roomNumber.equals(s.roomNumber);
    }

    public String toString() {
        return this.name;
    }

    public String getDetails() {
      
        String details = "Name : " + this.name + "\nTutor : " + this.professor + "\nRoom : " + this.roomNumber;
        return details;
    }
}
