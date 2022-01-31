public interface Car {
    default boolean musicSystem(boolean musicsystem){return false;}
    default boolean abs(boolean abs) {
        return false;
    }
    default boolean sunroof(boolean sunroof) {
        return false;
    }
    default boolean airbag(boolean airbag) {
        return false;
    }


}
