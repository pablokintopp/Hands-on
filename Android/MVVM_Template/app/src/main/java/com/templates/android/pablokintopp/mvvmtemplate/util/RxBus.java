package com.templates.android.pablokintopp.mvvmtemplate.util;

import rx.Observable;
import rx.subjects.PublishSubject;
import rx.subjects.SerializedSubject;
import rx.subjects.Subject;

/**
 * Created by Pablo on 06/03/2018.
 */

public class RxBus {

    private static RxBus instance = null;
    private final Subject<Object, Object> _bus = new SerializedSubject<>(PublishSubject.create());

    private RxBus(){

    }

    public static RxBus getInstance(){
        if(instance == null){
            instance = new RxBus();
        }

        return instance;
    }

    public void send(Object o){
        _bus.onNext(o);
    }

    public Observable<Object> toObservable(){
        return _bus;
    }

    public boolean hasObservers(){
        return  _bus.hasObservers();
    }


}
