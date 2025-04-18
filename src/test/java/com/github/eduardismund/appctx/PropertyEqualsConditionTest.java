package com.github.eduardismund.appctx;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

class PropertyEqualsConditionTest {
    PropertyEqualsCondition condition;

    @Test
    void test_isTrue() {
        final var properties = mock(Environment.class);
        final String test = "test";
        final String propertyName = "propertyName";
        final String expected = "test";

        condition = new PropertyEqualsCondition(propertyName, expected);

        doReturn(test).when(properties).getProperty(propertyName);

        assertTrue(condition.test(properties));
    }

    @Test
    void test_isFalse() {
        final var properties = mock(Environment.class);
        final String test = "test";
        final String propertyName = "propertyName";
        final String expected = "test1";

        condition = new PropertyEqualsCondition(propertyName, expected);

        doReturn(test).when(properties).getProperty(propertyName);

        assertFalse(condition.test(properties));
    }
}
