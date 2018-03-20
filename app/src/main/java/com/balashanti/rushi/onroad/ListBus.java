package com.balashanti.rushi.onroad;

/**
 * Created by Rushikesh Kotule on 10-Feb-18.
 * RecyclerView of bus list
 */

public class ListBus {
    String Name_bus;
    String Type_bus;

    public String getName_bus() {
        return Name_bus;
    }

    public String getType_bus() {
        return Type_bus;
    }

    public ListBus(String name_bus, String type_bus) {

        Name_bus = name_bus;
        Type_bus = type_bus;
    }
}
