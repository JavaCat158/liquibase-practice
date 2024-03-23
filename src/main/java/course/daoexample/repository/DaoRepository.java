package course.daoexample.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class DaoRepository {

    @Autowired
    private final JdbcTemplate jdbcTemplate = new JdbcTemplate();
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private final String productName = read("data.sql");

    @Autowired
    public DaoRepository(DataSource dataSource) {
        namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream(); BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> getProductName(String name) {
        Map<String, Object> params = Collections.singletonMap("name", name);
        return namedParameterJdbcTemplate.queryForList(productName, params, String.class);
    }

    public List<Map<String, Object>> getAll(String tablename) {
        String sql = "select * from " + tablename;
        return jdbcTemplate.queryForList(sql);
    }
}
