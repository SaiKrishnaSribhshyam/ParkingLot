package Exceptions;

public class NoAvailalbeParkingSpotException extends RuntimeException{
    private String message;

    public NoAvailalbeParkingSpotException(String message){
        this.message=message;
    }
}
