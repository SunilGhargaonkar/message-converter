package resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class DocumentLoader {

    public InputStream loadDocument(final File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }
}
