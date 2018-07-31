package com.musala.training.design.patterns.structural.bridge.bridge2;

import java.util.List;

public interface Formatter {
    String format(String header, List<Detail> details);
}
