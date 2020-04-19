package com.example.springWithReact;

import org.springframework.data.repository.PagingAndSortingRepository;

// PagingAndSortingRepository adds extra options to set page size and adds navigational links to hop from page to page
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
}
