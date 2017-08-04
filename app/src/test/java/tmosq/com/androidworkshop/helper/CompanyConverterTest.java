package tmosq.com.androidworkshop.helper;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import tmosq.com.androidworkshop.BuildConfig;
import tmosq.com.androidworkshop.model.Company;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, manifest = "src/main/AndroidManifest.xml", sdk = 21)
public class CompanyConverterTest {

    private CompanyConverter companyConverter;

    @Before
    public void setUp() throws Exception {
        companyConverter = new CompanyConverter(RuntimeEnvironment.application);
    }

    @Test
    public void generateAllCompanies() throws Exception {
        Company firstCompany = Company.builder()
                .id(1)
                .name("Tesla")
                .maximumSalary(150000.00)
                .minimumSalary(50000.00)
                .position("Service Technician")
                .description("We are looking for a Service Technician to work on one of the most progressive vehicles in the world. This position is customer facing, so solid customer service skills combined with exceptional 'hands on' technical ability go hand in hand.")
                .build();

        assertEquals(companyConverter.getAllCompanies().get(0), firstCompany);
    }
}