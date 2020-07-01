package com.github.freshchen.springbootcore.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author darcy
 * @since 2020/06/29
 **/
class MySelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{MyConfigImport.class.getName()};

    }
}
