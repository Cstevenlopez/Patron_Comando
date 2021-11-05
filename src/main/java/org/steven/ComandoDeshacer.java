package org.steven;

//amplía la interfaz comando añadiendo los métodos deshacer y rehacer
public interface ComandoDeshacer extends Comando {
    public void deshacer();
    public void rehacer();
}
