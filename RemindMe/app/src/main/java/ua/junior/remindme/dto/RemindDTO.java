package ua.junior.remindme.dto;

/**
 * Created by lenin on 29.02.2016.
 */
public class RemindDTO {

    private String Title;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public RemindDTO(String title) {

        Title = title;
    }
}
