package de.iteratec.workshop.gradle;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;


/**
 * A simple Java main class.
 */
public class MyApp {

  private static final Logger logger = Logger.getLogger(MyApp.class);

  public static void main(String[] args) {

    List<String> list = Arrays.asList("a", "bc", "def");

    Iterable<Integer> transformed = Iterables.transform(list,
        new Function<String, Integer>() {
          @Override
          public Integer apply(String input) {
            return input.length();
          }
        });

    logger.info(transformed);
  }

}
