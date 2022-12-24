package com.DNDMaker.runners;

import com.DNDMaker.importer.FileImporter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements ApplicationRunner {

    private static final Logger LOGGER = LogManager.getLogger(StartupRunner.class);

    @Override
    public void run(ApplicationArguments args) {
        LOGGER.info("StartupRunner init with args: {}", (Object) args.getSourceArgs());
        FileImporter importer = new FileImporter();
        Resource resource =  new ClassPathResource("data/spells.json");
        importer.fromResource(resource);
    }
}
