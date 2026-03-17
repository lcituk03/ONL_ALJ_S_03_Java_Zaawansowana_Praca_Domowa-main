package pl.coderslab.java8;

@FunctionalInterface
public interface Check <N extends Number, B>{
    B check(N n);
}
