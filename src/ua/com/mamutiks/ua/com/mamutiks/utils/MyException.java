package ua.com.mamutiks.ua.com.mamutiks.utils;

/**
 * Created by Сандро on 29.09.2015.
 */
public class MyException extends Exception{
    private final String errorCode;

    public MyException(String errorCode) {this.errorCode = errorCode;}

    public String getErrorCode() {
        return errorCode;
    }

}
