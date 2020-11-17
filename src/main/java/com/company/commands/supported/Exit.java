package com.company.commands.supported;

public class Exit extends AbstractExitCommand {
    private static final String EXIT_CODE = "q";

    private static final Exit INSTANCE = new Exit();

    @Override
    public String code() {
        return EXIT_CODE;
    }

    public static Exit command() {
        return INSTANCE;
    }
}
