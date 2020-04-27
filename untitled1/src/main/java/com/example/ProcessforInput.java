package com.example;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.message.MessageContentsList;

import javax.xml.bind.JAXBContext;
import java.io.DataInputStream;

public class ProcessforInput implements Processor {
    public void process(Exchange exchange) throws Exception {
        System.out.println(exchange.getIn().getBody());
        MessageContentsList messageContentsList = exchange.getIn().getBody(MessageContentsList.class);
        /*
        If you have multiple headers then the messageContentList will be populated as per the Service definition and the first parameter
        will become the first element of the messageContentList and the last element will become the last
        In this case the last element is the body which we can get as follows
         */
        System.out.println(">>> "+messageContentsList.size());
        User user = (User)messageContentsList.get(messageContentsList.size()-1);
        /*
        This example uses the same object as a consumer and a producer. If you want to use a different object for the
        Input of the next web service, you can create/process it here and after it is ready you can set it in the
        body of the exchange
         */
        exchange.getIn().setBody(user);
    }
}
