package com.springdemo.service;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSenderProx {
	
    
    private final JmsTemplate jmsQueueTemplate;
    
    public MessageSenderProx(final JmsTemplate jmsTemplate) {
        this.jmsQueueTemplate = jmsTemplate;
    }

    public void send(String queueName,final String text) {
    	
    	jmsQueueTemplate.convertAndSend(queueName,text);       
    }
    
    
}
