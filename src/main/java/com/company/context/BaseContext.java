package com.company.context;

import com.company.commands.CommandsProvider;
import com.company.commands.CommandsRegistry;
import com.company.input.AbstractInputSource;
import com.company.input.InputSources;
import com.company.operation.OperandsMemory;
import com.company.operation.OperatorRegistry;
import com.company.operation.OperatorsProvider;
import com.company.service.CalculationService;
import com.company.service.CommandHandlerService;
import com.company.service.InputHandlerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseContext {

    @Bean
    CommandsProvider commandsProvider() {
        return new CommandsProvider();
    }

    @Bean
    CommandsRegistry commandsRegistry(CommandsProvider commandsProvider) {
        return new CommandsRegistry(commandsProvider);
    }

    @Bean
    OperatorsProvider operatorsProvider() {
        return new OperatorsProvider();
    }

    @Bean
    OperatorRegistry operatorRegistry(OperatorsProvider operatorsProvider) {
        return new OperatorRegistry(operatorsProvider);
    }

    @Bean
    OperandsMemory<Double> operandsMemory() {
        return new OperandsMemory<>();
    }

    @Bean
    AbstractInputSource inputSource() {
        return InputSources.defaultInputSource();
    }

    @Bean
    CalculationService calculationService(OperatorRegistry operatorRegistry, OperandsMemory<Double> operandsMemory) {
        return new CalculationService(operatorRegistry, operandsMemory);
    }

    @Bean
    CommandHandlerService commandHandlerService(CommandsRegistry commandsRegistry) {
        return new CommandHandlerService(commandsRegistry);
    }

    @Bean
    InputHandlerService inputHandlerService(CommandHandlerService commandHandlerService,
                                            CalculationService calculationService) {
        return new InputHandlerService(commandHandlerService, calculationService);
    }

}
