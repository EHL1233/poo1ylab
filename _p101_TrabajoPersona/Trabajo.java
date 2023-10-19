package _p101_TrabajoPersona;

public class Trabajo {    // Clase trabajador 
    // Definir atributos de la clase
    private int Id;
    private String Rol;
    private double Salario;

    public Trabajo() {} // Constructor de la clase 
    public Trabajo(int id, String rol, double salario) { // Inicializa los atributos de la clase 
        Id = id;
        Rol = rol;
        Salario = salario;
    }
    public int getId() { // Obtener el Id 
        return Id; // Retornar el Id
    }
    public void setId(int id) { // Establese el Id
        Id = id;
    }
    public String getRol() {  // Obtener el Rol
        return Rol;  // Retornar el Rol
    }
    public void setRol(String rol) {  // Estableser el Rol
        Rol = rol;
    }
    public double getSalario() { // Obtener el Salario
        return Salario; // retornar el salario
    }
    public void setSalario(double salario) { // Estableser el salario
        Salario = salario;
    }
    @Override
    public String toString() { // Metodo toStrig para retornar una cade de texto
        return "Trabajo [Id=" + Id + ", Rol=" + Rol + ", Salario=" + Salario + "]";
    }
}
