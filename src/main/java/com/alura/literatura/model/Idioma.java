package com.alura.literatura.model;

public enum Idioma {
    INGLES("en"),
    CASTELLANO("es"),
    CHINO("zh"),
    ALEMAN("de"),
    FRANCES("fr"),
    ITALIANO("it"),
    PORTUGUES("pt"),
    RUSO("ru");

    private String idioma;

    Idioma(String idioma){
        this.idioma = idioma;
    }

    public static Idioma fromString(String text) {
        try {
        for (Idioma idiomas1 : Idioma.values()) {
            if (idiomas1.idioma.equalsIgnoreCase(text)) {
                return idiomas1;
            }
        }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        throw new IllegalArgumentException("Ningun idioma encontrado: " + text);
    }
}
