package com.coderzoe.demo2;

/**
 * @author yhs
 * @date 2020/6/1 22:30
 * @description
 */
public class ServiceImplProxy implements Service{
    private Service service = new ServiceImpl();

    public void add() {
        log("add");
        service.add();
    }

    public void delete() {
        log("delete");
        service.delete();
    }

    public void update() {
        log("update");
        service.update();
    }

    public void query() {
        log("query");
        service.query();
    }

    public ServiceImplProxy() {
    }

    public ServiceImplProxy(Service service) {
        this.service = service;
    }

    public void log(String message){
        System.out.println("使用了"+message+"方法");
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
