package com.arsatapathy.json;

import com.arsatapathy.cache.model.Customer;
import com.arsatapathy.delegate.model.Product;
import com.fasterxml.jackson.databind.JsonNode;
import com.github.victools.jsonschema.generator.*;
import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;

public class JsonSchemaTest {
    public static void main(String[] args) {
        SchemaGeneratorConfigBuilder configBuilder = new SchemaGeneratorConfigBuilder(SchemaVersion.DRAFT_7, OptionPreset.PLAIN_JSON);
        SchemaGeneratorConfig config = configBuilder.build();
        SchemaGenerator generator = new SchemaGenerator(config);
        JsonNode customerSchema = generator.generateSchema(Customer.class);
        JsonNode productSchema = generator.generateSchema(Product.class);
        JsonNode studentSchema = generator.generateSchema(Student.class);

        System.out.println(customerSchema.toPrettyString());
        System.out.println(productSchema.toPrettyString());

        JSONObject customerJsonObject = new JSONObject(customerSchema.toString());
        JSONObject productJsonObject = new JSONObject(productSchema.toString());
        JSONObject studentJsonObject = new JSONObject(studentSchema.toString());

        System.out.println(customerJsonObject);
        System.out.println(productJsonObject);

        Customer customer = Customer.builder().id("1").name("ashish").build();
        Product product = Product.builder().serialNumber("1").name("xyz").build();
        Student student = Student.builder().id(1).name("ashish").address("xyz").build();

        JSONObject customerJson = new JSONObject(customer);
        JSONObject productJson = new JSONObject(product);
        JSONObject studentJson = new JSONObject(student);

        System.out.println(customerJson);
        System.out.println(productJson);
        System.out.println(studentJson);

        Schema schemaCustomer = SchemaLoader.builder()
                .useDefaults(true)
                .schemaJson(customerJsonObject)
                .build().load().build();

        Schema schemaStudent = SchemaLoader.builder()
                .useDefaults(true)
                .schemaJson(studentJsonObject)
                .build().load().build();

        try {
            schemaCustomer.validate(customerJson);
            System.out.println("success");
        } catch (ValidationException e) {
            e.printStackTrace();
        }

        try {
            schemaCustomer.validate(productJson);
            System.out.println("success");
        } catch (ValidationException e) {
            e.printStackTrace();
        }

        try {
            schemaCustomer.validate(studentJson);
            System.out.println("success");
        } catch (ValidationException e) {
            e.printStackTrace();
        }

        try {
            schemaStudent.validate(studentJson);
            System.out.println("success");
        } catch (ValidationException e) {
            e.printStackTrace();
        }

    }
}
