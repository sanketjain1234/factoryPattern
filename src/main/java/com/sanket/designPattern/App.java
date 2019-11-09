package com.sanket.designPattern;

import com.sanket.designPattern.factory.TransporterFactory;
import com.sanket.designPattern.transportGeneric.AbstractTransporter;

/**
 *
 * This is the class which shows the implementation of
 * factory pattern to get appropriate object.
 *
 */
public class App 
{

    public static void main( String[] args ) {
        TransporterFactory transporterFactory = new TransporterFactory();

        AbstractTransporter transporter = transporterFactory.getTransporter("truck");
        transporter.doTransport();

        AbstractTransporter transporter2 = transporterFactory.getTransporter("ship");
        transporter2.doTransport();

    }
}
