package edu.mum.cs.cs472.lab14.customtags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrTimeTag extends SimpleTagSupport {
    String color;
    String size;
    @Override
    public void doTag() throws JspException, IOException {
        try {
            LocalTime timeNow = LocalTime.now();
            JspWriter out = getJspContext().getOut();
            if(color!=null && size!=null){
                out.print(String.format("<span style='color:%s; font-size: %s'>%s</span>"
                        ,color, size, timeNow.format(DateTimeFormatter.ISO_LOCAL_TIME)));
            }
            else if(color !=null && size==null){
                out.print(String.format("<span style='color:%s;'>%s</span>"
                        ,color, timeNow.format(DateTimeFormatter.ISO_LOCAL_TIME)));
            }
            else if(color == null && size!=null){
                out.print(String.format("<span style='font-size: %s;'>%s</span>"
                        ,size, timeNow.format(DateTimeFormatter.ISO_LOCAL_TIME)));
            }
            else{
                out.print(String.format("<span>%s</span>"
                                        ,timeNow.format(DateTimeFormatter.ISO_LOCAL_TIME)));
            }
        } catch (IOException ioe) {
            System.out.println(ioe);
        }

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
