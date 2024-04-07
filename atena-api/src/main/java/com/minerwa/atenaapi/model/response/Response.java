package com.minerwa.atenaapi.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.Map;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

/**
 * This class represents a response that can be sent to the client.
 * It includes various details about the response such as the timestamp, status code, status, reason, message, developer message, and data.
 * <p>
 * This class uses the {@code @SuperBuilder} annotation from the Lombok library to automatically generate builder methods.
 * In comparison to {@code @Builder} annotation {@code @SuperBuilder} s used when you have a more complex hierarchy of classes,
 * where you have subclasses and superclasses.
 * It allows you to include fields from superclasses in your builder.
 * This is useful when creating new instances of this class.
 * <p>
 * This class also uses the {@code @JsonInclude(NON_NULL)} annotation from the Jackson library.
 * This means that when instances of this class are serialized to JSON, any fields that are {@code null} will not be included in the JSON output.
 */
@Data
@SuperBuilder
@JsonInclude(NON_NULL)
public class Response {
    protected LocalDateTime timeStamp;
    protected int statusCode;
    protected HttpStatus status;
    protected String reason;
    protected String message;
    protected String developerMessage;
    protected Map<?, ?> data;
}
