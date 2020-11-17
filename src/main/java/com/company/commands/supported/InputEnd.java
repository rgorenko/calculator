package com.company.commands.supported;

public class InputEnd extends AbstractExitCommand {
    private static final String INPUT_END_CODE = null;
    private static final InputEnd INSTANCE = new InputEnd();

    @Override
    public String code() {
        return INPUT_END_CODE;
    }

    public static InputEnd command() {
        return INSTANCE;
    }
}
