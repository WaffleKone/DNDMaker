package com.DNDMaker.importer;


import com.DNDMaker.importer.dto.SpellDTO;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.List;

public class FileImporter {

    private static final Logger LOGGER = LogManager.getLogger(FileImporter.class);
    private static final ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    public void fromResource(Resource resource) {
        LOGGER.info("resource: {}", resource.getDescription());
        try {
            List<SpellDTO> spellDTOS = List.of(mapper.readValue(resource.getFile(), SpellDTO[].class));
            spellDTOS.forEach(LOGGER::info);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


