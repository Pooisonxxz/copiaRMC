package io.github.bonigarcia.test.unit;
//package io.github.bonigarcia.test.unit;


import net.minidev.json.JSONUtil;
import org.mockito.Mockito;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.text.IsEmptyString.emptyString;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import io.github.bonigarcia.Cat;
import io.github.bonigarcia.Opinion;

public class UnitTest {

    Cat gatoNuevo = new Cat("Gato1", "fotoGato1.png");
    double star = 5;
    String comment = "Comentario de prueba";
    //Opinion newOpinion = new Opinion(star,comment);

    @Test
    void verificarGetName(){
        assertThat(gatoNuevo.getName(), equalTo("Gato1"));
    }

    @Test
    void verificarLink(){
        assertThat(gatoNuevo.getPictureFileName(), equalTo("fotoGato1.png"));
    }

    @Test
    void verificarTasaPromedio()
    {
        assertThat(gatoNuevo.getAverageRate(), equalTo(0.0));

    }

    /*@Test
    void verificarOpinion(){
        assertThat(newOpinion.getComment(), equalTo("Comentario de prueba"));
    }

    @Test
    void verificarStar(){
        assertThat(newOpinion.getStars(), equalTo(5d));
    }*/
}