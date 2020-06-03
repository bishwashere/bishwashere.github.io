package edu.mum.cs.cs472.lab14.customtags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CurrentDateTag extends SimpleTagSupport {

    String foreColor;
    String text;

    @Override
    public void doTag() throws JspException, IOException {

        JspWriter out = getJspContext().getOut();
        if (foreColor != null)
            out.write(String.format("<span style='color:%s'>%s</span>", foreColor, text));
        else
            out.write(String.format("<span>%s</span>", text));
    }
    public void setForeColor(String foreColor) {
        this.foreColor = foreColor;
    }

    public void setText(String text) {
        this.text = text;
    }
}
