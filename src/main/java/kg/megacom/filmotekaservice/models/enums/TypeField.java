package kg.megacom.filmotekaservice.models.enums;

public enum TypeField {
    CHECK_BOX, COMBO_BOX,INPUT_BOX;

    TypeField() {

    }

    @Override
    public String toString() {
        return this.name();
    }
}
