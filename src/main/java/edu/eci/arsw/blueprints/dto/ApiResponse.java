package edu.eci.arsw.blueprints.dto;

//Profe aquí es un api response sencillo con una respuesta normal y/o con el error como tal qur arroje

public record ApiResponse<T>(int code, String message, T data) {

    public static <T> ApiResponse<T> of(int code, String message, T data) {
        return new ApiResponse<>(code, message, data);
    }

    public static <T> ApiResponse<T> error(int code, String message) {
        return new ApiResponse<>(code, message, null);
    }
}
