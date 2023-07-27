package pe.inuk.book.jaction.ctp1.data.apple.formatter;

import pe.inuk.book.jaction.ctp1.data.apple.Apple;

public class AppleWeightFormatter implements AppleFormatter{

    @Override
    public String accept(Apple apple) {
        return apple.getWeight() > 150 ? "heavy" : "light";
    }
}
