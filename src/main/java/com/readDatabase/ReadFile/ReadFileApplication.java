package com.readDatabase.ReadFile;

import com.readDatabase.ReadFile.Model.DataFromDatabase;
import com.readDatabase.ReadFile.Service.DataFromDatabaseService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableConfigurationProperties(DataFromDatabaseService.class)
public class ReadFileApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadFileApplication.class, args);
    }


    @Bean
    CommandLineRunner init(DataFromDatabaseService dataFromDatabaseService) {
        return (args) -> {
            dataFromDatabaseService.insertData(new DataFromDatabase.DataFromDatabaseBuilder().countryName("AFGHANISTAN").baseName("Bagram AB").latitude("34.946222").longitude("69.264639").baseNumber(1).sources("TomDispatch").note("2014 agreement allows U.S. troops to remain at Bagram Air Base and at least eight more major installations through 2024.").build());
            dataFromDatabaseService.insertData(new DataFromDatabase.DataFromDatabaseBuilder().countryName("AFGHANISTAN").baseName("Kandahar Airfield").latitude("31.506807").longitude("65.847511").baseNumber(1).build());
            dataFromDatabaseService.insertData(new DataFromDatabase.DataFromDatabaseBuilder().countryName("BAHRAIN").baseName("Manama").latitude("26.216667").longitude("50.583333").baseNumber(1).note("See Al Jaz. Map for 3 locs").sources("BSR; http://www.aljazeera.com/indepth/interactive/2012/04/2012417131242767298.html").build());
            dataFromDatabaseService.insertData(new DataFromDatabase.DataFromDatabaseBuilder().countryName("AUSTRALIA").baseName("Exmouth, Northwest Cape").latitude("-21.882527").longitude("67.567333").baseNumber(1).note("test info").sources("BSR; http://www.aljazeera.com/indepth/interactive/2012/04/2012417131242767298.html").build());
            dataFromDatabaseService.insertData(new DataFromDatabase.DataFromDatabaseBuilder().countryName("AUSTRALIA").baseName("Alice Springs").latitude("22.216667").longitude("8.583333").baseNumber(1).note("See Al Jaz. Map for 3 locs").sources("BSR; http://www.aljazeera.com/indepth/interactive/2012/04/2012417131242767298.html").build());
            dataFromDatabaseService.insertData(new DataFromDatabase.DataFromDatabaseBuilder().countryName("AUSTRALIA").baseName("Darwin, Robertson Barracks").latitude("12.216667").longitude("15.583333").baseNumber(1).note("See Al Jaz. Map for 3 locs").sources("BSR; http://www.aljazeera.com/indepth/interactive/2012/04/2012417131242767298.html").build());
        };
    }
}
