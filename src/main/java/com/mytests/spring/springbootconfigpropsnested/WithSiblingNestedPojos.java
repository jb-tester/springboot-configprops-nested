package com.mytests.spring.springbootconfigpropsnested;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

// here the properties defined in the inner class have the type of another inner class
// that is the property class's sibling
// in this case the property is not resolved
@ConfigurationProperties(prefix = "my.nested.sibling.pojos")
public class WithSiblingNestedPojos {

    String topStr;

    //@NestedConfigurationProperty
    Nested1 nested1;

    public Nested1 getNested() {
        return nested1;
    }

    public void setNested(Nested1 nested1) {
        this.nested1 = nested1;
    }

    public String getTopStr() {
        return topStr;
    }

    public void setTopStr(String topStr) {
        this.topStr = topStr;
    }

    public static class Nested1 {

        String nested1str;
        //@NestedConfigurationProperty
        Nested2 nested2;

        public Nested2 getNested2() {
            return nested2;
        }

        public void setNested2(Nested2 nested2) {
            this.nested2 = nested2;
        }

        public String getNested1str() {
            return nested1str;
        }

        public void setNested1str(String nested1str) {
            this.nested1str = nested1str;
        }
    }

    public static class Nested2 {
        String nested2str;

        public String getNested2str() {
            return nested2str;
        }

        public void setNested2str(String nested2str) {
            this.nested2str = nested2str;
        }
    }
}
