package com.mytests.spring.springbootconfigpropsnested;

import org.springframework.boot.context.properties.ConfigurationProperties;

// here the pojo-type properties have the property of the inner type pf the class
// that defines the property
// in this case all the properties are resolved
@ConfigurationProperties(prefix = "my.multilevel.nested.pojos")
public class WithNestedPojos {

    String topStr;

    Nested nested;

    public Nested getNested() {
        return nested;
    }

    public void setNested(Nested nested) {
        this.nested = nested;
    }

    public String getTopStr() {
        return topStr;
    }

    public void setTopStr(String topStr) {
        this.topStr = topStr;
    }

    public static class Nested{

        String nestedStr;
        Deep deep;

        public Deep getDeep() {
            return deep;
        }

        public void setDeep(Deep deep) {
            this.deep = deep;
        }

        public String getNestedStr() {
            return nestedStr;
        }

        public void setNestedStr(String nestedStr) {
            this.nestedStr = nestedStr;
        }
        public static class Deep{
            String deepNestedStr;
            Deeper deeper;

            public Deeper getDeeper() {
                return deeper;
            }

            public void setDeeper(Deeper deeper) {
                this.deeper = deeper;
            }

            public String getDeepNestedStr() {
                return deepNestedStr;
            }

            public void setDeepNestedStr(String deepNestedStr) {
                this.deepNestedStr = deepNestedStr;
            }

            public static class Deeper{

                String bottomStr;

                public String getBottomStr() {
                    return bottomStr;
                }

                public void setBottomStr(String bottomStr) {
                    this.bottomStr = bottomStr;
                }
            }
        }
    }

}
