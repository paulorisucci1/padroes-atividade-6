package org.example.model.academicblock;

import org.example.model.Professor;

public interface AcademicBlock {
    void enter(Professor professor);

    void leave(Professor professor);
}
