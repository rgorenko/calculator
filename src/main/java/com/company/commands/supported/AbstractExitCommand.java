package com.company.commands.supported;

import com.company.commands.Command;

public abstract class AbstractExitCommand  implements Command {
    private static final String GOODBYE = "Goodbye!";
    private static final int TERMINATION_STATUS_CODE = 0;

    @Override
    public void action() {
        System.out.println(GOODBYE);
        //Runtime.getRuntime().halt(TERMINATION_STATUS_CODE);
    }
}
