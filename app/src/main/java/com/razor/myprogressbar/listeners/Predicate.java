package com.razor.myprogressbar.listeners;

/**
 * Created by kuliza-265 on 9/1/17.
 */

public interface Predicate<T> {
    boolean apply(T datum);
}
