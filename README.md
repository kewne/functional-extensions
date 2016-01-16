# Functional extensions

A Java experiment gone wrong.

I started this due to the recurring annoyance that is
only being able to compose expressions with lambdas and
method references when said lambdas and method references
are at the start of the expression.

For example, the following are impossible
(yes, I am aware that composing these particular methods is smelly):

```java
(String::trim).andThen(String::toUpperCase);

(s -> s.trim()).andThen(s -> s.toUpperCase());
```

My initial idea for this repo was to use wrapping methods to
get around it:

```java
// Static imports used
wf(String::trim).andThen(String::toUpperCase);

wf(s -> s.trim()).andThen(s -> s.toUpperCase());
```

but, as it turns out, the code above does not compile
because the compiler infers the types as being `Object`
and then complains it cannot find the methods.
