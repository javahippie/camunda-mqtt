/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.minautics.incubator.mqtt;

import java.util.Map;
import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.stereotype.Component;

/**
 *
 * @author zoeller
 */
@Component
public class MqttInboundListener {

    @Autowired
    private RuntimeService runtimeService;

    @Bean
    @ServiceActivator(inputChannel = "mqttInputChannel")
    public MessageHandler handler() {
        return (Message<?> message) -> {
            runtimeService.createSignalEvent("mqttInbound")
                    .setVariables(Map.of("inboundMessage", message.getPayload()))
                    .send();
        };
    }

}
