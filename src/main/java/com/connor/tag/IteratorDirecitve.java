package com.connor.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by chenxk on 2017/11/9.
 */
public class IteratorDirecitve extends SimpleTagSupport {
    private String[] items;
    private String var;

    @Override
    public void doTag() throws JspException, IOException {
       if(items==null||items.length==0||var==null){
           return;
       }
       for(String item:items){//循环处理子标签
           getJspContext().setAttribute(var,item);
           getJspBody().invoke(null);
       }
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }
}
