package ua.lviv.iot.sportBuildings.models;

import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.openpojo.validation.Validator;
import com.openpojo.validation.ValidatorBuilder;
import com.openpojo.validation.rule.impl.GetterMustExistRule;
import com.openpojo.validation.rule.impl.SetterMustExistRule;
import com.openpojo.validation.test.impl.GetterTester;
import com.openpojo.validation.test.impl.SetterTester;

import org.junit.jupiter.api.Test;

class SportBuildingTest {

    @Test
    void testGetterSetterSportBuilding() {
        PojoClass pojoclass = PojoClassFactory.getPojoClass(SportBuilding.class);
        Validator validator = ValidatorBuilder
                .create()
                .with(new SetterMustExistRule())
                .with(new GetterMustExistRule())
                .with(new SetterTester())
                .with(new GetterTester())
                .build();
        validator.validate(pojoclass);
    }

    @Test
    void testGetterSetterAquaticsHall() {
        PojoClass pojoclass = PojoClassFactory.getPojoClass(AquaticsHall.class);
        Validator validator = ValidatorBuilder
                .create()
                .with(new SetterMustExistRule())
                .with(new GetterMustExistRule())
                .with(new SetterTester())
                .with(new GetterTester())
                .build();
        validator.validate(pojoclass);
    }

    @Test
    void testGetterSetterAthleticsPlayground() {
        PojoClass pojoclass = PojoClassFactory.getPojoClass(AthleticsPlayground.class);
        Validator validator = ValidatorBuilder
                .create()
                .with(new SetterMustExistRule())
                .with(new GetterMustExistRule())
                .with(new SetterTester())
                .with(new GetterTester())
                .build();
        validator.validate(pojoclass);
    }

    @Test
    void testGetterSetterChessHall() {
        PojoClass pojoclass = PojoClassFactory.getPojoClass(ChessHall.class);
        Validator validator = ValidatorBuilder
                .create()
                .with(new SetterMustExistRule())
                .with(new GetterMustExistRule())
                .with(new SetterTester())
                .with(new GetterTester())
                .build();
        validator.validate(pojoclass);
    }

    @Test
    void testGetterSetterFootballField() {
        PojoClass pojoclass = PojoClassFactory.getPojoClass(FootballField.class);
        Validator validator = ValidatorBuilder
                .create()
                .with(new SetterMustExistRule())
                .with(new GetterMustExistRule())
                .with(new SetterTester())
                .with(new GetterTester())
                .build();
        validator.validate(pojoclass);
    }

    @Test
    void testGetterSetterShootingPlayground() {
        PojoClass pojoclass = PojoClassFactory.getPojoClass(ShootingPlayground.class);
        Validator validator = ValidatorBuilder
                .create()
                .with(new SetterMustExistRule())
                .with(new GetterMustExistRule())
                .with(new SetterTester())
                .with(new GetterTester())
                .build();
        validator.validate(pojoclass);
    }
}
