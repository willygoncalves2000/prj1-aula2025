package br.edu.ifmg.produto.resources.exceptions;

import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {
    private List<FieldMessage> errors =  new ArrayList<FieldMessage>();

    public ValidationError() {

    }

    public List<FieldMessage> getFieldMessages() {
        return errors;
    }

    public void setFieldMessage(List<FieldMessage> fieldMessage) {
        this.errors = fieldMessage;
    }

    public void addFieldMessage(String field, String message) {
        this.errors.add(new FieldMessage(field, message));
    }
}
