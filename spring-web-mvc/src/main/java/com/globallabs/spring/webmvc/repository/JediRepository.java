package com.globallabs.spring.webmvc.repository;

import com.globallabs.spring.webmvc.model.Jedi;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JediRepository {

    private List<Jedi> jedi;

    public JediRepository() {
        jedi = new ArrayList<>();
        jedi.add(new Jedi("Luke", "Skywalker"));
    }

    public List<Jedi> getAllJedi(){
        return jedi;
    }

    public void add(final Jedi jedi) {
        this.jedi.add(jedi);
    }
}
