package com.semanticsquare.lambdas;

public class MyCacheIterator  implements CacheIterator {
    private int i = 0;
    private Bookmark[] items;

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return i < items.length;
    }

    @Override
    public Bookmark next() {
        // TODO Auto-generated method stub
        return items[i++];
    }

}