package com.defianttech.convertme;

import android.content.Context;
import androidx.test.filters.SmallTest;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SmallTest
public class UnitCollectionTests {

    @Test
    public void testUnitCollections() {
        Context context = InstrumentationRegistry.getInstrumentation().getContext();

        final int categoryDistance = 5;
        final int unitInch = 10;
        final int unitCm = 2;

        final float fromIn = 42f;
        final float toCm = 106.68f;

        assertThat((float) UnitCollection.convert(context, categoryDistance, unitInch, unitCm, fromIn), is(toCm));

    }
}
