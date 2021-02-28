/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.minautics.incubator.mqtt;

import org.springframework.integration.annotation.MessagingGateway;

/**
 *
 * @author zoeller
 */
@MessagingGateway(defaultRequestChannel = MqttConfig.MQTT_OUTBOUND_CHANNEL)
public interface MqttGateway {

    void sendToMqtt(String data);

}
