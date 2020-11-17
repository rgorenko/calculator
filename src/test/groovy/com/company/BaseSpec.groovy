package com.company

import com.company.context.BaseContext
import com.company.service.CalculationService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ContextConfiguration(classes = [BaseContext])
@SpringBootTest(classes = [App])
@ActiveProfiles("test")
class BaseSpec extends Specification {

    @Autowired
    protected CalculationService calculator
}
