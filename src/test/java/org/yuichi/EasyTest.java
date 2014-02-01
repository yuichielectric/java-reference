package org.yuichi;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class EasyTest {
    @Test
    public void easy() {
        assertThat(1 + 1, is(2));
    }
}
