package message.converter.core.parse;

import message.converter.api.model.SlackMessageData;
import message.converter.api.parse.ContentParser;

import java.io.File;

public class SlackMessageParser implements ContentParser<SlackMessageData> {

    @Override
    public SlackMessageData parse(final File file) {
        return null;
    }
}
