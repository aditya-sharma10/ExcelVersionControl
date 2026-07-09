package com.aditya.DataSync.Dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiResponse<T> {

    private boolean success;

    private String message;

    private int statusCode;

    private LocalDateTime timestamp;

    private T data;

}