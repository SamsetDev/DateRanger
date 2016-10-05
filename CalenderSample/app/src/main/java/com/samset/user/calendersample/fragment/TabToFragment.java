package com.samset.user.calendersample.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


import com.samset.user.calendersample.MainActivity;
import com.samset.user.calendersample.R;
import com.samset.user.calendersample.views.CalendarView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

/**
 * A simple {@link Fragment} subclass.
 */
public class TabToFragment extends Fragment {

    private View view;
    private CalendarView calendarView;

    public TabToFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_tab_from, container, false);
        initView(view);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getSelectedDate();
    }

    private void getSelectedDate()
    {
        HashSet<Date> events = new HashSet<>();
        events.add(new Date());

        calendarView.updateCalendar(events);

        calendarView.setEventHandler(new CalendarView.EventHandler()
        {
            @Override
            public void onDayLongPress(Date date)
            {
                // show returned day
                DateFormat df = SimpleDateFormat.getDateInstance();
                Toast.makeText(getActivity(), df.format(date), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemClick(Date date) {
                DateFormat df = SimpleDateFormat.getDateInstance();
                ((MainActivity)getActivity()).getSelectedDateto(df.format(date));
                Toast.makeText(getActivity(), df.format(date), Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void initView(View view) {
        calendarView = (CalendarView) view.findViewById(R.id.calendar_view);
    }

}
