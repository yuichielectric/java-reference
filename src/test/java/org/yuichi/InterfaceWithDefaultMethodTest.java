package org.yuichi;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class InterfaceWithDefaultMethodTest {
    @Test
    public void testHello() {
        class impl implements InterfaceWithDefaultMethod {};
        assertThat(new impl().hello("yuichi"), is("Hello, yuichi"));
    }
}
