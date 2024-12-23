package com.stech.api.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("second")
public class QualifierServiceImplSecond implements QualifierService{
    @Override
    public String displayMessage() {
        return "This is Qualifier Service Second!!!";
    }
}
