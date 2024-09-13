package registros;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-09-13T06:22:55", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Consulta.class)
public class Consulta_ { 

    public static volatile SingularAttribute<Consulta, Integer> idPaciente;
    public static volatile SingularAttribute<Consulta, String> horario;
    public static volatile SingularAttribute<Consulta, String> tipoConsulta;
    public static volatile SingularAttribute<Consulta, String> medico;
    public static volatile SingularAttribute<Consulta, Integer> id;
    public static volatile SingularAttribute<Consulta, String> dataConsulta;
    public static volatile SingularAttribute<Consulta, String> duracao;

}