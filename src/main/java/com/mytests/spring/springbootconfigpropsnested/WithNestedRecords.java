package com.mytests.spring.springbootconfigpropsnested;

import org.springframework.boot.context.properties.ConfigurationProperties;

// here the properties defined in the inner record have the type of another inner record
// that is the property record's sibling
// in this case the property is not resolved
@ConfigurationProperties("my.nested.records")
public record WithNestedRecords(NestedLevel1 nested) {

    public record NestedLevel1(String level1Str, NestedLevel2 deep) {}
    public record NestedLevel2(String level2Str, NestedLevel3 deeper) {}
    public record NestedLevel3(String level3Str) {}
}
