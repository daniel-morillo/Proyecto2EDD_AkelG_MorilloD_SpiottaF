/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasDeDatos;

/**
 *
 * @author Daniel Morillo
 */
public class HashTable <T>{
    
    private Entry[] arrayHash;
    private int size;

    public HashTable(int size) {
        this.size = size;
        this.arrayHash = new Entry[size];
        for (int i = 0; i < size; i++) {
            arrayHash[i] = new Entry();
        }
    }
    
    private int hash(int n){
        int clave;
        clave = n % size;
        
        return clave;
    }
    
    public void insertar(int key, Object valor){
        int hashindex = hash(key);
        Entry valorarreglo = arrayHash[hashindex];
        Entry itemnuevo = new Entry(key,valor);
        itemnuevo.setSiguiente(valorarreglo.getSiguiente()); 
        valorarreglo.setSiguiente(itemnuevo);
    } 
    
    public T obtener(int key){
        T valor = null;
        int hashindex = hash(key);
        Entry valorarreglo = arrayHash[hashindex];
        while(valorarreglo != null){
            if (valorarreglo.getKey() == key){
                valor = (T) valorarreglo.getValor();
                break;
            }
            valorarreglo = valorarreglo.getSiguiente();
        }
        return valor;  
    }
    
    public T obtenerporHash(int key){
        T valor = null;
        Entry valorarreglo = arrayHash[key];
        if (valorarreglo.getSiguiente()!= null){
            if (valorarreglo.getSiguiente().getSiguiente()!= null){
                String valores  = "";
                while (valorarreglo.getSiguiente()!= null){
                    valores += valorarreglo.getSiguiente().getValor() + " , ";
                    valorarreglo = valorarreglo.getSiguiente();
                }
                return (T) valores;
            }
            valor = (T) valorarreglo.getSiguiente().getValor();
        }
        return valor;
    }
}
