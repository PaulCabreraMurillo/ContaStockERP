package com.contastock.erp.api;
import org.springframework.http.*;import org.springframework.web.bind.annotation.*;import java.util.*;
@RestControllerAdvice public class ApiExceptionHandler {
@ExceptionHandler(IllegalArgumentException.class) public ResponseEntity<?> bad(IllegalArgumentException e){return ResponseEntity.badRequest().body(Map.of("error",e.getMessage()));}
@ExceptionHandler(org.springframework.dao.DataIntegrityViolationException.class) public ResponseEntity<?> conflict(Exception e){return ResponseEntity.status(409).body(Map.of("error","El registro está relacionado con otros datos y no se puede eliminar."));}
}
