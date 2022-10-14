package com.line;

import com.line.domain.Hospital;
import com.line.parser.HospitalParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\admin\\Downloads\\Seoul_hospital.csv";
        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
        List<Hospital> hospitals = hospitalLineReader.readLines(filename);

        List<String> sqlStatements = new ArrayList<>();
        for(Hospital hospital : hospitals){
            sqlStatements.add(hospital.getSqlInsertQuery2());
        }
        String sqlFilename = "seoul_hospital_insert.sql";
        FileController hospitalFileController = new FileController<>(new HospitalParser());
        hospitalFileController.createANewFile(sqlFilename);
        hospitalFileController.writeLines(sqlStatements,sqlFilename);
    }
}
