package com.scott.organstopperserver.configuration;

import com.scott.organstopperserver.datarepository.*;
import com.scott.organstopperserver.model.entity.organ.Division;
import com.scott.organstopperserver.model.entity.organ.Organ;
import com.scott.organstopperserver.model.PipeLength;
import com.scott.organstopperserver.model.entity.organ.Stop;
import com.scott.organstopperserver.model.entity.piece.OrganConfiguration;
import com.scott.organstopperserver.model.entity.piece.Piece;
import com.scott.organstopperserver.model.entity.piece.StopCombination;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class DatabaseConfiguration {
    private static final Logger log = LoggerFactory.getLogger(DatabaseConfiguration.class);

    @Bean
    CommandLineRunner initializeDatabase(OrganRepository organRepository, DivisionRepository divisionRepository,
                                         StopRepository stopRepository, PieceRepository pieceRepository,
                                         OrganConfigurationRepository organConfigurationRepository,
                                         StopCombinationRepository stopCombinationRepository) {

        List<Division> divisions = Arrays.asList(
                divisionRepository.save(new Division("Great", Arrays.asList(
                        stopRepository.save(new Stop("Diapason", PipeLength.EIGHT)),
                        stopRepository.save(new Stop("Bourdon", PipeLength.EIGHT))
                ))),
                divisionRepository.save(new Division("Swell", Arrays.asList(
                        stopRepository.save(new Stop("Grand Jeux", PipeLength.TWO_TWO_THIRDS)),
                        stopRepository.save(new Stop("Principal", PipeLength.EIGHT)),
                        stopRepository.save(new Stop("Prestant", PipeLength.FOUR)),
                        stopRepository.save(new Stop("Doublette", PipeLength.TWO))
                ))),
                divisionRepository.save(new Division("Pedal", Arrays.asList(
                        stopRepository.save(new Stop("Principal", PipeLength.SIXTEEN)),
                        stopRepository.save(new Stop("Choral Bass", PipeLength.FOUR))
                )))
        );

        OrganConfiguration organConfiguration1 = organConfigurationRepository
                .save(new OrganConfiguration(Arrays.asList(
                        stopCombinationRepository.save(
                                new StopCombination(1, List.of(divisions.get(0).getStops().get(0)))
                        ))));

        Piece piece1 = new Piece("Pasticcio", List.of(organConfiguration1));

        return args -> {
            log.info("Preloading Organ: " + organRepository.save(new Organ("Walt Disney Concert Hall", divisions)));
            log.info("Preloading Piece: " + pieceRepository.save(piece1));
        };
    }
}
