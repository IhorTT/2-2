package net.ukr.tigor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        TextContainer tc = new TextContainer();
        Class clsTextContainer = tc.getClass();
        try {
            Method myAnotSaverMethod = clsTextContainer.getDeclaredMethod("saveToDisk",String.class);
            Saver svr = myAnotSaverMethod.getAnnotation(Saver.class);
            if (myAnotSaverMethod.isAnnotationPresent(Saver.class)) {

                myAnotSaverMethod.invoke(tc, svr.path());
            }
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }


}
