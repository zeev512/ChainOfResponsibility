package il.co.migdal.ins.personalaccidents.doctor.station;

import il.co.migdal.ins.AbstractModelFlyweight;
import il.co.migdal.ins.service.BusinessServiceException;
import il.co.migdal.ins.personalaccidents.AbstractServiceStation;

public class OperativeClaimUpdater extends AbstractServiceStation {

    /*OperativeClaimUpdater(AbstractServiceStation nextStation) {
        super(nextStation);
    }*/

    @Override
    public int index() {
        return 7;
    }

    @Override
    public AbstractServiceStation doService(AbstractModelFlyweight flyweight) throws BusinessServiceException {
        super.doService(flyweight);
        return this;
    }

}

