/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.minautics.incubator.delegate;

import de.minautics.incubator.mqtt.MqttGateway;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author zoeller
 */
@Component
public class SendToMqttDelegate implements JavaDelegate {
    
    @Autowired
    private MqttGateway gateway;

    @Override
    public void execute(DelegateExecution de) throws Exception {
        String data = (String) de.getVariable("mqttMessage");
        gateway.sendToMqtt(data);
    }
    
}
