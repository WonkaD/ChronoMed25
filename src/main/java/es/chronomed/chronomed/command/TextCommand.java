package es.chronomed.chronomed.command;

import es.chronomed.chronomed.beans.State1;
import javax.ejb.EJB;

public class TextCommand extends FrontCommand {
    @EJB
    State1 s;
    
    @Override
    public void process() {
        request.setAttribute("mensaje", s.getString());
        forward("/index.jsp");
    }
}
