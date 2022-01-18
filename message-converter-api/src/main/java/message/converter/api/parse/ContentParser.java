package message.converter.api.parse;

import java.io.File;
import java.io.FileNotFoundException;

@FunctionalInterface
public interface ContentParser<T> {
    T parse(File file);
}
