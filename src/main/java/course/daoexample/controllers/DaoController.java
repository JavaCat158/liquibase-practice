package course.daoexample.controllers;

import course.daoexample.repository.DaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class DaoController {
    DaoRepository daoRepository;

    @Autowired
    public DaoController(DaoRepository daoRepository) {
        this.daoRepository = daoRepository;
    }

    @GetMapping("/products/fetch-product")
    public List<String> retName(@RequestParam String name) {
        return daoRepository.getProductName(name);
    }

    @GetMapping("/all")
    public List<Map<String, Object>> all(@RequestParam String tableName) {
        return daoRepository.getAll(tableName);
    }
}
