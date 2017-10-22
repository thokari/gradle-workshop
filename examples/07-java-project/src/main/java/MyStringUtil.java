import java.util.stream.Stream;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

public class MyStringUtil {

    public static String dashCase(final String camelCased) {

        String[] parts = StringUtils.splitByCharacterTypeCamelCase(camelCased);
        
        return Stream.of(parts)
            .map(part -> part.toLowerCase())
            .collect(Collectors.joining("-"));
    }
}
