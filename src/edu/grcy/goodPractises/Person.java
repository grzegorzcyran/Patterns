package edu.grcy.goodPractises;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person {

    private String name;
    private String surname;
    private int age;


    private String telephoneNo;

    /**
     * pole adres do klasy Address, a w klasie Person - mapa z adresami
     */
    //private String address;
    Map<AddressType, Address> addresses;

    private PersonalFinances personalFinances;

    public Person(String name, String surname, String telephoneNo, AddressType addressType, Address address) {
        this.name = name;
        this.surname = surname;
        this.telephoneNo = telephoneNo;
        personalFinances = new PersonalFinances();
        addresses = new HashMap<>();
        addresses.put(addressType, address);
    }

    //jeśli mamy komunikację z systemami zewnętrznymi to one nie mają
    //obowiązku znać naszych wewnętrznych struktur typu AddressType
    //ale mogą przekazać oczekiwaną wartość
    public Person(String name, String surname, String telephoneNo, String addressType, Address address) {
        this.name = name;
        this.surname = surname;
        this.telephoneNo = telephoneNo;
        personalFinances = new PersonalFinances();
        addresses = new HashMap<>();
        addresses.put(AddressType.getByPolishTranslation(addressType), address);
    }

    public Person(String name, String surname, int age, String telephoneNo, Map<AddressType, Address> addresses, PersonalFinances personalFinances) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.telephoneNo = telephoneNo;
        this.addresses = addresses;
        this.personalFinances = personalFinances;
    }
}
