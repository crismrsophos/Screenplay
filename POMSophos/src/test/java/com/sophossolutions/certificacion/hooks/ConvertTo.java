package com.sophossolutions.certificacion.hooks;

import java.util.List;


import com.sophossolutions.certificacion.models.Usuario;
import com.sophossolutions.certificacion.models.Cliente;

import com.sophossolutions.certificacion.models.TShirt;


import io.cucumber.java.DataTableType;

public class ConvertTo {

    @DataTableType
    public Usuario toUsuario(List<String> list) {
        return new Usuario(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5), list.get(6), list.get(7));
    }

    @DataTableType
    public Cliente toCliente(List<String> list) {
        return new Cliente(list.get(0), list.get(1), list.get(2), list.get(3));
    }

    @DataTableType
    public TShirt toTShirt(List<String> list) {
        return new TShirt(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4));
    }


}
