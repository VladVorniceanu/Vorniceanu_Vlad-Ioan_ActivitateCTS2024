package Teste.Suite;

import Teste.PachetTuristicTest;
import Teste.PersoanaTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({PersoanaTest.class, PachetTuristicTest.class})
public class SuitaCompleta {
}
