package com.peasch.service;

import com.peasch.model.entities.Library;

import java.util.List;

public interface LibraryService {
    List<Library> getLibraries();


    Library findById(Integer id);

    Library save(Library library);
}