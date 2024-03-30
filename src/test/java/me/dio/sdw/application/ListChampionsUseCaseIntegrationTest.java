package me.dio.sdw.application;

import me.dio.sdw.domain.model.Champions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ListChampionsUseCaseIntegrationTest {

    @Autowired
    private ListChampionsUseCase listChampionsUseCase;

    @Test
    public void testListChampionsSize(){
        List<Champions> champions = listChampionsUseCase.findAll();

        Assertions.assertEquals(champions.size(), 12);
    }

}
