package Singleton;

public class LazyStyle {//use "Singleton" in class name

        private static LazyStyle obj;

        private LazyStyle(){}

        public static LazyStyle getInstance() {
            if(obj == null) {
                obj = new LazyStyle();
            }
            return obj;
        }



    }
    
