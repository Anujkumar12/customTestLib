package com.gmda.testlib;

import java.util.Collection;
import java.util.Iterator;

public class CentralTendency {

    public static Number arithmeticMean(Collection<? extends Number> numbers) {
        //check type of values
        Iterator<? extends Number> iterator = numbers.iterator();
        Number firstNumberInCollection = iterator.next();

        if (firstNumberInCollection instanceof Integer) {
            return computeMeanInt(numbers);
        } else if (firstNumberInCollection instanceof Long) {
            return computeMeanLong(numbers);
        }

        return computeMeanDouble(numbers);
    }


    /**
     * computes arithmetic mean for a set of Integer values
     *
     * @param numbers
     * @return
     */
    private static Number computeMeanInt(Collection<? extends Number> numbers) {
        double result = 0;
        Iterator<? extends  Number> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            result += iterator.next().intValue();
        }
        return result/numbers.size();
    }

    private static Number computeMeanLong(Collection<? extends Number> numbers) {
        double result = 0;
        Iterator<? extends  Number> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            result += iterator.next().longValue();
        }
        return result/numbers.size();
    }

    private static Number computeMeanDouble(Collection<? extends Number> numbers) {
        double result = 0;
        Iterator<? extends  Number> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            result += iterator.next().doubleValue();
        }
        return result/numbers.size();
    }


}
