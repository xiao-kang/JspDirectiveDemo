package com.connor.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by chenxk on 2017/11/9.
 */
public class OtherwiseDirective extends SimpleTagSupport{

    @Override
    public void doTag() throws JspException, IOException {
        if(!((ChooseDirective)getParent()).isSelect()){
            getJspBody().invoke(null);
        }
    }


}
