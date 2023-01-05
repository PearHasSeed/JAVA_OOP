package CountryManager.countryarraymanager;

public class App {


    public static void main(String[] args) {
        CountryArrayManager.input();

        System.out.println("====================");

        testSortIncreasingByPopulation();
        System.out.println("====================");
        testSortDecreasingByPopulation();
        System.out.println("====================");
        testSortIncreasingByArea();
        System.out.println("====================");
        testSortDecreasingByArea();
        System.out.println("====================");
        testSortIncreasingByGdp();
        System.out.println("====================");
        testSortDecreasingByGdp();
        System.out.println("====================");
        testFilterAfricaCountry();
        System.out.println("====================");
        testFilterAsiaCountry();
        System.out.println("====================");
        testFilterEuropeCountry();
        System.out.println("====================");
        testFilterNorthAmericaCountry();
        System.out.println("====================");
        testFilterOceaniaCountry();
        System.out.println("====================");
        testFilterSouthAmericaCountry();
        System.out.println("====================");

        testFilterMostPopulousCountries(3);
        System.out.println("====================");
        testFilterLeastPopulousCountries(3);
        System.out.println("====================");
        testFilterLargestAreaCountries(3);
        System.out.println("====================");
        testFilterSmallestAreaCountries(3);
        System.out.println("====================");
        testFilterHighestGdpCountries(3);
        System.out.println("====================");
        testFilterLowestGdpCountries(3);
        /* TODO: write code to test program */
    }


    public static void testSortIncreasingByPopulation() {
        String codesString = CountryArrayManager.codeOfCountriesToString(CountryArrayManager.sortByIncreasingPopulation());
        System.out.println(codesString);
    }

    public static void testSortDecreasingByPopulation() {
        /* TODO */
        String codesString = CountryArrayManager.codeOfCountriesToString(CountryArrayManager.sortByDecreasingPopulation());
        System.out.println(codesString);
    }

    public static void testSortIncreasingByArea() {
        /* TODO */
        String codesString = CountryArrayManager.codeOfCountriesToString(CountryArrayManager.sortByIncreasingArea());
        System.out.println(codesString);
    }

    public static void testSortDecreasingByArea() {
        /* TODO */
        String codesString = CountryArrayManager.codeOfCountriesToString(CountryArrayManager.sortByDecreasingArea());
        System.out.println(codesString);
    }

    public static void testSortIncreasingByGdp() {
        /* TODO */
        String codesString = CountryArrayManager.codeOfCountriesToString(CountryArrayManager.sortByIncreasingGdp());
        System.out.println(codesString);
    }

    public static void testSortDecreasingByGdp() {
        /* TODO */
        String codesString = CountryArrayManager.codeOfCountriesToString(CountryArrayManager.sortByDecreasingGdp());
        System.out.println(codesString);
    }

    public static void testFilterAfricaCountry() {
        /* TODO */
        String codesString = CountryArrayManager.codeOfCountriesToString(CountryArrayManager.filterAfricaCountry());
        System.out.println(codesString);
    }

    public static void testFilterAsiaCountry() {
        /* TODO */
        String codesString = CountryArrayManager.codeOfCountriesToString(CountryArrayManager.filterAsiaCountry());
        System.out.println(codesString);
    }

    public static void testFilterEuropeCountry() {
        /* TODO */
        String codesString = CountryArrayManager.codeOfCountriesToString(CountryArrayManager.filterEuropeCountry());
        System.out.println(codesString);
    }

    public static void testFilterNorthAmericaCountry() {
        /* TODO */
        String codesString = CountryArrayManager.codeOfCountriesToString(CountryArrayManager.filterNorthAmericaCountry());
        System.out.println(codesString);
    }

    public static void testFilterOceaniaCountry() {
        /* TODO */
        String codesString = CountryArrayManager.codeOfCountriesToString(CountryArrayManager.filterOceaniaCountry());
        System.out.println(codesString);
    }

    public static void testFilterSouthAmericaCountry() {
        /* TODO */
        String codesString = CountryArrayManager.codeOfCountriesToString(CountryArrayManager.filterSouthAmericaCountry());
        System.out.println(codesString);
    }

    public static void testFilterMostPopulousCountries(int howMany) {
        /* TODO */
        String codesString = CountryArrayManager.codeOfCountriesToString(CountryArrayManager.filterMostPopulousCountries(howMany));
        System.out.println(codesString);
    }

    public static void testFilterLeastPopulousCountries(int howMany) {
        /* TODO */
        String codesString = CountryArrayManager.codeOfCountriesToString(CountryArrayManager.filterLeastPopulousCountries(howMany));
        System.out.println(codesString);
    }

    public static void testFilterLargestAreaCountries(int howMany) {
        /* TODO */
        String codesString = CountryArrayManager.codeOfCountriesToString(CountryArrayManager.filterLargestAreaCountries(howMany));
        System.out.println(codesString);
    }

    public static void testFilterSmallestAreaCountries(int howMany) {
        /* TODO */
        String codesString = CountryArrayManager.codeOfCountriesToString(CountryArrayManager.filterSmallestAreaCountries(howMany));
        System.out.println(codesString);
    }

    public static void testFilterHighestGdpCountries(int howMany) {
        /* TODO */
        String codesString = CountryArrayManager.codeOfCountriesToString(CountryArrayManager.filterHighestGdpCountries(howMany));
        System.out.println(codesString);
    }

    public static void testFilterLowestGdpCountries(int howMany) {
        /* TODO */
        String codesString = CountryArrayManager.codeOfCountriesToString(CountryArrayManager.filterLowestGdpCountries(howMany));
        System.out.println(codesString);
    }
}
