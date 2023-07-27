package pe.inuk.book.jaction.ctp1.data.apple.predicate;

import pe.inuk.book.jaction.ctp1.data.apple.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
