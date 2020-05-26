package com.spring.ecurieApp.models;


public class JsonResponse {

    private Boolean succes;
    private String message;
    private Object objet1;
    private Object objet2;
    private Object objet3;
    private Object objet4;
    private Object objet5;



    public JsonResponse() {
    }

    public Boolean getSucces() {
        return succes;
    }

    public void setSucces(Boolean succes) {
        this.succes = succes;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObjet1() {
        return objet1;
    }

    public void setObjet1(Object objet1) {
        this.objet1 = objet1;
    }

    public Object getObjet2() { return objet2; }

    public void setObjet2(Object objet2) { this.objet2 = objet2; }

    public Object getObjet3() {
        return objet3;
    }

    public void setObjet3(Object objet3) {
        this.objet3 = objet3;
    }

    public Object getObjet4() {
        return objet4;
    }

    public void setObjet4(Object objet4) {
        this.objet4 = objet4;
    }

    public Object getObjet5() {
        return objet5;
    }

    public void setObjet5(Object objet5) {
        this.objet5 = objet5;
    }
}