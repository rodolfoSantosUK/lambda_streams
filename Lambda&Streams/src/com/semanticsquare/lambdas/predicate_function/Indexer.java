package com.semanticsquare.lambdas.predicate_function;


import org.htmlcleaner.HtmlCleaner;

import java.util.Arrays;
import java.util.List;

class Indexer {

    private static List<String> stopWords = Arrays.asList("of", "the", "a", "is", "to", "in", "and");

    static String stripHtmlTags(String doc) {
        return new HtmlCleaner().clean(doc).getText().toString();
    }

    static String removeStopwords(String doc) {

        StringBuilder sb = new StringBuilder();
        for (String word : doc.split(" ")) {
            if (!stopWords.contains(word))
                sb.append(word).append(" ");
        }

        return sb.toString();
    }

}

