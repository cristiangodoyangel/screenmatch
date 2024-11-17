package com.aluracursos.screeenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DatosEpisodio(
        @JsonAlias("Tile") String titulo,
        @JsonAlias("Episode")  Integer numeroEpisodio,
        @JsonAlias("imdbRating") String evaluacion,
        @JsonAlias("Released") String fechaDeLanzamiento;

) {
}