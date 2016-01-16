package io.github.kewne.fx;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * A collection of wrapper methods for allowing lambda first
 * functional interface composition.
 */
public final class FXWrappers {

    private FXWrappers() {
    }

    /**
     * Convenience method for wrapping a lambda expression or method reference,
     * allowing easier composition.
     *
     * @param wrapped the predicate to wrap
     * @param <T>     the type parameter of the predicate
     * @return the input, after type coercion
     */
    public static <T> Predicate<T> wp(Predicate<T> wrapped) {
        return wrapped;
    }

    /**
     * Wrapper for {@link Function}
     *
     * @param wrapped the function to wrap
     * @param <S>     the function's input type parameter
     * @param <T>     the function's output type parameter
     * @return the input, after type coercion
     */
    public static <S, T> Function<S, T> wf(Function<S, T> wrapped) {
        return wrapped;
    }


    /**
     * Convenience method for wrapping a lambda expression,
     * allowing easier composition.
     *
     * @param wrapped the unary operator to wrap
     * @param <T>     the operator's type parameter
     * @return the input, after type coercion
     */
    public static <T> UnaryOperator<T> wuo(UnaryOperator<T> wrapped) {
        return wrapped;
    }

}
