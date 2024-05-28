package Teste.Suite;

import Teste.Categorii.Mock;
import Teste.Categorii.WithoutMock;
import Teste.PachetTuristicTest;
import Teste.PersoanaTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({PersoanaTest.class, PachetTuristicTest.class})
@Categories.IncludeCategory(WithoutMock.class)
public class SuitaCustom {
}
