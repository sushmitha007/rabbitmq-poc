//package com.stackroute.rabbitmqlistner.config;
//
//import org.springframework.amqp.core.Exchange;
//import org.springframework.amqp.core.ExchangeBuilder;
//import org.springframework.amqp.core.TopicExchange;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class RabbitMqExchangeConfiguration {
//    @Bean
//    Exchange exampleExchange(){
//        return new TopicExchange("ExampleExchange");
//    }
//    @Bean
//    Exchange example2ndExchange(){
//        return ExchangeBuilder.directExchange("Example2ndExchange").autoDelete().internal().build();
//    }
//    @Bean
//    Exchange newExchange(){
//        return ExchangeBuilder.topicExchange("TopicTestExchange").autoDelete().durable(true).internal().build();
//    }
//    @Bean
//    Exchange fanoutExchange(){
//        return  ExchangeBuilder.fanoutExchange("fanoutTestExchange").autoDelete().durable(true).internal().build();
//    }
//    @Bean
//    Exchange headersExchange(){
//        return ExchangeBuilder.headersExchange("HeadersTestExchange").autoDelete().durable(true).internal().ignoreDeclarationExceptions().build();
//    }
//}
