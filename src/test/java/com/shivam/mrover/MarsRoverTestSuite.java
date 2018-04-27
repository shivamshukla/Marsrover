package com.shivam.mrover;

import com.shivam.mrover.commands.MoveBackCommandTest;
import com.shivam.mrover.commands.MoveForwardCommandTest;
import com.shivam.mrover.commands.SpinLeftCommandTest;
import com.shivam.mrover.commands.SpinRightCommandTest;
import com.shivam.mrover.directions.EastDirectionTest;
import com.shivam.mrover.directions.NorthDirectionTest;
import com.shivam.mrover.directions.SouthDirectionTest;
import com.shivam.mrover.directions.WestDirectionTest;
import com.shivam.mrover.rover.RoverExceptionTest;
import com.shivam.mrover.rover.RoverTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MoveBackCommandTest.class,
        MoveForwardCommandTest.class,
        SpinLeftCommandTest.class,
        SpinRightCommandTest.class,
        EastDirectionTest.class,
        NorthDirectionTest.class,
        SouthDirectionTest.class,
        WestDirectionTest.class,
        RoverTest.class,
        RoverExceptionTest.class,
        InputUtilTest.class,
        PlateauTest.class
})
public class MarsRoverTestSuite extends BaseTest {

}
