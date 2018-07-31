package com.musala.training.design.patterns.structural.bridge.bridge2;

import java.util.List;

public class HTMLFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("\n");
        sb.append("<body>");
        sb.append("\n");
        sb.append("<h2> Classification: ");
        sb.append(header);
        sb.append("</h2>");
        sb.append("\n");
        sb.append("<ul>");
        sb.append("\n");
        for(Detail detail : details) {
            sb.append("<li>");
            sb.append(detail.getLabel());
            sb.append(" : ");
            sb.append(detail.getValue());
            sb.append(" </li>");
            sb.append("\n");
        }
        sb.append("</ul>");
        sb.append("\n");
        sb.append("</body>");
        sb.append("\n");
        sb.append("</html>");
        return sb.toString();
    }
}
