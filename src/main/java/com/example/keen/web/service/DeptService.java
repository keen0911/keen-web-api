package com.example.keen.web.service;

import java.util.ArrayList;
import java.util.HashMap;

public interface DeptService {
    public ArrayList<HashMap> searchAllDept();
    public HashMap searchById(int id);
}
