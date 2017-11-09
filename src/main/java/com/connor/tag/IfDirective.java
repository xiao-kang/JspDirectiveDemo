package com.connor.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by chenxk on 2017/11/9.
 */
public class IfDirective extends SimpleTagSupport{
    private boolean test=false;

    @Override
    public void doTag() throws JspException, IOException {
        if(test){
            ((ChooseDirective)getParent()).setSelect(true);
            //test为真则处理子节点
            getJspBody().invoke(null);
        }
    }

    public boolean isTest() {
        return test;
    }

    public void setTest(boolean test) {
        this.test = test;
    }
}
