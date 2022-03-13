package kg.megacom.filmotekaservice.models.enums;

public enum TypeValue {
    NUMERIC, TEXT, DATE;

    TypeValue() {

    }

    @Override
    public String toString() {
        return this.name();
    }

    public boolean isCorrectType(String input) {
        return false;
    }

}