package com.company.input;

import java.io.*;

public final class InputSources {

    private InputSources() {
    }

    private static final AbstractInputSource DEFAULT = (System.console() == null)
            ? streamInputSource(System.in)
            : new ConsoleSource(System.console());

    public static AbstractInputSource defaultInputSource() {
        return DEFAULT;
    }

    public static AbstractInputSource streamInputSource(InputStream in) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        return new CharacterSource(reader);
    }

    public static AbstractInputSource characterInputSource(BufferedReader reader) {
        return new CharacterSource(reader);
    }
}