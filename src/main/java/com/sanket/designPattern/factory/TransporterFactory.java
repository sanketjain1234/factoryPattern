package com.sanket.designPattern.factory;

import com.sanket.designPattern.transportGeneric.AbstractTransporter;
import com.sanket.designPattern.transportGeneric.ShipTransport;
import com.sanket.designPattern.transportGeneric.TruckTransport;

import javax.swing.*;

public class TransporterFactory {

    public AbstractTransporter getTransporter(String transportType){
        if((transportType.equalsIgnoreCase("truck"))){
            return new TruckTransport();
        }
        return new ShipTransport();
    }


}
