package registros;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import registros.Paciente;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-09-12T16:59:28", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(ProntuarioAtendimento.class)
public class ProntuarioAtendimento_ { 

    public static volatile SingularAttribute<ProntuarioAtendimento, String> prescricao;
    public static volatile SingularAttribute<ProntuarioAtendimento, String> dataAtendimento;
    public static volatile SingularAttribute<ProntuarioAtendimento, Paciente> paciente;
    public static volatile SingularAttribute<ProntuarioAtendimento, String> diagnostico;
    public static volatile SingularAttribute<ProntuarioAtendimento, String> dataRetorno;
    public static volatile SingularAttribute<ProntuarioAtendimento, Integer> id;
    public static volatile SingularAttribute<ProntuarioAtendimento, String> sintomas;

}