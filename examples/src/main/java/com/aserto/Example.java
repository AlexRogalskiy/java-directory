package com.aserto;

import com.aserto.directory.reader.v2.*;
import com.aserto.directory.writer.v2.*;
import com.aserto.directory.importer.v2.*;
import com.aserto.directory.exporter.v2.*;
import com.aserto.directory.common.v2.*;

import io.github.cdimascio.dotenv.DotenvException;
import javax.net.ssl.SSLException;

public class Example {
    public static void main(String[] args) {
        try {
            Config config = new Config();

            System.out.format("Connecting to directory: %s:%d...\n", config.Host(), config.Port());

            DirectoryClient directoryClient = new DirectoryClient(config);
    
            listObjectTypes(directoryClient);
    
        } catch (DotenvException | SSLException ex) {
            System.out.printf("error: %s\n", ex.getMessage());
            System.exit(1);
        }
    }

    public static void listObjectTypes(DirectoryClient directoryClient) {
        System.out.println("<--------------- list object types call --------------->");

        GetObjectTypesRequest.Builder builder = GetObjectTypesRequest.newBuilder();
        GetObjectTypesRequest request = builder.build();
        GetObjectTypesResponse response = directoryClient.Reader().getObjectTypes(request);
        
        response.getResultsList().forEach(objectType -> {
            System.out.println(objectType);
        });
    }
}

