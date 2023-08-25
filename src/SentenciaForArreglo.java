import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        String[] nombres = new String[6];
        String[] nombres1 = {"JUAN","ANA","MARIA","LUIS","CARLOS","MARCOS"};
        String nombres2[] = new String[6];
        int count = nombres1.length;
        for(int i = 0;i < count ; i++){
            if(nombres1[i].equalsIgnoreCase("ana") || nombres1[i].equalsIgnoreCase("CARLOS")  ){
                continue;
            }
            System.out.println((i+1)+".- "+nombres1[i]);
        }
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Juan\" o \"María\"");
        boolean encontrado = false;
        for(int i = 0; i < count ;i++){
            if(nombres1[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null, "Fue encontrado ".concat(buscar));
        }else{
            JOptionPane.showMessageDialog(null, "No existe el asistente");
        }
    }
}
