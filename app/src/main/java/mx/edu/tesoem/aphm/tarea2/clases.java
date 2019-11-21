package mx.edu.tesoem.aphm.tarea2;

import java.util.ArrayList;

public class clases {

    public static ArrayList<String> listColors = new ArrayList<String>();

    public static void agregar(String c){
        listColors.add(c);
    }

    public static ArrayList<String> mostrar(){
        return listColors;
    }
}
