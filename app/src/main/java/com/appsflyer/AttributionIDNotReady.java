package com.appsflyer;

/**
 * Created with IntelliJ IDEA.
 * User: gilmeroz
 * Date: 12/10/13
 * Time: 3:39 PM
 * To change this template use File | Settings | File Templates.
 */
class AttributionIDNotReady extends Exception {
    public AttributionIDNotReady(){
        super("Data was not received from server yet.");
    }
}
