package com.trsvax.doc.services;

import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.ioc.MappedConfiguration;

public class DevModule {
    public static void contributeApplicationDefaults(MappedConfiguration<String, Object> configuration) {   
        configuration.add(SymbolConstants.PRODUCTION_MODE, "false");   
     }
}
