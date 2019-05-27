package br.com.usinasantafe.plm.tb.estaticas;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import br.com.usinasantafe.plm.pst.Entidade;

/**
 * Created by anderson on 05/05/2017.
 */
@DatabaseTable(tableName="tbrativparest")
public class RAtivParadaTO extends Entidade {

    @DatabaseField(id=true)
    private Long idRAtivParada;
    @DatabaseField
    private Long idAtiv;
    @DatabaseField
    private Long idParada;

    public RAtivParadaTO() {
    }

    public Long getIdRAtivParada() {
        return idRAtivParada;
    }

    public void setIdRAtivParada(Long idRAtivParada) {
        this.idRAtivParada = idRAtivParada;
    }

    public Long getIdAtiv() {
        return idAtiv;
    }

    public void setIdAtiv(Long idAtiv) {
        this.idAtiv = idAtiv;
    }

    public Long getIdParada() {
        return idParada;
    }

    public void setIdParada(Long idParada) {
        this.idParada = idParada;
    }
}
