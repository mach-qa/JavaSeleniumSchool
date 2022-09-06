package HomeWork.MovieLibrary.Helpers;

import HomeWork.MovieLibrary.Models.MovieLibrary;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class MapperJson {

    static List<MovieLibrary> deserializeJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File jsonFile = new File("src/main/resources/movies.json");
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        return mapper.readValue(jsonFile, new TypeReference<>());
    }
}
