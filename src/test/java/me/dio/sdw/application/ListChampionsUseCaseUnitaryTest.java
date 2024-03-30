package me.dio.sdw.application;

import me.dio.sdw.adapters.out.ChampionsJdbcRepository;
import me.dio.sdw.domain.model.Champions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ListChampionsUseCaseUnitaryTest {

    @Mock
    private ListChampionsUseCase listChampionsUseCase;

    @Test
    public void testListChampionsSize(){
        List<Champions> expectedList = Arrays.asList(null, null, null ,null);
        when(listChampionsUseCase.findAll()).thenReturn(expectedList);

        List<Champions> champions = listChampionsUseCase.findAll();

        Assertions.assertEquals(champions.size(), 4);

        verify(listChampionsUseCase).findAll();
    }
}
