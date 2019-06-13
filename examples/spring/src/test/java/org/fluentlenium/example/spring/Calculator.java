package org.fluentlenium.example.spring;

import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.example.spring.app.AndroidCalculator;
import org.junit.Test;

public class Calculator extends ExampleFluentTest {

    @Page
    private AndroidCalculator calculator;

    @Test
    public void shouldCorrectlyAdd() {
        calculator.addTwoPlusFour().verifyResult(6);
    }

}

