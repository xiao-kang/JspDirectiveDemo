package com.connor.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by chenxk on 2017/11/9.
 */
public class NowDirective extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().getOut().print(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
    }
}
