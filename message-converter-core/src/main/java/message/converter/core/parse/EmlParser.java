package message.converter.core.parse;

import message.converter.api.model.EmailData;
import message.converter.api.parse.ContentParser;
import resource.DocumentLoader;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class EmlParser implements ContentParser<EmailData> {

    final DocumentLoader documentLoader;

    public EmlParser() {
        this.documentLoader = new DocumentLoader();
    }

    @Override
    public EmailData parse(final File file)  {

        return null;
    }
}
