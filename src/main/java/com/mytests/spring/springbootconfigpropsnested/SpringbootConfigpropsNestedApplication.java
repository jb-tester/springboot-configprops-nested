package com.mytests.spring.springbootconfigpropsnested;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({WithNestedPojos.class, WithSiblingNestedPojos.class, WithNestedRecords.class})
public class SpringbootConfigpropsNestedApplication implements CommandLineRunner {

    private final WithNestedPojos withNestedPojos;
    private final WithNestedRecords withNestedRecords;
    private final WithSiblingNestedPojos withSiblingNestedPojos;

    public SpringbootConfigpropsNestedApplication(WithNestedPojos withNestedPojos, WithNestedRecords withNestedRecords, WithSiblingNestedPojos withSiblingNestedPojos) {
        this.withNestedPojos = withNestedPojos;
        this.withNestedRecords = withNestedRecords;
        this.withSiblingNestedPojos = withSiblingNestedPojos;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootConfigpropsNestedApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(withNestedPojos.getTopStr());
        System.out.println(withNestedPojos.getNested().getNestedStr());
        System.out.println(withNestedPojos.getNested().getDeep().getDeepNestedStr());
        System.out.println(withNestedPojos.getNested().getDeep().getDeeper().getBottomStr());
        System.out.println(withSiblingNestedPojos.getTopStr());
        System.out.println(withSiblingNestedPojos.getNested().getNested1str());
        System.out.println(withSiblingNestedPojos.getNested().getNested2().getNested2str());
        System.out.println(withNestedRecords.nested().level1Str());
        System.out.println(withNestedRecords.nested().deep().level2Str());
        System.out.println(withNestedRecords.nested().deep().deeper().level3Str());
    }
}
