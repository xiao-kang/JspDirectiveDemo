package com.connor.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

/**
 * Created by chenxk on 2017/11/9.
 */
public class ChangeInnerDirective extends SimpleTagSupport {


    @Override
    public void doTag() throws JspException, IOException {
        StringWriter jspWriter=new StringWriter();
        getJspBody().invoke(jspWriter);//将内部代码拿出来。
        getJspContext().getOut().write("修改后："+jspWriter.getBuffer());
    }


}
