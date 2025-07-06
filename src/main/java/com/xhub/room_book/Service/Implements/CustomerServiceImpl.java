package com.xhub.room_book.Service.Implements;

import com.xhub.room_book.DTO.CustomerDTO;
import com.xhub.room_book.Entity.Customer;
import com.xhub.room_book.Exception.NotFoundException;
import com.xhub.room_book.Repository.CustomerRepository;
import com.xhub.room_book.Service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepo;

    private CustomerDTO mapToDTO(Customer entity) {
        return CustomerDTO.builder()
                .id(entity.getCustomerId())
                .fullName(entity.getFullName())
                .phone(entity.getPhone())
                .email(entity.getEmail())
                .idCard(entity.getIdCard())
                .address(entity.getAddress())
                .build();
    }

    private Customer mapToEntity(CustomerDTO dto) {
        return Customer.builder()
                .customerId(dto.getId())
                .fullName(dto.getFullName())
                .phone(dto.getPhone())
                .email(dto.getEmail())
                .idCard(dto.getIdCard())
                .address(dto.getAddress())
                .build();
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerRepo.findAll()
                .stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CustomerDTO getCustomerById(Long id) {
        Customer customer = customerRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Customer not found with id: " + id));
        return mapToDTO(customer);
    }

    @Override
    public CustomerDTO createCustomer(CustomerDTO dto) {
        if (customerRepo.existsByIdCard(dto.getIdCard())) {
            throw new RuntimeException("Customer with ID card already exists.");
        }
        Customer saved = customerRepo.save(mapToEntity(dto));
        return mapToDTO(saved);
    }

    @Override
    public CustomerDTO updateCustomer(Long id, CustomerDTO dto) {
        Customer existing = customerRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Customer not found with id: " + id));
        existing.setFullName(dto.getFullName());
        existing.setPhone(dto.getPhone());
        existing.setEmail(dto.getEmail());
        existing.setIdCard(dto.getIdCard());
        existing.setAddress(dto.getAddress());
        return mapToDTO(customerRepo.save(existing));
    }

    @Override
    public void deleteCustomer(Long id) {
        if (!customerRepo.existsById(id)) {
            throw new NotFoundException("Customer not found with id: " + id);
        }
        customerRepo.deleteById(id);
    }
}
