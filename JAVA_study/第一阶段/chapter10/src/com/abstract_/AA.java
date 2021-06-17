package com.abstract_;

public class AA extends Template{
    @Override
    public void job() {
        int num = 1;
        for (int i = 0; i < 100000; i++) {
            num += i;
        }
    }
}
