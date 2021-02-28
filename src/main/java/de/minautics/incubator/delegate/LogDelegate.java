/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.minautics.incubator.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

/**
 *
 * @author zoeller
 */
@Component
public class LogDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution de) throws Exception {
        System.out.println(de);
    }
    
}
