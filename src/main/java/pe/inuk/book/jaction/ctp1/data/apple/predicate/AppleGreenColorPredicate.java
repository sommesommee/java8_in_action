package pe.inuk.book.jaction.ctp1.data.apple.predicate;

import pe.inuk.book.jaction.ctp1.data.apple.Apple;

public class AppleGreenColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
