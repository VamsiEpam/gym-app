package com.epam.gymapp.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class Topic {
    @Bean
    public NewTopic getReportTopic()
    {
        return TopicBuilder.name("report").build();
    }
    @Bean
    public NewTopic getNotificationTopic()
    {
        return TopicBuilder.name("notification").build();
    }

}
