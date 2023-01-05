package CountryManager.countryarraymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CountryArrayManager {

    private static ArrayList<Country> countries = new ArrayList<Country>();
    private static final String COMMA_DELIMITER = ",";

    public static void input() {
        BufferedReader dataReader = null;
        try {
            String filePath = "src/main/java/CountryManager/data/countries.csv";
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }

                /*
                 * TODO: create Country and append countries into
                 * CountryArrayManager here.
                 */
                String code = dataList.get(0);
                String name = dataList.get(1);
                int population = Integer.parseInt(dataList.get(2));
                double area = Double.parseDouble(dataList.get(3));
                double gdp = Double.parseDouble(dataList.get(4));
                String continent = dataList.get(5);
                switch (continent) {
                    case "Africa" -> countries.add(new AfricaCountry(code, name, population, area, gdp));
                    case "South America" -> countries.add(new SouthAmericaCountry(code, name, population, area, gdp));
                    case "Europe" -> countries.add(new EuropeCountry(code, name, population, area, gdp));
                    case "Asia" -> countries.add(new AsiaCountry(code, name, population, area, gdp));
                    case "North America" -> countries.add(new NorthAmericaCountry(code, name, population, area, gdp));
                    case "Oceania" -> countries.add(new OceaniaCountry(code, name, population, area, gdp));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            Collections.addAll(result, splitData);
        }

        return result;
    }


    /**
     * Sort the countries in order of increasing population
     * using selection sort algorithm.
     *
     * @return array of increasing population countries.
     */
    public static ArrayList<Country> sortByIncreasingPopulation() {

        return (ArrayList<Country>) countries.stream()
                .sorted(Comparator.comparing(Country::getPopulation)).collect(Collectors.toList());
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     *
     * @return array of decreasing population countries.
     */
    public static ArrayList<Country> sortByDecreasingPopulation() {

        return (ArrayList<Country>) countries.stream()
                .sorted(Comparator.comparing(Country::getPopulation).reversed()).collect(Collectors.toList());
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public static ArrayList<Country> sortByIncreasingArea() {

        return (ArrayList<Country>) countries.stream()
                .sorted(Comparator.comparing(Country::getArea)).collect(Collectors.toList());
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public static ArrayList<Country> sortByDecreasingArea() {

        return (ArrayList<Country>) countries.stream()
                .sorted(Comparator.comparing(Country::getArea).reversed()).collect(Collectors.toList());
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing GDP countries.
     */
    public static ArrayList<Country> sortByIncreasingGdp() {

        return (ArrayList<Country>) countries.stream()
                .sorted(Comparator.comparing(Country::getGdp)).collect(Collectors.toList());
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing insertion countries.
     */
    public static ArrayList<Country> sortByDecreasingGdp() {

        return (ArrayList<Country>) countries.stream()
                .sorted(Comparator.comparing(Country::getGdp).reversed()).collect(Collectors.toList());
    }

    public static ArrayList<Country> filterAfricaCountry() {
        /* TODO */

        return (ArrayList<Country>) countries.stream()
                .filter(x -> x instanceof AfricaCountry).collect(Collectors.toList());
    }

    public static ArrayList<Country> filterAsiaCountry() {
        /* TODO */

        return (ArrayList<Country>) countries.stream()
                .filter(x -> x instanceof AsiaCountry).collect(Collectors.toList());
    }

    public static ArrayList<Country> filterEuropeCountry() {
        /* TODO */

        return (ArrayList<Country>) countries.stream()
                .filter(x -> x instanceof EuropeCountry).collect(Collectors.toList());
    }

    public static ArrayList<Country> filterNorthAmericaCountry() {
        /* TODO */

        return (ArrayList<Country>) countries.stream()
                .filter(x -> x instanceof NorthAmericaCountry).collect(Collectors.toList());
    }

    public static ArrayList<Country> filterOceaniaCountry() {
        /* TODO */

        return (ArrayList<Country>) countries.stream()
                .filter(x -> x instanceof OceaniaCountry).collect(Collectors.toList());
    }

    public static ArrayList<Country> filterSouthAmericaCountry() {
        /* TODO */

        return (ArrayList<Country>) countries.stream()
                .filter(x -> x instanceof SouthAmericaCountry).collect(Collectors.toList());
    }

    public static ArrayList<Country> filterMostPopulousCountries(int howMany) {
        /* TODO */

        return (ArrayList<Country>) sortByDecreasingPopulation().stream().limit(howMany).collect(Collectors.toList());
    }

    public static ArrayList<Country> filterLeastPopulousCountries(int howMany) {
        /* TODO */

        return (ArrayList<Country>) sortByIncreasingPopulation().stream().limit(howMany).collect(Collectors.toList());
    }

    public static ArrayList<Country> filterLargestAreaCountries(int howMany) {
        /* TODO */

        return (ArrayList<Country>) sortByDecreasingArea().stream().limit(howMany).collect(Collectors.toList());
    }

    public static ArrayList<Country> filterSmallestAreaCountries(int howMany) {
        /* TODO */

        return (ArrayList<Country>) sortByIncreasingArea().stream().limit(howMany).collect(Collectors.toList());
    }

    public static ArrayList<Country> filterHighestGdpCountries(int howMany) {
        /* TODO */

        return (ArrayList<Country>) sortByDecreasingGdp().stream().limit(howMany).collect(Collectors.toList());
    }

    public static ArrayList<Country> filterLowestGdpCountries(int howMany) {
        /* TODO */

        return (ArrayList<Country>) sortByIncreasingGdp().stream().limit(howMany).collect(Collectors.toList());
    }

    public static String codeOfCountriesToString(ArrayList<Country> countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (Country country : countries) {
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

}
