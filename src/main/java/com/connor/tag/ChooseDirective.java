package com.connor.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by chenxk on 2017/11/9.
 */
public class ChooseDirective extends SimpleTagSupport {
    private boolean isSelect=false;

    public boolean isSelect() {
        return isSelect;
    }

    @Override
    public void doTag() throws JspException, IOException {
        getJspBody().invoke(null);
    }

    public void setSelect(boolean select) {
        isSelect = select;
    }
}
