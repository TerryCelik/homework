package com.herokuapp;

import org.junit.jupiter.api.TestInstance;
import org.springframework.test.context.ContextConfiguration;

import com.herokuapp.configuration.PropertyReader;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class BaseTest {

	PropertyReader properties = new PropertyReader();
}
