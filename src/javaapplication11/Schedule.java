/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author asiri
 */
public class Schedule {

    private String[][] data = {{"", "", "", "", ""},
                               {"", "", "", "", ""},
                               {"", "", "", "", ""},
                               {"", "", "", "", ""},
                               {"", "", "", "", ""},
                               {"", "", "", "", ""},
                               {"", "", "", "", ""},
                               {"", "", "", "", ""}};
    private String course;
    private String Sec;

    public Schedule(String[][] data) {
        this.data = data;
    }
    
    public Schedule(String sun, String mon, String tue, String wed, String thu, String course) {
        String[] sunA = sun.split(",");
        String[] monA = mon.split(",");
        String[] tueA = tue.split(",");
        String[] wedA = wed.split(",");
        String[] thuA = thu.split(",");

        for (String element : sunA) {
            try {
                int i = Integer.parseInt(element);
                data[i - 1][0] = course;
            } catch (NumberFormatException numberFormatException) {
            }
        }

        for (String element : monA) {
            try {
                int i = Integer.parseInt(element);
                data[i - 1][1] = course;
            } catch (NumberFormatException numberFormatException) {
            }
        }

        for (String element : tueA) {
            try {
                int i = Integer.parseInt(element);
                data[i - 1][2] = course;
            } catch (NumberFormatException numberFormatException) {
            }
        }

        for (String element : wedA) {
            try {
                int i = Integer.parseInt(element);
                data[i - 1][3] = course;
            } catch (NumberFormatException numberFormatException) {
            }
        }

        for (String element : thuA) {
            try {
                int i = Integer.parseInt(element);
                data[i - 1][4] = course;
            } catch (NumberFormatException numberFormatException) {
            }
        }
        
        this.course = course;
    }
    
    

    

    boolean isConflicted(Schedule other) {
        for (int i = 0; i < this.getArr().length; i++) {
            for (int j = 0; j < this.getArr()[i].length; j++) {
                if (!this.getArr()[i][j].trim().isEmpty() && !other.getArr()[i][j].trim().isEmpty()) {
                    return true;

                }
            }
        }
        return false;
    }
    
    Schedule Add(Schedule other) {
        String[][] newStr = new String[8][5];
        
        for (int i = 0; i < this.getArr().length; i++) {
            for (int j = 0; j < this.getArr()[i].length; j++) {
                newStr[i][j] = this.getArr()[i][j].concat(other.getArr()[i][j]);

            }
        }
        Schedule newsc = new Schedule(newStr);
        //newsc.setSec(this.getSec().concat("*$*").concat(other.getSec()));
        return newsc;
    }
    
    
    
    public String[][] getArr() {
        return data;
    }
    
    public void setSec(String Sec) {
        this.Sec = Sec;
    }

    public String getSec() {
        return Sec;
    }
    
    void Print() {

        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {
                System.out.print(data[r][c] + " ");
            }
            System.out.println();
        }
    }

    public String getCourse() {
        return course;
    }
}
