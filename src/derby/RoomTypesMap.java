package com.gekko.middleware.derby.hotel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class RoomTypesMap {
    private Map<String, RoomMappingSql> mapping = new HashMap<String, RoomMappingSql>();

    /**
     * Add mappings from DWP file rows
     */
    public void addMapping(String key, RoomMappingSql sql) {
        
        RoomMappingSql oldSql = mapping.get(key);
        if (oldSql != null && !oldSql.isNotMapped()){
            
          int oldmaxPax = Integer.valueOf(oldSql.getMaxPax());
          
          if(StringUtils.isEmpty(sql.getMaxPax())){
              return;// Keep the old one
          }   
          
          int newmaxpax = Integer.valueOf(sql.getMaxPax());
          
          // Use the minimum
          if(oldmaxPax <= newmaxpax){
              return;// Keep the old one
          }
        }
        
        mapping.put(key, sql);
    }


    /**
     * Save all in a file
     */
    @Override
    public String toString() {

        
        try {
            PrintStream out = new PrintStream(new FileOutputStream("C:/Users/zoltans/Desktop/Starwood.sql"));
            System.setOut(out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        
        System.out.println("SET @DERBY_GATEWAY_ID=49;");
        System.out.println("INSERT INTO map_roomtypes (idgateway, gateway_code, gateway_name, gekko_id) VALUES");
        for (RoomMappingSql sql : mapping.values()) {
            
            
            if(sql.isNotMapped()){
                System.out.println("NOT MAPPED !!! " + sql + ",");
                System.out.println("text: " + sql.getInfo());
                continue;
            }
            System.out.println(sql + ",");
            
        }
        
        System.out.println(";");
        
        return null;
    }
    
    
}
