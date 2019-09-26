package org.giselle.examenprimerparcial;

import java.util.ArrayList;

public class ListDataHelper {

    public static ArrayList<ListViewItem> provideItems(){
        ArrayList<ListViewItem> list = new ArrayList<>();
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, android.R.color.holo_blue_bright, "Holo blue bright"));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp,android.R.color.holo_blue_light, "Holo blue light"));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp,android.R.color.holo_green_light, "Holo green light"));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp,android.R.color.holo_orange_light, "Holo orange light"));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, android.R.color.holo_red_light,"Holo red light"));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp,android.R.color.holo_purple, "Holo purple"));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, android.R.color.holo_blue_dark,"Holo blue dark"));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, android.R.color.holo_green_dark,"Holo green dark"));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp,android.R.color.holo_red_dark,"Holo red dark"));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp,android.R.color.holo_orange_dark,"Holo orange dark"));

        return list;
    }
}