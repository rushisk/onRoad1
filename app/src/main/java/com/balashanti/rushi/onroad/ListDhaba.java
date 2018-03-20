package com.balashanti.rushi.onroad;

/**
 * Created by Rushikesh Kotule on 11-Feb-18.
 * Recyclerview of dhaba
 */

public class ListDhaba  {
    String Name_dhaba;

    public String getName_dhaba() {
        return Name_dhaba;
    }

    public String getType_dhaba() {
        return Type_dhaba;
    }

    String Type_dhaba;

    public ListDhaba(String name_dhaba, String type_dhaba) {
        Name_dhaba = name_dhaba;
        Type_dhaba = type_dhaba;
    }
}
