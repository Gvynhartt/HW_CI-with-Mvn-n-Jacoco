package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions; /** во-первых, при таком импорте "Assertions" попросту не будет работать */

public class StatisticsServiceTest {

    @Test
    void findMaxIfLowerThanInitialCurrentMax() { /** исходное название теста "findMax" неинформативно */
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual); /** во-вторых, при таком объявлении объекта метод также не будет работать */
    }

    @Test

    /**
     * в-третьих, исходный код, наша священная корова, содержит балластную переменную "current_max_index",
     * которая нигде не используется, поэтому из 3 предложенных в задании метрик LINES (скорей всего) отпадает;
     * INSTRUCTIONS предполагает понимание работы байткода Java, каковое в межушном ганглии отсутствует;
     * следовательно, мы будем проверять покрытие всех джвух веток целой одной развилки после "if", поэтому наш вариант - BRANCHES
     * (ой, как же удобно, что именно его нам показывали в лекции)
     */
    void findMaxIfHigherThanInitialCurrentMax() {
        StatisticsService slavice = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 13, 8, 6, 11, 11, 12};
        long expected = 13;

        long actual = slavice.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxIfAllValuesEqual() {
        /** на всякий случай ещё набросим на вентилятор тест, который провряет покрытие
     при отсутствии переназначений переменной "current_max" внутри цикла*/
        StatisticsService saabisu = new StatisticsService();

        long[] incomesInBillions = {13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13};
        long expected = 13;

        long actual = saabisu.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }
}
