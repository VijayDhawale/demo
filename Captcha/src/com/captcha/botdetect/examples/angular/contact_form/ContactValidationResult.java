package com.captcha.botdetect.examples.angular.contact_form;

import java.util.HashMap;
import java.util.Map;

public class ContactValidationResult {
    private boolean success;
    private Map<String, String> errors;

    public ContactValidationResult() {
        errors = new HashMap<String, String>();
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Map<String, String> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, String> errors) {
        this.errors = errors;
    }
}
