package com.musala.training.design.patterns.structural.bridge.bridge2;

import java.util.List;

public abstract class Printer {

     public String print(Formatter formatter) {
         return formatter.format(getHeader(), getDetails());
     }

     abstract protected String getHeader();
     abstract protected List<Detail> getDetails();
}
