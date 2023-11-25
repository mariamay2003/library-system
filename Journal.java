/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package101;

public class Journal extends Book {
    private String conferenceName;
    private int conferenceNo;

    public Journal() {
    }

    public Journal(BirthDate date, Author author, String title, int no, String genre, int version, int noOfPage, String conferenceName, int conferenceNo) {
        super(date, author, title, no, genre, version, noOfPage);
        this.conferenceName = conferenceName;
        this.conferenceNo = conferenceNo;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    public int getConferenceNo() {
        return conferenceNo;
    }

    public void setConferenceNo(int conferenceNo) {
        this.conferenceNo = conferenceNo;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+" ,ConferenceName :"+this.conferenceName+" ,ConferenceNo :"+this.conferenceNo;
    }
    
  
}
