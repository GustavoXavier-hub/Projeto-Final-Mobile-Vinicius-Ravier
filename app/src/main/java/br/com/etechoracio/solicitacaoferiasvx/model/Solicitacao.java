package br.com.etechoracio.solicitacaoferiasvx.model;

import java.util.Date;

public class Solicitacao {


    private Date data;
    private Date dataFim;
    private String sim;
    private String nao;


    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    public String getNao() {
        return nao;
    }

    public void setNao(String nao) {
        this.nao = nao;
    }
}


