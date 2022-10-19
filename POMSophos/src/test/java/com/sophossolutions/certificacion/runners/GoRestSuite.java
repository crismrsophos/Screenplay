package com.sophossolutions.certificacion.runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(
		{ 
			GoRestPostear.class, 
			GoRestConsultar.class,
			GoRestEliminar.class
		}
)

public class GoRestSuite {
}
