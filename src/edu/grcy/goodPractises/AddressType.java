package edu.grcy.goodPractises;

public enum AddressType {
    HOME("dom", "house"),
    OFFICE("biuro", "office"),
    ANY_OTHER_REQUIRED("jakiś inny", "some other");

    //enum może mieć pola
    private String polishTranslation;
    private String englishTranslation;

    //enum może mieć konstruktor
    AddressType(String polishTranslation, String englishTranslation) {
        this.polishTranslation = polishTranslation;
        this.englishTranslation = englishTranslation;
    }

    public String getPolishTranslation() {
        return polishTranslation;
    }

    public String getEnglishTranslation() {
        return englishTranslation;
    }

    public static AddressType getByPolishTranslation(String translation) {
        for(AddressType current : AddressType.values()) {
            if(translation == current.polishTranslation) {
                return current;
            }
        }
        return null;
    }
}
