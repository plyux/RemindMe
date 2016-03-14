package ua.junior.remindme.dto;

import java.util.Date;

/**
 * Created by lenin on 29.02.2016.
 */
public class RemindDTO {

    private String id;
    private String title;
    private Date remindDate;


    public RemindDTO() {

    }

    public RemindDTO(String title) {

        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getRemindDate() {
        return remindDate;
    }

    public void setRemindDate(Date remindDate) {
        this.remindDate = remindDate;
    }
}
