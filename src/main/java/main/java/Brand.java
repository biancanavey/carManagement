public enum Brand {

    BMW("BMW"),
    PEUGEOT("PEUGEOT"),
    NISSAN("NISSAN"),
    FIAT("FIAT"),
    FERRARI("FERRARI"),
    MERCEDES("MERCEDES");
    private final String stringRep;

    Brand(String stringRep) {
        this.stringRep = stringRep;
    }

    @Override
    public String toString() {
        return stringRep;
    }
    }