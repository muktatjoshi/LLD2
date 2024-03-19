package com.app.booking.hotel.factory;

import com.app.booking.hotel.factory.component.AndroidComponentFactory;
import com.app.booking.hotel.factory.component.IosComponentFactory;
import com.app.booking.hotel.factory.component.UIComponentFactory;

public class Platform {

    public UIComponentFactory createUIComponentFactory(String plat){
        if(plat.equals("Android")){
            return new AndroidComponentFactory();
        }else if(plat.equals("IOS")){
            return new IosComponentFactory();
        }
        return null;
    }
}
