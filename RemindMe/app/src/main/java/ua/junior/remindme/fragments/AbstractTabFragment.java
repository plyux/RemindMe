package ua.junior.remindme.fragments;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by Вевдюк on 27.01.2016.
 */
public class AbstractTabFragment extends Fragment{

    private String title;
    protected View view;
    protected Context context;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
