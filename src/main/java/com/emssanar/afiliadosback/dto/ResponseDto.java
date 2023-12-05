package com.emssanar.afiliadosback.dto;

import com.emssanar.afiliadosback.entity.Afiliado;

import java.io.Serializable;

public class ResponseDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer codigo;
    private String mensaje;
    private Afiliado afiliado;

    public ResponseDto() {
    }

    public ResponseDto(Integer codigo, String mensaje, Afiliado afiliado) {
        this.codigo = codigo;
        this.mensaje = mensaje;
        this.afiliado = afiliado;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Afiliado getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(Afiliado afiliado) {
        this.afiliado = afiliado;
    }
}
