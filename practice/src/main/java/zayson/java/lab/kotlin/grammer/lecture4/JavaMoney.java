package zayson.java.lab.kotlin.grammer.lecture4;

import org.jetbrains.annotations.NotNull;

public class JavaMoney implements Comparable<JavaMoney> {
    private final long amount;

    public JavaMoney(long amount) {
        this.amount = amount;
    }

    @Override
    public int compareTo(@NotNull JavaMoney o) {
        return Long.compare(this.amount, o.amount);
    }
}
