package io.github.kewne.fx;

import org.junit.Test;

import static io.github.kewne.fx.FXWrappers.*;
import static java.util.stream.Stream.of;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FXWrappersTest {

    @Test
    public void allowWrapPredicateMethodReference() {
        assertTrue(wp(String::isEmpty).test(""));
    }

    @Test
    public void allowWrapPredicateLambda() {
        assertTrue(of("hello", "")
                .allMatch(
                        wp((String s) -> s.toUpperCase().equals("HELLO"))
                                .or(s -> s.toLowerCase().isEmpty())));
    }

    @Test
    public void allowWrapFunctionLambda() {
        assertEquals("hello", wf((String s) -> s.toUpperCase().toLowerCase()).apply("hello"));
    }

    @Test
    public void allowWrapUnaryOperatorLambda() {
        assertEquals("HELLO", wuo((String s) -> s.toUpperCase()).apply("hello"));
    }

}